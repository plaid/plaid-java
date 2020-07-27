package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Payment;
import com.plaid.client.response.BaseResponse;

import java.util.List;

public class PaymentListResponse extends BaseResponse {
  private List<Payment> payments;
  private String nextCursor;

  public List<Payment> getPayments() {
    return payments;
  }

  public String getNextCursor() {
    return nextCursor;
  }

}
