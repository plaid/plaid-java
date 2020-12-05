package com.plaid.client.model.banktransfer;

public class BankTransferFailure {
  private String achReturnCode;
  private String description;

  public BankTransferFailure(String achReturnCode, String description) {
    this.achReturnCode = achReturnCode;
    this.description = description;
  }

  public String getAchReturnCode() {
    return achReturnCode;
  }

  public String getDescription() {
    return description;
  }
}
