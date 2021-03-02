package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.Error;
import com.plaid.client.model.WebhookVerificationKeyGetRequest;
import com.plaid.client.model.WebhookVerificationKeyGetResponse;
import org.junit.Test;
import retrofit2.Response;

public class WebhookVerificationKeyGetTest extends AbstractIntegrationTest {

  @Test
  public void testWebhookVerificationKeyGetSuccess() throws Exception {
    WebhookVerificationKeyGetRequest request = new WebhookVerificationKeyGetRequest()
      .keyId("6c5516e1-92dc-479e-a8ff-5a51992e0001");

    Response<WebhookVerificationKeyGetResponse> getWebhookVerificationKeyResponse = client()
      .webhookVerificationKeyGet(request)
      .execute();
    assertSuccessResponse(getWebhookVerificationKeyResponse);
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getAlg());
    assertNotNull(
      getWebhookVerificationKeyResponse.body().getKey().getCreatedAt()
    );
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getCrv());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getKid());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getKty());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getUse());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getX());
    assertNotNull(getWebhookVerificationKeyResponse.body().getKey().getY());
  }

  @Test
  public void testWebhookVerificationKeyGetFailure() throws Exception {
    WebhookVerificationKeyGetRequest request = new WebhookVerificationKeyGetRequest()
      .keyId("not-a-key-id");

    Response<WebhookVerificationKeyGetResponse> response = client()
      .webhookVerificationKeyGet(request)
      .execute();

    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_INPUT,
      "INVALID_WEBHOOK_VERIFICATION_KEY_ID"
    );
  }
}
