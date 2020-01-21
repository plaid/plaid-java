package com.plaid.client.request.paymentinitiation;

import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.model.payment.Amount;

/**
 * Request for the /payment_initiation/payment/create endpoint.
 */
public final class PaymentCreateRequest extends BaseClientRequest {
  private String recipientId;
  private String reference;
  private Amount amount;

  public PaymentCreateRequest(String recipientId, String reference, Amount amount) {
    this.recipientId = recipientId;
    this.reference = reference;
    this.amount = amount;
  }

}
