package com.plaid.client.model.payment;

import com.plaid.client.model.payment.Address;

public final class Recipient {
  private String recipientId;
  private String name;
  private String iban;
  private Address address;

  public String getRecipientId() {
    return recipientId;
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
