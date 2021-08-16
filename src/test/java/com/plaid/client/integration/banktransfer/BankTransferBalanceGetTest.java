package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.request.banktransfer.BankTransferBalanceGetRequest;
import com.plaid.client.response.banktransfer.BankTransferBalanceGetResponse;

import org.junit.Test;

import retrofit2.Response;

public class BankTransferBalanceGetTest extends AbstractIntegrationTest {
  @Test
  public void testBankTransferBalanceGet() throws Exception {
    Response<BankTransferBalanceGetResponse> response = client().service()
      .bankTransferBalanceGet(new BankTransferBalanceGetRequest()).execute();
    assertSuccessResponse(response);
    assertNotNull(response.body().getBalance());
    assertFalse(response.body().getBalance().getAvailable().isEmpty());
  }
};
