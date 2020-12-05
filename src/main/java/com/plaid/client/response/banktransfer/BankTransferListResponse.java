package com.plaid.client.response;

import com.plaid.client.model.banktransfer.BankTransfer;

public class BankTransferListResponse extends BaseResponse {
  private List<BankTransfer> bankTransfers;

  public String getBankTransfers() {
    return bankTransfers;
  }
}
