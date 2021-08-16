package com.plaid.client.integration;

import com.plaid.client.request.ItemWebhookUpdateRequest;
import com.plaid.client.request.SandboxItemFireWebhookRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.ItemWebhookUpdateResponse;
import com.plaid.client.response.SandboxItemFireWebhookResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SandboxItemFireWebhookTest extends AbstractItemIntegrationTest {
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
    // Set a webhook
    Response<ItemWebhookUpdateResponse> webhookResponse = client().service().itemWebhookUpdate(
      new ItemWebhookUpdateRequest(getItemPublicTokenExchangeResponse().getAccessToken(), "https://baz.xyz/foo-test-hook")).execute();
    // Fire a webhook
    Response<SandboxItemFireWebhookResponse> response =
      client().service().sandboxItemFireWebhook(new SandboxItemFireWebhookRequest(getItemPublicTokenExchangeResponse().getAccessToken(), "DEFAULT_UPDATE")).execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getWebhookFired());
  }
}
