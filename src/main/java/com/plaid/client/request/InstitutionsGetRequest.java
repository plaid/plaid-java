package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;
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

  public InstitutionsGetRequest withIncludeOptionalMetadata(boolean includeOptionalMetadata) {
    this.options = new Options(includeOptionalMetadata);
    return this;
  }

  private static class Options {
    private boolean includeOptionalMetadata;

    private Options(boolean includeOptionalMetadata) {
      this.includeOptionalMetadata = includeOptionalMetadata;
    }
  }
}
