package com.plaid.client.model.banktransfer;

import java.util.Objects;

public class BankTransferReceiverDetails {
  private String availableBalance;

  public String getAvailableBalance() {
    return availableBalance;
  }

  @Override public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    BankTransferReceiverDetails that = (BankTransferReceiverDetails) other;
    return Objects.equals(availableBalance, that.getAvailableBalance());
  }
}
