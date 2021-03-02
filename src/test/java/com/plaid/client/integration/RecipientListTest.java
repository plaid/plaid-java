package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.integration.RecipientCreateTest;
import com.plaid.client.model.PaymentInitiationRecipientCreateResponse;
import com.plaid.client.model.PaymentInitiationRecipientListRequest;
import com.plaid.client.model.PaymentInitiationRecipientListResponse;
import java.util.Arrays;
import org.junit.Test;
import retrofit2.Response;

public class RecipientListTest extends AbstractIntegrationTest {

  @Test
  public void testRecipientListSuccess() throws Exception {
    Response<PaymentInitiationRecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithIban(
      client()
    );
    assertNotNull(createRecipientResponse.body().getRecipientId());

    PaymentInitiationRecipientListRequest request = new PaymentInitiationRecipientListRequest();

    Response<PaymentInitiationRecipientListResponse> listRecipientResponse = client()
      .paymentInitiationRecipientList(request)
      .execute();
    assertSuccessResponse(listRecipientResponse);
    assertTrue(listRecipientResponse.body().getRecipients().size() > 0);
  }
}
