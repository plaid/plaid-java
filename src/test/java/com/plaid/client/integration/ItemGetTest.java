package com.plaid.client.integration;

import com.plaid.client.request.ItemGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

public class ItemGetTest extends AbstractItemIntegrationTest {
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
    Response<ItemGetResponse> response =
      client().service().itemGet(new ItemGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())).execute();

    assertSuccessResponse(response);
    assertItemEquals(getItem(), response.body().getItem());
  }

  @Test
  public void testFailure() throws Exception {
    Response<ItemGetResponse> response =
      client().service().itemGet(new ItemGetRequest("not-a-token")).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testImmutableListsInResponses() throws Exception {
    // quick smoke tests to make sure that ImmutableListTypeAdapterFactory is installed and working
    // this test could really be anywhere
    Response<ItemGetResponse> response =
      client().service().itemGet(new ItemGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())).execute();

    assertSuccessResponse(response);
    response.body().getItem().getAvailableProducts().add(Product.IDENTITY);
  }
}
