package com.plaid.client.response.banktransfer;

import com.plaid.client.model.banktransfer.BankTransferBalance;
import com.plaid.client.response.BaseResponse;

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
