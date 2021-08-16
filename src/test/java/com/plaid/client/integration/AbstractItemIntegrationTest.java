package com.plaid.client.integration;

import com.plaid.client.request.SandboxPublicTokenCreateRequest;
import com.plaid.client.request.ItemGetRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ItemStatus;
import com.plaid.client.response.Account;
import com.plaid.client.response.ItemGetResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.SandboxPublicTokenCreateResponse;
import org.junit.Before;
import retrofit2.Response;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * For tests where an item is required.
 * <p>
 * Subclasses must provide the institution and products desired by implementing.
 * {@link #setupItemProducts()} and {@link #setupItemInstitutionId()}
 */
public abstract class AbstractItemIntegrationTest extends AbstractIntegrationTest {
  private ItemPublicTokenExchangeResponse exchangeTokenResponse;
  private ItemStatus item;

  protected static void assertAccount(Account actualAccount,
                                      String expectedType,
                                      String expectedSubType,
                                      Double expectedBalanceAvailable,
                                      Double expectedBalanceCurrent,
                                      Double expectedBalanceLimit,
                                      String expectedName,
                                      String expectedMask,
                                      String expectedOfficialName) {
    assertNotNull(actualAccount.getAccountId());
    assertEquals(expectedType, actualAccount.getType());
    assertEquals(expectedSubType, actualAccount.getSubtype());
    assertEquals(expectedBalanceAvailable, actualAccount.getBalances().getAvailable());
    assertEquals(expectedBalanceCurrent, actualAccount.getBalances().getCurrent());
    assertEquals(expectedBalanceLimit, actualAccount.getBalances().getLimit());
    assertEquals(expectedName, actualAccount.getName());
    assertEquals(expectedMask, actualAccount.getMask());
    assertEquals(expectedOfficialName, actualAccount.getOfficialName());
  }

  @Before
  public void setUpItem() throws Exception {
    Response<SandboxPublicTokenCreateResponse> createResponse =
      client().service().sandboxPublicTokenCreate(new SandboxPublicTokenCreateRequest(setupItemInstitutionId(), setupItemProducts())).execute();
    assertSuccessResponse(createResponse);
    Response<ItemPublicTokenExchangeResponse> response =
      client().service().itemPublicTokenExchange(new ItemPublicTokenExchangeRequest(createResponse.body().getPublicToken())).execute();
    assertSuccessResponse(response);

    this.exchangeTokenResponse = response.body();

    Response<ItemGetResponse> itemGetResponse =
      client().service().itemGet(new ItemGetRequest(exchangeTokenResponse.getAccessToken())).execute();
    assertSuccessResponse(itemGetResponse);
    item = itemGetResponse.body().getItem();

  }

  protected abstract List<Product> setupItemProducts();

  protected abstract String setupItemInstitutionId();

  public ItemPublicTokenExchangeResponse getItemPublicTokenExchangeResponse() {
    return exchangeTokenResponse;
  }

  public ItemStatus getItem() {
    return item;
  }
}
