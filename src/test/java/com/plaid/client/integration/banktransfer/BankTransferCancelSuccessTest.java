package com.plaid.client.integration.banktransfer;

import com.plaid.client.request.banktransfer.BankTransferCancelRequest;
import com.plaid.client.response.banktransfer.BankTransferCancelResponse;

import retrofit2.Response;

public class BankTransferCancelSuccessTest extends AbstractBankTransferTest {
  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    Response<BankTransferCancelResponse> response =  client().service().bankTransferCancel(
      new BankTransferCancelRequest(getBankTransfer().getId())).execute();
    assertSuccessResponse(response);
  }
};