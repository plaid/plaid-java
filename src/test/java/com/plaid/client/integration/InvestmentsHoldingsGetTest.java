package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.Holding;
import com.plaid.client.model.InvestmentHoldingsGetRequestOptions;
import com.plaid.client.model.InvestmentsHoldingsGetRequest;
import com.plaid.client.model.InvestmentsHoldingsGetResponse;
import com.plaid.client.model.Products;
import com.plaid.client.model.Security;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

public class InvestmentsHoldingsGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Collections.singletonList(Products.INVESTMENTS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testInvestmentsHoldingsGetSuccess() throws Exception {
    InvestmentsHoldingsGetRequest request = new InvestmentsHoldingsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<InvestmentsHoldingsGetResponse> response = client()
      .investmentsHoldingsGet(request)
      .execute();
    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected holdings
    List<Holding> holdings = response.body().getHoldings();
    assertTrue(holdings.size() > 0);
    for (Holding holding : holdings) {
      assertNotNull(holding.getAccountId());
      assertNotNull(holding.getSecurityId());
      assertNotNull(holding.getQuantity());
      assertNotNull(holding.getIsoCurrencyCode());
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

  @Test
  public void testInvestmentsHoldingGetWithAccountIds() throws Exception {
    // first call to get an account ID
    InvestmentsHoldingsGetRequest request = new InvestmentsHoldingsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<InvestmentsHoldingsGetResponse> response = client()
      .investmentsHoldingsGet(request)
      .execute();
    assertSuccessResponse(response);

    String accountId = null;
    for (AccountBase account : response.body().getAccounts()) {
      if (AccountType.INVESTMENT.equals(account.getType())) {
        accountId = account.getAccountId();
        break;
      }
    }

    InvestmentHoldingsGetRequestOptions options = new InvestmentHoldingsGetRequestOptions()
    .accountIds(Arrays.asList(accountId));

    InvestmentsHoldingsGetRequest investmentsHoldingsGetRequest = new InvestmentsHoldingsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .options(options);

    Response<InvestmentsHoldingsGetResponse> investmentsHoldingsGetResponse = client()
      .investmentsHoldingsGet(investmentsHoldingsGetRequest)
      .execute();
    assertSuccessResponse(investmentsHoldingsGetResponse);

    // item should be the same one we created
    assertItemEquals(
      getItem(),
      investmentsHoldingsGetResponse.body().getItem()
    );

    // sandbox should return expected accounts
    List<AccountBase> accounts = investmentsHoldingsGetResponse
      .body()
      .getAccounts();
    assertEquals(1, accounts.size());
  }

  @Test
  public void testInvestmentsHoldingGetInvalidAccessToken() throws Exception {
    InvestmentsHoldingsGetRequest investmentsHoldingsGetRequest = new InvestmentsHoldingsGetRequest()
      .accessToken("notreal");

    Response<InvestmentsHoldingsGetResponse> response = client()
      .investmentsHoldingsGet(investmentsHoldingsGetRequest)
      .execute();
    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
