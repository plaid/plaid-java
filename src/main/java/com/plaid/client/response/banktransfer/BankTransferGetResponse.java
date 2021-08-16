package com.plaid.client.response.banktransfer;

import com.plaid.client.model.banktransfer.BankTransfer;
import com.plaid.client.response.BaseResponse;

public class BankTransferGetResponse extends BaseResponse {
  private BankTransfer bankTransfer;

  public BankTransfer getBankTransfer() {
    return bankTransfer;
  }
}
