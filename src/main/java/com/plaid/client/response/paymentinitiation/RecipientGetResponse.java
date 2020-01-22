package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.payment.Address;
import com.plaid.client.response.BaseResponse;
import java.util.List;

public final class RecipientGetResponse extends BaseResponse {
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
