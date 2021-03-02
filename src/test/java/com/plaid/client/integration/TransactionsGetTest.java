package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.Gson;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.Error;
import com.plaid.client.model.ItemPublicTokenExchangeRequest;
import com.plaid.client.model.ItemPublicTokenExchangeResponse;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import com.plaid.client.model.Transaction;
import com.plaid.client.model.TransactionsGetRequest;
import com.plaid.client.model.TransactionsGetRequestOptions;
import com.plaid.client.model.TransactionsGetResponse;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import retrofit2.Response;

public class TransactionsGetTest extends AbstractIntegrationTest {

  private String accessToken;
  private LocalDate startDate;
  private LocalDate endDate;

  @Before
  public void setUp() throws Exception {
    SandboxPublicTokenCreateRequest request = new SandboxPublicTokenCreateRequest()
      .institutionId(TARTAN_BANK_INSTITUTION_ID)
      .initialProducts(Arrays.asList(Products.TRANSACTIONS));

    Response<SandboxPublicTokenCreateResponse> createResponse = client()
      .sandboxPublicTokenCreate(request)
      .execute();

    assertSuccessResponse(createResponse);

    ItemPublicTokenExchangeRequest exchangeRequest = new ItemPublicTokenExchangeRequest()
      .publicToken(createResponse.body().getPublicToken());

    Response<ItemPublicTokenExchangeResponse> response = client()
      .itemPublicTokenExchange(exchangeRequest)
      .execute();

    assertSuccessResponse(response);

    this.accessToken = response.body().getAccessToken();
    startDate = LocalDate.now().minusDays(365 * 2);
    endDate = LocalDate.now();
  }

  @Test
  public void testSuccess() throws Exception {
    TransactionsGetRequestOptions options = new TransactionsGetRequestOptions()
    .count(100);

    TransactionsGetRequest request = new TransactionsGetRequest()
      .accessToken(accessToken)
      .startDate(startDate)
      .endDate(endDate)
      .options(options);

    Response<TransactionsGetResponse> apiResponse = null;
    for (int i = 0; i < 5; i++) {
      apiResponse = client().transactionsGet(request).execute();
      if (apiResponse.isSuccessful()) {
        break;
      } else {
        try {
          assertErrorResponse(
            apiResponse,
            Error.ErrorTypeEnum.ITEM_ERROR,
            "PRODUCT_NOT_READY"
          );
          Thread.sleep(3000);
        } catch (Exception e) {}
      }
    }
    assertSuccessResponse(apiResponse);
    TransactionsGetResponse transactionResponse = apiResponse.body();
    assertNotNull(transactionResponse);
    assertNotNull(transactionResponse.getTotalTransactions());
    assertNotNull(transactionResponse.getItem());
    assertNotNull(transactionResponse.getAccounts());
    assertFalse(transactionResponse.getAccounts().isEmpty());
    assertTrue(transactionResponse.getTransactions().size() > 0);

    for (Transaction txn : transactionResponse.getTransactions()) {
      assertNotNull(txn.getTransactionId());
      assertNotNull(txn.getAccountId());
      assertNotNull(txn.getPending());
      assertNotNull(txn.getTransactionType());
      assertNotNull(txn.getPaymentMeta());
      assertNotNull(txn.getDate());
      assertNotNull(txn.getName());
      assertNotNull(txn.getAmount());
      assertNotNull(txn.getLocation());
      assertNotNull(txn.getPaymentChannel());
    }
  }

  @Test
  public void testFullyLoadedRequest() throws Exception {
    // get some account info
    AccountsGetRequest agRequest = new AccountsGetRequest()
      .accessToken(accessToken);

    Response<AccountsGetResponse> accountsGetResponse = client()
      .accountsGet(agRequest)
      .execute();
    assertSuccessResponse(accountsGetResponse);
    String someAccountId = accountsGetResponse
      .body()
      .getAccounts()
      .get(0)
      .getAccountId();

    // actual test
    int numTxns = 2;

    TransactionsGetRequestOptions options = new TransactionsGetRequestOptions()
      .accountIds(Arrays.asList(someAccountId))
      .count(numTxns)
      .offset(1);

    TransactionsGetRequest request = new TransactionsGetRequest()
      .accessToken(accessToken)
      .startDate(startDate)
      .endDate(endDate)
      .options(options);

    Response<TransactionsGetResponse> apiResponse = null;
    for (int i = 0; i < 5; i++) {
      apiResponse = client().transactionsGet(request).execute();
      if (apiResponse.isSuccessful()) {
        break;
      } else {
        try {
          assertErrorResponse(
            apiResponse,
            Error.ErrorTypeEnum.ITEM_ERROR,
            "PRODUCT_NOT_READY"
          );
          Thread.sleep(3000);
        } catch (Exception e) {}
      }
    }

    assertSuccessResponse(apiResponse);
    assertTrue(apiResponse.body().getTotalTransactions() > numTxns);
    assertEquals(numTxns, apiResponse.body().getTransactions().size());
  }

  @Test
  public void testBadAccessToken() throws Exception {
    TransactionsGetRequest request = new TransactionsGetRequest()
      .accessToken("totally-invalid-stuff")
      .startDate(LocalDate.now())
      .endDate(LocalDate.now());

    Response<TransactionsGetResponse> response = client()
      .transactionsGet(request)
      .execute();

    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
