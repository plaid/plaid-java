package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
import java.util.List;

import static com.plaid.client.internal.Util.isBetween;

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

  public InstitutionsGetRequest(Integer count, Integer offset, boolean includeInstitutionData) {
    isBetween(count, 1, 500, "count");
    isBetween(offset, 0, Integer.MAX_VALUE, "offset");

    this.options = new Options(includeInstitutionData);
    this.count = count;
    this.offset = offset;
  }

  private static class Options {
    private boolean includeInstitutionData;

    private Options(boolean includeInstitutionData) {
      this.includeInstitutionData = includeInstitutionData;
    }
  }
}
