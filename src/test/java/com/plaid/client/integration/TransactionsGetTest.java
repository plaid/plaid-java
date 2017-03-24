package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.ItemCreateRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemCreateResponse;
import com.plaid.client.response.TransactionsGetResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;

public class TransactionsGetTest extends AbstractIntegrationTest {
  private String accessToken;
  private Date startDate;
  private Date endDate;

  @Before
  public void setUp() throws Exception {
    Response<ItemCreateResponse> response = client().service().itemCreate(
      new ItemCreateRequest(
        TARTAN_BANK_INSTITUTION_ID,
        Arrays.asList(Product.TRANSACTIONS)
      )
        .withOptionAwaitResults(true)
        .withCredentials("username", "user_good")
        .withCredentials("password", "pass_good")
    ).execute();

    assertSuccessResponse(response);

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    this.accessToken = response.body().getAccessToken();
    startDate = simpleDateFormat.parse("2017-01-01");
    endDate = simpleDateFormat.parse("2017-02-01");
  }

  @Test
  public void testSuccess() throws Exception {
    Response<TransactionsGetResponse> response = client().service().transactionsGet(
      new TransactionsGetRequest(
        accessToken,
        startDate,
        endDate))
      .execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getTotalTransactions());
    assertNotNull(response.body().getItem());
    assertNotNull(response.body().getAccounts());
    assertFalse(response.body().getAccounts().isEmpty());
    for (TransactionsGetResponse.Transaction txn : response.body().getTransactions()) {
      assertNotNull(txn.getTransactionId());
      assertNotNull(txn.getAccountId());
      assertNotNull(txn.getPending());
      assertNotNull(txn.getTransactionType());
      assertNotNull(txn.getPaymentMeta());
      assertNotNull(txn.getDate());
      assertNotNull(txn.getName());
      assertNotNull(txn.getAmount());
      assertNotNull(txn.getLocation());
    }
  }

  // TODO: Enable test, see #7
  @Ignore
  public void testFullyLoadedRequest() throws Exception {
    // get some account info
    Response<AccountsGetResponse> accountsGetResponse =
      client().service().accountsGet(new AccountsGetRequest(accessToken)).execute();
    assertSuccessResponse(accountsGetResponse);
    String someAccountId = accountsGetResponse.body().getAccounts().get(0).getAccountId();

    // actual test
    int numTxns = 2;
    Response<TransactionsGetResponse> response = client().service().transactionsGet(
      new TransactionsGetRequest(
        accessToken,
        startDate,
        endDate)
        .withAccountIds(Arrays.asList(someAccountId))
        .withCount(numTxns)
        .withOffset(1)).execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getTotalTransactions() > numTxns);
    assertEquals(numTxns, response.body().getTransactions().size());
  }

  @Test
  public void testBadAccessToken() throws Exception {
    Response<TransactionsGetResponse> response = client().service().transactionsGet(
      new TransactionsGetRequest(
        "totally-invalid-stuff",
        new Date(),
        new Date()))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }
}
