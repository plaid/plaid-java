package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.model.payment.Address;
import com.plaid.client.request.PaymentRecipientCreateRequest;
import com.plaid.client.response.PaymentRecipientCreateResponse;
import com.plaid.client.response.PaymentRecipientGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class PaymentRecipientCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a payment recipient.
   * Used by other integration tests to set up.
   */
  public static Response<PaymentRecipientCreateResponse> createPaymentRecipient(PlaidClient client) throws Exception {

    Address address = new Address(Arrays.asList("Street Name 999"), "City", "99999", "GB");
    PaymentRecipientCreateRequest paymentRecipientCreateRequest =
      new PaymentRecipientCreateRequest("John Doe", "GB33BUKB20201555555555", address);

    Response<PaymentRecipientCreateResponse> response =
      client.service().paymentRecipientCreate(paymentRecipientCreateRequest).execute();

    return response;
  }

  @Test
  public void testPaymentRecipientCreateSuccess() throws Exception {
    Response<PaymentRecipientCreateResponse> response = createPaymentRecipient(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }
}
