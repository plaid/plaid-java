package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.InstitutionsSearchResponse;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;

public class InstitutionsSearchTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("t").withProducts(Product.IDENTITY)).execute();

    assertSuccessResponse(response);
  }

  @Test
  public void testSuccessWithIncludeInstitutionDataTrue() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest("t").withIncludeInstitutionData(true)).execute();

    assertSuccessResponse(response);
  }

  @Test
  public void testSuccessWithIncludeInstitutionDataFalse() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest("t").withIncludeInstitutionData(false)).execute();

    assertSuccessResponse(response);
  }

  @Test
  public void testNoResults() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("zebra")).execute();

    assertSuccessResponse(response);
    assertEquals(0, response.body().getInstitutions().size());
  }
}
