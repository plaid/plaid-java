package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.integration.PaymentCreateTest;
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.LinkTokenCreateRequest;
import com.plaid.client.model.LinkTokenCreateRequestPaymentInitiation;
import com.plaid.client.model.LinkTokenCreateRequestUser;
import com.plaid.client.model.LinkTokenCreateResponse;
import com.plaid.client.model.PaymentInitiationPaymentCreateResponse;
import com.plaid.client.model.PaymentInitiationPaymentGetRequest;
import com.plaid.client.model.PaymentInitiationPaymentGetResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import org.junit.Test;
import retrofit2.Response;

public class PaymentGetTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentGetSuccess() throws Exception {
    Response<PaymentInitiationPaymentCreateResponse> createPaymentResponse = PaymentCreateTest.createPayment(
      client()
    );
    String paymentId = createPaymentResponse.body().getPaymentId();
    assertNotNull(paymentId);

    String clientUserId = Long.toString((new Date()).getTime());

    LinkTokenCreateRequestUser user = new LinkTokenCreateRequestUser()
    .clientUserId(clientUserId);

    LinkTokenCreateRequestPaymentInitiation paymentInitiation = new LinkTokenCreateRequestPaymentInitiation()
    .paymentId(paymentId);

    LinkTokenCreateRequest request = new LinkTokenCreateRequest()
      .user(user)
      .clientName("client name")
      .products(Arrays.asList(Products.PAYMENT_INITIATION))
      .countryCodes(Arrays.asList(CountryCode.US))
      .language("en")
      .paymentInitiation(paymentInitiation);

    Response<LinkTokenCreateResponse> response = client()
      .linkTokenCreate(request)
      .execute();
    assertSuccessResponse(response);

    PaymentInitiationPaymentGetRequest payRequest = new PaymentInitiationPaymentGetRequest()
      .paymentId(paymentId);

    Response<PaymentInitiationPaymentGetResponse> getPaymentResponse = client()
      .paymentInitiationPaymentGet(payRequest)
      .execute();
    assertSuccessResponse(getPaymentResponse);
    assertNotNull(getPaymentResponse.body().getPaymentId());
    assertNotNull(getPaymentResponse.body().getReference());
    assertNotNull(getPaymentResponse.body().getAmount());
    assertNotNull(getPaymentResponse.body().getStatus());
    assertNotNull(getPaymentResponse.body().getLastStatusUpdate());
    assertNotNull(getPaymentResponse.body().getRecipientId());
  }
}
