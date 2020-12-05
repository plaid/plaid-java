package com.plaid.client.response.banktransfer;

import com.plaid.client.model.banktransfer.BankTransferEvent;
import com.plaid.client.response.BaseResponse;
import java.util.List;

public class BankTransferEventSyncResponse extends BaseResponse {
  private List<BankTransferEvent> bankTransferEvents;

  public List<BankTransferEvent> getBankTransferEvents() {
    return bankTransferEvents;
  }
}
