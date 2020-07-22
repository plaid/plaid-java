package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.model.paymentinitiation.Address;
import com.plaid.client.model.paymentinitiation.Bacs;
import com.plaid.client.request.paymentinitiation.RecipientCreateRequest;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;
import com.plaid.client.response.paymentinitiation.RecipientGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class RecipientCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a payment recipient with an iban.
   * Used by other integration tests to set up.
   */
  public static Response<RecipientCreateResponse> createRecipientWithIban(PlaidClient client) throws Exception {

    Address address = new Address(Arrays.asList("Street Name 999"), "City", "99999", "GB");
    RecipientCreateRequest recipientCreateRequest =
        new RecipientCreateRequest("John Doe").withIban("GB33BUKB20201555555555").withAddress(address);


    Response<RecipientCreateResponse> response =
      client.service().recipientCreate(recipientCreateRequest).execute();

    return response;
  }

  /**
   * Utility method that creates a payment recipient with bacs.
   * Used by other integration tests to set up.
   */
  public static Response<RecipientCreateResponse> createRecipientWithBacs(PlaidClient client) throws Exception {

    Address address = new Address(Arrays.asList("Street Name 999"), "City", "99999", "GB");
    RecipientCreateRequest recipientCreateRequest =
        new RecipientCreateRequest("John Doe").withAddress(address).withBacs(new Bacs("12345678", "01-02-03"));


    Response<RecipientCreateResponse> response =
        client.service().recipientCreate(recipientCreateRequest).execute();

    return response;
  }

  public static Response<RecipientCreateResponse> createRecipientWithBacsAndIban(PlaidClient client) throws Exception {

    Address address = new Address(Arrays.asList("Street Name 999"), "City", "99999", "GB");
    RecipientCreateRequest recipientCreateRequest =
        new RecipientCreateRequest("John Doe").withIban("GB33BUKB20201555555555").withAddress(address).withBacs(new Bacs("12345678", "01-02-03"));

    Response<RecipientCreateResponse> response =
        client.service().recipientCreate(recipientCreateRequest).execute();

    return response;
  }

  @Test
  public void testRecipientCreateSuccessWithIban() throws Exception {
    Response<RecipientCreateResponse> response = createRecipientWithIban(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }

  @Test
  public void testRecipientCreateSuccessWithBacs() throws Exception {
    Response<RecipientCreateResponse> response = createRecipientWithBacs(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }

  @Test
  public void testRecipientCreateSuccessWithBacsAndIban() throws Exception {
    Response<RecipientCreateResponse> response = createRecipientWithBacsAndIban(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }
}
