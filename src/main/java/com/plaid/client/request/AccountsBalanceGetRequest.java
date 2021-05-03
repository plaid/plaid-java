package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

import java.util.ArrayList;
import java.util.List;

import static com.plaid.client.internal.Util.notBlank;
import static com.plaid.client.internal.Util.notEmpty;

/**
 * Request for the /accounts/balance/get endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class AccountsBalanceGetRequest extends BaseAccessTokenRequest {
  private Options options;

  public AccountsBalanceGetRequest(String accessToken) {
    super(accessToken);
  }

  public AccountsBalanceGetRequest withAccountIds(List<String> accountIds) {
    notEmpty(accountIds, "accountIds");
    if (this.options == null) {
      this.options = new Options(new ArrayList<>(accountIds));
    } else {
      this.options.setAccountIds(accountIds);
    }
    return this;
  }

  public AccountsBalanceGetRequest withMinLastUpdatedDateTime(String minLastUpdatedDatetime) {
    notBlank(minLastUpdatedDatetime, "minLastUpdatedDatetime");
    if (this.options == null) {
      this.options = new Options(minLastUpdatedDatetime);
    } else {
      this.options.setMinLastUpdatedDateTime(minLastUpdatedDatetime);
    }
    return this;
  }

  private static class Options {
    private List<String> accountIds;
    private String minLastUpdatedDatetime;

    private Options(List<String> accountIds, String minLastUpdatedDatetime) {
      this.accountIds = accountIds;
      this.minLastUpdatedDatetime = minLastUpdatedDatetime;
    }

    private Options(List<String> accountIds) {
      this(accountIds, null);
    }

    private Options(String minLastUpdatedDatetime) {
      this(null, minLastUpdatedDatetime);
    }

    private void setMinLastUpdatedDateTime(String minLastUpdatedDatetime) {
      this.minLastUpdatedDatetime = minLastUpdatedDatetime;
    }

    private void setAccountIds(List<String> accountIds) {
      this.accountIds = accountIds;
    }
  }
}
