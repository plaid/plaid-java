package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertTrue;

import com.plaid.client.request.SandboxBankTransferSimulateRequest;
import com.plaid.client.request.banktransfer.BankTransferEventSyncRequest;
import com.plaid.client.response.SandboxBankTransferSimulateResponse;
import com.plaid.client.response.banktransfer.BankTransferEventSyncResponse;

import retrofit2.Response;

public class BankTransferEventSyncTest extends AbstractBankTransferTest {
  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    Response<SandboxBankTransferSimulateResponse> simulateResponse = client().service().sandboxBankTransferSimulate(
      new SandboxBankTransferSimulateRequest(getBankTransfer().getId(), "posted")
    ).execute();
    assertSuccessResponse(simulateResponse);

    Response<BankTransferEventSyncResponse> eventSyncResponse = client().service().bankTransferEventSync(
      new BankTransferEventSyncRequest(0)
    ).execute();
    assertSuccessResponse(eventSyncResponse);
    assertTrue(eventSyncResponse.body().getBankTransferEvents().size() >= 2);
  }
};
