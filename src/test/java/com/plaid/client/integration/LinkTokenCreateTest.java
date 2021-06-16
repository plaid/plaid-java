package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.LinkTokenCreateRequest;
import com.plaid.client.request.ItemImportRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.request.depositswitch.DepositSwitchCreateRequest;
import com.plaid.client.response.LinkTokenCreateResponse;
import com.plaid.client.response.Account;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ItemImportResponse;
import com.plaid.client.response.depositswitch.DepositSwitchCreateResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LinkTokenCreateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());
    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    Response<LinkTokenCreateResponse> response =
      client().service().linkTokenCreate(
        new LinkTokenCreateRequest(
          user,
          "very nice client name",
          Collections.singletonList("auth"),
          Collections.singletonList("US"),
          "en")).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getLinkToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testSuccess_full() throws Exception {
    String clientUserId = Long.toString((new Date()).getTime());

    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId)
      .withLegalName("Legal name")
      .withPhoneNumber("4155558888")
      .withEmailAddress("email@address.com")
      .withPhoneNumberVerifiedTime(new Date())
      .withEmailAddressVerifiedTime(new Date());
    Map<String, LinkTokenCreateRequest.SubtypeFilters> accountFilters = new HashMap<>();
    accountFilters.put("depository",
      new LinkTokenCreateRequest.SubtypeFilters(Collections.singletonList("checking")));
    LinkTokenCreateRequest request = new LinkTokenCreateRequest(
      user,
      "very nice client name",
      Collections.singletonList("auth"),
      Collections.singletonList("US"),
      "en"
    )
      .withWebhook("https://example.com/webhook")
      .withLinkCustomizationName("default")
      .withAccountFilters(accountFilters);

    Response<LinkTokenCreateResponse> response =
      client().service().linkTokenCreate(
        request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getLinkToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testSuccess_depositSwitch() throws Exception {
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

    List<Account> accounts = accountsGetResponse.body().getAccounts();
    String accountId = "";
    for (int i = 0; i < accounts.size(); i++) {
        if (accounts.get(i).getType().equals("depository")) {
          accountId = accounts.get(i).getAccountId();
          break;
        }
    }

    Response<DepositSwitchCreateResponse> depositSwitchCreateResponse = client().service()
        .depositSwitchCreate(new DepositSwitchCreateRequest(accountId, accessToken)).execute();
    assertSuccessResponse(depositSwitchCreateResponse);
    assertNotNull(depositSwitchCreateResponse.body().getDepositSwitchId());
    String depositSwitchId = depositSwitchCreateResponse.body().getDepositSwitchId();

    String clientUserId = Long.toString((new Date()).getTime());

    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    LinkTokenCreateRequest request = new LinkTokenCreateRequest(
      user,
      "very nice client name",
      Collections.singletonList("deposit_switch"),
      Collections.singletonList("US"),
      "en"
    ).WithDepositSwitch(depositSwitchId);
    
    Response<LinkTokenCreateResponse> response =
      client().service().linkTokenCreate(
        request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getLinkToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }
}
