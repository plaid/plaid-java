package com.plaid.client.response;

import java.util.List;

/**
 * Response to /institutions/get request.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class InstitutionsGetResponse extends BaseResponse {
  private List<Institution> institutions;
  private Integer total;

  public List<Institution> getInstitutions() {
    return institutions;
  }

  public Integer getTotal() {
    return total;
  }
}
