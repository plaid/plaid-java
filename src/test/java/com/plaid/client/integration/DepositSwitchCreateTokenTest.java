package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.DepositSwitchCreateRequest;
import com.plaid.client.model.DepositSwitchCreateResponse;
import com.plaid.client.model.DepositSwitchTokenCreateRequest;
import com.plaid.client.model.DepositSwitchTokenCreateResponse;
import com.plaid.client.model.ItemImportRequest;
import com.plaid.client.model.ItemImportRequestOptions;
import com.plaid.client.model.ItemImportRequestUserAuth;
import com.plaid.client.model.ItemImportResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class DepositSwitchCreateTokenTest extends AbstractIntegrationTest {

  @Test
  public void testDepositSwitchCreateTokenSuccess() throws Exception {
    ItemImportRequestUserAuth itemImportRequestUserAuth = new ItemImportRequestUserAuth()
      .userId("user_good")
      .authToken("pass_good");

    ItemImportRequestOptions options = new ItemImportRequestOptions()
    .webhook("https://some.webhook.example.com");

    ItemImportRequest itemImportRequest = new ItemImportRequest()
      .products(Arrays.asList(Products.IDENTITY, Products.AUTH))
      .userAuth(itemImportRequestUserAuth)
      .options(options);

    Response<ItemImportResponse> itemImportResponse = client()
      .itemImport(itemImportRequest)
      .execute();

    assertSuccessResponse(itemImportResponse);
    assertNotNull(itemImportResponse.body().getAccessToken());

    String accessToken = itemImportResponse.body().getAccessToken();

    // get account id
    AccountsGetRequest accountsRequest = new AccountsGetRequest()
      .accessToken(accessToken);

    Response<AccountsGetResponse> accountsGetResponse = client()
      .accountsGet(accountsRequest)
      .execute();
    assertSuccessResponse(accountsGetResponse);
    assertNotNull(accountsGetResponse.body().getAccounts());

    List<AccountBase> accounts = accountsGetResponse.body().getAccounts();
    String accountId = "";
    for (int i = 0; i < accounts.size(); i++) {
      if (accounts.get(i).getType().equals(AccountType.DEPOSITORY)) {
        accountId = accounts.get(i).getAccountId();
        break;
      }
    }

    DepositSwitchCreateRequest depositSwitchCreateRequest = new DepositSwitchCreateRequest()
      .targetAccountId(accountId)
      .targetAccessToken(accessToken);

    Response<DepositSwitchCreateResponse> depositSwitchCreateResponse = client()
      .depositSwitchCreate(depositSwitchCreateRequest)
      .execute();

    assertSuccessResponse(depositSwitchCreateResponse);
    assertNotNull(depositSwitchCreateResponse.body().getDepositSwitchId());
    String depositSwitchId = depositSwitchCreateResponse
      .body()
      .getDepositSwitchId();

    // create deposit switch token
    DepositSwitchTokenCreateRequest tokenCreateRequest = new DepositSwitchTokenCreateRequest()
      .depositSwitchId(depositSwitchId);

    Response<DepositSwitchTokenCreateResponse> depositSwitchTokenCreateResponse = client()
      .depositSwitchTokenCreate(tokenCreateRequest)
      .execute();

    assertSuccessResponse(depositSwitchTokenCreateResponse);
    assertNotNull(
      depositSwitchTokenCreateResponse.body().getDepositSwitchToken()
    );
    assertNotNull(
      depositSwitchTokenCreateResponse
        .body()
        .getDepositSwitchTokenExpirationTime()
    );
  }
}
