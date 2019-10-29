package com.plaid.client.request;

import com.plaid.client.request.common.BasePublicRequest;

import static com.plaid.client.internal.Util.notNull;

/**
 * Request for the /institutions/get_by_id endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class InstitutionsGetByIdRequest extends BasePublicRequest {
  private String institutionId;
  private Options options;

  public InstitutionsGetByIdRequest(String institutionId) {
    notNull(institutionId, "institutionId");

    this.institutionId = institutionId;
  }

  public InstitutionsGetByIdRequest withIncludeOptionalMetadata(boolean includeOptionalMetadata) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.includeOptionalMetadata = includeOptionalMetadata;
    return this;
  }

  public InstitutionsGetByIdRequest withIncludeStatus(boolean includeStatus) {
    if (this.options == null) {
      this.options = new Options();
    }
    this.options.includeStatus = includeStatus;
    return this;
  }

  private static class Options {
    private boolean includeOptionalMetadata;
    private boolean includeStatus;
  }
}
