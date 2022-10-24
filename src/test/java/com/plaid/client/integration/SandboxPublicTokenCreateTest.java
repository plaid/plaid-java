package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.PlaidError;
import com.plaid.client.model.ItemPublicTokenExchangeRequest;
import com.plaid.client.model.ItemPublicTokenExchangeResponse;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class SandboxPublicTokenCreateTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    SandboxPublicTokenCreateRequest request = new SandboxPublicTokenCreateRequest()
      .institutionId(TARTAN_BANK_INSTITUTION_ID)
      .initialProducts(Arrays.asList(Products.AUTH));

    Response<SandboxPublicTokenCreateResponse> createResponse = client()
      .sandboxPublicTokenCreate(request)
      .execute();

    assertSuccessResponse(createResponse);
    assertNotNull(createResponse.body().getPublicToken());

    ItemPublicTokenExchangeRequest exchangeRequest = new ItemPublicTokenExchangeRequest()
      .publicToken(createResponse.body().getPublicToken());

    Response<ItemPublicTokenExchangeResponse> response = client()
      .itemPublicTokenExchange(exchangeRequest)
      .execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());
    assertNotNull(response.body().getItemId());
  }
}
