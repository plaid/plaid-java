package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.model.paymentinitiation.Address;
import com.plaid.client.request.paymentinitiation.RecipientCreateRequest;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class RecipientCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a payment recipient.
   * Used by other integration tests to set up.
   */
  public static Response<RecipientCreateResponse> createRecipient(PlaidClient client) throws Exception {

    Address address = new Address(Arrays.asList("Street Name 999"), "City", "99999", "GB");
    RecipientCreateRequest RecipientCreateRequest =
      new RecipientCreateRequest("John Doe", "GB33BUKB20201555555555", address);

    Response<RecipientCreateResponse> response =
      client.service().recipientCreate(RecipientCreateRequest).execute();

    return response;
  }

  @Test
  public void testRecipientCreateSuccess() throws Exception {
    Response<RecipientCreateResponse> response = createRecipient(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }
}
