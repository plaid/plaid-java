package com.plaid.client.response.depositswitch;

import com.plaid.client.response.BaseResponse;

public class DepositSwitchCreateResponse extends BaseResponse {
  private String depositSwitchId;

  public String getDepositSwitchId() {
    return depositSwitchId;
  }
}
