package com.plaid.client.integration;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.InstitutionsSearchAccountFilter;
import com.plaid.client.model.InstitutionsSearchRequest;
import com.plaid.client.model.InstitutionsSearchRequestOptions;
import com.plaid.client.model.InstitutionsSearchResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import retrofit2.Response;

public class InstitutionsSearchTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .countryCodes(Arrays.asList(CountryCode.US))
      .products(Arrays.asList(Products.IDENTITY))
      .query("t");

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();
    assertSuccessResponse(response);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    InstitutionsSearchRequestOptions options = new InstitutionsSearchRequestOptions()
    .includeOptionalMetadata(true);

    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .countryCodes(Arrays.asList(CountryCode.US))
      .products(Arrays.asList(Products.IDENTITY))
      .query("t")
      .options(options);

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();
    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNotNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNotNull(
      institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor()
    );
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    InstitutionsSearchRequestOptions options = new InstitutionsSearchRequestOptions()
    .includeOptionalMetadata(false);

    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .countryCodes(Arrays.asList(CountryCode.US))
      .products(Arrays.asList(Products.IDENTITY))
      .query("t")
      .options(options);

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();
    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertNull(institutionsSearchResponse.getInstitutions().get(0).getUrl());
    assertNull(
      institutionsSearchResponse.getInstitutions().get(0).getPrimaryColor()
    );
  }

  @Test
  public void testSuccessWithOAuth() throws Exception {
    InstitutionsSearchRequestOptions options = new InstitutionsSearchRequestOptions()
    .oauth(true);

    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .countryCodes(Arrays.asList(CountryCode.GB))
      .products(Arrays.asList(Products.AUTH))
      .query("Pl")
      .options(options);

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();
    assertSuccessResponse(response);

    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    assertTrue(institutionsSearchResponse.getInstitutions().get(0).getOauth());
  }

  @Test
  public void testSuccessWithoutOAuth() throws Exception {
    InstitutionsSearchRequestOptions options = new InstitutionsSearchRequestOptions()
    .oauth(false);

    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .countryCodes(Arrays.asList(CountryCode.GB))
      .products(Arrays.asList(Products.AUTH))
      .query("Bank")
      .options(options);

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();

    assertSuccessResponse(response);
    InstitutionsSearchResponse institutionsSearchResponse = response.body();
    // TODO: reenable once oauth filtering is fixed
    // assertFalse(institutionsSearchResponse.getInstitutions().get(0).getOauth());
  }

  @Test
  public void testNoResults() throws Exception {
    InstitutionsSearchRequest request = new InstitutionsSearchRequest()
      .countryCodes(Arrays.asList(CountryCode.US))
      .products(Arrays.asList(Products.AUTH))
      .query("zebra");

    Response<InstitutionsSearchResponse> response = client()
      .institutionsSearch(request)
      .execute();

    assertSuccessResponse(response);
    assertEquals(0, response.body().getInstitutions().size());
  }
}
