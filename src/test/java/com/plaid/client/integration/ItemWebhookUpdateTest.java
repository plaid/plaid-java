package com.plaid.client.integration;

import static org.junit.Assert.assertEquals;

import com.plaid.client.model.Error;
import com.plaid.client.model.Item;
import com.plaid.client.model.ItemWebhookUpdateRequest;
import com.plaid.client.model.ItemWebhookUpdateResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class ItemWebhookUpdateTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    // Update the webhook
    String webhook = "https://baz.xyz/foo-test-hook";
    ItemWebhookUpdateRequest request = new ItemWebhookUpdateRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .webhook(webhook);

    Response<ItemWebhookUpdateResponse> webhookResponse = client()
      .itemWebhookUpdate(request)
      .execute();

    assertSuccessResponse(webhookResponse);
    Item item = webhookResponse.body().getItem();
    assertEquals(item.getWebhook(), webhook);
  }

  @Test
  public void testFailure() throws Exception {
    // Invalid webhook URL provided
    ItemWebhookUpdateRequest request = new ItemWebhookUpdateRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .webhook("invalid-hook");

    Response<ItemWebhookUpdateResponse> webhookResponse = client()
      .itemWebhookUpdate(request)
      .execute();

    assertErrorResponse(
      webhookResponse,
      Error.ErrorTypeEnum.INVALID_REQUEST,
      "INVALID_FIELD"
    );
  }
}
