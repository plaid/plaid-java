package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /payment_initiation/payment/recipient/get endpoint.
 */
public final class PaymentRecipientGetRequest extends BaseClientRequest {
  private String recipientId;

  public PaymentRecipientGetRequest(String recipientId) {
    this.recipientId = recipientId;
  }
}
