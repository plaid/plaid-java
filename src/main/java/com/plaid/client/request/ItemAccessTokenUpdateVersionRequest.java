package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

import static com.plaid.client.internal.Util.notNull;

/**
 * Request object for /item/access_token/update_version endpoint.
 */
public final class ItemAccessTokenUpdateVersionRequest extends BaseClientRequest {
  private String accessTokenV1;

  public ItemAccessTokenUpdateVersionRequest(String accessTokenV1) {
    notNull(accessTokenV1, "access_token_v1");
    this.accessTokenV1 = accessTokenV1;
  }
}
