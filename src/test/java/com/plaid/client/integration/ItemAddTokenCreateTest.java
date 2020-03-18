package com.plaid.client.integration;

import com.plaid.client.request.ItemAddTokenCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemAddTokenCreateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemAddTokenCreateTest extends AbstractItemIntegrationTest {
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
    Response<ItemAddTokenCreateResponse> response =
      client().service().itemAddTokenCreate(new ItemAddTokenCreateRequest()).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getAddToken());
    assertTrue(response.body().getExpiration().after(new Date()));
  }
}
