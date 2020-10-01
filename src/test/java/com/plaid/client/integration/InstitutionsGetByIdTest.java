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
      institutionsGetById(new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList("US")))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertIsTartanBank(institution);
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataTrue() throws Exception {
    Response<InstitutionsGetByIdResponse> response =
      client().service().institutionsGetById(
        new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList("US")).withIncludeOptionalMetadata(
          true))
        .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertIsTartanBank(institution);

    assertEquals("https://www.plaid.com/", institution.getUrl());
    assertNotNull(institution.getLogo());
    assertEquals("#174e7c", institution.getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeOptionalMetadataFalse() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
      institutionsGetById(new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList("US")).
        withIncludeOptionalMetadata(false))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertIsTartanBank(institution);

    assertEquals(null, institution.getUrl());
    assertEquals(null, institution.getLogo());
    assertEquals(null, institution.getPrimaryColor());
  }

  @Test
  public void testSuccessWithIncludeStatusTrue() throws Exception {
    Response<InstitutionsGetByIdResponse> response = client().service().
      institutionsGetById(new InstitutionsGetByIdRequest(FIRST_PLATYPUS_BANK_INSTITUTION_ID, Arrays.asList("US")).
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
      institutionsGetById(new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList("US")).
        withIncludeStatus(false))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertNull(institution.getStatus());
    assertIsTartanBank(institution);
  }

  private void assertIsTartanBank(Institution institution) {
    assertEquals(TARTAN_BANK_INSTITUTION_ID, institution.getInstitutionId());
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
    assertEquals(FIRST_PLATYPUS_BANK_INSTITUTION_ID, institution.getInstitutionId());
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
      new InstitutionsGetByIdRequest("notreal", Arrays.asList("US")))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_INSTITUTION");
  }
}
