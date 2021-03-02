package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertEquals;

import com.plaid.client.model.BankTransferGetRequest;
import com.plaid.client.model.BankTransferGetResponse;
import retrofit2.Response;

public class BankTransferGetTest extends AbstractBankTransferTest {

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    BankTransferGetRequest request = new BankTransferGetRequest()
      .bankTransferId(getBankTransfer().getId());

    Response<BankTransferGetResponse> response = client()
      .bankTransferGet(request)
      .execute();
    assertSuccessResponse(response);
    assertEquals(getBankTransfer(), response.body().getBankTransfer());
  }
}
