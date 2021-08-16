package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request object for /credit_details/get.
 */
public class CreditDetailsGetRequest extends BaseAccessTokenRequest {
  public CreditDetailsGetRequest(String accessToken) {
    super(accessToken);
  }
}
