package com.plaid.client.integration.banktransfer;

import static org.junit.Assert.assertEquals;

import com.plaid.client.model.BankTransferListRequest;
import com.plaid.client.model.BankTransferListResponse;
import retrofit2.Response;

public class BankTransferListTest extends AbstractBankTransferTest {

  @Override
  protected void bankTransferTest() throws AssertionError, Exception {
    BankTransferListRequest request = new BankTransferListRequest()
      .count(1);

    Response<BankTransferListResponse> response = client()
      .bankTransferList(request)
      .execute();
    assertSuccessResponse(response);
    assertEquals(1, response.body().getBankTransfers().size());
  }
}
