package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request object for /item/access_token/invalidate endpoint.
 */
public class ItemAccessTokenInvalidateRequest extends BaseAccessTokenRequest {
  public ItemAccessTokenInvalidateRequest(String accessToken) {
    super(accessToken);
  }
}
