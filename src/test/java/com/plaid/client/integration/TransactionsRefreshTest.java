package com.plaid.client.integration;

import com.plaid.client.request.TransactionsRefreshRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.TransactionsRefreshResponse;
import com.plaid.client.response.ErrorResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

public class TransactionsRefreshTest extends AbstractItemIntegrationTest {
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
    Response<TransactionsRefreshResponse> response = client()
      .service()
      .transactionsRefresh(new TransactionsRefreshRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();
    assertSuccessResponse(response);
  }

  @Test
  public void testInvalidAccessKey() throws Exception {
    Response<TransactionsRefreshResponse> response = client()
      .service()
      .transactionsRefresh(new TransactionsRefreshRequest("Bad Token"))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }
}
