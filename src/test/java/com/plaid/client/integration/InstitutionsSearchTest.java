package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.InstitutionsSearchResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class InstitutionsSearchTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("US"), "t").withProducts(Product.IDENTITY)).execute();

    assertSuccessResponse(response);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("US"), "t").withIncludeOptionalMetadata(true)).execute();

    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("US"), "t").withIncludeOptionalMetadata(false)).execute();

    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();

    assertNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNull(institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor());
  }

  @Test
  public void testSuccessWithAccountFilter() throws Exception {
    Map<String, List<String>> accountFilter = new HashMap<>();
    accountFilter.put("loan", Arrays.asList("student"));

    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("US"), "wells")
          .withAccountFilter(accountFilter)
          .withProducts(Product.LIABILITIES)
        ).execute();

    assertSuccessResponse(response);

    assertTrue(response.body().getInstitutions().size() > 0);
  }

  @Test
  public void testSuccessWithOAuth() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("GB"), "Bank").withOAuth(true)).execute();
    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertTrue(institutionsSearchResponse.getInstitutions().get(0).getOAuth());
  }

  @Test
  public void testSuccessWithoutOAuth() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("GB"), "Bank").withOAuth(false)).execute();
    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertFalse(institutionsSearchResponse.getInstitutions().get(0).getOAuth());
  }

  @Test
  public void testNoResults() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest(Arrays.asList("US"), "zebra")).execute();

    assertSuccessResponse(response);
    assertEquals(0, response.body().getInstitutions().size());

  }
}
