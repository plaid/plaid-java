package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /income/get endpoint.
 */
public final class IncomeGetRequest extends BaseAccessTokenRequest {
  public IncomeGetRequest(String accessToken) {
    super(accessToken);
  }
}
