package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /item/webhook/update endpoint.
 */
public final class ItemWebhookUpdateRequest extends BaseAccessTokenRequest {
  private String webhook;
	
  public ItemWebhookUpdateRequest(String accessToken, String webhook) {
    super(accessToken);
    this.webhook = webhook;
  }
}
