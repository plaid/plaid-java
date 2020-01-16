package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.PaymentRecipientGetRequest;
import com.plaid.client.response.PaymentRecipientCreateResponse;
import com.plaid.client.response.PaymentRecipientGetResponse;
import com.plaid.client.integration.PaymentRecipientCreateTest;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class PaymentRecipientGetTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentRecipientGetSuccess() throws Exception {

    Response<PaymentRecipientCreateResponse> createPaymentRecipientResponse = PaymentRecipientCreateTest.createPaymentRecipient(client());
    String recipientId = createPaymentRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    Response<PaymentRecipientGetResponse> getPaymentRecipientResponse =
      client().service().paymentRecipientGet(new PaymentRecipientGetRequest(recipientId)).execute();
    assertSuccessResponse(getPaymentRecipientResponse);
    assertNotNull(getPaymentRecipientResponse.body().getRecipientId());
    assertNotNull(getPaymentRecipientResponse.body().getName());
    assertNotNull(getPaymentRecipientResponse.body().getIban());
    assertNotNull(getPaymentRecipientResponse.body().getAddress());
  }
}
