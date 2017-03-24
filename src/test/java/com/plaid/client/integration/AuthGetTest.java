package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.AuthGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.AuthGetResponse;
import com.plaid.client.response.ErrorResponse;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
      client().service().authGet(new AuthGetRequest(getItemCreateResponse().getAccessToken())).execute();

    assertSuccessResponse(response);
    assertEquals(4, response.body().getAccounts().size());
    assertNotNull(response.body().getItem());

    for (AuthGetResponse.Numbers n : response.body().getNumbers()) {
      assertNotNull(n.getAccount());
      assertNotNull(n.getRouting());
      assertNotNull(n.getAccountId());
      assertNotNull(n.getWireRouting());
    }
  }

  @Test
  public void testSelectiveAccountSuccess() throws Exception {
    // first call to get an account ID
    Response<AccountsGetResponse> accountsGetResponse = client().service().accountsGet(
      new AccountsGetRequest(getItemCreateResponse().getAccessToken()))
      .execute();
    assertSuccessResponse(accountsGetResponse);
    String accountId = accountsGetResponse.body().getAccounts().get(1).getAccountId();

    // call under test
    Response<AuthGetResponse> response =
      client().service().authGet(new AuthGetRequest(getItemCreateResponse().getAccessToken()).withAccountIds(Arrays.asList(accountId))).execute();

    assertSuccessResponse(response);
    List<AuthGetResponse.Numbers> numbersList = response.body().getNumbers();
    assertNotNull(numbersList);
    assertEquals(1, numbersList.size());
    assertEquals(accountId, numbersList.get(0).getAccountId());
    assertEquals("1111222233331111", numbersList.get(0).getAccount());
    assertEquals("011401533", numbersList.get(0).getRouting());
    assertEquals("021000021", numbersList.get(0).getWireRouting());
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
      client().service().authGet(new AuthGetRequest(getItemCreateResponse().getAccessToken()).withAccountIds(Arrays.asList("fake-not-real"))).execute();
    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCOUNT_ID");
  }
}
