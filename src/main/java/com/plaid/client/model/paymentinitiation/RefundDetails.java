package com.plaid.client.model.paymentinitiation;

public class RefundDetails {
  private Bacs bacs;
  private String iban;
  private String name;

  public Bacs getBacs() {
    return bacs;
  }

  public String getIban() {
    return iban;
  }

  public String getName() {
    return name;
  }
}
