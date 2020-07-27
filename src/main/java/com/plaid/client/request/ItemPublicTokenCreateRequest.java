package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /item/public_token/create endpoint.
 */
public class ItemPublicTokenCreateRequest extends BaseAccessTokenRequest {
  public ItemPublicTokenCreateRequest(String accessToken) {
    super(accessToken);
  }
}
