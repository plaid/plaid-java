package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.AuthGetNumbers;
import com.plaid.client.model.AuthGetRequest;
import com.plaid.client.model.AuthGetRequestOptions;
import com.plaid.client.model.AuthGetResponse;
import com.plaid.client.model.Error;
import com.plaid.client.model.NumbersACH;
import com.plaid.client.model.NumbersBACS;
import com.plaid.client.model.NumbersEFT;
import com.plaid.client.model.NumbersInternational;
import com.plaid.client.model.Products;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

public class AuthGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Collections.singletonList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testAllAccountsSuccess() throws Exception {
    AuthGetRequest authGetRequest = new AuthGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AuthGetResponse> response = client()
      .authGet(authGetRequest)
      .execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getAccounts().size() > 1);
    assertNotNull(response.body().getItem());

    for (NumbersACH numberACH : response.body().getNumbers().getAch()) {
      assertNotNull(numberACH.getAccount());
      assertNotNull(numberACH.getRouting());
      assertNotNull(numberACH.getAccountId());
      assertNotNull(numberACH.getWireRouting());
    }

    // The sandbox data that is returned only has ACH numbers so this doesn't actually do anything
    for (NumbersEFT numberEFT : response.body().getNumbers().getEft()) {
      assertNotNull(numberEFT.getAccount());
      assertNotNull(numberEFT.getBranch());
      assertNotNull(numberEFT.getInstitution());
      assertNotNull(numberEFT.getAccountId());
    }

    // The sandbox data that is returned only has ACH numbers so this doesn't actually do anything
    for (NumbersInternational numberInternational : response
      .body()
      .getNumbers()
      .getInternational()) {
      assertNotNull(numberInternational.getIban());
      assertNotNull(numberInternational.getBic());
      assertNotNull(numberInternational.getAccountId());
    }

    // The sandbox data that is returned only has ACH numbers so this doesn't actually do anything
    for (NumbersBACS numberBACS : response.body().getNumbers().getBacs()) {
      assertNotNull(numberBACS.getAccountId());
      assertNotNull(numberBACS.getAccount());
      assertNotNull(numberBACS.getSortCode());
    }
  }

  @Test
  public void testSelectiveAccountSuccess() throws Exception {
    // first call to get an account ID
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest()
    .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AccountsGetResponse> accountsGetResponse = client().accountsGet(accountsGetRequest).execute();
    assertSuccessResponse(accountsGetResponse);
    String accountId = accountsGetResponse.body().getAccounts().get(1).getAccountId();

    // call under test
    AuthGetRequest authGetRequest = new AuthGetRequest()
    .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AuthGetRequestOptions authGetRequestOptions = new AuthGetRequestOptions()
    .accountIds(Collections.singletonList(accountId));
    authGetRequest.options(authGetRequestOptions);

    Response<AuthGetResponse> response = client().authGet(authGetRequest).execute();

    assertSuccessResponse(response);
    List<NumbersACH> achList = response.body().getNumbers().getAch();
    assertNotNull(achList);
    assertEquals(1, achList.size());
    assertEquals(accountId, achList.get(0).getAccountId());
    assertEquals("1111222233331111", achList.get(0).getAccount());
    assertEquals("011401533", achList.get(0).getRouting());
    assertEquals("021000021", achList.get(0).getWireRouting());
  }

  @Test
  public void testNoSuchTokenError() throws Exception {
    AuthGetRequest authGetRequest = new AuthGetRequest()
      .accessToken("bad-access-token");

    Response<AuthGetResponse> response = client()
      .authGet(authGetRequest)
      .execute();
    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }

  @Test
  public void testNoSuchAccountError() throws Exception {
    AuthGetRequest authGetRequestErr = new AuthGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    AuthGetRequestOptions authGetRequestOptions = new AuthGetRequestOptions()
    .accountIds(Collections.singletonList("fake-not-real"));
    authGetRequestErr.options(authGetRequestOptions);

    Response<AuthGetResponse> authResponse = client()
      .authGet(authGetRequestErr)
      .execute();
    assertErrorResponse(
      authResponse,
      Error.ErrorTypeEnum.INVALID_REQUEST,
      "INVALID_FIELD"
    );
  }
}
