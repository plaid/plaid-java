package com.plaid.client.model.banktransfer;

import java.util.Objects;

public class BankTransferUser {
  private String legalName;
  private String emailAddress;
  private String routingNumber;

  public BankTransferUser(String legalName) {
    this.legalName = legalName;
  }

  public BankTransferUser withEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  public BankTransferUser withRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  public String getLegalName() {
    return legalName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getRoutingNumber() {
    return routingNumber;
  }

  @Override public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    BankTransferUser that = (BankTransferUser) other;
    return Objects.equals(legalName, that.getLegalName()) &&
      Objects.equals(emailAddress, that.getEmailAddress()) &&
      Objects.equals(routingNumber, that.getRoutingNumber());
  }
}
