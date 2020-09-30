package com.plaid.client.integration;

import com.plaid.client.request.InstitutionsGetByIdRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.Institution;
import com.plaid.client.response.InstitutionsGetByIdResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InstitutionsGetByIdTest extends AbstractIntegrationTest {
  @Test
  public void testSuccess() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
      institutionsGetById(new InstitutionsGetByIdRequest(Arrays.asList("US"), TARTAN_BANK_INSTITUTION_ID))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertFalse(institution.getCredentials().isEmpty());
    for (Institution.Credential c : institution.getCredentials()) {
      assertNotNull(c.getLabel());
      assertNotNull(c.getType());
      assertNotNull(c.getName());
    }
    assertIsTartanBank(institution);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsGetByIdResponse> response =
      client().service().institutionsGetById(
        new InstitutionsGetByIdRequest(Arrays.asList("US"), TARTAN_BANK_INSTITUTION_ID).withIncludeOptionalMetadata(
          true))
        .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertFalse(institution.getCredentials().isEmpty());
    for (Institution.Credential c : institution.getCredentials()) {
      assertNotNull(c.getLabel());
      assertNotNull(c.getType());
      assertNotNull(c.getName());
    }

    assertIsTartanBank(institution);

    assertEquals("https://www.plaid.com/", institution.getUrl());
    assertNotNull(institution.getLogo());
    assertEquals("#174e7c", institution.getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
      institutionsGetById(new InstitutionsGetByIdRequest(Arrays.asList("US"), TARTAN_BANK_INSTITUTION_ID).
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

    assertIsTartanBank(institution);

    assertEquals(null, institution.getUrl());
    assertEquals(null, institution.getLogo());
    assertEquals(null, institution.getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeStatusTrue() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
      institutionsGetById(new InstitutionsGetByIdRequest(Arrays.asList("US"), FIRST_PLATYPUS_BANK_INSTITUTION_ID).
        withIncludeStatus(true))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertNotNull(institution.getStatus());
    assertNotNull(institution.getStatus().getTransactionsUpdates());
    assertNotNull(institution.getStatus().getAuth());
    assertNotNull(institution.getStatus().getBalance());
    assertNotNull(institution.getStatus().getIdentity());
    assertIsFirstPlatypusBank(institution);
  }

  @Test
  public void testSuccessWithIncludeStatusFalse() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
      institutionsGetById(new InstitutionsGetByIdRequest(Arrays.asList("US"), TARTAN_BANK_INSTITUTION_ID).
        withIncludeStatus(false))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertNull(institution.getStatus());
    assertIsTartanBank(institution);
  }

  private void assertIsTartanBank(Institution institution) {
    assertTrue(institution.hasMfa());
    assertEquals(TARTAN_BANK_INSTITUTION_ID, institution.getInstitutionId());
    assertEquals(Arrays.asList("code", "list", "questions", "selections"), institution.getMfa());
    assertEquals("Tartan Bank", institution.getName());
    assertEquals(Arrays.asList(
      Product.ASSETS,
      Product.AUTH,
      Product.BALANCE,
      Product.TRANSACTIONS,
      Product.CREDIT_DETAILS,
      Product.INCOME,
      Product.IDENTITY,
      Product.INVESTMENTS,
      Product.LIABILITIES
      ),
      institution.getProducts());
    assertTrue(institution.getCountryCodes().contains("US"));
  }

  private void assertIsFirstPlatypusBank(Institution institution) {
    assertTrue(institution.hasMfa());
    assertEquals(FIRST_PLATYPUS_BANK_INSTITUTION_ID, institution.getInstitutionId());
    assertEquals(Arrays.asList("code", "list", "questions", "selections"), institution.getMfa());
    assertEquals("First Platypus Bank", institution.getName());
    assertEquals(Arrays.asList(
      Product.ASSETS,
      Product.AUTH,
      Product.BALANCE,
      Product.TRANSACTIONS,
      Product.CREDIT_DETAILS,
      Product.INCOME,
      Product.IDENTITY,
      Product.INVESTMENTS,
      Product.LIABILITIES
      ),
      institution.getProducts());
    assertTrue(institution.getCountryCodes().contains("US"));
  }

  @Test
  public void testInvalidInstitution() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().institutionsGetById(
      new InstitutionsGetByIdRequest(Arrays.asList("US"), "notreal"))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_INSTITUTION");
  }
}
