package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

public class BankTransferGetRequest extends BaseClientRequest {
  private Integer bankTransferId;

  public BankTransferGetRequest(String bankTransferId) {
    this.bankTransferId = bankTransferId;
  }
}
