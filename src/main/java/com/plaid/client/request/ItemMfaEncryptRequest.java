package com.plaid.client.request;

import com.plaid.client.request.common.BasePublicRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.plaid.client.internal.Util.notEmpty;

/**
 * Request for the /item/mfa/encrypt endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public final class ItemMfaEncryptRequest extends BasePublicRequest {
  private List<String> responses;

  public ItemMfaEncryptRequest(List<String> responses) {
    notEmpty(responses, "responses");
    this.responses = new ArrayList<>(responses);
  }

  public ItemMfaEncryptRequest(String... responses) {
    this(Arrays.asList(responses));
  }
}
