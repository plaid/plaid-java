package com.plaid.client.response;

import java.util.List;

/**
 * Response to /institutions/search request.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class InstitutionsSearchResponse extends BaseResponse {
  private List<Institution> institutions;

  public List<Institution> getInstitutions() {
    return institutions;
  }
}
