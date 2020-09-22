package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.LinkTokenCreateRequest;
import com.plaid.client.request.paymentinitiation.PaymentGetRequest;
import com.plaid.client.response.LinkTokenCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentGetResponse;
import com.plaid.client.integration.PaymentCreateTest;
import org.junit.Test;
import java.util.Collections;
import java.util.Date;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class PaymentGetTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentGetSuccess() throws Exception {

    Response<PaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createPayment(client());
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    String clientUserId = Long.toString((new Date()).getTime());
    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    Response<LinkTokenCreateResponse> response = client().service().linkTokenCreate(
      new LinkTokenCreateRequest(
        user,
        "client name",
        Collections.singletonList("payment_initiation"),
        Collections.singletonList("US"),
        "en"
      ).withPaymentInitiation(new LinkTokenCreateRequest.PaymentInitiation(paymentId))
    ).execute();
    assertSuccessResponse(response);

    Response<PaymentGetResponse> getPaymentResponse =
      client().service().paymentGet(new PaymentGetRequest(paymentId)).execute();
    assertSuccessResponse(getPaymentResponse);
    assertNotNull(getPaymentResponse.body().getPaymentId());
    assertNotNull(getPaymentResponse.body().getReference());
    assertNotNull(getPaymentResponse.body().getAmount());
    assertNotNull(getPaymentResponse.body().getStatus());
    assertNotNull(getPaymentResponse.body().getLastStatusUpdate());
    assertNotNull(getPaymentResponse.body().getRecipientId());
  }
}
