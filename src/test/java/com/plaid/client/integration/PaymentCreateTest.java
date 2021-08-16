package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.plaid.client.PlaidClient;
import com.plaid.client.model.paymentinitiation.Amount;
import com.plaid.client.model.paymentinitiation.Bacs;
import com.plaid.client.model.paymentinitiation.PaymentCreateOptions;
import com.plaid.client.model.paymentinitiation.Schedule;
import com.plaid.client.request.paymentinitiation.PaymentCreateRequest;
import com.plaid.client.request.paymentinitiation.PaymentGetRequest;
import com.plaid.client.response.paymentinitiation.PaymentCreateResponse;
import com.plaid.client.response.paymentinitiation.PaymentGetResponse;
import com.plaid.client.response.paymentinitiation.RecipientCreateResponse;

import org.junit.Test;

import retrofit2.Response;

public class PaymentCreateTest extends AbstractIntegrationTest {

  /**
   * Utility method that creates a single immediate payment. Used by other
   * integration tests to set up.
   */
  public static Response<PaymentCreateResponse> createSingleImmediatePayment(PlaidClient client) throws Exception {

    Response<RecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithIban(client);
    String recipientId = createRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    Amount amount = new Amount("GBP", 999.99);
    PaymentCreateRequest paymentCreateRequest = new PaymentCreateRequest(recipientId, "reference", amount);

    Response<PaymentCreateResponse> response = client.service().paymentCreate(paymentCreateRequest).execute();

    return response;
  }

  /**
   * Utility method that creates a standing order. Used by other integration tests
   * to set up.
   */
  public static Response<PaymentCreateResponse> createStandingOrder(PlaidClient client) throws Exception {

    Response<RecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithIban(client);
    String recipientId = createRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    Amount amount = new Amount("GBP", 999.99);
    Date currentDate = new Date();
    Date date = new Date(currentDate.getTime() + TimeUnit.HOURS.toMillis(7 * 24));
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Schedule schedule = new Schedule("MONTHLY", 1, dateFormat.format(date));
    PaymentCreateRequest paymentCreateRequest = new PaymentCreateRequest(recipientId, "reference", amount, schedule);

    Response<PaymentCreateResponse> response = client.service().paymentCreate(paymentCreateRequest).execute();

    return response;
  }

  /**
   * Utility method that creates a single immediate payment with options. Used by other
   * integration tests to set up.
   */
  public static Response<PaymentCreateResponse> createSingleImmediatePaymentWithOptions(PlaidClient client, PaymentCreateOptions options) throws Exception {

    Response<RecipientCreateResponse> createRecipientResponse = RecipientCreateTest.createRecipientWithIban(client);
    String recipientId = createRecipientResponse.body().getRecipientId();
    assertNotNull(recipientId);

    Amount amount = new Amount("GBP", 999.99);
    PaymentCreateRequest paymentCreateRequest = new PaymentCreateRequest(recipientId, "reference", amount).withOptions(options);

    Response<PaymentCreateResponse> response = client.service().paymentCreate(paymentCreateRequest).execute();

    return response;
  }

  @Test
  public void testSingleImmediatePaymentCreateSuccess() throws Exception {
    Response<PaymentCreateResponse> response = createSingleImmediatePayment(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getPaymentId());
    assertNotNull(response.body().getStatus());
  }

  @Test
  public void testStandingOrderCreateSuccess() throws Exception {
    Response<PaymentCreateResponse> response = createStandingOrder(client());
    assertSuccessResponse(response);
    assertNotNull(response.body().getPaymentId());
    assertNotNull(response.body().getStatus());
  }

  @Test
  public void testSingleImmediatePaymentWithRequestRefundDetailsCreateSuccess() throws Exception {
    PaymentCreateOptions options = new PaymentCreateOptions().withRefundDetails(true);
    Response<PaymentCreateResponse> response = createSingleImmediatePaymentWithOptions(client(), options);
    assertSuccessResponse(response);
    assertNotNull(response.body().getPaymentId());
    assertNotNull(response.body().getStatus());
  }

  @Test
  public void testSingleImmediatePaymentWithBacsCreateSuccess() throws Exception {
    PaymentCreateOptions options = new PaymentCreateOptions().withBacs(new Bacs("1234567890", "000000"));
    Response<PaymentCreateResponse> response = createSingleImmediatePaymentWithOptions(client(), options);
    assertSuccessResponse(response);
    assertNotNull(response.body().getPaymentId());
    assertNotNull(response.body().getStatus());

    PaymentGetRequest request = new PaymentGetRequest(response.body().getPaymentId());
    Response<PaymentGetResponse> getResponse = client().service().paymentGet(request).execute();

    assertSuccessResponse(response);
    assertNotNull(getResponse.body().getPaymentId());
    assertNotNull(getResponse.body().getStatus());
    assertNotNull(getResponse.body().getBacs());
  }

  @Test
  public void testSingleImmediatePaymentWithIbanCreateSuccess() throws Exception {
    PaymentCreateOptions options = new PaymentCreateOptions().withIban("iban");
    Response<PaymentCreateResponse> response = createSingleImmediatePaymentWithOptions(client(), options);
    assertSuccessResponse(response);
    assertNotNull(response.body().getPaymentId());
    assertNotNull(response.body().getStatus());

    PaymentGetRequest request = new PaymentGetRequest(response.body().getPaymentId());
    Response<PaymentGetResponse> getResponse = client().service().paymentGet(request).execute();

    assertSuccessResponse(response);
    assertNotNull(getResponse.body().getPaymentId());
    assertNotNull(getResponse.body().getStatus());
    assertNotNull(getResponse.body().getIban());
  }
}
