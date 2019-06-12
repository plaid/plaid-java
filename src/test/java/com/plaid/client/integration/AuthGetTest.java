package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.AuthGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.AuthGetResponse;
import com.plaid.client.response.ErrorResponse;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AuthGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAllAccountsSuccess() throws Exception {
    Response<AuthGetResponse> response =
      client().service()
        .authGet(new AuthGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
        .execute();

    assertSuccessResponse(response);
    assertEquals(8, response.body().getAccounts().size());
    assertNotNull(response.body().getItem());

    for (AuthGetResponse.NumberACH numberACH : response.body().getNumbers().getACH()) {
      assertNotNull(numberACH.getAccount());
      assertNotNull(numberACH.getRouting());
      assertNotNull(numberACH.getAccountId());
      assertNotNull(numberACH.getWireRouting());
    }

    // The sandbox data that is returned only has ACH numbers so this doesn't actually do anything
    for (AuthGetResponse.NumberEFT numberEFT : response.body().getNumbers().getEFT()) {
      assertNotNull(numberEFT.getAccount());
      assertNotNull(numberEFT.getBranch());
      assertNotNull(numberEFT.getInstitution());
      assertNotNull(numberEFT.getAccountId());
    }

    // The sandbox data that is returned only has ACH numbers so this doesn't actually do anything
    for (AuthGetResponse.NumberInternational numberInternational : response.body().getNumbers().getInternational()) {
      assertNotNull(numberInternational.getIBAN());
      assertNotNull(numberInternational.getBIC());
      assertNotNull(numberInternational.getAccountId());
    }

    // The sandbox data that is returned only has ACH numbers so this doesn't actually do anything
    for (AuthGetResponse.NumberBACS numberBACS : response.body().getNumbers().getBACS()) {
      assertNotNull(numberBACS.getAccountId());
      assertNotNull(numberBACS.getAccount());
      assertNotNull(numberBACS.getSortCode());
    }
  }

  @Test
  public void testSelectiveAccountSuccess() throws Exception {
    // first call to get an account ID
    Response<AccountsGetResponse> accountsGetResponse = client().service().accountsGet(
      new AccountsGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();
    assertSuccessResponse(accountsGetResponse);
    String accountId = accountsGetResponse.body().getAccounts().get(1).getAccountId();

    // call under test
    Response<AuthGetResponse> response =
      client().service()
        .authGet(new AuthGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())
          .withAccountIds(Collections.singletonList(accountId)))
        .execute();

    assertSuccessResponse(response);
    List<AuthGetResponse.NumberACH> achList = response.body().getNumbers().getACH();
    assertNotNull(achList);
    assertEquals(1, achList.size());
    assertEquals(accountId, achList.get(0).getAccountId());
    assertEquals("1111222233331111", achList.get(0).getAccount());
    assertEquals("011401533", achList.get(0).getRouting());
    assertEquals("021000021", achList.get(0).getWireRouting());
  }

  @Test
  public void testNoSuchTokenError() throws Exception {
    Response<AuthGetResponse> response =
      client().service().authGet(new AuthGetRequest("bad-access-token")).execute();
    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }

  @Test
  @Ignore("triggers a sandbox 500 error at this time")
  public void testNoSuchAccountError() throws Exception {
    Response<AuthGetResponse> response =
      client().service()
        .authGet(new AuthGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())
          .withAccountIds(Collections.singletonList("fake-not-real")))
        .execute();
    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCOUNT_ID");
  }
}
