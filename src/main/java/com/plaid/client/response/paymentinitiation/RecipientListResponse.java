package com.plaid.client.response.paymentinitiation;

import com.plaid.client.model.paymentinitiation.Address;
import com.plaid.client.model.paymentinitiation.Recipient;
import com.plaid.client.response.BaseResponse;

import java.util.List;

public class RecipientListResponse extends BaseResponse {
  private List<Recipient> recipients;

  public List<Recipient> getRecipients() {
    return recipients;
  }
}
