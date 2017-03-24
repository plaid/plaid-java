package com.plaid.client.integration;

import com.plaid.client.request.CategoriesGetRequest;
import com.plaid.client.response.CategoriesGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CategoriesGetTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<CategoriesGetResponse> response = client().service().categoriesGet(
      new CategoriesGetRequest()
    ).execute();

    assertSuccessResponse(response);
    assertFalse(response.body().getCategories().isEmpty());

    CategoriesGetResponse.Category category = response.body().getCategories().get(0);
    assertEquals("10000000", category.getCategoryId());
    assertEquals("special", category.getGroup());
    assertEquals(Arrays.asList("Bank Fees"), category.getHierarchy());
  }
}
