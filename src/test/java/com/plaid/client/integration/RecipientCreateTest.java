package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.request.PlaidApi;
import com.plaid.client.model.NullableRecipientBACS;
import com.plaid.client.model.PaymentInitiationAddress;
import com.plaid.client.model.PaymentInitiationRecipientCreateRequest;
import com.plaid.client.model.PaymentInitiationRecipientCreateResponse;
import java.util.Arrays;
import org.junit.Test;
import retrofit2.Response;


public class RecipientCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a payment recipient with an iban. Used by other integration tests
   * to set up.
   */
  public static Response<PaymentInitiationRecipientCreateResponse> createRecipientWithIban(
    PlaidApi client
  )
    throws Exception {
    PaymentInitiationAddress address = new PaymentInitiationAddress()
      .street(Arrays.asList("Street Name 999"))
      .city("City")
      .postalCode("99999")
      .country("GB");

    PaymentInitiationRecipientCreateRequest recipientCreateRequest = new PaymentInitiationRecipientCreateRequest()
      .name("John Doe")
      .iban("GB33BUKB20201555555555")
      .address(address);

    Response<PaymentInitiationRecipientCreateResponse> response = client
      .paymentInitiationRecipientCreate(recipientCreateRequest)
      .execute();

    return response;
  }

  /**
   * Utility method that creates a payment recipient with bacs. Used by other integration tests to
   * set up.
   */
  public static Response<PaymentInitiationRecipientCreateResponse> createRecipientWithBacs(
    PlaidApi client
  )
    throws Exception {
    PaymentInitiationAddress address = new PaymentInitiationAddress()
      .street(Arrays.asList("Street Name 999"))
      .city("City")
      .postalCode("99999")
      .country("GB");
    NullableRecipientBACS bacs = new NullableRecipientBACS()
      .account("26207729")
      .sortCode("560029");

    PaymentInitiationRecipientCreateRequest recipientCreateRequest = new PaymentInitiationRecipientCreateRequest()
      .name("John Doe")
      .bacs(bacs)
      .address(address);

    Response<PaymentInitiationRecipientCreateResponse> response = client
      .paymentInitiationRecipientCreate(recipientCreateRequest)
      .execute();

    return response;
  }

  public static Response<PaymentInitiationRecipientCreateResponse> createRecipientWithBacsAndIban(
    PlaidApi client
  )
    throws Exception {
    PaymentInitiationAddress address = new PaymentInitiationAddress()
      .street(Arrays.asList("Street Name 999"))
      .city("City")
      .postalCode("99999")
      .country("GB");

    NullableRecipientBACS bacs = new NullableRecipientBACS()
      .account("26207729")
      .sortCode("560029");

    PaymentInitiationRecipientCreateRequest recipientCreateRequest = new PaymentInitiationRecipientCreateRequest()
      .name("John Doe")
      .bacs(bacs)
      .iban("GB33BUKB20201555555555")
      .address(address);

    Response<PaymentInitiationRecipientCreateResponse> response = client
      .paymentInitiationRecipientCreate(recipientCreateRequest)
      .execute();

    return response;
  }

  @Test
  public void testRecipientCreateSuccessWithIban() throws Exception {
    Response<PaymentInitiationRecipientCreateResponse> response = createRecipientWithIban(
      client()
    );
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }

  @Test
  public void testRecipientCreateSuccessWithBacs() throws Exception {
    Response<PaymentInitiationRecipientCreateResponse> response = createRecipientWithBacs(
      client()
    );
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }

  @Test
  public void testRecipientCreateSuccessWithBacsAndIban() throws Exception {
    Response<PaymentInitiationRecipientCreateResponse> response = createRecipientWithBacsAndIban(
      client()
    );
    assertSuccessResponse(response);
    assertNotNull(response.body().getRecipientId());
  }
}
