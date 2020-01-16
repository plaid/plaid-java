package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.model.payment.Amount;
import com.plaid.client.request.PaymentCreateRequest;
import com.plaid.client.response.PaymentCreateResponse;
import com.plaid.client.response.PaymentRecipientCreateResponse;
import com.plaid.client.integration.PaymentRecipientCreateTest;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class PaymentCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a payment.
   * Used by other integration tests to set up.
   */
  public static Response<PaymentCreateResponse> createPayment(PlaidClient client) throws Exception {

    Response<PaymentRecipientCreateResponse> createPaymentRecipientResponse = PaymentRecipientCreateTest.createPaymentRecipient(client);
    String recipientId = createPaymentRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    Amount amount = new Amount("GBP", 999.99);
    PaymentCreateRequest paymentCreateRequest = new PaymentCreateRequest(recipientId, "reference", amount);

    Response<PaymentCreateResponse> response =
      client.service().paymentCreate(paymentCreateRequest).execute();

    return response;
  }

  @Test
  public void testPaymentCreateSuccess() throws Exception {
    Response<PaymentCreateResponse> response = createPayment(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getPaymentId());
    assertNotNull(response.body().getStatus());
  }
}
