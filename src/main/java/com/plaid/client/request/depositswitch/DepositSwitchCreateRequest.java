package com.plaid.client.request.depositswitch;

import com.plaid.client.request.common.BaseClientRequest;

import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /deposit_switch/create endpoint.
 */
public final class DepositSwitchCreateRequest extends BaseClientRequest {
  private String targetAccountId;
  private String targetAccessToken;

  public DepositSwitchCreateRequest(String targetAccountId, String targetAccessToken) {
    notNull(targetAccountId, "targetAccountId");
    notNull(targetAccessToken, "targetaccessToken");
    this.targetAccountId = targetAccountId;
    this.targetAccessToken = targetAccessToken;
  }

}
