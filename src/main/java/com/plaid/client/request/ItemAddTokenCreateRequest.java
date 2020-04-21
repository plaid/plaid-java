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
    private Optional<String> legalName = Optional.empty();
    private Optional<String> phoneNumber = Optional.empty();
    private Optional<String> emailAddress = Optional.empty();
    private Optional<Date> phoneNumberVerifiedTime = Optional.empty();
    private Optional<Date> emailAddressVerifiedTime = Optional.empty();

    public User(String clientUserId) {
      Util.notNull(clientUserId, "clientUserId");
      this.clientUserId = clientUserId;
    }

    public User withLegalName(String legalName) {
      Util.notNull(legalName, "legalName");
      this.legalName = Optional.of(legalName);
      return this;
    }

    public User withPhoneNumber(String phoneNumber) {
      Util.notNull(phoneNumber, "phoneNumber");
      this.phoneNumber = Optional.of(phoneNumber);
      return this;
    }

    public User withVerifiedPhoneNumber(String phoneNumber, Date verifiedTime) {
      Util.notNull(phoneNumber, "phoneNumber");
      Util.notNull(verifiedTime, "verifiedTime");
      this.phoneNumber = Optional.of(phoneNumber);
      this.phoneNumberVerifiedTime = Optional.of(verifiedTime);
      return this;
    }

    public User withEmailAddress(String emailAddress) {
      Util.notNull(emailAddress, "emailAddress");
      this.emailAddress = Optional.of(emailAddress);
      return this;
    }

    public User withVerifiedEmailAddress(String emailAddress, Date verifiedTime) {
      Util.notNull(emailAddress, "emailAddress");
      Util.notNull(verifiedTime, "verifiedTime");
      this.emailAddress = Optional.of(emailAddress);
      this.emailAddressVerifiedTime = Optional.of(verifiedTime);
      return this;
    }
  }
}
