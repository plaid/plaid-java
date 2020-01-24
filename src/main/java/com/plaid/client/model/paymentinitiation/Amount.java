package com.plaid.client.model.paymentinitiation;

public final class Amount {
  private String currency;
  private Double value;

  public Amount(String currency, Double value) {
    this.currency = currency;
    this.value = value;
  }

  public String getCurrency() {
    return currency;
  }

  public Double getValue() {
    return value;
  }
}
