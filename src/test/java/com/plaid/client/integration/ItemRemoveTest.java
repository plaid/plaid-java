package com.plaid.client.integration;

import com.plaid.client.request.ItemRemoveRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ItemRemoveResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ItemRemoveTest extends AbstractItemIntegrationTest {
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
    Response<ItemRemoveResponse> response = client().service().itemRemove(
      new ItemRemoveRequest(getItemPublicTokenExchangeResponse().getAccessToken())
    ).execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getRemoved());
  }
}
