package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.request.common.Product;

import java.util.List;

import static com.plaid.client.internal.Util.isBetween;
import static com.plaid.client.internal.Util.notEmpty;

/**
 * Request for the /institutions/get endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class InstitutionsGetRequest extends BaseClientRequest {
  private Integer count;
  private Integer offset;
  private List<String> countryCodes;
  private Options options;

  public InstitutionsGetRequest(Integer count, Integer offset, List<String> countryCodes) {
    isBetween(count, 1, 500, "count");
    isBetween(offset, 0, Integer.MAX_VALUE, "offset");
    notEmpty(countryCodes, "countryCodes");

    this.count = count;
    this.offset = offset;
    this.countryCodes = countryCodes;
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

  public InstitutionsGetRequest withOAuth(boolean oauth) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.oauth = oauth;
    return this;
  }

  private static class Options {
    private List<Product> products;
    private boolean includeOptionalMetadata;
    private Boolean oauth;
  }
}
