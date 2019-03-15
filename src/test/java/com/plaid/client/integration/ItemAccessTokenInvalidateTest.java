package com.plaid.client.integration;

import com.plaid.client.request.ItemAccessTokenInvalidateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemAccessTokenInvalidateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ItemAccessTokenInvalidateTest extends AbstractItemIntegrationTest {
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
    Response<ItemAccessTokenInvalidateResponse> response = client().service().itemAccessTokenInvalidate(
      new ItemAccessTokenInvalidateRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getNewAccessToken());
    assertNotEquals(getItemPublicTokenExchangeResponse().getAccessToken(), response.body().getNewAccessToken());
  }

  @Test
  public void testInvalidAccessToken() throws Exception {
    Response<ItemAccessTokenInvalidateResponse> response = client().service().itemAccessTokenInvalidate(
      new ItemAccessTokenInvalidateRequest("not-real"))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }
}
