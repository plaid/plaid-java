package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for /item/public_token/exchange endpoint.
 */
public class ItemPublicTokenExchangeRequest extends BaseClientRequest {
  private String publicToken;

  public ItemPublicTokenExchangeRequest(String publicToken) {
    this.publicToken = publicToken;
  }
}
