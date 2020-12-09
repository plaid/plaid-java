package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertEquals;

import com.plaid.client.request.banktransfer.BankTransferGetRequest;
import com.plaid.client.response.banktransfer.BankTransferGetResponse;

import retrofit2.Response;

public class BankTransferGetTest extends AbstractBankTransferTest {
  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    Response<BankTransferGetResponse> response = client().service().bankTransferGet(
      new BankTransferGetRequest(getBankTransfer().getId())
    ).execute();
    assertSuccessResponse(response);
    assertEquals(getBankTransfer(), response.body().getBankTransfer());
  }
};