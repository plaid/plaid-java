package com.plaid.client.request.paymentinitiation;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /payment_initiation/payment/list endpoint.
 */
public class PaymentListRequest extends BaseClientRequest {
  private Integer count;
  private String cursor;

  public PaymentListRequest() {}

  public PaymentListRequest withCount(int count) {
    this.count = count;
    return this;
  }

  public PaymentListRequest withCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

}
