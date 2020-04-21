package com.plaid.client.request;

import com.plaid.client.internal.gson.Optional;
import com.plaid.client.internal.Util;
import com.plaid.client.request.common.BaseClientRequest;

import java.util.Date;

/**
 * Request for the /item/add_token/create endpoint.
 */
public final class ItemAddTokenCreateRequest extends BaseClientRequest {
  private User user;

  public ItemAddTokenCreateRequest(User user) {
    Util.notNull(user, "user");
    this.user = user;
  }

  public static class User {
    private String clientUserId;
    private Optional<Options> options = Optional.empty();

    public User(String clientUserId) {
      Util.notNull(clientUserId, "clientUserId");
      this.clientUserId = clientUserId;
    }

    public User withLegalName(String legalName) {
      notNull(legalName, "legalName");
      options = options.orElse(new Options());
      userOptions.get().legalName = legalName;
      return this;
    }

    public User withPhoneNumber(String phoneNumber) {
      notNull(phoneNumber, "phoneNumber");
      options = options.orElse(new Options());
      options.get().phoneNumber = phoneNumber;
      return this;
    }

    public User withVerifiedPhoneNumber(String phoneNumber, Date verifiedTime) {
      notNull(phoneNumber, "phoneNumber");
      notNull(verifiedTime, "verifiedTime");
      options = options.orElse(new Options());
      options.get().phoneNumber = phoneNumber;
      options.get().phoneNumberVerifiedTime = verifiedTime;
      return this;
    }

    public User withEmailAddress(String emailAddress) {
      notNull(emailAddress, "emailAddress");
      options = options.orElse(new Options());
      options.get().emailAddress = emailAddress;
      return this;
    }

    public User withVerifiedEmailAddress(String emailAddress, Date verifiedTime) {
      notNull(emailAddress, "emailAddress");
      notNull(verifiedTime, "verifiedTime");
      options = options.orElse(new Options());
      options.get().emailAddress = emailAddress;
      options.get().emailAddressVerifiedTime = verifiedTime;
      return this;
    }

    private static class Options {
      private String legalName;
      private String phoneNumber;
      private String emailAddress;
      private Date phoneNumberVerifiedTime;
      private Date emailAddressVerifiedTime;
    }
  }
}
