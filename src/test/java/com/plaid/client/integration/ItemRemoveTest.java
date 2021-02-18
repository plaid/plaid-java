package com.plaid.client.integration;

import static org.junit.Assert.assertTrue;

import com.plaid.client.model.ItemRemoveRequest;
import com.plaid.client.model.ItemRemoveResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class ItemRemoveTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    ItemRemoveRequest request = new ItemRemoveRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<ItemRemoveResponse> response = client()
      .itemRemove(request)
      .execute();

    assertSuccessResponse(response);
  }
}
