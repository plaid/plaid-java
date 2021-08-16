package com.plaid.client.response.banktransfer;

import com.plaid.client.model.banktransfer.BankTransfer;
import com.plaid.client.response.BaseResponse;
import java.util.List;

public class BankTransferListResponse extends BaseResponse {
  private List<BankTransfer> bankTransfers;

  public List<BankTransfer> getBankTransfers() {
    return bankTransfers;
  }
}
