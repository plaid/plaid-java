package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.paymentinitiation.PaymentGetRequest;
import com.plaid.client.request.paymentinitiation.PaymentTokenCreateRequest;
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentGetResponse;
import com.plaid.client.response.paymentinitiation.PaymentTokenCreateResponse;
import com.plaid.client.integration.PaymentCreateTest;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class PaymentGetTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentGetSuccess() throws Exception {

    Response<PaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createPayment(client());
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    Response<PaymentTokenCreateResponse> createPaymentTokenResponse =
      client().service().paymentTokenCreate(new PaymentTokenCreateRequest(paymentId)).execute();
    assertSuccessResponse(createPaymentTokenResponse);

    Response<PaymentGetResponse> getPaymentResponse =
      client().service().paymentGet(new PaymentGetRequest(paymentId)).execute();
    assertSuccessResponse(getPaymentResponse);
    assertNotNull(getPaymentResponse.body().getPaymentId());
    assertNotNull(getPaymentResponse.body().getReference());
    assertNotNull(getPaymentResponse.body().getAmount());
    assertNotNull(getPaymentResponse.body().getStatus());
    assertNotNull(getPaymentResponse.body().getLastStatusUpdate());
    assertNotNull(getPaymentResponse.body().getRecipientId());
    assertNotNull(getPaymentResponse.body().getPaymentToken());
  }
}
