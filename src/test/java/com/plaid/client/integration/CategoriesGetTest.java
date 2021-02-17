package com.plaid.client.integration;

// Empty class for constructing request
import com.plaid.client.model.Category;
import com.plaid.client.model.CategoriesGetResponse;
import org.junit.Test;
import retrofit2.Response;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CategoriesGetTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    Response<CategoriesGetResponse> response = client().categoriesGet(new Object()).execute();
    assertSuccessResponse(response);
    assertFalse(response.body().getCategories().isEmpty());

    Category category = response.body().getCategories().get(0);
    assertEquals("10000000", category.getCategoryId());
    assertEquals("special", category.getGroup());
    assertEquals(Arrays.asList("Bank Fees"), category.getHierarchy());
  }
}
