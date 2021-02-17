package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.integration.PaymentCreateTest;
import com.plaid.client.model.PaymentInitiationPaymentCreateResponse;
import com.plaid.client.model.PaymentInitiationPaymentListRequest;
import com.plaid.client.model.PaymentInitiationPaymentListResponse;
import org.junit.Test;
import retrofit2.Response;

public class PaymentListTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentListSuccess() throws Exception {
    Response<PaymentInitiationPaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createPayment(
      client()
    );
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    PaymentInitiationPaymentListRequest request = new PaymentInitiationPaymentListRequest()
      .count(10);

    Response<PaymentInitiationPaymentListResponse> listPaymentResponse = client()
      .paymentInitiationPaymentList(request)
      .execute();

    assertSuccessResponse(listPaymentResponse);
    assertTrue(listPaymentResponse.body().getPayments().size() > 0);

    if (listPaymentResponse.body().getNextCursor() != null) {
      String nextCursor = listPaymentResponse.body().getNextCursor();
      PaymentInitiationPaymentListRequest cursorReq = new PaymentInitiationPaymentListRequest()
        .cursor(nextCursor);

      Response<PaymentInitiationPaymentListResponse> listPaymentResponseWithCursor = client()
        .paymentInitiationPaymentList(cursorReq)
        .execute();
      assertSuccessResponse(listPaymentResponseWithCursor);
    }
  }
}
