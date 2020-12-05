package com.plaid.client.response;

import com.plaid.client.model.banktransfer.BankTransferBalance;

public class BankTransferBalanceGetResponse extends BaseResponse {
  private BankTransferBalance balance;
  private String originationAccountId;

  public BankTransferBalance getBalance() {
    return balance;
  }

  public String getOriginationAccountId() {
    return originationAccountId;
  }
}
