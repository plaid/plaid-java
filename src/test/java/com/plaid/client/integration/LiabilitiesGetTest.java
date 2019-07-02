package com.plaid.client.integration;

import com.plaid.client.request.LiabilitiesGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Account;
import com.plaid.client.response.LiabilitiesGetResponse;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.Security;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LiabilitiesGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Collections.singletonList(Product.LIABILITIES);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testLiabilitiesGetSuccess() throws Exception {
    Response<LiabilitiesGetResponse> response = client().service().liabilitiesGet(
      new LiabilitiesGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected liabilities
    LiabilitiesGetResponse.Liabilities liabilities = response.body().getLiabilities();
    List<LiabilitiesGetResponse.StudentLoanLiability> studentLoans = liabilities.getStudent();
    assertTrue(studentLoans.size() > 0);
    for (LiabilitiesGetResponse.StudentLoanLiability studentLoan : studentLoans) {
      assertNotNull(studentLoan.getAccountId());
    }
  }

  @Test
  public void testLiabilitiesGetWithAccountIds() throws Exception {
    // first call to get an account ID
    Response<LiabilitiesGetResponse> response = client().service().liabilitiesGet(
      new LiabilitiesGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();
    assertSuccessResponse(response);
    String accountId = null;
    for (Account account : response.body().getAccounts()) {
      if ("student".equals(account.getSubtype())) {
        accountId = account.getAccountId();
        break;
      }
    }

    // call under test
    response = client().service().liabilitiesGet(
      new LiabilitiesGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()).withAccountIds(Arrays.asList(accountId)))
      .execute();
    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected accounts
    List<Account> accounts = response.body().getAccounts();
    assertEquals(1, accounts.size());
  }

  @Test
  public void testLiabilitiesGetInvalidAccessToken() throws Exception {
    Response<LiabilitiesGetResponse> response = client().service().liabilitiesGet(
      new LiabilitiesGetRequest("notreal"))
      .execute();
    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }

}
