package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertFalse;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.model.BankTransferMigrateAccountRequest;
import com.plaid.client.model.BankTransferMigrateAccountResponse;
import org.junit.Test;
import retrofit2.Response;

public class BankTransferMigrateAccountTest extends AbstractIntegrationTest {

  @Test
  public void testBankTransferMigrateAccount() throws Exception {
    BankTransferMigrateAccountRequest request = new BankTransferMigrateAccountRequest()
      .accountNumber("100000000")
      .routingNumber("121122676")
      .accountType("checking");

    Response<BankTransferMigrateAccountResponse> response = client()
      .bankTransferMigrateAccount(request)
      .execute();

    assertSuccessResponse(response);
    assertFalse(response.body().getAccessToken().isEmpty());
    assertFalse(response.body().getAccountId().isEmpty());
  }
}
