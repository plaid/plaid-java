package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.payment.Address;
import com.plaid.client.model.payment.Recipient;
import com.plaid.client.response.BaseResponse;

import java.util.List;

public final class RecipientListResponse extends BaseResponse {
  private List<Recipient> recipients;

  public List<Recipient> getRecipients() {
    return recipients;
  }
}
