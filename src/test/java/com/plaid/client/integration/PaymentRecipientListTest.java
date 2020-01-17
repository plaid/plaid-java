package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.PaymentRecipientListRequest;
import com.plaid.client.response.PaymentRecipientCreateResponse;
import com.plaid.client.response.PaymentRecipientListResponse;
import com.plaid.client.integration.PaymentRecipientCreateTest;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PaymentRecipientListTest extends AbstractIntegrationTest {

  @Test
  public void testPaymentRecipientListSuccess() throws Exception {

    Response<PaymentRecipientCreateResponse> createPaymentRecipientResponse = PaymentRecipientCreateTest.createPaymentRecipient(client());
    assertNotNull(createPaymentRecipientResponse.body().getRecipientId());

    Response<PaymentRecipientListResponse> listPaymentRecipientResponse =
      client().service().paymentRecipientList(new PaymentRecipientListRequest()).execute();
    assertSuccessResponse(listPaymentRecipientResponse);
    assertTrue(listPaymentRecipientResponse.body().getRecipients().size() > 0);
  }
}
