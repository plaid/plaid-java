package com.plaid.client.integration;

import com.plaid.client.request.SandboxPublicTokenCreateRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.SandboxPublicTokenCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class SandboxPublicTokenCreateTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    Response<SandboxPublicTokenCreateResponse> createResponse =
      client().service().sandboxPublicTokenCreate(new SandboxPublicTokenCreateRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList(Product.AUTH))).execute();

    assertSuccessResponse(createResponse);
    assertNotNull(createResponse.body().getPublicToken());

    Response<ItemPublicTokenExchangeResponse> response =
      client().service().itemPublicTokenExchange(new ItemPublicTokenExchangeRequest(createResponse.body().getPublicToken())).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());
    assertNotNull(response.body().getItemId());    
  }
}
