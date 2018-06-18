package com.plaid.client.request;

import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.common.BaseClientRequest;


import java.util.List;

import static com.plaid.client.internal.Util.notNull;

public final class AssetReportCreateRequest extends BaseClientRequest {
  private List<String> accessTokens;
  private int daysRequested;
  private Optional<Options> options = Optional.empty();

  public AssetReportCreateRequest(List<String> accessTokens, int daysRequested) {
    this.accessTokens = accessTokens;
    this.daysRequested = daysRequested;
  }

  public AssetReportCreateRequest withOptionWebhook(String webhook) {
    notNull(webhook, "webhook");
    options = options.orElse(new Options());
    options.get().webhook = webhook;
    return this;
  }

  public AssetReportCreateRequest withClientReportId(String clientReportId) {
    notNull(clientReportId, "clientReportId");
    options = options.orElse(new Options());
    options.get().clientReportId = clientReportId;
    return this;
  }

  public AssetReportCreateRequest withClientUserId(String clientUserId) {
    notNull(clientUserId, "clientUserId");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = clientUserId;
    return this;
  }

  public AssetReportCreateRequest withFirstName(String firstName) {
    notNull(firstName, "firstName");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = firstName;
    return this;
  }

  public AssetReportCreateRequest withMiddleName(String middleName) {
    notNull(middleName, "middleName");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = middleName;
    return this;
  }

  public AssetReportCreateRequest withLastName(String lastName) {
    notNull(lastName, "lastName");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = lastName;
    return this;
  }

  public AssetReportCreateRequest withSsn(String ssn) {
    notNull(ssn, "ssn");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = ssn;
    return this;
  }

  public AssetReportCreateRequest withPhoneNumber(String phoneNumber) {
    notNull(phoneNumber, "phoneNumber");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = phoneNumber;
    return this;
  }

  public AssetReportCreateRequest withEmail(String email) {
    notNull(email, "email");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().clientUserId = email;
    return this;
  }

  private static class Options {
    private String webhook;
    private String clientReportId;
    private Optional<UserOptions> user = Optional.empty();

    private static class UserOptions {
      private String clientUserId;
      private String firstName;
      private String middleName;
      private String lastName;
      private String ssn;
      private String phoneNumber;
      private String email;
    }

  }
}
