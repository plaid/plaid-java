package com.plaid.client.response;

/**
 * Response from /item/webhook/update endpoint.
 */
public final class ItemWebhookUpdateResponse extends BaseResponse {
  private ItemStatus item;

  public ItemStatus getItem() {
	    return item;
  }
}
