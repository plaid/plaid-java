package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import com.plaid.client.request.InstitutionsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Institution;
import com.plaid.client.response.InstitutionsGetResponse;

import org.junit.Test;

import retrofit2.Response;

public class InstitutionsGetTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(new InstitutionsGetRequest(3, 0, Arrays.asList("US"))).execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithProducts() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(
            new InstitutionsGetRequest(3, 0, Arrays.asList("US")).withProducts(Arrays.asList(Product.IDENTITY)))
        .execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(new InstitutionsGetRequest(3, 0, Arrays.asList("US")).withIncludeOptionalMetadata(true))
        .execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(new InstitutionsGetRequest(3, 0, Arrays.asList("US")).withIncludeOptionalMetadata(false))
        .execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithCountryCodes() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(new InstitutionsGetRequest(3, 0, Arrays.asList("US"))).execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithOAuth() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(new InstitutionsGetRequest(3, 0, Arrays.asList("GB")).withOAuth(true)).execute();
    assertSuccessResponse(response);
    List<Institution> institutions = response.body().getInstitutions();
    assertEquals(3, institutions.size());
    for (int i = 0; i < institutions.size(); i++) {
      assertTrue(institutions.get(i).getOAuth());
    }
  }

  @Test
  public void testSuccessWithoutOAuth() throws Exception {
    Response<InstitutionsGetResponse> response = client().service()
        .institutionsGet(new InstitutionsGetRequest(3, 0, Arrays.asList("GB")).withOAuth(false)).execute();
    assertSuccessResponse(response);
    List<Institution> institutions = response.body().getInstitutions();
    for (int i = 0; i < institutions.size(); i++) {
      assertFalse(institutions.get(i).getOAuth());
    }
  }

  @Test
  public void testRequestValidation() throws Exception {
    try {
      new InstitutionsGetRequest(0, 0, Arrays.asList("US"));
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
    }
    try {
      new InstitutionsGetRequest(501, 0, Arrays.asList("US"));
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
    }
    try {
      new InstitutionsGetRequest(1, -1, Arrays.asList("US"));
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
    }
  }
}
