package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /item/public_token/exchange endpoint.
 */
public final class ApexProcessorTokenCreateRequest extends BaseAccessTokenRequest {
  private String accessToken;

  public ApexProcessorTokenCreateRequest(String accessToken) {
    super(accessToken);
  }
}
