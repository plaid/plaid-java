package com.plaid.client.integration;

import com.plaid.client.PlaidClient;
import com.plaid.client.request.WebhookVerificationKeyGetRequest;
import com.plaid.client.response.WebhookVerificationKeyGetResponse;
import com.plaid.client.response.ErrorResponse;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class WebhookVerificationKeyGetTest extends AbstractIntegrationTest {

  @Test
  public void testWebhookVerificationKeyGetSuccess() throws Exception {

    Response<WebhookVerificationKeyGetResponse> getWebhookVerificationKeyResponse =
      client().service().getWebhookVerificationKey(new WebhookVerificationKeyGetRequest("6c5516e1-92dc-479e-a8ff-5a51992e0001")).execute();
    assertSuccessResponse(getWebhookVerificationKeyResponse);
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getAlg());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getCreatedAt());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getCrv());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getKid());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getKty());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getUse());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getX());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getY());
  }

  @Test
  public void testWebhookVerificationKeyGetFailure() throws Exception {
    Response<WebhookVerificationKeyGetResponse> response =
      client().service().getWebhookVerificationKey(new WebhookVerificationKeyGetRequest("not-a-key-id")).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_WEBHOOK_VERIFICATION_KEY_ID");
  }
}

