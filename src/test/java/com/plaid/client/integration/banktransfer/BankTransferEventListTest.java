package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertEquals;

import com.plaid.client.model.banktransfer.BankTransferEvent;
import com.plaid.client.request.SandboxBankTransferSimulateRequest;
import com.plaid.client.request.banktransfer.BankTransferEventListRequest;
import com.plaid.client.response.SandboxBankTransferSimulateResponse;
import com.plaid.client.response.banktransfer.BankTransferEventListResponse;

import org.junit.Before;
import java.util.List;

import retrofit2.Response;

public class BankTransferEventListTest extends AbstractBankTransferTest {
  @Before
  public void simulatePosted() throws AssertionError, Exception {
    Response<SandboxBankTransferSimulateResponse> simulateResponse = client().service().sandboxBankTransferSimulate(
      new SandboxBankTransferSimulateRequest(getBankTransfer().getId(), "posted")
    ).execute();
    assertSuccessResponse(simulateResponse);
  }

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    Response<BankTransferEventListResponse> eventListResponse = client().service().bankTransferEventList(
      new BankTransferEventListRequest().withBankTransferId(getBankTransfer().getId())
    ).execute();
    assertSuccessResponse(eventListResponse);
    List<BankTransferEvent> bankTransferEvents = eventListResponse.body().getBankTransferEvents();
    assertEquals(2, bankTransferEvents.size());
    for (BankTransferEvent e : bankTransferEvents) {
      assertEquals(getBankTransfer().getId(), e.getBankTransferId());
    }
  }
};
