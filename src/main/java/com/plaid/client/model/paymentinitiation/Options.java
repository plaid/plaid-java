package com.plaid.client.model.paymentinitiation;

public class Options {
  private boolean requestRefundDetails;
  private Bacs bacs;
  private String iban;

  public Options() {
  }

  public Options withRefundDetails(boolean requestRefundDetails) {
    this.requestRefundDetails = requestRefundDetails;
    return this;
  }

  public Options withBacs(Bacs bacs) {
    this.bacs = bacs;
    return this;
  }

  public Options withIban(String iban) {
    this.iban = iban;
    return this;
  }

  public boolean getRequestRefundDetails() {
    return requestRefundDetails;
  }

  public Bacs getBacs() {
    return bacs;
  }

  public String getIban() {
    return iban;
  }
}
