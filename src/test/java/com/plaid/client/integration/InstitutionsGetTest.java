package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Institution;
import com.plaid.client.response.InstitutionsGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InstitutionsGetTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsGetResponse> response =
      client().service().institutionsGet(new InstitutionsGetRequest(3, 0)).execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithProducts() throws Exception {
    Response<InstitutionsGetResponse> response =
    client().service().institutionsGet(new InstitutionsGetRequest(3, 0).
      withCountryCodes(Arrays.asList("US")).
      withProducts(Arrays.asList(Product.IDENTITY))).
    execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsGetResponse> response =
        client().service().institutionsGet(new InstitutionsGetRequest(3, 0).withIncludeOptionalMetadata(true)).execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsGetResponse> response =
        client().service().institutionsGet(new InstitutionsGetRequest(3, 0).withIncludeOptionalMetadata(false)).execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testSuccessWithCountryCodes() throws Exception {
    Response<InstitutionsGetResponse> response =
    client().service().institutionsGet(new InstitutionsGetRequest(3, 0).withCountryCodes(Arrays.asList("US"))).execute();

    assertSuccessResponse(response);

    // check number returned
    assertEquals(3, response.body().getInstitutions().size());
  }

  @Test
  public void testRequestValidation() throws Exception {
    try {
      new InstitutionsGetRequest(0, 0);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
    }
    try {
      new InstitutionsGetRequest(501, 0);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
    }
    try {
      new InstitutionsGetRequest(1, -1);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
    }
  }
}
