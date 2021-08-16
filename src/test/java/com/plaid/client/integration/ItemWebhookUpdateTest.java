package com.plaid.client.integration;

import com.plaid.client.request.ItemWebhookUpdateRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemWebhookUpdateResponse;
import com.plaid.client.response.ItemStatus;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemWebhookUpdateTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.TRANSACTIONS);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    // Update the webhook
    Response<ItemWebhookUpdateResponse> webhookResponse = client().service().itemWebhookUpdate(
    	new ItemWebhookUpdateRequest(getItemPublicTokenExchangeResponse().getAccessToken(), "https://baz.xyz/foo-test-hook")).execute();

    assertSuccessResponse(webhookResponse);
    ItemStatus itemStatus = webhookResponse.body().getItem();
    assertEquals(itemStatus.getWebhook(), "https://baz.xyz/foo-test-hook");
  }

  @Test
  public void testFailure() throws Exception {
	  // Invalid webhook URL provided
	  Response<ItemWebhookUpdateResponse> webhookResponse = client().service().itemWebhookUpdate(
    	  new ItemWebhookUpdateRequest(getItemPublicTokenExchangeResponse().getAccessToken(), "INVALID_HOOK")).execute();

    assertErrorResponse(webhookResponse, ErrorResponse.ErrorType.INVALID_REQUEST, "INVALID_FIELD");
  }
}
