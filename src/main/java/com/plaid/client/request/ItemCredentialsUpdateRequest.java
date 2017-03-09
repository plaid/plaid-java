package com.plaid.client.request;

import com.plaid.client.internal.gson.RequiredField;
import com.plaid.client.request.common.BaseAccessTokenRequest;

import java.util.HashMap;
import java.util.Map;

import static com.plaid.client.internal.Util.arrayToMap;
import static com.plaid.client.internal.Util.notEmpty;
import static com.plaid.client.internal.Util.notNull;


/**
 * Request for the /item/credentials/update endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ItemCredentialsUpdateRequest extends BaseAccessTokenRequest {
  private RequiredField<Map<String, String>> credentials = RequiredField.empty();
  private Options options;

  public ItemCredentialsUpdateRequest(String accessToken) {
    super(accessToken);
  }

  public ItemCredentialsUpdateRequest withCredentials(Map<String, String> credentials) {
    notEmpty(credentials, "credentials");
    this.credentials = RequiredField.of(new HashMap<>(credentials));
    return this;
  }

  /**
   * @param credentials A list of credentials specified as: name1,value1,name2,value2,...
   * @return this. to satisfy fluent pattern.
   */
  public ItemCredentialsUpdateRequest withCredentials(String... credentials) {
    this.credentials = RequiredField.of(arrayToMap(credentials));
    return this;
  }

  public ItemCredentialsUpdateRequest withCredentialsToken(String credentialsToken) {
    notNull(credentialsToken, "credentialsToken");

    // just blow away options since this is the only one which can be set anyway
    options = new Options(credentialsToken);
    return this;
  }

  private static class Options {
    private String credentialsToken;

    private Options(String credentialsToken) {
      this.credentialsToken = credentialsToken;
    }
  }
}
