package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.model.APR;
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.CreditCardLiability;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.LiabilitiesGetRequest;
import com.plaid.client.model.LiabilitiesGetRequestOptions;
import com.plaid.client.model.LiabilitiesGetResponse;
import com.plaid.client.model.LiabilitiesObject;
import com.plaid.client.model.Products;
import com.plaid.client.model.Security;
import com.plaid.client.model.StudentLoan;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Response;

public class LiabilitiesGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Collections.singletonList(Products.LIABILITIES);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testLiabilitiesStudentLoanGetSuccess() throws Exception {
    LiabilitiesGetRequest request = new LiabilitiesGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<LiabilitiesGetResponse> response = client()
      .liabilitiesGet(request)
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected student loan liabilities
    LiabilitiesObject liabilities = response.body().getLiabilities();
    List<StudentLoan> studentLoans = liabilities.getStudent();
    assertTrue(studentLoans.size() > 0);
    for (StudentLoan studentLoan : studentLoans) {
      assertNotNull(studentLoan.getAccountId());
      assertNotNull(studentLoan.getAccountNumber());
      assertNotNull(studentLoan.getDisbursementDates());
      assertNotNull(studentLoan.getExpectedPayoffDate());
      assertNotNull(studentLoan.getGuarantor());
      assertNotNull(studentLoan.getInterestRatePercentage());
      assertNotNull(studentLoan.getIsOverdue());
      assertNotNull(studentLoan.getLastPaymentAmount());
      assertNotNull(studentLoan.getLastPaymentDate());
      assertNotNull(studentLoan.getLastStatementIssueDate());
      assertNotNull(studentLoan.getLoanName());
      assertNotNull(studentLoan.getLoanStatus());
      assertNotNull(studentLoan.getLoanStatus().getEndDate());
      assertNotNull(studentLoan.getLoanStatus().getType());
      assertNotNull(studentLoan.getMinimumPaymentAmount());
      assertNotNull(studentLoan.getNextPaymentDueDate());
      assertNotNull(studentLoan.getOriginationDate());
      assertNotNull(studentLoan.getOriginationPrincipalAmount());
      assertNotNull(studentLoan.getOutstandingInterestAmount());
      assertNotNull(studentLoan.getPaymentReferenceNumber());
      assertNotNull(studentLoan.getPslfStatus());
      assertNotNull(studentLoan.getPslfStatus().getEstimatedEligibilityDate());
      assertNotNull(studentLoan.getPslfStatus().getPaymentsMade());
      assertNotNull(studentLoan.getPslfStatus().getPaymentsRemaining());
      assertNotNull(studentLoan.getRepaymentPlan());
      assertNotNull(studentLoan.getRepaymentPlan().getDescription());
      assertNotNull(studentLoan.getRepaymentPlan().getType());
      assertNotNull(studentLoan.getSequenceNumber());
      assertNotNull(studentLoan.getServicerAddress());
      assertNotNull(studentLoan.getServicerAddress().getCity());
      assertNotNull(studentLoan.getServicerAddress().getCountry());
      assertNotNull(studentLoan.getServicerAddress().getRegion());
      assertNotNull(studentLoan.getServicerAddress().getStreet());
      assertNotNull(studentLoan.getServicerAddress().getPostalCode());
      assertNotNull(studentLoan.getYtdInterestPaid());
      assertNotNull(studentLoan.getYtdPrincipalPaid());
    }
  }

  @Test
  public void testLiabilitiesCreditCardGetSuccess() throws Exception {
    LiabilitiesGetRequest request = new LiabilitiesGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<LiabilitiesGetResponse> response = client()
      .liabilitiesGet(request)
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected credit card liabilities
    LiabilitiesObject liabilities = response.body().getLiabilities();
    List<CreditCardLiability> creditCards = liabilities.getCredit();
    assertTrue(creditCards.size() > 0);
    for (CreditCardLiability creditCard : creditCards) {
      List<APR> aprs = creditCard.getAprs();
      assertNotNull(aprs);
      for (APR apr : aprs) {
        assertNotNull(apr.getAprPercentage());
        assertNotNull(apr.getAprType());
        assertNotNull(apr.getBalanceSubjectToApr());
        assertNotNull(apr.getInterestChargeAmount());
      }
      assertNotNull(creditCard.getAccountId());
      assertNotNull(creditCard.getIsOverdue());
      assertNotNull(creditCard.getLastPaymentAmount());
      assertNotNull(creditCard.getLastPaymentDate());
      assertNotNull(creditCard.getLastStatementIssueDate());
      assertNotNull(creditCard.getMinimumPaymentAmount());
      assertNotNull(creditCard.getNextPaymentDueDate());
    }
  }

  @Test
  public void testLiabilitiesGetWithAccountIds() throws Exception {
    // first call to get an account ID
    LiabilitiesGetRequest request = new LiabilitiesGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<LiabilitiesGetResponse> response = client()
      .liabilitiesGet(request)
      .execute();

    assertSuccessResponse(response);
    String accountId = null;
    for (AccountBase account : response.body().getAccounts()) {
      if (AccountSubtype.STUDENT.equals(account.getSubtype())) {
        accountId = account.getAccountId();
        break;
      }
    }

    // call under test
    LiabilitiesGetRequestOptions options = new LiabilitiesGetRequestOptions()
    .accountIds(Arrays.asList(accountId));

    LiabilitiesGetRequest liabilitiesGetRequest = new LiabilitiesGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .options(options);

    Response<LiabilitiesGetResponse> liabilitiesGetResponse = client()
      .liabilitiesGet(liabilitiesGetRequest)
      .execute();

    response = client().liabilitiesGet(liabilitiesGetRequest).execute();
    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected accounts
    List<AccountBase> accounts = response.body().getAccounts();
    assertEquals(1, accounts.size());
  }

  @Test
  public void testLiabilitiesGetInvalidAccessToken() throws Exception {
    LiabilitiesGetRequest request = new LiabilitiesGetRequest()
      .accessToken("not-real");

    Response<LiabilitiesGetResponse> response = client()
      .liabilitiesGet(request)
      .execute();
    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
