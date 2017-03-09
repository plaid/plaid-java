package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request object for /transactions/deactivate endpoint.
 */
public final class TransactionsDeactivateRequest extends BaseAccessTokenRequest {
  public TransactionsDeactivateRequest(String accessToken) {
    super(accessToken);
  }
}
