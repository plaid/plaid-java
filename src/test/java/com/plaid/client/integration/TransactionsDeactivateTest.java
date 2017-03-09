package com.plaid.client.integration;

import com.plaid.client.request.common.Product;
import com.plaid.client.request.TransactionsDeactivateRequest;
import com.plaid.client.response.TransactionsDeactivateResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class TransactionsDeactivateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    Response<TransactionsDeactivateResponse> response = client().service().transactionsDeactivate(
      new TransactionsDeactivateRequest(getItemCreateResponse().getAccessToken())
    ).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getMessage());
  }
}
