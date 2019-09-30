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
  public void testLiabilitiesStudentLoanGetSuccess() throws Exception {
    Response<LiabilitiesGetResponse> response = client().service().liabilitiesGet(
      new LiabilitiesGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected student loan liabilities
    LiabilitiesGetResponse.Liabilities liabilities = response.body().getLiabilities();
    List<LiabilitiesGetResponse.StudentLoanLiability> studentLoans = liabilities.getStudent();
    assertTrue(studentLoans.size() > 0);
    for (LiabilitiesGetResponse.StudentLoanLiability studentLoan : studentLoans) {
      assertNotNull(studentLoan.getAccountId());
      assertNotNull(studentLoan.getAccountNumber());
      assertNotNull(studentLoan.getDisbursementDates());
      assertNotNull(studentLoan.getExpectedPayoffDate());
      assertNotNull(studentLoan.getGuarantor());
      assertNotNull(studentLoan.getInterestRatePercentage());
      assertNotNull(studentLoan.getIsOverdue());
      assertNotNull(studentLoan.getLastPaymentAmount());
      assertNotNull(studentLoan.getLastPaymentDate());
      assertNotNull(studentLoan.getLastStatementBalance());
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
    Response<LiabilitiesGetResponse> response = client().service().liabilitiesGet(
      new LiabilitiesGetRequest(getItemPublicTokenExchangeResponse().getAccessToken()))
      .execute();

    assertSuccessResponse(response);

    // item should be the same one we created
    assertItemEquals(getItem(), response.body().getItem());

    // sandbox should return expected credit card liabilities
    LiabilitiesGetResponse.Liabilities liabilities = response.body().getLiabilities();
    List<LiabilitiesGetResponse.CreditCardLiability> creditCards = liabilities.getCredit();
    assertTrue(creditCards.size() > 0);
    for (LiabilitiesGetResponse.CreditCardLiability creditCard : creditCards) {
      List<LiabilitiesGetResponse.Apr> aprs = creditCard.getAprs();
      assertNotNull(aprs);
      for (LiabilitiesGetResponse.Apr apr : aprs) {
        assertNotNull(apr.getAprPercentage());
        assertNotNull(apr.getAprType());
        assertNotNull(apr.getBalanceSubjectToApr());
        assertNotNull(apr.getInterestChargeAmount());
      }
      assertNotNull(creditCard.getAccountId());
      assertNotNull(creditCard.getIsOverdue());
      assertNotNull(creditCard.getLastPaymentAmount());
      assertNotNull(creditCard.getLastPaymentDate());
      assertNotNull(creditCard.getLastStatementBalance());
      assertNotNull(creditCard.getLastStatementIssueDate());
      assertNotNull(creditCard.getMinimumPaymentAmount());
      assertNotNull(creditCard.getNextPaymentDueDate());
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
