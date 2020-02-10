package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /webhook_verification_key/get endpoint.
 */
public final class WebhookVerificationKeyGetRequest extends BaseClientRequest {
  private String keyId;

  public WebhookVerificationKeyGetRequest(String keyId) {
    this.keyId = keyId;
  }
}

