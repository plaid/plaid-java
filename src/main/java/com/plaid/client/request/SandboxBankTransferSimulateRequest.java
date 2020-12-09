package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.model.banktransfer.BankTransferFailure;

public class SandboxBankTransferSimulateRequest extends BaseClientRequest {
  private String bankTransferId;
  private String eventType;
  private BankTransferFailure failureReason;

  public SandboxBankTransferSimulateRequest(String bankTransferId, String eventType) {
    this.bankTransferId = bankTransferId;
    this.eventType = eventType;
  }

  public SandboxBankTransferSimulateRequest withFailureReason(BankTransferFailure failureReason) {
    this.failureReason = failureReason;
    return this;
  }
}
