package com.plaid.client.integration;

import static com.plaid.client.integration.AbstractItemIntegrationTest.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.AccountsBalanceGetRequest;
import com.plaid.client.model.AccountsBalanceGetRequestOptions;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.Error;
import com.plaid.client.model.Item;
import com.plaid.client.model.ItemStatus;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

public class AccountsBalanceGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAccountsBalanceGetSuccess() throws Exception {
    AccountsBalanceGetRequest request = new AccountsBalanceGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AccountsGetResponse> response = client()
      .accountsBalanceGet(request)
      .execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getRequestId());

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected accounts
    List<AccountBase> accounts = response.body().getAccounts();
    assertTrue(accounts.size() > 1);
    assertAccount(
      accounts.get(0),
      AccountType.DEPOSITORY,
      AccountSubtype.CHECKING,
      100d,
      110d,
      null,
      "Plaid Checking",
      "0000",
      "Plaid Gold Standard 0% Interest Checking"
    );
    assertAccount(
      accounts.get(1),
      AccountType.DEPOSITORY,
      AccountSubtype.SAVINGS,
      200d,
      210d,
      null,
      "Plaid Saving",
      "1111",
      "Plaid Silver Standard 0.1% Interest Saving"
    );
    assertAccount(
      accounts.get(2),
      AccountType.DEPOSITORY,
      AccountSubtype.CD,
      null,
      1000d,
      null,
      "Plaid CD",
      "2222",
      "Plaid Bronze Standard 0.2% Interest CD"
    );
    assertAccount(
      accounts.get(3),
      AccountType.CREDIT,
      AccountSubtype.CREDIT_CARD,
      null,
      410d,
      2000d,
      "Plaid Credit Card",
      "3333",
      "Plaid Diamond 12.5% APR Interest Credit Card"
    );
  }

  @Test
  public void testAccountsBalanceGetWithAccountId() throws Exception {
    // first call to get an account ID
    AccountsBalanceGetRequest request = new AccountsBalanceGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AccountsGetResponse> response = client()
      .accountsBalanceGet(request)
      .execute();
    assertSuccessResponse(response);
    assertNotNull(response.body().getRequestId());
    String accountId = response.body().getAccounts().get(1).getAccountId();

    // call under test
    AccountsBalanceGetRequest accountsBalanceRequest = new AccountsBalanceGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AccountsBalanceGetRequestOptions options = new AccountsBalanceGetRequestOptions()
    .accountIds(Arrays.asList(accountId));

    accountsBalanceRequest.setOptions(options);

    response = client().accountsBalanceGet(accountsBalanceRequest).execute();
    assertSuccessResponse(response);
    assertNotNull(response.body().getRequestId());

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected accounts
    List<AccountBase> accounts = response.body().getAccounts();
    assertEquals(1, accounts.size());
    assertAccount(
      accounts.get(0),
      AccountType.DEPOSITORY,
      AccountSubtype.SAVINGS,
      200d,
      210d,
      null,
      "Plaid Saving",
      "1111",
      "Plaid Silver Standard 0.1% Interest Saving"
    );
  }

  @Test
  public void testAccountsBalanceGetInvalidAccountId() throws Exception {
    AccountsBalanceGetRequest request = new AccountsBalanceGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AccountsBalanceGetRequestOptions options = new AccountsBalanceGetRequestOptions()
    .accountIds(Arrays.asList("not-real"));
    request.setOptions(options);

    Response<AccountsGetResponse> response = client()
      .accountsBalanceGet(request)
      .execute();
    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_REQUEST,
      "INVALID_FIELD"
    );
  }

  @Test
  public void testAccountsBalanceGetInvalidAccessToken() throws Exception {
    AccountsBalanceGetRequest request = new AccountsBalanceGetRequest()
      .accessToken("notreal");

    Response<AccountsGetResponse> response = client()
      .accountsBalanceGet(request)
      .execute();
    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
