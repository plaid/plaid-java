package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.plaid.client.model.CountryCode;
import com.plaid.client.model.Institution;
import com.plaid.client.model.InstitutionsGetRequest;
import com.plaid.client.model.InstitutionsGetRequestOptions;
import com.plaid.client.model.InstitutionsGetResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class InstitutionsGetTest extends AbstractIntegrationTest {

  @Test
  public void testSuccess() throws Exception {
    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(4)
      .countryCodes(Arrays.asList(CountryCode.US));
    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithProducts() throws Exception {
    InstitutionsGetRequestOptions options = new InstitutionsGetRequestOptions();
    options.products(Arrays.asList(Products.IDENTITY));

    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(4)
      .countryCodes(Arrays.asList(CountryCode.US))
      .options(options);

    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    InstitutionsGetRequestOptions options = new InstitutionsGetRequestOptions();
    options.includeOptionalMetadata(true);

    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(4)
      .countryCodes(Arrays.asList(CountryCode.US))
      .options(options);

    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    InstitutionsGetRequestOptions options = new InstitutionsGetRequestOptions();
    options.includeOptionalMetadata(false);

    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(4)
      .countryCodes(Arrays.asList(CountryCode.US))
      .options(options);

    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();
    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithCountryCodes() throws Exception {
    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(4)
      .countryCodes(Arrays.asList(CountryCode.US));

    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();
    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithOAuth() throws Exception {
    InstitutionsGetRequestOptions options = new InstitutionsGetRequestOptions();
    options.oauth(true);

    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(1)
      .countryCodes(Arrays.asList(CountryCode.GB))
      .options(options);

    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();

    assertSuccessResponse(response);
    List<Institution> institutions = response.body().getInstitutions();
    assertEquals(3, institutions.size());
    // TODO: reenable this after institution fix for oauth filtering
    // for (int i = 0; i < institutions.size(); i++) {
    //   assertTrue(institutions.get(i).getOauth());
    // }
  }

  @Test
  public void testSuccessWithoutOAuth() throws Exception {
    InstitutionsGetRequestOptions options = new InstitutionsGetRequestOptions();
    options.oauth(false);

    InstitutionsGetRequest request = new InstitutionsGetRequest()
      .count(3)
      .offset(1)
      .countryCodes(Arrays.asList(CountryCode.GB))
      .options(options);

    Response<InstitutionsGetResponse> response = client()
      .institutionsGet(request)
      .execute();

    assertSuccessResponse(response);
    // TODO: reenable this after institution fix for oauth filtering
    List<Institution> institutions = response.body().getInstitutions();
    // for (int i = 0; i < institutions.size(); i++) {
    //   assertFalse(institutions.get(i).getOauth());
    // }
  }
}
