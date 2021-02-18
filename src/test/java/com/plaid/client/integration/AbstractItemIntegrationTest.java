package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.Item;
import com.plaid.client.model.ItemGetRequest;
import com.plaid.client.model.ItemGetResponse;
import com.plaid.client.model.ItemPublicTokenExchangeRequest;
import com.plaid.client.model.ItemPublicTokenExchangeResponse;
import com.plaid.client.model.ItemStatus;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxPublicTokenCreateRequest;
import com.plaid.client.model.SandboxPublicTokenCreateResponse;
import java.util.List;
import org.junit.Before;
import retrofit2.Response;

/**
 * For tests where an item is required.
 * <p>
 * Subclasses must provide the institution and products desired by implementing.
 * {@link #setupItemProducts()} and {@link #setupItemInstitutionId()}
 */
public abstract class AbstractItemIntegrationTest
  extends AbstractIntegrationTest {

  private ItemPublicTokenExchangeResponse exchangeTokenResponse;
  private Item item;

  protected static void assertAccount(
    AccountBase actualAccount,
    AccountType expectedType,
    AccountSubtype expectedSubType,
    Double expectedBalanceAvailable,
    Double expectedBalanceCurrent,
    Double expectedBalanceLimit,
    String expectedName,
    String expectedMask,
    String expectedOfficialName
  ) {
    assertNotNull(actualAccount.getAccountId());
    assertEquals(expectedType, actualAccount.getType());
    assertEquals(expectedSubType, actualAccount.getSubtype());
    assertEquals(
      expectedBalanceAvailable,
      actualAccount.getBalances().getAvailable()
    );
    assertEquals(
      expectedBalanceCurrent,
      actualAccount.getBalances().getCurrent()
    );
    assertEquals(expectedBalanceLimit, actualAccount.getBalances().getLimit());
    assertEquals(expectedName, actualAccount.getName());
    assertEquals(expectedMask, actualAccount.getMask());
    assertEquals(expectedOfficialName, actualAccount.getOfficialName());
  }

  @Before
  public void setUpItem() throws Exception {
    SandboxPublicTokenCreateRequest request = new SandboxPublicTokenCreateRequest()
      .institutionId(setupItemInstitutionId());
    request.setInitialProducts(setupItemProducts());

    Response<SandboxPublicTokenCreateResponse> createResponse = client()
      .sandboxPublicTokenCreate(request)
      .execute();
    assertSuccessResponse(createResponse);

    ItemPublicTokenExchangeRequest itemPublicTokenExchangeRequest = new ItemPublicTokenExchangeRequest()
      .publicToken(createResponse.body().getPublicToken());

    Response<ItemPublicTokenExchangeResponse> response = client()
      .itemPublicTokenExchange(itemPublicTokenExchangeRequest)
      .execute();
    assertSuccessResponse(response);

    this.exchangeTokenResponse = response.body();

    ItemGetRequest itemGetRequest = new ItemGetRequest()
      .accessToken(exchangeTokenResponse.getAccessToken());

    Response<ItemGetResponse> itemGetResponse = client()
      .itemGet(itemGetRequest)
      .execute();
    assertSuccessResponse(itemGetResponse);
    item = itemGetResponse.body().getItem();
  }

  protected abstract List<Products> setupItemProducts();

  protected abstract String setupItemInstitutionId();

  public ItemPublicTokenExchangeResponse getItemPublicTokenExchangeResponse() {
    return exchangeTokenResponse;
  }

  public Item getItem() {
    return item;
  }
}
