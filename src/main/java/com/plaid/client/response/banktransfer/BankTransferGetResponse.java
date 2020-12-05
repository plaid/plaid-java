package com.plaid.client.response;

import com.plaid.client.model.banktransfer.BankTransfer;

public class BankTransferGetResponse extends BaseResponse {
  private BankTransfer bankTransfer;

  public BankTransfer getBankTransfer() {
    return bankTransfer;
  }
}
