package com.plaid.client.integration;

import com.plaid.client.request.ItemCreateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Account;
import com.plaid.client.response.ItemCreateResponse;
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
  private ItemCreateResponse itemCreateResponse;

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
    Response<ItemCreateResponse> response =
      client().service()
        .itemCreate(new ItemCreateRequest(
          setupItemInstitutionId(),
          setupItemProducts())
          .withCredentials("username", "user_good")
          .withCredentials("password", "pass_good")).execute();
    assertSuccessResponse(response);
    itemCreateResponse = response.body();
  }

  protected abstract List<Product> setupItemProducts();

  protected abstract String setupItemInstitutionId();

  public ItemCreateResponse getItemCreateResponse() {
    return itemCreateResponse;
  }
}
