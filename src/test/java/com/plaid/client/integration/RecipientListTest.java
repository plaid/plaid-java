package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.paymentinitiation.RecipientListRequest;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientListResponse;
import com.plaid.client.integration.RecipientCreateTest;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RecipientListTest extends AbstractIntegrationTest {

  @Test
  public void testRecipientListSuccess() throws Exception {

    Response<RecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipient(client());
    assertNotNull(createRecipientResponse.body().getRecipientId());

    Response<RecipientListResponse> listRecipientResponse =
      client().service().recipientList(new RecipientListRequest()).execute();
    assertSuccessResponse(listRecipientResponse);
    assertTrue(listRecipientResponse.body().getRecipients().size() > 0);
  }
}
