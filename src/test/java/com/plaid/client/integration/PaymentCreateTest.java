package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.model.paymentinitiation.Amount;
import com.plaid.client.request.paymentinitiation.PaymentCreateRequest;
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;
import com.plaid.client.integration.RecipientCreateTest;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class PaymentCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a paymentinitiation.
   * Used by other integration tests to set up.
   */
  public static Response<PaymentCreateResponse> createPayment(PlaidClient client) throws Exception {

    Response<RecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithIban(client);
    String recipientId = createRecipientResponse.body().getRecipientId();
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
