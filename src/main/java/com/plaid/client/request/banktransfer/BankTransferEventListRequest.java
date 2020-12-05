package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import java.util.ArrayList;
import java.util.List;

public class BankTransferEventListRequest extends BaseClientRequest {
  private String startDate;
  private String endDate;
  private String bankTransferId;
  private String accountId;
  private String bankTransferType;
  private List<String> eventTypes;
  private Integer count;
  private Integer offset;
  private String originationAccountId;
  private String direction;

  public BankTransferEventListRequest withStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public BankTransferEventListRequest WithEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public BankTransferEventListRequest WithBankTransferId(String bankTransferId) {
    this.bankTransferId = bankTransferId;
    return this;
  }

  public BankTransferEventListRequest withAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public BankTransferEventListRequest withBankTransferType(String bankTransferType) {
    this.bankTransferType = bankTransferType;
    return this;
  }

  public BankTransferEventListRequest withEventTypes(List<String> eventTypes) {
    this.eventTypes = new ArrayList<>(eventTypes);
    return this;
  }

  public BankTransferEventListRequest withCount(Integer count) {
    this.count = count;
    return this;
  }

  public BankTransferEventListRequest withOffset(Integer offset) {
    this.offset = offset;
    return this;
  }

  public BankTransferEventListRequest withOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
    return this;
  }

  public BankTransferEventListRequest withDirection(String direction) {
    this.direction = direction;
    return this;
  }
}
