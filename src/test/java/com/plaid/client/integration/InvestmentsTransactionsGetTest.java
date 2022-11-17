package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.Gson;
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.InvestmentTransaction;
import com.plaid.client.model.InvestmentsTransactionsGetRequest;
import com.plaid.client.model.InvestmentsTransactionsGetRequestOptions;
import com.plaid.client.model.InvestmentsTransactionsGetResponse;
import com.plaid.client.model.ItemPublicTokenExchangeRequest;
import com.plaid.client.model.ItemPublicTokenExchangeResponse;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import com.plaid.client.model.Security;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import org.ietf.jgss.GSSContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

public class InvestmentsTransactionsGetTest
  extends AbstractItemIntegrationTest {

  private LocalDate startDate;
  private LocalDate endDate;

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.INVESTMENTS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Before
  public void setUp() throws Exception {
    startDate = LocalDate.now().minusDays(365 * 2);
    endDate = LocalDate.now();
  }

  @Ignore
  @Test
  public void testSuccess() throws Exception {
    InvestmentsTransactionsGetRequestOptions options = new InvestmentsTransactionsGetRequestOptions()
    .count(100);

    InvestmentsTransactionsGetRequest request = new InvestmentsTransactionsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .startDate(startDate)
      .endDate(endDate)
      .options(options);

    Response<InvestmentsTransactionsGetResponse> response = null;
    for (int i = 0; i < 5; i++) {
      response = client().investmentsTransactionsGet(request).execute();
      if (response.isSuccessful()) {
        break;
      } else {
        Gson gson = new Gson();
        PlaidError error = gson.fromJson(response.errorBody().string(), PlaidError.class);
        assertEquals(error.getErrorCode(), "PRODUCT_NOT_READY");
        Thread.sleep(3000);
      }
    }
    assertSuccessResponse(response);
    assertNotNull(response.body().getTotalInvestmentTransactions());
    assertNotNull(response.body().getItem());
    assertNotNull(response.body().getAccounts());
    assertFalse(response.body().getAccounts().isEmpty());
    assertTrue(response.body().getInvestmentTransactions().size() > 0);

    List<InvestmentTransaction> investmentTransactions = response
      .body()
      .getInvestmentTransactions();
    assertTrue(investmentTransactions.size() > 0);
    for (InvestmentTransaction txn : investmentTransactions) {
      assertNotNull(txn.getInvestmentTransactionId());
      assertNotNull(txn.getAccountId());
      assertNotNull(txn.getDate());
      assertNotNull(txn.getName());
      assertNotNull(txn.getAmount());
      assertNotNull(txn.getType());
      assertNotNull(txn.getIsoCurrencyCode());
      assertNotNull(txn.getSubtype());
    }

    List<Security> securities = response.body().getSecurities();
    assertTrue(securities.size() > 0);
    for (Security security : securities) {
      assertNotNull(security.getSecurityId());
      assertNotNull(security.getName());
      assertNotNull(security.getType());
      assertNotNull(security.getIsoCurrencyCode());
    }
  }

  @Ignore
  @Test
  public void testFullyLoadedRequest() throws Exception {
    // get some account info
    AccountsGetRequest request = new AccountsGetRequest()
    .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AccountsGetResponse> accountsGetResponse = client()
      .accountsGet(request)
      .execute();
    assertSuccessResponse(accountsGetResponse);

    String accountId = null;
    for (AccountBase account : accountsGetResponse.body().getAccounts()) {
      if (AccountType.INVESTMENT.equals(account.getType())) {
        accountId = account.getAccountId();
        break;
      }
    }

    // actual test
    InvestmentsTransactionsGetRequestOptions options = new InvestmentsTransactionsGetRequestOptions()
      .accountIds(Arrays.asList(accountId))
      .count(2)
      .offset(1);

    InvestmentsTransactionsGetRequest investmentGetRequest = new InvestmentsTransactionsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .startDate(startDate)
      .endDate(endDate)
      .options(options);

    Response<InvestmentsTransactionsGetResponse> response = client()
      .investmentsTransactionsGet(investmentGetRequest)
      .execute();
    assertSuccessResponse(response);
    assertTrue(response.body().getTotalInvestmentTransactions() > 2);
    assertEquals(2, response.body().getInvestmentTransactions().size());
  }

  @Test
  public void testBadAccessToken() throws Exception {
    InvestmentsTransactionsGetRequest request = new InvestmentsTransactionsGetRequest()
      .accessToken("totally-invalid-stuff")
      .startDate(startDate)
      .endDate(endDate);

    Response<InvestmentsTransactionsGetResponse> response = client()
      .investmentsTransactionsGet(request)
      .execute();

    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
