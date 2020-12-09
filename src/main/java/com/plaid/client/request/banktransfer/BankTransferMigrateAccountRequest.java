package com.plaid.client.request.banktransfer;

import com.plaid.client.request.common.BaseClientRequest;

public class BankTransferMigrateAccountRequest extends BaseClientRequest {
  private String accountNumber;
  private String routingNumber;
  private String accountType;

  public BankTransferMigrateAccountRequest(
    String accountNumber,
    String routingNumber,
    String accountType
  ) {
    this.accountNumber = accountNumber;
    this.routingNumber = routingNumber;
    this.accountType = accountType;
  }
}
