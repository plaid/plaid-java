package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.SandboxPublicTokenCreateRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.SandboxPublicTokenCreateResponse;
import com.plaid.client.response.TransactionsGetResponse;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Arrays;
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
    Response<SandboxPublicTokenCreateResponse> createResponse =
      client().service().sandboxPublicTokenCreate(new SandboxPublicTokenCreateRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList(Product.TRANSACTIONS))).execute();

    assertSuccessResponse(createResponse);

    Response<ItemPublicTokenExchangeResponse> response =
      client().service().itemPublicTokenExchange(new ItemPublicTokenExchangeRequest(createResponse.body().getPublicToken())).execute();

    assertSuccessResponse(response);

    this.accessToken = response.body().getAccessToken();
    startDate = new Date(System.currentTimeMillis() - 86400000L * 100);
    endDate = new Date();
  }

  @Test
  public void testSuccess() throws Exception {
    TransactionsGetRequest request =
      new TransactionsGetRequest(accessToken, startDate, endDate)
        .withCount(100);

    Response<TransactionsGetResponse> response = null;
    for (int i = 0; i < 5; i++) {
      response = client().service().transactionsGet(request).execute();
      if (response.isSuccessful()) {
        break;
      } else {
        ErrorResponse errorResponse = client().parseError(response);
        assertEquals(errorResponse.getErrorCode(), "PRODUCT_NOT_READY");
        Thread.sleep(3000);
      }
    }
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
