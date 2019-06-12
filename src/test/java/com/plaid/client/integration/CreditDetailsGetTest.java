package com.plaid.client.integration;

import com.plaid.client.request.CreditDetailsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.CreditDetailsGetResponse;
import com.plaid.client.response.ErrorResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreditDetailsGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.CREDIT_DETAILS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    Response<CreditDetailsGetResponse> response = client()
      .service()
      .creditDetailsGet(new CreditDetailsGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();

    assertSuccessResponse(response);
    CreditDetailsGetResponse creditDetailsGetResponse = response.body();
    assertItemEquals(getItem(), creditDetailsGetResponse.getItem());
    assertEquals(1, creditDetailsGetResponse.getCreditDetails().size());
    CreditDetailsGetResponse.CreditDetail detail = creditDetailsGetResponse.getCreditDetails().get(0);
    assertNotNull(detail.getAccountId());
    assertNotNull(detail.getLastPaymentAmount());
    assertNotNull(detail.getLastPaymentDate());
    assertNotNull(detail.getLastStatementBalance());
    assertNotNull(detail.getLastStatementDate());
    assertNotNull(detail.getMinimumPaymentAmount());
    assertNotNull(detail.getNextBillDueDate());
    assertNotNull(detail.getAprs());

    assertAprNotNull(detail.getAprs().getBalanceTransfers());
    assertAprNotNull(detail.getAprs().getCashAdvances());
    assertAprNotNull(detail.getAprs().getPurchases());
  }

  @Test
  public void testInvalidAccessKey() throws Exception {
    Response<CreditDetailsGetResponse> response = client()
      .service()
      .creditDetailsGet(new CreditDetailsGetRequest("whatever"))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }

  private static void assertAprNotNull(CreditDetailsGetResponse.Apr apr) {
    assertNotNull(apr);
    assertNotNull(apr.getApr());
    assertNotNull(apr.getBalanceSubjectToApr());
    assertNotNull(apr.getInterestChargeAmount());
  }
}
