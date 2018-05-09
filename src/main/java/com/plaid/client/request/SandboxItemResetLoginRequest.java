package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for the /sandbox/item/reset_login endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/#managing-item-states">https://plaid.com/docs/api/#managing-item-states</a>
 */
public final class SandboxItemResetLoginRequest extends BaseAccessTokenRequest {
  public SandboxItemResetLoginRequest(String accessToken) {
    super(accessToken);
  }
}