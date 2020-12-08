package com.plaid.client.integration.banktransfer;

import com.plaid.client.request.SandboxBankTransferSimulateRequest;
import com.plaid.client.request.banktransfer.BankTransferCancelRequest;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.SandboxBankTransferSimulateResponse;
import com.plaid.client.response.banktransfer.BankTransferCancelResponse;

import retrofit2.Response;

public class BankTransferCancelFailureTest extends AbstractBankTransferTest {
  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    Response<SandboxBankTransferSimulateResponse> simulateResponse = client().service().sandboxBankTransferSimulate(
      new SandboxBankTransferSimulateRequest(getBankTransfer().getId(), "failed")).execute();
    assertSuccessResponse(simulateResponse);
    Response<BankTransferCancelResponse> cancelResponse = client().service().bankTransferCancel(
      new BankTransferCancelRequest(getBankTransfer().getId())).execute();
    assertErrorResponse(cancelResponse, ErrorResponse.ErrorType.BANK_TRANSFER_ERROR, "BANK_TRANSFER_NOT_CANCELLABLE");
  }
};