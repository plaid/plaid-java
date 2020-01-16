package com.plaid.client.model.payment;

import com.plaid.client.model.payment.Address;

public final class Recipient {
  private String name;
  private String iban;
  private Address address;

  Recipient(String name, String iban, Address address) {
    this.name = name;
    this.iban = iban;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getIban() {
    return iban;
  }

  public Address getAddress() {
    return address;
  }
}
