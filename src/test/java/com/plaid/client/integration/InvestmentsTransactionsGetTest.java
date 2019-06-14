package com.plaid.client.integration;

import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.SandboxPublicTokenCreateRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Account;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.InvestmentsTransactionsGetResponse;
import com.plaid.client.response.SandboxPublicTokenCreateResponse;
import com.plaid.client.response.Security;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class InvestmentsTransactionsGetTest extends AbstractIntegrationTest {
  private String accessToken;
  private Date startDate;
  private Date endDate;

  @Before
  public void setUp() throws Exception {
    Response<SandboxPublicTokenCreateResponse> createResponse =
      client().service().sandboxPublicTokenCreate(new SandboxPublicTokenCreateRequest(TARTAN_BANK_INSTITUTION_ID, Arrays.asList(Product.INVESTMENTS))).execute();

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
    InvestmentsTransactionsGetRequest request =
      new InvestmentsTransactionsGetRequest(accessToken, startDate, endDate)
        .withCount(100);

    Response<InvestmentsTransactionsGetResponse> response = null;
    for (int i = 0; i < 5; i++) {
      response = client().service().investmentsTransactionsGet(request).execute();
      if (response.isSuccessful()) {
        break;
      } else {
        ErrorResponse errorResponse = client().parseError(response);
        assertEquals(errorResponse.getErrorCode(), "PRODUCT_NOT_READY");
        Thread.sleep(3000);
      }
    }
    assertSuccessResponse(response);
    assertNotNull(response.body().getTotalInvestmentTransactions());
    assertNotNull(response.body().getItem());
    assertNotNull(response.body().getAccounts());
    assertFalse(response.body().getAccounts().isEmpty());
    assertTrue(response.body().getInvestmentTransactions().size() > 0);

    List<InvestmentsTransactionsGetResponse.InvestmentTransaction> investmentTransactions = response.body().getInvestmentTransactions();
    assertTrue(investmentTransactions.size() > 0);
    for (InvestmentsTransactionsGetResponse.InvestmentTransaction txn : investmentTransactions) {
      assertNotNull(txn.getInvestmentTransactionId());
      assertNotNull(txn.getAccountId());
      assertNotNull(txn.getDate());
      assertNotNull(txn.getName());
      assertNotNull(txn.getAmount());
      assertNotNull(txn.getType());
      assertNotNull(txn.getIsoCurrencyCode());
    }

    List<Security> securities = response.body().getSecurities();
    assertTrue(securities.size() > 0);
    for (Security security : securities) {
      assertNotNull(security.getSecurityId());
      assertNotNull(security.getName());
      assertNotNull(security.getType());
      assertNotNull(security.getClosePrice());
      assertNotNull(security.getIsoCurrencyCode());
    }
  }

  public void testFullyLoadedRequest() throws Exception {
    // get some account info
    Response<AccountsGetResponse> accountsGetResponse =
      client().service().accountsGet(new AccountsGetRequest(accessToken)).execute();
    assertSuccessResponse(accountsGetResponse);
    String someAccountId = null;
    for (Account account : accountsGetResponse.body().getAccounts()) {
      if ("investment".equals(account.getType())) {
        someAccountId = account.getAccountId();
        break;
      }
    }

    // actual test
    int numTxns = 2;
    Response<InvestmentsTransactionsGetResponse> response = client().service().investmentsTransactionsGet(
      new InvestmentsTransactionsGetRequest(
        accessToken,
        startDate,
        endDate)
        .withAccountIds(Collections.singletonList(someAccountId))
        .withCount(numTxns)
        .withOffset(1)).execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getTotalInvestmentTransactions() > numTxns);
    assertEquals(numTxns, response.body().getInvestmentTransactions().size());
  }

  @Test
  public void testBadAccessToken() throws Exception {
    Response<InvestmentsTransactionsGetResponse> response = client().service().investmentsTransactionsGet(
      new InvestmentsTransactionsGetRequest(
        "totally-invalid-stuff",
        new Date(),
        new Date()))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }
}
