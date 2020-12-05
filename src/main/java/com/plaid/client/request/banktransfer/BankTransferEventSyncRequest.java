package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class BankTransferEventSyncRequest extends BaseClientRequest {
  private Integer afterId;
  private Integer count;

  public BankTransferEventSyncRequest(Integer afterId) {
    this.afterId = afterId;
  }

  public BankTransferEventSyncRequest withCount(Integer count) {
    this.count = count;
    return this;
  }
}
