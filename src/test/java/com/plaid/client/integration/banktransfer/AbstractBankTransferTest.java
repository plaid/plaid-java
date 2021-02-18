package com.plaid.client.integration.banktransfer;

import com.plaid.client.integration.AbstractItemIntegrationTest;
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.AccountsGetRequest;
import com.plaid.client.model.AccountsGetResponse;
import com.plaid.client.model.BankTransfer;
import com.plaid.client.model.BankTransferCreateRequest;
import com.plaid.client.model.BankTransferCreateResponse;
import com.plaid.client.model.BankTransferNetwork;
import com.plaid.client.model.BankTransferType;
import com.plaid.client.model.BankTransferUser;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

/**
 * For tests where a bank transfer is required.
 * <p>
 * Subclasses must implement the institution and products desired by implementing.
 * {@link #setupItemProducts()} and {@link #setupItemInstitutionId()}
 */
public abstract class AbstractBankTransferTest
  extends AbstractItemIntegrationTest {

  private BankTransfer bankTransfer;

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Before
  public void setUpBankTransfer() throws Exception {
    AccountsGetRequest request = new AccountsGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<AccountsGetResponse> response = client()
      .accountsGet(request)
      .execute();

    assertSuccessResponse(response);
    String accountId = response.body().getAccounts().get(0).getAccountId();

    BankTransferUser user = new BankTransferUser().legalName("First Last");

    BankTransferCreateRequest bankRequest = new BankTransferCreateRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .idempotencyKey(String.valueOf(Math.random()))
      .accountId(accountId)
      .type(BankTransferType.CREDIT)
      .network(BankTransferNetwork.ACH)
      .amount("1.00")
      .isoCurrencyCode("USD")
      .description("testdesc")
      .user(user)
      .achClass(ACHClass.PPD);

    Response<BankTransferCreateResponse> createResponse = client()
      .bankTransferCreate(bankRequest)
      .execute();
    assertSuccessResponse(createResponse);
    this.bankTransfer = createResponse.body().getBankTransfer();
  }

  protected abstract void bankTransferTest() throws AssertionError, Exception;

  @Test
  public void runWithRetries() throws Exception {
    int maxRetries = 3;
    for (int i = 0; i < maxRetries; i++) {
      try {
        this.bankTransferTest();
        break;
      } catch (AssertionError e) {
        // Rethrow error on final retry
        if (i == maxRetries - 1) {
          throw e;
        }
        Thread.sleep(1000);
      }
    }
  }

  public BankTransfer getBankTransfer() {
    return bankTransfer;
  }
}
