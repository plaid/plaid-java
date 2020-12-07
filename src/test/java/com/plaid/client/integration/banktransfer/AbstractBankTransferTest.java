package com.plaid.client.integration.banktransfer;

import com.plaid.client.integration.AbstractItemIntegrationTest;
import com.plaid.client.model.banktransfer.BankTransfer;
import com.plaid.client.model.banktransfer.BankTransferUser;
import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.banktransfer.BankTransferCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.banktransfer.BankTransferCreateResponse;

import java.util.List;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

import retrofit2.Response;

/**
 * For tests where a bank transfer is required.
 * <p>
 * Subclasses must implement the institution and products desired by implementing.
 * {@link #setupItemProducts()} and {@link #setupItemInstitutionId()}
 */
public abstract class AbstractBankTransferTest extends AbstractItemIntegrationTest {
  private BankTransfer bankTransfer;

  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Before
  public void setUpBankTransfer() throws Exception {
    String accessToken = getItemPublicTokenExchangeResponse().getAccessToken();
    Response<AccountsGetResponse> response = client().service().accountsGet(
      new AccountsGetRequest(accessToken))
      .execute();
    assertSuccessResponse(response);
    String accountId = response.body().getAccounts().get(0).getAccountId();

    Response<BankTransferCreateResponse> createResponse =
      client().service().bankTransferCreate(new BankTransferCreateRequest(
        String.valueOf(Math.random()),
        accessToken,
        accountId,
        "credit",
        "ach",
        "1.00",
        "USD",
        "testdesc",
        new BankTransferUser("Firstname Lastname"))
        .withAchClass("ppd")
      ).execute();
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
        if (i == maxRetries-1) {
          throw e;
        }
        Thread.sleep(1000);
        continue;
      }
    }
  }

  public BankTransfer getBankTransfer() {
    return bankTransfer;
  }
};
