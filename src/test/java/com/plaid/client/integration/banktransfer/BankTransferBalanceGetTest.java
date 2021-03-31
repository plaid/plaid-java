package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.model.BankTransferBalanceGetRequest;
import com.plaid.client.model.BankTransferBalanceGetResponse;
import org.junit.Test;
import retrofit2.Response;

public class BankTransferBalanceGetTest extends AbstractIntegrationTest {

  @Test
  public void testBankTransferBalanceGet() throws Exception {
    BankTransferBalanceGetRequest request = new BankTransferBalanceGetRequest();

    Response<BankTransferBalanceGetResponse> response = client()
      .bankTransferBalanceGet(request)
      .execute();
    assertSuccessResponse(response);
    assertNotNull(response.body().getBalance());
    assertFalse(response.body().getBalance().getAvailable().isEmpty());
  }
}
