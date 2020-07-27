package com.plaid.client.request;

import com.plaid.client.request.common.BaseAccessTokenRequest;

/**
 * Request for the /item/get endpoint.
 *
 * @see <a href="https://plaid.com/docs/api/">https://plaid.com/docs/api</a>
 */
public class ItemGetRequest extends BaseAccessTokenRequest {
  public ItemGetRequest(String accessToken) {
    super(accessToken);
  }
}
