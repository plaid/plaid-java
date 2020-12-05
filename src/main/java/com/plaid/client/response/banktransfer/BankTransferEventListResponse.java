package com.plaid.client.response;

import com.plaid.client.model.banktransfer.BankTransferEvent;

public class BankTransferEventListResponse extends BaseResponse {
  private List<BankTransferEvent> bankTransferEvents;

  public String getBankTransferEvents() {
    return bankTransferEvents;
  }
}
