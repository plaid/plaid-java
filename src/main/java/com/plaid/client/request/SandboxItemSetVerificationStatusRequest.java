package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for the /sandbox/item/set_verification_status endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/#TODO">https://plaid.com/docs/api/#TODO</a>
 */
public class SandboxItemSetVerificationStatusRequest extends BaseAccessTokenRequest {
  private String accountId;
  private String verificationStatus;

  public SandboxItemSetVerificationStatusRequest(String accessToken, String accountId, String verificationStatus) {
    super(accessToken);
    this.accountId = accountId;
    this.verificationStatus = verificationStatus;
  }
}
