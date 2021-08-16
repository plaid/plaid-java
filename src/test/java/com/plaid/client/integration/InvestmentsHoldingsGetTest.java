package com.plaid.client.integration;

import com.plaid.client.request.InvestmentsHoldingsGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Account;
import com.plaid.client.response.InvestmentsHoldingsGetResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.Security;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class InvestmentsHoldingsGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.INVESTMENTS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testInvestmentsHoldingsGetSuccess() throws Exception {
    Response<InvestmentsHoldingsGetResponse> response = client().service().investmentsHoldingsGet(
      new InvestmentsHoldingsGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected holdings
    List<InvestmentsHoldingsGetResponse.Holding> holdings = response.body().getHoldings();
    assertTrue(holdings.size() > 0);
    for (InvestmentsHoldingsGetResponse.Holding holding : holdings) {
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
      assertNotNull(security.getClosePrice());
      assertNotNull(security.getIsoCurrencyCode());
    }
  }

  @Test
  public void testInvestmentsHoldingGetWithAccountIds() throws Exception {
    // first call to get an account ID
    Response<InvestmentsHoldingsGetResponse> response = client().service().investmentsHoldingsGet(
      new InvestmentsHoldingsGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();
    assertSuccessResponse(response);
    String accountId = null;
    for (Account account : response.body().getAccounts()) {
      if ("investment".equals(account.getType())) {
        accountId = account.getAccountId();
        break;
      }
    }

    // call under test
    response = client().service().investmentsHoldingsGet(
      new InvestmentsHoldingsGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()).withAccountIds(Arrays.asList(accountId)))
      .execute();
    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected accounts
    List<Account> accounts = response.body().getAccounts();
    assertEquals(1, accounts.size());
  }

  @Test
  public void testInvestmentsHoldingGetInvalidAccessToken() throws Exception {
    Response<InvestmentsHoldingsGetResponse> response = client().service().investmentsHoldingsGet(
      new InvestmentsHoldingsGetRequest("notreal"))
      .execute();
    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }

}
