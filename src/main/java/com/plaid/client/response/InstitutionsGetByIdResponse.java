package com.plaid.client.response;

/**
 * Response to /institutions/get_by_id request.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class InstitutionsGetByIdResponse extends BaseResponse {
  private Institution institution;

  public Institution getInstitution() {
    return institution;
  }
}
