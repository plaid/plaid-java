package com.plaid.client.request.banktransfer;

import com.plaid.client.request.common.BaseClientRequest;

public class BankTransferGetRequest extends BaseClientRequest {
  private String bankTransferId;

  public BankTransferGetRequest(String bankTransferId) {
    this.bankTransferId = bankTransferId;
  }
}
