package com.plaid.client.integration.depositswitch;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.ItemImportRequest;
import com.plaid.client.request.depositswitch.DepositSwitchCreateRequest;
import com.plaid.client.request.depositswitch.DepositSwitchGetRequest;
import com.plaid.client.request.depositswitch.DepositSwitchTokenCreateRequest;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ItemImportResponse;
import com.plaid.client.response.depositswitch.DepositSwitchCreateResponse;
import com.plaid.client.response.depositswitch.DepositSwitchGetResponse;
import com.plaid.client.response.depositswitch.DepositSwitchTokenCreateResponse;

import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class DepositSwitchCreateTokenTest extends AbstractIntegrationTest {
  @Test
  public void testDepositSwitchCreateTokenSuccess() throws Exception {
    HashMap<String, String> userAuth = new HashMap<>();
    userAuth.put("user_id", "user_good");
    userAuth.put("auth_token", "pass_good");

    Response<ItemImportResponse> itemImportResponse = client().service()
        .itemImport(new ItemImportRequest(Arrays.asList("identity", "auth"), userAuth)
            .withWebhook("https://some.webhook.example.com"))
        .execute();

    assertSuccessResponse(itemImportResponse);
    assertNotNull(itemImportResponse.body().getAccessToken());

    String accessToken = itemImportResponse.body().getAccessToken();

    // get account id
    Response<AccountsGetResponse> accountsGetResponse = client().service()
        .accountsGet(new AccountsGetRequest(accessToken)).execute();
    assertSuccessResponse(accountsGetResponse);
    assertNotNull(accountsGetResponse.body().getAccounts());

    String accountId = accountsGetResponse.body().getAccounts().get(0).getAccountId();

    Response<DepositSwitchCreateResponse> depositSwitchCreateResponse = client().service()
        .depositSwitchCreate(new DepositSwitchCreateRequest(accountId, accessToken)).execute();
    assertSuccessResponse(depositSwitchCreateResponse);
    assertNotNull(depositSwitchCreateResponse.body().getDepositSwitchId());
    String depositSwitchId = depositSwitchCreateResponse.body().getDepositSwitchId();

    // create osit switch token
    Response<DepositSwitchTokenCreateResponse> depositSwitchTokenCreateResponse = client().service()
        .depositSwitchTokenCreate(new DepositSwitchTokenCreateRequest(depositSwitchId)).execute();

    assertSuccessResponse(depositSwitchTokenCreateResponse);
    assertNotNull(depositSwitchTokenCreateResponse.body().getDepositSwitchToken());
    assertNotNull(depositSwitchTokenCreateResponse.body().getDepositSwitchTokenExpirationTime());
  }
}
