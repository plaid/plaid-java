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
  private List<String> countryCodes;
  private String institutionId;
  private Options options;

  public InstitutionsGetByIdRequest(List<String> countryCodes, String institutionId) {
    notEmpty(countryCodes, "countryCodes");
    notNull(institutionId, "institutionId");

    this.countryCodes = countryCodes;
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
