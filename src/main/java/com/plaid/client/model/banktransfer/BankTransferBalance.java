package com.plaid.client.model.banktransfer;

public class BankTransferBalance {
  private String available;

  public BankTransferBalance(String available) {
    this.available = available;
  }

  public String getAvailable() {
    return available;
  }

  @Override public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    BankTransferBalance that = (BankTransferBalance) other;
    return Objects.equals(available, that.getAvailable());
  }
}
