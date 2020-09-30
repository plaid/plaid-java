package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;

import java.util.List;

/**
 * Request for the /institutions/get_by_id endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class InstitutionsGetByIdRequest extends BaseClientRequest {
  private String institutionId;
  private List<String> countryCodes;
  private Options options;

  public InstitutionsGetByIdRequest(String institutionId, List<String> countryCodes) {
    notNull(institutionId, "institutionId");
    notEmpty(countryCodes, "countryCodes");

    this.institutionId = institutionId;
    this.countryCodes = countryCodes;
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
