package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.plaid.client.model.BankTransferCancelRequest;
import com.plaid.client.model.BankTransferCancelResponse;
import com.plaid.client.model.BankTransferFailure;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.SandboxBankTransferSimulateRequest;
import com.plaid.client.model.SandboxBankTransferSimulateResponse;
import retrofit2.Response;

public class BankTransferCancelFailureTest extends AbstractBankTransferTest {

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    SandboxBankTransferSimulateRequest request = new SandboxBankTransferSimulateRequest()
      .bankTransferId(getBankTransfer().getId())
      .eventType("failed");

    Response<SandboxBankTransferSimulateResponse> simulateResponse = client()
      .sandboxBankTransferSimulate(request)
      .execute();

    assertSuccessResponse(simulateResponse);

    BankTransferCancelRequest cancelRequest = new BankTransferCancelRequest()
      .bankTransferId(getBankTransfer().getId());

    Response<BankTransferCancelResponse> cancelResponse = client()
      .bankTransferCancel(cancelRequest)
      .execute();

    Gson gson = new Gson();
    PlaidError error = gson.fromJson(
      cancelResponse.errorBody().string(),
      PlaidError.class
    );
    assertNotNull(error);
    assertNotNull(error.getRequestId());
    assertEquals(PlaidErrorType.BANK_TRANSFER_ERROR, error.getErrorType());
    assertEquals("BANK_TRANSFER_NOT_CANCELLABLE", error.getErrorCode());
  }
}
