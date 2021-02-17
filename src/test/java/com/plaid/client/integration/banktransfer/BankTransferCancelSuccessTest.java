package com.plaid.client.integration.banktransfer;

import com.plaid.client.model.BankTransferCancelRequest;
import com.plaid.client.model.BankTransferCancelResponse;
import retrofit2.Response;

public class BankTransferCancelSuccessTest extends AbstractBankTransferTest {

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    BankTransferCancelRequest cancelRequest = new BankTransferCancelRequest()
      .bankTransferId(getBankTransfer().getId());

    Response<BankTransferCancelResponse> response = client()
      .bankTransferCancel(cancelRequest)
      .execute();
    assertSuccessResponse(response);
  }
}
