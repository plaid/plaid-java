package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.integration.RecipientCreateTest;
import com.plaid.client.model.PaymentInitiationRecipientCreateResponse;
import com.plaid.client.model.PaymentInitiationRecipientGetRequest;
import com.plaid.client.model.PaymentInitiationRecipientGetResponse;
import java.util.Arrays;
import org.junit.Test;
import retrofit2.Response;

public class RecipientGetTest extends AbstractIntegrationTest {

  @Test
  public void testRecipientGetSuccessWithIban() throws Exception {
    Response<PaymentInitiationRecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithIban(
      client()
    );
    String recipientId = createRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    PaymentInitiationRecipientGetRequest request = new PaymentInitiationRecipientGetRequest()
      .recipientId(recipientId);

    Response<PaymentInitiationRecipientGetResponse> getRecipientResponse = client()
      .paymentInitiationRecipientGet(request)
      .execute();
    assertSuccessResponse(getRecipientResponse);
    assertNotNull(getRecipientResponse.body().getRecipientId());
    assertNotNull(getRecipientResponse.body().getName());
    assertNotNull(getRecipientResponse.body().getIban());
    assertNotNull(getRecipientResponse.body().getAddress());
  }

  @Test
  public void testRecipientGetSuccessWithBacs() throws Exception {
    Response<PaymentInitiationRecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithBacs(
      client()
    );
    String recipientId = createRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    PaymentInitiationRecipientGetRequest request = new PaymentInitiationRecipientGetRequest()
      .recipientId(recipientId);

    Response<PaymentInitiationRecipientGetResponse> getRecipientResponse = client()
      .paymentInitiationRecipientGet(request)
      .execute();

    assertSuccessResponse(getRecipientResponse);
    assertNotNull(getRecipientResponse.body().getRecipientId());
    assertNotNull(getRecipientResponse.body().getName());
    assertNotNull(getRecipientResponse.body().getBacs());
    assertNotNull(getRecipientResponse.body().getAddress());
  }
}
