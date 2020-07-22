package com.plaid.client.request.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Address;
import com.plaid.client.model.paymentinitiation.Bacs;
import com.plaid.client.request.AssetReportCreateRequest;
import com.plaid.client.request.common.BaseClientRequest;

import java.util.List;

import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /payment_initiation/recipient/create endpoint.
 */
public final class RecipientCreateRequest extends BaseClientRequest {
  private String name;
  private String iban;
  private Address address;
  private Bacs bacs;

  public RecipientCreateRequest(String name) {
    this.name = name;
  }

  public RecipientCreateRequest withAddress(Address address) {
    this.address = address;
    return this;
  }

  public RecipientCreateRequest withIban(String iban) {
    this.iban = iban;
    return this;
  }

  public RecipientCreateRequest withBacs(Bacs bacs) {
    this.bacs = bacs;
    return this;
  }
}
