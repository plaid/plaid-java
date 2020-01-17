package com.plaid.client.response;

import com.plaid.client.model.payment.Payment;

import java.util.List;

public final class PaymentListResponse extends BaseResponse {
  private List<Payment> payments;
  private String nextCursor;

  public List<Payment> getPayments() {
    return payments;
  }

  public String getNextCursor() {
    return nextCursor;
  }

}
