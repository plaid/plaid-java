package com.plaid.client.request;

import com.google.gson.annotations.JsonAdapter;
import com.plaid.client.internal.Util;
import com.plaid.client.internal.gson.DateOnlyTypeAdapterFactory;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.internal.gson.RequiredField;
import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.request.common.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /item/create endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ItemCreateRequest extends BaseClientRequest {
  private RequiredField<Map<String, String>> credentials = RequiredField.empty();
  private String institutionId;
  private List<Product> initialProducts;
  private Optional<Options> options = Optional.empty();

  public ItemCreateRequest(String institutionId, List<Product> initialProducts) {
    notNull(institutionId, "institutionId");
    notEmpty(initialProducts, "initialProducts");

    this.initialProducts = new ArrayList<>(initialProducts);
    this.institutionId = institutionId;
  }

  public ItemCreateRequest withCredentials(Map<String, String> credentials) {
    Util.notNull(credentials, "credentials");

    this.credentials = RequiredField.of(new HashMap<>(credentials));
    return this;
  }

  public ItemCreateRequest withCredentials(String name, String value) {
    if (!this.credentials.isPresent()) {
      this.credentials = RequiredField.of(new HashMap<String, String>());
    }
    this.credentials.get().put(name, value);
    return this;
  }

  public ItemCreateRequest withOptionWebhook(String webhook) {
    notNull(webhook, "webhook");
    options = options.orElse(new Options());
    options.get().webhook = webhook;
    return this;
  }

  public ItemCreateRequest withOptionCredentialsToken(String credentialsToken) {
    notNull(credentialsToken, "credentialsToken");
    options = options.orElse(new Options());
    options.get().credentialsToken = credentialsToken;
    return this;
  }

  public ItemCreateRequest withOptionStartDate(Date startDate) {
    notNull(startDate, "startDate");
    options = options.orElse(new Options());
    options.get().transactions = options.get().transactions.orElse(new Options.TransactionOptions());
    options.get().transactions.get().startDate = new Date(startDate.getTime());
    return this;
  }

  public ItemCreateRequest withOptionEndDate(Date endDate) {
    notNull(endDate, "endDate");
    options = options.orElse(new Options());
    options.get().transactions = options.get().transactions.orElse(new Options.TransactionOptions());
    options.get().transactions.get().endDate = new Date(endDate.getTime());
    return this;
  }

  public ItemCreateRequest withOptionAwaitResults(boolean awaitResults) {
    options = options.orElse(new Options());
    options.get().transactions = options.get().transactions.orElse(new Options.TransactionOptions());
    options.get().transactions.get().awaitResults = awaitResults;
    return this;
  }

  private static class Options {
    private Optional<TransactionOptions> transactions = Optional.empty();
    private String webhook;
    private String credentialsToken;

    private static class TransactionOptions {
      @JsonAdapter(DateOnlyTypeAdapterFactory.class) private Date startDate;
      @JsonAdapter(DateOnlyTypeAdapterFactory.class) private Date endDate;
      private Boolean awaitResults;
    }
  }
}
