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

  public InstitutionsGetByIdRequest(String institutionId) {
    notNull(institutionId, "institutionId");

    this.institutionId = institutionId;
  }
}
