package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertFalse;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.request.banktransfer.BankTransferMigrateAccountRequest;
import com.plaid.client.response.banktransfer.BankTransferMigrateAccountResponse;

import org.junit.Test;

import retrofit2.Response;

public class BankTransferMigrateAccountTest extends AbstractIntegrationTest {
  @Test
  public void testBankTransferMigrateAccount() throws Exception {
    Response<BankTransferMigrateAccountResponse> response = client().service()
      .bankTransferMigrateAccount(new BankTransferMigrateAccountRequest("100000000", "121122676", "checking"))
      .execute();
    assertSuccessResponse(response);
    assertFalse(response.body().getAccessToken().isEmpty());
    assertFalse(response.body().getAccountId().isEmpty());
  }
};
