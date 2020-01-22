package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.paymentinitiation.RecipientGetRequest;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientGetResponse;
import com.plaid.client.integration.RecipientCreateTest;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class RecipientGetTest extends AbstractIntegrationTest {

  @Test
  public void testRecipientGetSuccess() throws Exception {

    Response<RecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipient(client());
    String recipientId = createRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    Response<RecipientGetResponse> getRecipientResponse =
      client().service().recipientGet(new RecipientGetRequest(recipientId)).execute();
    assertSuccessResponse(getRecipientResponse);
    assertNotNull(getRecipientResponse.body().getRecipientId());
    assertNotNull(getRecipientResponse.body().getName());
    assertNotNull(getRecipientResponse.body().getIban());
    assertNotNull(getRecipientResponse.body().getAddress());
  }
}
