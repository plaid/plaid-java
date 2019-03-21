package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.InstitutionsSearchResponse;
import org.junit.Test;
import retrofit2.Response;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InstitutionsSearchTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("t").withProducts(Product.IDENTITY)).execute();

    assertSuccessResponse(response);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest("t").withIncludeOptionalMetadata(true)).execute();

    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest("t").withIncludeOptionalMetadata(false)).execute();

    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();

    assertNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNull(institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor());
  }

  @Test
  public void testNoResults() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("zebra")).execute();

    assertSuccessResponse(response);
    assertEquals(0, response.body().getInstitutions().size());

  }
}
