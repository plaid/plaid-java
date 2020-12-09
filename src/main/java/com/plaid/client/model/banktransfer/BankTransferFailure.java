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

  @Override public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    BankTransferFailure that = (BankTransferFailure) other;
    return this.getAchReturnCode().equals(that.getAchReturnCode()) &&
      this.getDescription().equals(that.getDescription());
  }
}
