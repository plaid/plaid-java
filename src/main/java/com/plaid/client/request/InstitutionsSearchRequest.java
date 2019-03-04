package com.plaid.client.request;

import com.plaid.client.internal.gson.RequiredField;
import com.plaid.client.request.common.BasePublicRequest;
import com.plaid.client.request.common.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /institutions/search endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class InstitutionsSearchRequest extends BasePublicRequest {
  private String query;
  private RequiredField<List<Product>> products = RequiredField.empty();
  private Options options;

  public InstitutionsSearchRequest(String query) {
    notNull(query, "query");
    this.query = query;
  }

  public InstitutionsSearchRequest(String query, boolean includeInstitutionData) {
    notNull(query, "query");
    this.query = query;
    this.options = new Options(includeInstitutionData);
  }


  public InstitutionsSearchRequest withProducts(Product... products) {
    notEmpty(products, "product");
    if (!this.products.isPresent()) {
      this.products = RequiredField.of(new ArrayList<Product>());
    }
    this.products.get().addAll(Arrays.asList(products));
    return this;
  }

  private static class Options {
    private boolean includeInstitutionData;

    private Options(boolean includeInstitutionData) {
      this.includeInstitutionData = includeInstitutionData;
    }
  }

}
