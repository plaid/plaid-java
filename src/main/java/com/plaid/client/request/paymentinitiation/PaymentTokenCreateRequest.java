package com.plaid.client.request.paymentinitiation;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /payment_initiation/payment/token/create endpoint.
 */
public final class PaymentTokenCreateRequest extends BaseClientRequest {
  private String paymentId;

  public PaymentTokenCreateRequest(String paymentId) {
    this.paymentId = paymentId;
  }

}
