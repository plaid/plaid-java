package com.plaid.client.response;

import java.util.Date;

/**
 * Response from /sandbox/item/fire_webhook endpoint.
 */
public final class SandboxItemFireWebhookResponse extends BaseResponse {
  private boolean webhookFired;

  public boolean getWebhookFired() {
    return webhookFired;
  }
}
