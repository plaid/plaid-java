package com.plaid.client.request;

import com.plaid.client.request.common.BaseClientRequest;

/**
 * Request for the /item/add_token/create endpoint.
 */
public final class ItemAddTokenCreateRequest extends BaseClientRequest {
  private User user;

  public ItemAddTokenCreateRequest(User user) {
    notNull(user, "user");
    this.user = user;
  }

  public static class User {
    private String clientUserId;

    public User(String clientUserId) {
      notNull(clientUserId, "clientUserId");
      notEmpty(clientUserId, "clientUserId");
      this.clientUserId = clientUserId;
    }
  }
}
