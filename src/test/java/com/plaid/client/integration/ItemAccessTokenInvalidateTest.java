package com.plaid.client.integration;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.ItemAccessTokenInvalidateRequest;
import com.plaid.client.model.ItemAccessTokenInvalidateResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class ItemAccessTokenInvalidateTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    ItemAccessTokenInvalidateRequest request = new ItemAccessTokenInvalidateRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<ItemAccessTokenInvalidateResponse> response = client()
      .itemAccessTokenInvalidate(request)
      .execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getNewAccessToken());
    assertNotEquals(
      getItemPublicTokenExchangeResponse().getAccessToken(),
      response.body().getNewAccessToken()
    );
  }

  @Test
  public void testInvalidAccessToken() throws Exception {
    ItemAccessTokenInvalidateRequest request = new ItemAccessTokenInvalidateRequest()
      .accessToken("not-real");

    Response<ItemAccessTokenInvalidateResponse> response = client()
      .itemAccessTokenInvalidate(request)
      .execute();

    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
