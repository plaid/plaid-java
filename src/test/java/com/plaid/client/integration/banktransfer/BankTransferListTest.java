package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertEquals;

import com.plaid.client.request.banktransfer.BankTransferListRequest;
import com.plaid.client.response.banktransfer.BankTransferListResponse;

import retrofit2.Response;

public class BankTransferListTest extends AbstractBankTransferTest {
  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    Response<BankTransferListResponse> response = client().service().bankTransferList(
      new BankTransferListRequest().withCount(1)
    ).execute();
    assertSuccessResponse(response);
    assertEquals(1, response.body().getBankTransfers().size());
  }
};