package com.plaid.client.model.paymentinitiation;

public class PaymentCreateOptions {
  private boolean requestRefundDetails;
  private Bacs bacs;
  private String iban;

  public PaymentCreateOptions withRefundDetails(boolean requestRefundDetails) {
    this.requestRefundDetails = requestRefundDetails;
    return this;
  }

  public PaymentCreateOptions withBacs(Bacs bacs) {
    this.bacs = bacs;
    return this;
  }

  public PaymentCreateOptions withIban(String iban) {
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
