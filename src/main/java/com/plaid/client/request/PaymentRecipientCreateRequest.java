package com.plaid.client.request;

import com.plaid.client.model.payment.Address;
import com.plaid.client.request.common.BaseClientRequest;

import java.util.List;

/**
 * Request for the /payment_initiation/payment/recipient/create endpoint.
 */
public final class PaymentRecipientCreateRequest extends BaseClientRequest {
  private String name;
  private String iban;
  private Address address;

  public PaymentRecipientCreateRequest(String name, String iban, Address address) {
    this.name = name;
    this.iban = iban;
    this.address = address;
  }
}
