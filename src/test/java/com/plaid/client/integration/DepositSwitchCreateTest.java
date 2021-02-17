package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.DepositSwitchCreateRequest;
import com.plaid.client.model.DepositSwitchCreateResponse;
import com.plaid.client.model.ItemImportRequest;
import com.plaid.client.model.ItemImportRequestUserAuth;
import com.plaid.client.model.ItemImportResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class DepositSwitchCreateTest extends AbstractIntegrationTest {

  @Test
  public void testDepositSwitchCreateSuccess() throws Exception {
    ItemImportRequestUserAuth itemImportRequestUserAuth = new ItemImportRequestUserAuth()
      .userId("user_good")
      .authToken("pass_good");

    ItemImportRequest itemImportRequest = new ItemImportRequest()
      .products(Arrays.asList(Products.IDENTITY, Products.AUTH))
      .userAuth(itemImportRequestUserAuth);

    Response<ItemImportResponse> itemImportResponse = client()
      .itemImport(itemImportRequest)
      .execute();

    assertSuccessResponse(itemImportResponse);
    assertNotNull(itemImportResponse.body().getAccessToken());

    String accessToken = itemImportResponse.body().getAccessToken();

    // get account id
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest()
      .accessToken(accessToken);

    Response<AccountsGetResponse> accountsGetResponse = client()
      .accountsGet(accountsGetRequest)
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
  }
}
