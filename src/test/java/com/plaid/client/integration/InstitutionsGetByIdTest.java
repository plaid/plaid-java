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
    Response<InstitutionsGetByIdResponse> response = client().service().institutionsGetById(new InstitutionsGetByIdRequest(TARTAN_BANK_INSTITUTION_ID))
      .execute();

    assertSuccessResponse(response);

    Institution institution = response.body().getInstitution();
    assertFalse(institution.getCredentials().isEmpty());
    for (Institution.Credential c : institution.getCredentials()) {
      assertNotNull(c.getLabel());
      assertNotNull(c.getType());
      assertNotNull(c.getName());
    }
    assertTrue(institution.hasMfa());
    assertEquals(TARTAN_BANK_INSTITUTION_ID, institution.getInstitutionId());
    assertEquals(Arrays.asList("code", "list", "questions", "selections"), institution.getMfa());
    assertEquals("Tartan Bank", institution.getName());
    assertEquals(Arrays.asList(Product.AUTH, Product.BALANCE, Product.TRANSACTIONS, Product.CREDIT_DETAILS, Product.INCOME, Product.IDENTITY),
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
