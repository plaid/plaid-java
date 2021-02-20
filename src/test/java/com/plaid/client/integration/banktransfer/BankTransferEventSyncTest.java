package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertTrue;

import com.plaid.client.model.BankTransferEventSyncRequest;
import com.plaid.client.model.BankTransferEventSyncResponse;
import com.plaid.client.model.SandboxBankTransferSimulateRequest;
import com.plaid.client.model.SandboxBankTransferSimulateResponse;
import retrofit2.Response;

public class BankTransferEventSyncTest extends AbstractBankTransferTest {

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    SandboxBankTransferSimulateRequest request = new SandboxBankTransferSimulateRequest()
      .bankTransferId(getBankTransfer().getId())
      .eventType("posted");

    Response<SandboxBankTransferSimulateResponse> simulateResponse = client()
      .sandboxBankTransferSimulate(request)
      .execute();
    assertSuccessResponse(simulateResponse);

    BankTransferEventSyncRequest syncRequest = new BankTransferEventSyncRequest()
      .afterId(0);

    Response<BankTransferEventSyncResponse> eventSyncResponse = client()
      .bankTransferEventSync(syncRequest)
      .execute();
    assertSuccessResponse(eventSyncResponse);
    assertTrue(eventSyncResponse.body().getBankTransferEvents().size() >= 2);
  }
}
