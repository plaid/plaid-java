package com.plaid.client.integration;

import com.plaid.client.request.IncomeGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.IncomeGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class IncomeGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.INCOME);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testFailure() throws Exception {

    Response<IncomeGetResponse> response = client().service().incomeGet(
      new IncomeGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())
    ).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.ITEM_ERROR, "PRODUCT_NOT_READY");
  }
}
