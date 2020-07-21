package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Address;
import com.plaid.client.model.paymentinitiation.Bacs;
import com.plaid.client.response.BaseResponse;
import java.util.List;

public final class RecipientGetResponse extends BaseResponse {
  private String recipientId;
  private String name;
  private String iban;
  private Address address;
  private Bacs bacs;


  public Bacs getBacs() {
    return bacs;
  }

  public void setBacs(Bacs bacs) {
    this.bacs = bacs;
  }

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
