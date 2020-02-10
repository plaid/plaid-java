package com.plaid.client.response.depositswitch;

import com.plaid.client.response.BaseResponse;

public final class DepositSwitchGetResponse extends BaseResponse {
  private String depositSwitchId;
  private String targetItemId;
  private String targetAccountId;
  private String state;
  private String dateCreated;
  private String dateCompleted;

  public String getDepositSwitchId() {
    return depositSwitchId;
  }

  public String getTargetItemId() {
    return targetItemId;
  }

  public String getTargetAccountId() {
    return targetAccountId;
  }

  public String getState() {
    return state;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public String getdateCompleted() {
    return dateCompleted;
  }
}
