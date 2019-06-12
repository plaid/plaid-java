package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for the /sandbox/item/fire_webhook endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/#TODO">https://plaid.com/docs/api/#TODO</a>
 */
public final class SandboxItemFireWebhookRequest extends BaseAccessTokenRequest {
  private String webhookCode;

  public SandboxItemFireWebhookRequest(String accessToken, String webhookCode) {
    super(accessToken);
    this.webhookCode = webhookCode;
  }
}
