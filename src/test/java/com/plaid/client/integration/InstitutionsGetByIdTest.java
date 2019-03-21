package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsGetByIdRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.Institution;
import com.plaid.client.response.InstitutionsGetByIdResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InstitutionsGetByIdTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
        institutionsGetById(new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertFalse(institution.getCredentials().isEmpty());
    for (Institution.Credential c : institution.getCredentials()) {
      assertNotNull(c.getLabel());
      assertNotNull(c.getType());
      assertNotNull(c.getName());
    }
    assertIsValidInstitution(institution);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsGetByIdResponse> response =
        client().service().institutionsGetById(
            new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID).withIncludeOptionalMetadata(true))
        .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertFalse(institution.getCredentials().isEmpty());
    for (Institution.Credential c : institution.getCredentials()) {
      assertNotNull(c.getLabel());
      assertNotNull(c.getType());
      assertNotNull(c.getName());
    }

    assertIsValidInstitution(institution);

    assertEquals("https://www.plaid.com/", institution.getUrl());
    assertEquals("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", institution.getLogo());
    assertEquals("#174e7c", institution.getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
        institutionsGetById(new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID).
            withIncludeOptionalMetadata(false))
        .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertFalse(institution.getCredentials().isEmpty());
    for (Institution.Credential c : institution.getCredentials()) {
      assertNotNull(c.getLabel());
      assertNotNull(c.getType());
      assertNotNull(c.getName());
    }

    assertIsValidInstitution(institution);

    assertEquals(null, institution.getUrl());
    assertEquals(null, institution.getLogo());
    assertEquals(null, institution.getPrimaryColor());
  }

  private void assertIsValidInstitution(Institution institution) {
    assertTrue(institution.hasMfa());
    assertEquals(TARTAN_BANK_INSTITUTION_ID, institution.getInstitutionId());
    assertEquals(Arrays.asList("code", "list", "questions", "selections"), institution.getMfa());
    assertEquals("Tartan Bank", institution.getName());
    assertEquals(Arrays.asList(Product.ASSETS, Product.AUTH, Product.BALANCE,
        Product.TRANSACTIONS, Product.CREDIT_DETAILS, Product.INCOME, Product.IDENTITY),
        institution.getProducts());
  }

  @Test
  public void testInvalidInstitution() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().institutionsGetById(
      new InstitutionsGetByIdRequest("notreal"))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_INSTITUTION");
  }
}
