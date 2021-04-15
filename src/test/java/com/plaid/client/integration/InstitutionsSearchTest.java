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
      client().service().institutionsSearch(new InstitutionsSearchRequest("t", Arrays.asList("US")).withProducts(Product.IDENTITY)).execute();

    assertSuccessResponse(response);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest("t", Arrays.asList("US")).withIncludeOptionalMetadata(true)).execute();

    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsSearchResponse> response =
        client().service().institutionsSearch(new InstitutionsSearchRequest("t", Arrays.asList("US")).withIncludeOptionalMetadata(false)).execute();

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
        client().service().institutionsSearch(new InstitutionsSearchRequest("wells", Arrays.asList("US"))
          .withAccountFilter(accountFilter)
          .withProducts(Product.LIABILITIES)
        ).execute();

    assertSuccessResponse(response);

    assertTrue(response.body().getInstitutions().size() > 0);
  }

  @Test
  public void testSuccessWithOAuth() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("Bank", Arrays.asList("GB")).withOAuth(true)).execute();
    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertTrue(institutionsSearchResponse.getInstitutions().get(0).getOAuth());
  }

  @Test
  public void testSuccessWithoutOAuth() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("Bank", Arrays.asList("GB")).withOAuth(false)).execute();
    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertFalse(institutionsSearchResponse.getInstitutions().get(0).getOAuth());
  }

  @Test
  public void testSuccessWithIncludePaymentInitiationMetadataTrue() throws Exception {
    Response<InstitutionsSearchResponse> response = client().service().
      institutionsSearch(new InstitutionsSearchRequest("Royal Bank of Plaid", Arrays.asList("GB")).withIncludePaymentInitiationMetadata(true)).execute();
    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getPaymentInitiationMetadata());
  }

  @Test
  public void testSuccessWithIncludePaymentInitiationMetadataFalse() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("Royal Bank of Plaid", Arrays.asList("GB")).withIncludePaymentInitiationMetadata(false)).execute();
    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNull(institutionsSearchResponse.getInstitutions().get(0).getPaymentInitiationMetadata());
  }

  @Test
  public void testNoResults() throws Exception {
    Response<InstitutionsSearchResponse> response =
      client().service().institutionsSearch(new InstitutionsSearchRequest("zebra", Arrays.asList("US"))).execute();

    assertSuccessResponse(response);
    assertEquals(0, response.body().getInstitutions().size());

  }
}
