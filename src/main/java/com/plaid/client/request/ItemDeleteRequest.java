package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /item/delete endpoint.
 */
public final class ItemDeleteRequest extends BaseAccessTokenRequest {
  public ItemDeleteRequest(String accessToken) {
    super(accessToken);
  }
}
