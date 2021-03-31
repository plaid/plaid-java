package com.plaid.client.integration;

import com.plaid.client.model.Error;
import com.plaid.client.model.Products;
import com.plaid.client.model.TransactionsRefreshRequest;
import com.plaid.client.model.TransactionsRefreshResponse;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class TransactionsRefreshTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Collections.singletonList(Products.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    TransactionsRefreshRequest request = new TransactionsRefreshRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<TransactionsRefreshResponse> response = client()
      .transactionsRefresh(request)
      .execute();
    assertSuccessResponse(response);
  }

  @Test
  public void testInvalidAccessKey() throws Exception {
    TransactionsRefreshRequest request = new TransactionsRefreshRequest()
      .accessToken("Bad Token");

    Response<TransactionsRefreshResponse> response = client()
      .transactionsRefresh(request)
      .execute();

    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
