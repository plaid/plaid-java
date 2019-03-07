package com.plaid.client.request;

import com.plaid.client.internal.gson.RequiredField;
import com.plaid.client.request.common.BasePublicRequest;
import com.plaid.client.request.common.Product;
import java.util.ArrayList;
import java.util.Arrays;

import static com.plaid.client.internal.Util.notEmpty;
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

  public InstitutionsGetByIdRequest withIncludeInstitutionData(boolean includeInstitutionData) {
    this.options = new Options(includeInstitutionData);
    return this;
  }

  private static class Options {
    private boolean includeInstitutionData;

    private Options(boolean includeInstitutionData) {
      this.includeInstitutionData = includeInstitutionData;
    }
  }
}
