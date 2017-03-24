package com.plaid.client.integration;

import com.plaid.client.integration.util.PlaidSandboxApiService;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertNotNull;

public class ItemPublicTokenExchangeTest extends AbstractIntegrationTest {
  private String publicToken;

  @Before
  public void setUp() throws Exception {
    HashMap<String, String> credentials = new HashMap<>();
    credentials.put("username", "user_good");
    credentials.put("password", "pass_good");

    Response<PlaidSandboxApiService.LinkItemCreateResponse> response =
      sandboxApiService().linkItemCreate(
        new PlaidSandboxApiService.LinkItemCreateRequest(
          credentials,
          Arrays.asList(Product.AUTH),
          TARTAN_BANK_INSTITUTION_ID
        )).execute();

    assertSuccessResponse(response);
    publicToken = response.body().getPublicToken();
  }

  @Test
  public void testSuccess() throws Exception {
    Response<ItemPublicTokenExchangeResponse> response =
      client().service().itemPublicTokenExchange(new ItemPublicTokenExchangeRequest(publicToken)).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());
  }

  @Test
  public void testInvalidTokenFailure() throws Exception {
    Response<ItemPublicTokenExchangeResponse> response =
      client().service().itemPublicTokenExchange(new ItemPublicTokenExchangeRequest("not-real")).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_PUBLIC_TOKEN");
  }
}
