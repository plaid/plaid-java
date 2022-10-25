package com.plaid.client.integration;

import static org.junit.Assert.assertNull;

import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.ItemGetRequest;
import com.plaid.client.model.ItemGetResponse;
import com.plaid.client.model.ItemStatusInvestments;
import com.plaid.client.model.ItemStatusLastWebhook;
import com.plaid.client.model.ItemStatusTransactions;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class ItemGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.TRANSACTIONS, Products.INVESTMENTS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    ItemGetRequest request = new ItemGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<ItemGetResponse> response = client().itemGet(request).execute();

    assertSuccessResponse(response);
    assertItemEquals(getItem(), response.body().getItem());
  }

  @Test
  public void testSuccessWithStatus() throws Exception {
    ItemGetRequest request = new ItemGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<ItemGetResponse> response = client().itemGet(request).execute();

    assertSuccessResponse(response);
    assertItemEquals(getItem(), response.body().getItem());

    ItemStatusTransactions transactions = response
      .body()
      .getStatus()
      .getTransactions();
    assertNull(transactions.getLastFailedUpdate());

    ItemStatusInvestments investments = response
      .body()
      .getStatus()
      .getInvestments();
    assertNull(investments.getLastFailedUpdate());

    ItemStatusLastWebhook webhook = response
      .body()
      .getStatus()
      .getLastWebhook();
    assertNull(webhook);
  }

  @Test
  public void testFailure() throws Exception {
    ItemGetRequest request = new ItemGetRequest()
      .accessToken("not-a-token");

    Response<ItemGetResponse> response = client().itemGet(request).execute();

    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
