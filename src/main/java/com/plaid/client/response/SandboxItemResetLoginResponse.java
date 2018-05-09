package com.plaid.client.response;

import java.util.Date;

/**
 * Response from /sandbox/item/reset_login endpoint.
 */
public final class SandboxItemResetLoginResponse extends BaseResponse {
  private Boolean resetLogin;

  public Boolean getResetLogin() {
    return resetLogin;
  }
}
