package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.Error;
import com.plaid.client.model.ItemPublicTokenExchangeRequest;
import com.plaid.client.model.ItemPublicTokenExchangeResponse;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

public class ItemPublicTokenExchangeTest extends AbstractIntegrationTest {

  private String publicToken;

  @Before
  public void setUp() throws Exception {
    SandboxPublicTokenCreateRequest request = new SandboxPublicTokenCreateRequest()
      .institutionId(TARTAN_BANK_INSTITUTION_ID)
      .initialProducts(Arrays.asList(Products.AUTH));

    Response<SandboxPublicTokenCreateResponse> response = client()
      .sandboxPublicTokenCreate(request)
      .execute();

    assertSuccessResponse(response);
    publicToken = response.body().getPublicToken();
  }

  @Test
  public void testSuccess() throws Exception {
    ItemPublicTokenExchangeRequest request = new ItemPublicTokenExchangeRequest()
      .publicToken(publicToken);

    Response<ItemPublicTokenExchangeResponse> response = client()
      .itemPublicTokenExchange(request)
      .execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());
    assertNotNull(response.body().getItemId());
  }

  @Test
  public void testInvalidTokenFailure() throws Exception {
    ItemPublicTokenExchangeRequest request = new ItemPublicTokenExchangeRequest()

      .publicToken("not-real");
    Response<ItemPublicTokenExchangeResponse> response = client()
      .itemPublicTokenExchange(request)
      .execute();

    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_INPUT,
      "INVALID_PUBLIC_TOKEN"
    );
  }
}
