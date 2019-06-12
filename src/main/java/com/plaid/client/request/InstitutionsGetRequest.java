package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.request.common.Product;

import java.util.List;

import static com.plaid.client.internal.Util.isBetween;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /institutions/get endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class InstitutionsGetRequest extends BaseClientRequest {
  private Integer count;
  private Integer offset;
  private Options options;

  public InstitutionsGetRequest(Integer count, Integer offset) {
    isBetween(count, 1, 500, "count");
    isBetween(offset, 0, Integer.MAX_VALUE, "offset");

    this.count = count;
    this.offset = offset;
  }

  public InstitutionsGetRequest withProducts(List<Product> products) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.products = products;
    return this;
  }

  public InstitutionsGetRequest withIncludeOptionalMetadata(boolean includeOptionalMetadata) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.includeOptionalMetadata = includeOptionalMetadata;
    return this;
  }

  public InstitutionsGetRequest withCountryCodes(List<String> countryCodes) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.countryCodes = countryCodes;
    return this;
  }

  private static class Options {
    private List<Product> products;
    private boolean includeOptionalMetadata;
    private List<String> countryCodes;
  }
}
