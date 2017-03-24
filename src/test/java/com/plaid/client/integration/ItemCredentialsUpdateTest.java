package com.plaid.client.integration;

import com.plaid.client.integration.util.PlaidSandboxApiService;
import com.plaid.client.request.ItemCredentialsEncryptRequest;
import com.plaid.client.request.ItemCredentialsUpdateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemCredentialsEncryptResponse;
import com.plaid.client.response.ItemCredentialsUpdateResponse;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemCredentialsUpdateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Before
  public void setUp() throws Exception {
    Response<PlaidSandboxApiService.ItemResetLoginResponse> response = sandboxApiService().itemResetLogin(
      new PlaidSandboxApiService.ItemResetLoginRequest(getItemCreateResponse().getAccessToken())).execute();
    assertSuccessResponse(response);
    assertTrue(response.body().getResetLogin());
  }

  @Test
  public void testCredentialsMapSuccess() throws Exception {
    Map<String, String> credentials = new HashMap<>();
    credentials.put("username", "user_good");
    credentials.put("password", "pass_good");

    Response<ItemCredentialsUpdateResponse> response = client().service().itemCredentialsUpdate(
      new ItemCredentialsUpdateRequest(getItemCreateResponse().getAccessToken())
        .withCredentials(credentials)).execute();

    assertSuccessResponse(response);
    assertItemEquals(getItemCreateResponse().getItem(), response.body().getItem());
  }

  @Test
  public void testCredentialsVarArgsSuccess() throws Exception {
    Response<ItemCredentialsUpdateResponse> response = client().service().itemCredentialsUpdate(
      new ItemCredentialsUpdateRequest(getItemCreateResponse().getAccessToken())
        .withCredentials("username", "user_good", "password", "pass_good")).execute();

    assertSuccessResponse(response);
    assertItemEquals(getItemCreateResponse().getItem(), response.body().getItem());
  }

  @Test
  public void testCredentialsTokenSuccess() throws Exception {
    // first encrypt credentials
    Response<ItemCredentialsEncryptResponse> itemCredentialsEncryptResponse =
      client().service().itemCredentialsEncrypt(new ItemCredentialsEncryptRequest("username", "user_good", "password", "pass_good")).execute();
    assertSuccessResponse(itemCredentialsEncryptResponse);

    Response<ItemCredentialsUpdateResponse> response = client().service().itemCredentialsUpdate(
      new ItemCredentialsUpdateRequest(getItemCreateResponse().getAccessToken())
        .withCredentialsToken(itemCredentialsEncryptResponse.body().getCredentialsToken())).execute();

    assertSuccessResponse(response);
    assertItemEquals(getItemCreateResponse().getItem(), response.body().getItem());
  }

  @Test
  public void testError() throws Exception {
    Response<ItemCredentialsUpdateResponse> response = client().service().itemCredentialsUpdate(
      new ItemCredentialsUpdateRequest(getItemCreateResponse().getAccessToken())
        .withCredentials("username", "baduser", "password", "badpassword")).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.ITEM_ERROR, "INVALID_UPDATED_USERNAME");
  }
}
