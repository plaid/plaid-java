package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for /transactions/refresh endpoint.
 */
public final class TransactionsRefreshRequest extends BaseAccessTokenRequest {
  public TransactionsRefreshRequest(String accessToken) {
    super(accessToken);
  }
}
