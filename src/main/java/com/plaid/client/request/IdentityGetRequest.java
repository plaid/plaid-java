package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /identity/get endpoint.
 */
public final class IdentityGetRequest extends BaseAccessTokenRequest {
  public IdentityGetRequest(String accessToken) {
    super(accessToken);
  }
}
