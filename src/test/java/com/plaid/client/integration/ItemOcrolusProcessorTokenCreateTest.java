package com.plaid.client.integration;

import com.plaid.client.request.ItemOcrolusProcessorTokenCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemOcrolusProcessorTokenCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ItemOcrolusProcessorTokenCreateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testError() throws Exception {
    Response<ItemOcrolusProcessorTokenCreateResponse> response =
      client().service().itemOcrolusProcessorTokenCreate(new ItemOcrolusProcessorTokenCreateRequest(getItemPublicTokenExchangeResponse().getAccessToken(), "FooBarAccountId")).execute();
    // Just assert that some error was returned - due to the nature of the
    // integration and required configuration at the API key level, we don't
    // know the exact error code to expect.
    assertFalse(response.isSuccessful());
    assertNotNull(response.errorBody());

    ErrorResponse errorResponse = client().parseError(response);
    assertNotNull(errorResponse);
    assertNotNull(errorResponse.getRequestId());
  }
}
