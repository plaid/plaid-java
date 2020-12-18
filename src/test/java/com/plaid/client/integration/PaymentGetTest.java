package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Collections;
import java.util.Date;

import com.plaid.client.request.LinkTokenCreateRequest;
import com.plaid.client.request.paymentinitiation.PaymentGetRequest;
import com.plaid.client.response.LinkTokenCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentGetResponse;

import org.junit.Test;

import retrofit2.Response;

public class PaymentGetTest extends AbstractIntegrationTest {

  @Test
  public void testSingleImmediatePaymentGetSuccess() throws Exception {

    Response<PaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createSingleImmediatePayment(client());
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    String clientUserId = Long.toString((new Date()).getTime());
    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    Response<LinkTokenCreateResponse> response = client().service()
        .linkTokenCreate(new LinkTokenCreateRequest(user, "client name",
            Collections.singletonList("payment_initiation"), Collections.singletonList("GB"), "en")
                .withPaymentInitiation(new LinkTokenCreateRequest.PaymentInitiation(paymentId)))
        .execute();
    assertSuccessResponse(response);

    Response<PaymentGetResponse> getPaymentResponse = client().service().paymentGet(new PaymentGetRequest(paymentId))
        .execute();
    assertSuccessResponse(getPaymentResponse);
    assertNotNull(getPaymentResponse.body().getPaymentId());
    assertNotNull(getPaymentResponse.body().getReference());
    assertNotNull(getPaymentResponse.body().getAmount());
    assertNull(getPaymentResponse.body().getSchedule());
    assertNotNull(getPaymentResponse.body().getStatus());
    assertNotNull(getPaymentResponse.body().getLastStatusUpdate());
    assertNotNull(getPaymentResponse.body().getRecipientId());
  }

  @Test
  public void testStandingOrderGetSuccess() throws Exception {

    Response<PaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createStandingOrder(client());
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    String clientUserId = Long.toString((new Date()).getTime());
    LinkTokenCreateRequest.User user = new LinkTokenCreateRequest.User(clientUserId);
    Response<LinkTokenCreateResponse> response = client().service()
        .linkTokenCreate(new LinkTokenCreateRequest(user, "client name",
            Collections.singletonList("payment_initiation"), Collections.singletonList("GB"), "en")
                .withPaymentInitiation(new LinkTokenCreateRequest.PaymentInitiation(paymentId)))
        .execute();
    assertSuccessResponse(response);

    Response<PaymentGetResponse> getPaymentResponse = client().service().paymentGet(new PaymentGetRequest(paymentId))
        .execute();
    assertSuccessResponse(getPaymentResponse);
    assertNotNull(getPaymentResponse.body().getPaymentId());
    assertNotNull(getPaymentResponse.body().getReference());
    assertNotNull(getPaymentResponse.body().getAmount());
    assertNotNull(getPaymentResponse.body().getSchedule());
    assertNotNull(getPaymentResponse.body().getStatus());
    assertNotNull(getPaymentResponse.body().getLastStatusUpdate());
    assertNotNull(getPaymentResponse.body().getRecipientId());
  }
}
