package com.plaid.client.request;

import com.plaid.client.request.common.BasePublicRequest;

import java.util.HashMap;
import java.util.Map;

import static com.plaid.client.internal.Util.arrayToMap;
import static com.plaid.client.internal.Util.notEmpty;

/**
 * Request for the /item/credentials/encrypt endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ItemCredentialsEncryptRequest extends BasePublicRequest {
  private Map<String, String> credentials;

  public ItemCredentialsEncryptRequest(Map<String, String> credentials) {
    notEmpty(credentials, "credentials");
    this.credentials = new HashMap<>(credentials);
  }

  /**
   * Convenience constructor for credentials. Each 2 consecutive arguments are a (name,value) pair,
   * so this method will only accept an even number of arguments.
   * <p>
   * For example:
   * <code>
   * ItemCredentialsEncryptRequest("username", "alice", "password", "supersecret");
   * </code>
   * <p>
   * More generally:
   * <code>
   * ItemCredentialsEncryptRequest(name1, value1, name2, value2, ...);
   * </code>
   *
   * @param namesAndValues A series of credential names and corresponding values.
   */
  public ItemCredentialsEncryptRequest(String... namesAndValues) {
    this.credentials = arrayToMap(namesAndValues);
  }
}
