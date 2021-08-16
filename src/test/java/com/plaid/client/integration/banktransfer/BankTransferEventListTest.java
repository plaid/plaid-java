package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertEquals;

import com.plaid.client.model.BankTransferEventListRequest;
import com.plaid.client.model.BankTransferEventListResponse;
import com.plaid.client.model.SandboxBankTransferSimulateRequest;
import com.plaid.client.model.SandboxBankTransferSimulateResponse;
import com.plaid.client.model.BankTransferEvent;
import java.util.List;
import retrofit2.Response;

public class BankTransferEventListTest extends AbstractBankTransferTest {

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    SandboxBankTransferSimulateRequest request = new SandboxBankTransferSimulateRequest()
      .bankTransferId(getBankTransfer().getId())
      .eventType("posted");

    Response<SandboxBankTransferSimulateResponse> simulateResponse = client()
      .sandboxBankTransferSimulate(request)
      .execute();
    assertSuccessResponse(simulateResponse);

    BankTransferEventListRequest listRequest = new BankTransferEventListRequest()
      .bankTransferId(getBankTransfer().getId());

    Response<BankTransferEventListResponse> eventListResponse = client()
      .bankTransferEventList(listRequest)
      .execute();
    assertSuccessResponse(eventListResponse);
    List<BankTransferEvent> bankTransferEvents = eventListResponse
      .body()
      .getBankTransferEvents();
    assertEquals(1, bankTransferEvents.size());
    for (BankTransferEvent e : bankTransferEvents) {
      assertEquals(getBankTransfer().getId(), e.getBankTransferId());
    }
  }
}
