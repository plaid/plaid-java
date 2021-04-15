package com.plaid.client.request;

import com.plaid.client.internal.gson.RequiredField;
import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.request.common.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /institutions/search endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class InstitutionsSearchRequest extends BaseClientRequest {
  private String query;
  private RequiredField<List<Product>> products = RequiredField.empty();
  private List<String> countryCodes;
  private Options options;

  public InstitutionsSearchRequest(String query, List<String> countryCodes) {
    notNull(query, "query");
    notEmpty(countryCodes, "countryCodes");

    this.query = query;
    this.countryCodes = countryCodes;
  }

  public InstitutionsSearchRequest withProducts(Product... products) {
    notEmpty(products, "product");
    if (!this.products.isPresent()) {
      this.products = RequiredField.of(new ArrayList<Product>());
    }
    this.products.get().addAll(Arrays.asList(products));
    return this;
  }

  public InstitutionsSearchRequest withIncludeOptionalMetadata(boolean includeOptionalMetadata) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.includeOptionalMetadata = includeOptionalMetadata;
    return this;
  }

  public InstitutionsSearchRequest withAccountFilter(Map<String, List<String>> accountFilter) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.accountFilter = accountFilter;
    return this;
  }

  public InstitutionsSearchRequest withOAuth(boolean oauth) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.oauth = oauth;
    return this;
  }

  public InstitutionsSearchRequest withIncludePaymentInitiationMetadata(boolean includePaymentInitiationMetadata) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
    return this;
  }

  public InstitutionsSearchRequest withPaymentInitiation(PaymentInitiation paymentInitiation) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.paymentInitiation = paymentInitiation;
    return this;
  }

  public static class PaymentInitiation {
    private String paymentId;

    public PaymentInitiation(String paymentId) {
      this.paymentId = paymentId;
    }
  }

  private static class Options {
    private boolean includeOptionalMetadata;
    private Map<String, List<String>> accountFilter;
    private Boolean oauth;
    private boolean includePaymentInitiationMetadata;
    private PaymentInitiation paymentInitiation;
  }
}
