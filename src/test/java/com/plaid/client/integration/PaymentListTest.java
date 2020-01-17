package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.PaymentListRequest;
import com.plaid.client.response.PaymentCreateResponse;
import com.plaid.client.response.PaymentListResponse;
import com.plaid.client.integration.PaymentCreateTest;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PaymentListTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentListSuccess() throws Exception {

    Response<PaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createPayment(client());
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    Response<PaymentListResponse> listPaymentResponse =
      client().service().paymentList(new PaymentListRequest().withCount(10)).execute();
    assertSuccessResponse(listPaymentResponse);
    assertTrue(listPaymentResponse.body().getPayments().size() > 0);
    assertNotNull();
    if (listPaymentResponse.body().getNextCursor() != null) {
      String nextCursor = listPaymentResponse.body().getNextCursor();
      Response<PaymentListResponse> listPaymentResponseWithCursor =
        client().service().paymentList(new PaymentListRequest().withCursor(nextCursor)).execute();
      assertSuccessResponse(listPaymentResponseWithCursor);
    }
  }
}
