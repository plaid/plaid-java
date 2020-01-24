package com.plaid.client.request.depositswitch;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /deposit_switch/get endpoint.
 */
public final class DepositSwitchGetRequest extends BaseClientRequest {
  private String depositSwitchId;

  public DepositSwitchGetRequest(String depositSwitchId) {
    this.depositSwitchId = depositSwitchId;
  }

}
