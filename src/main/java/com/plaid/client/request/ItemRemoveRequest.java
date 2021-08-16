package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /item/remove endpoint.
 */
public class ItemRemoveRequest extends BaseAccessTokenRequest {
  public ItemRemoveRequest(String accessToken) {
    super(accessToken);
  }
}
