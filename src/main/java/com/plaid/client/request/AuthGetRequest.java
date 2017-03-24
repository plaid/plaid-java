package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

import java.util.ArrayList;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;

public final class AuthGetRequest extends BaseAccessTokenRequest {
  private Options options;

  public AuthGetRequest(String accessToken) {
    super(accessToken);
  }

  public AuthGetRequest withAccountIds(List<String> accountIds) {
    this.options = new Options(accountIds);
    return this;
  }

  private static class Options {
    private final List<String> accountIds;

    private Options(List<String> accountIds) {
      notEmpty(accountIds, "accountIds");
      this.accountIds = new ArrayList<>(accountIds);
    }
  }
}
