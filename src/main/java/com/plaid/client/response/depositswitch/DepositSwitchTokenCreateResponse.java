package com.plaid.client.response.depositswitch;

import com.plaid.client.response.BaseResponse;

public final class DepositSwitchTokenCreateResponse extends BaseResponse {
  private String depositSwitchToken;
  private String depositSwitchTokenExpirationTime;

  public String getDepositSwitchToken() {
    return depositSwitchToken;
  }

  public String getDepositSwitchTokenExpirationTime() {
    return depositSwitchTokenExpirationTime;
  }
}
