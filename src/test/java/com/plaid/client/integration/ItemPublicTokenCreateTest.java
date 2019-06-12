package com.plaid.client.integration;

import com.plaid.client.request.ItemPublicTokenCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemPublicTokenCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemPublicTokenCreateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    Response<ItemPublicTokenCreateResponse> response =
      client().service().itemPublicTokenCreate(new ItemPublicTokenCreateRequest(getItemPublicTokenExchangeResponse().getAccessToken())).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getPublicToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }

  @Test
  public void testBadAccessToken() throws Exception {
    Response<ItemPublicTokenCreateResponse> response =
      client().service().itemPublicTokenCreate(new ItemPublicTokenCreateRequest("nope-nope-nope")).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }
}
