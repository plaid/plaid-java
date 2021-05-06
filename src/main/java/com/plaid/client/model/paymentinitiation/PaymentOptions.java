package com.plaid.client.model.paymentinitiation;

public class PaymentOptions {
  private boolean requestRefundDetails;
  private Bacs bacs;
  private String iban;

  public PaymentOptions withRefundDetails(boolean requestRefundDetails) {
    this.requestRefundDetails = requestRefundDetails;
    return this;
  }

  public PaymentOptions withBacs(Bacs bacs) {
    this.bacs = bacs;
    return this;
  }

  public PaymentOptions withIban(String iban) {
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
