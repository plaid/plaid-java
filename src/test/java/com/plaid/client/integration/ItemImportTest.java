package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.model.ItemImportRequest;
import com.plaid.client.model.ItemImportRequestUserAuth;
import com.plaid.client.model.ItemImportRequestOptions;
import com.plaid.client.model.ItemImportResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;
import retrofit2.Response;

public class ItemImportTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    ItemImportRequestOptions options = new ItemImportRequestOptions()
    .webhook("https://some.webhook.example.com");

    ItemImportRequestUserAuth itemImportRequestUserAuth = new ItemImportRequestUserAuth()
      .userId("user_good")
      .authToken("pass_good");

    ItemImportRequest request = new ItemImportRequest()
      .products(Arrays.asList(Products.IDENTITY, Products.AUTH))
      .userAuth(itemImportRequestUserAuth)
      .options(options);

    Response<ItemImportResponse> response = client()
      .itemImport(request)
      .execute();
    assertSuccessResponse(response);
    assertNotNull(response.body().getAccessToken());
  }
}
