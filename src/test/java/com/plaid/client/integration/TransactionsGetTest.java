package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.ItemCreateRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemCreateResponse;
import com.plaid.client.response.TransactionsGetResponse;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TransactionsGetTest extends AbstractIntegrationTest {
  private String accessToken;
  private Date startDate;
  private Date endDate;

  @Before
  public void setUp() throws Exception {
    Response<ItemCreateResponse> response = client().service().itemCreate(
      new ItemCreateRequest(
        TARTAN_BANK_INSTITUTION_ID,
        Collections.singletonList(Product.TRANSACTIONS)
      )
        .withOptionAwaitResults(true)
        .withCredentials("username", "user_good")
        .withCredentials("password", "pass_good")
    ).execute();

    assertSuccessResponse(response);

    this.accessToken = response.body().getAccessToken();
    startDate = new Date();
    endDate = new Date(System.currentTimeMillis() - 86400 * 10);
  }

  @Test
  public void testSuccess() throws Exception {
    TransactionsGetRequest request =
      new TransactionsGetRequest(accessToken, startDate, endDate)
        .withCount(100);
    Response<TransactionsGetResponse> response = client().service()
      .transactionsGet(request).execute();

    assertSuccessResponse(response);
    assertNotNull(response.body().getTotalTransactions());
    assertNotNull(response.body().getItem());
    assertNotNull(response.body().getAccounts());
    assertFalse(response.body().getAccounts().isEmpty());
    assertTrue(response.body().getTransactions().size() > 0);
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
      assertNotNull(txn.getIsoCurrencyCode());
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
        .withAccountIds(Collections.singletonList(someAccountId))
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
