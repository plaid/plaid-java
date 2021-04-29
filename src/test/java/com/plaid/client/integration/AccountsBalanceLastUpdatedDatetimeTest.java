package com.plaid.client.integration;

import com.plaid.client.request.AccountsBalanceGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Account;
import com.plaid.client.response.AccountsBalanceGetResponse;
import com.plaid.client.response.ErrorResponse;
import org.junit.Test;
import retrofit2.Response;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AccountsBalanceLastUpdatedDatetimeTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return FIRST_PLATYPUS_BALANCE_BANK_INSTITUTION_ID;
  }

  private String formatDatetime(Date date) {
    TimeZone tz = TimeZone.getTimeZone("UTC");
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
    df.setTimeZone(tz);

    return df.format(date);
  }

  @Test
  public void testAccountsBalanceLastUpdatedDatetimeGetSuccess() throws Exception {
    String minLastUpdatedDatetime = formatDatetime(
      Date.from(Instant.now().minus(Duration.ofDays(2))));
    Response<AccountsBalanceGetResponse> response = client().service().accountsBalanceGet(
      new AccountsBalanceGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())
      .withMinLastUpdatedDateTime(minLastUpdatedDatetime))
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected accounts with a last updated datetime on
    // the balance for this institution
    List<Account> accounts = response.body().getAccounts();
    assertTrue(accounts.size() > 1);
    assertNotNull(accounts.get(0).getBalances().getLastUpdatedDatetime());
    assertFalse(accounts.get(0).getBalances().getLastUpdatedDatetime().trim().isEmpty());
  }

  @Test
  public void testAccountsBalanceGetWithMinLastUpdatedDatetime() throws Exception {
    String minLastUpdatedDatetime = formatDatetime(new Date());
    Response<AccountsBalanceGetResponse> response = client().service().accountsBalanceGet(
      new AccountsBalanceGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())
      .withMinLastUpdatedDateTime(minLastUpdatedDatetime))
      .execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_RESULT, "LAST_UPDATED_DATETIME_OUT_OF_RANGE");
  }
}
