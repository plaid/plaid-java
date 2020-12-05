package com.plaid.client.model.banktransfer;

public class BankTransferBalance {
  private String available;

  public BankTransferBalance(String available) {
    this.available = available;
  }

  public String getAvailable() {
    return available;
  }
}
