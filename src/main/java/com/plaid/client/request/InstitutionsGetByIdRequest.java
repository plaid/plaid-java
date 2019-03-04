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

  public InstitutionsGetByIdRequest(String institutionId, boolean includeInstitutionData) {
    notNull(institutionId, "institutionId");

    this.institutionId = institutionId;
    this.options = new Options(includeInstitutionData);
  }

  private static class Options {
    private boolean includeInstitutionData;

    private Options(boolean includeInstitutionData) {
      this.includeInstitutionData = includeInstitutionData;
    }
  }
}
