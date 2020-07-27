package com.plaid.client.request.paymentinitiation;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /payment_initiation/payment/get endpoint.
 */
public class PaymentGetRequest extends BaseClientRequest {
  private String paymentId;

  public PaymentGetRequest(String paymentId) {
    this.paymentId = paymentId;
  }
}
