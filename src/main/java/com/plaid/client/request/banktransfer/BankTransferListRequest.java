package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class BankTransferListRequest extends BaseClientRequest {
  private String startDate;
  private String endDate;
  private Integer count;
  private Integer offset;
  private String originationAccountId;
  private String direction;

  public BankTransferListRequest withStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public BankTransferListRequest WithEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public BankTransferListRequest withCount(Integer count) {
    this.count = count;
    return this;
  }

  public BankTransferListRequest withOffset(Integer offset) {
    this.offset = offset;
    return this;
  }

  public BankTransferListRequest withOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
    return this;
  }

  public BankTransferListRequest withDirection(String direction) {
    this.direction = direction;
    return this;
  }
}
