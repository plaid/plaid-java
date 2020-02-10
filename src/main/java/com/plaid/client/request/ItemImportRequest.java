package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.internal.gson.Optional;

import java.util.List;
import java.util.Map;

import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /item/import endpoint.
 */
public final class ItemImportRequest extends BaseClientRequest {
  private List<String> products;
  private Optional<Options> options = Optional.empty();
  private Map<String, String> userAuth;

  public ItemImportRequest(List<String> products, Map<String, String> userAuth) {
    this.products = products;
    this.userAuth = userAuth;
  }

  public ItemImportRequest withWebhook(String webhook) {
    notNull(webhook, "webhook");
    options = options.orElse(new Options());
    options.get().webhook = webhook;
    return this;
  }

  private static class Options {
    private String webhook;
  }

}
// products, userauth, options with webhook
