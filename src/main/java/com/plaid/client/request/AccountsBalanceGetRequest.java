package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

import java.util.ArrayList;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;

/**
 * Request for the /accounts/balance/get endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class AccountsBalanceGetRequest extends BaseAccessTokenRequest {
  private Options options;

  public AccountsBalanceGetRequest(String accessToken) {
    super(accessToken);
  }

  public AccountsBalanceGetRequest withAccountIds(List<String> accountIds) {
    notEmpty(accountIds, "accountIds");
    this.options = new Options(new ArrayList<>(accountIds));
    return this;
  }

  private static class Options {
    private List<String> accountIds;

    private Options(List<String> accountIds) {
      this.accountIds = accountIds;
    }
  }
}
