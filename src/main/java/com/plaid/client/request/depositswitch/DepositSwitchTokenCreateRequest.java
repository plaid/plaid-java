package com.plaid.client.request.depositswitch;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /deposit_switch/token/create endpoint.
 */
public class DepositSwitchTokenCreateRequest extends BaseClientRequest {
  private String depositSwitchId;

  public DepositSwitchTokenCreateRequest(String depositSwitchId) {
    this.depositSwitchId = depositSwitchId;
  }

}
