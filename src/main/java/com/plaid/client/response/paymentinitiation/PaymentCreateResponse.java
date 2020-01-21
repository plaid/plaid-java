package com.plaid.client.response.paymentinitiation;

import com.plaid.client.response.BaseResponse;
import java.util.Date;

public final class PaymentCreateResponse extends BaseResponse {
  private String paymentId;
  private String status;

  public String getPaymentId() {
    return paymentId;
  }

  public String getStatus() {
    return status;
  }
}
