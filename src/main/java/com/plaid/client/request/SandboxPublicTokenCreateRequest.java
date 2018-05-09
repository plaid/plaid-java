package com.plaid.client.request;

import com.plaid.client.request.common.BasePublicRequest;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.common.Product;

import java.util.ArrayList;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /sandbox/public_token/create endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api/</a>
 */
public final class SandboxPublicTokenCreateRequest extends BasePublicRequest {
  private String institutionId;
  private List<Product> initialProducts;
  private Optional<Options> options = Optional.empty();

  public SandboxPublicTokenCreateRequest(String institutionId, List<Product> initialProducts) {
    notNull(institutionId, "institutionId");
    notEmpty(initialProducts, "initialProducts");

    this.initialProducts = new ArrayList<>(initialProducts);
    this.institutionId = institutionId;
  }

  public SandboxPublicTokenCreateRequest withOptionWebhook(String webhook) {
    notNull(webhook, "webhook");
    options = options.orElse(new Options());
    options.get().webhook = webhook;
    return this;
  }  

  private static class Options {
    private String webhook;
  }
}