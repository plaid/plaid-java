package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetRequestOptions;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

public class AccountsGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Collections.singletonList(Products.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAccountsGetSuccess() throws Exception {
    AccountsGetRequest request = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AccountsGetResponse> response = client()
      .accountsGet(request)
      .execute();

    assertSuccessResponse(response);

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
  public void testAccountGetWithAccountId() throws Exception {
    // first call to get an account ID
    AccountsGetRequest request = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AccountsGetResponse> response = client()
      .accountsGet(request)
      .execute();
    assertSuccessResponse(response);
    String accountId = response.body().getAccounts().get(1).getAccountId();

    // call under test
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AccountsGetRequestOptions options = new AccountsGetRequestOptions()
    .accountIds(Arrays.asList(accountId));
    accountsGetRequest.setOptions(options);

    response = client().accountsGet(accountsGetRequest).execute();
    assertSuccessResponse(response);

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
  public void testAccountGetWithPersistentAccountId() throws Exception {
    // first call to get an account ID
    AccountsGetRequest request = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());
    Response<AccountsGetResponse> response = client()
      .accountsGet(request)
      .execute();
    assertSuccessResponse(response);
    String accountId = response.body().getAccounts().get(1).getAccountId();

    // call under test
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AccountsGetRequestOptions options = new AccountsGetRequestOptions()
    .accountIds(Arrays.asList(accountId));
    accountsGetRequest.setOptions(options);

    response = client().accountsGet(accountsGetRequest).execute();
    assertSuccessResponse(response);

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
    assertEquals(accounts.get(0).getPersistentAccountId(), "211a4e5d8361a3afb7a3886362198c7306e00a313b5aa944c20d34b6");
  }

  @Test
  public void testAccountGetInvalidAccountId() throws Exception {
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AccountsGetRequestOptions options = new AccountsGetRequestOptions()
    .accountIds(Arrays.asList("not-real"));
    accountsGetRequest.setOptions(options);

    Response<AccountsGetResponse> response = client()
      .accountsGet(accountsGetRequest)
      .execute();
    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_REQUEST,
      "INVALID_FIELD"
    );
  }

  @Test
  public void testAccountGetInvalidAccessToken() throws Exception {
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest()
      .accessToken("notreal");

    Response<AccountsGetResponse> response = client()
      .accountsGet(accountsGetRequest)
      .execute();
    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
