package com.plaid.client.integration;

import static org.junit.Assert.assertTrue;

import com.plaid.client.model.Error;
import com.plaid.client.model.ItemWebhookUpdateRequest;
import com.plaid.client.model.ItemWebhookUpdateResponse;
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxItemFireWebhookRequest;
import com.plaid.client.model.SandboxItemFireWebhookResponse;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class SandboxItemFireWebhookTest extends AbstractItemIntegrationTest {

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
    // Set a webhook
    ItemWebhookUpdateRequest request = new ItemWebhookUpdateRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .webhook("https://baz.xyz/foo-test-hook");

    Response<ItemWebhookUpdateResponse> webhookResponse = client()
      .itemWebhookUpdate(request)
      .execute();

    // Fire a webhook
    SandboxItemFireWebhookRequest fireRequest = new SandboxItemFireWebhookRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .webhookCode(
        SandboxItemFireWebhookRequest.WebhookCodeEnum.DEFAULT_UPDATE
      );

    Response<SandboxItemFireWebhookResponse> response = client()
      .sandboxItemFireWebhook(fireRequest)
      .execute();

    assertSuccessResponse(response);
    assertTrue(response.body().getWebhookFired());
  }
}
