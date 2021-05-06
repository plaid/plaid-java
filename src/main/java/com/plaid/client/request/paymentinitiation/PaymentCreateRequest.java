package com.plaid.client.request.paymentinitiation;

import com.plaid.client.internal.gson.Optional;
import com.plaid.client.model.paymentinitiation.Amount;
import com.plaid.client.model.paymentinitiation.PaymentOptions;
import com.plaid.client.model.paymentinitiation.Schedule;
import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /payment_initiation/payment/create endpoint.
 */
public class PaymentCreateRequest extends BaseClientRequest {
  private String recipientId;
  private String reference;
  private Amount amount;
  private Schedule schedule;
  private Optional<PaymentOptions> options = Optional.empty();

  public PaymentCreateRequest(String recipientId, String reference, Amount amount) {
    this.recipientId = recipientId;
    this.reference = reference;
    this.amount = amount;
  }

  public PaymentCreateRequest(String recipientId, String reference, Amount amount, Schedule schedule) {
    this.recipientId = recipientId;
    this.reference = reference;
    this.amount = amount;
    this.schedule = schedule;
  }

  public PaymentCreateRequest withOptions(PaymentOptions options) {
    this.options = Optional.of(options);
    return this;
  }
}
