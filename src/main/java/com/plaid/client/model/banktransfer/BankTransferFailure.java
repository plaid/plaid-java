package com.plaid.client.model.banktransfer;

import java.util.Objects;

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
    return Objects.equals(achReturnCode, that.getAchReturnCode()) &&
      Objects.equals(description, that.getDescription());
  }
}
