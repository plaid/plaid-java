package com.plaid.client.request;

import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.common.BaseClientRequest;

import java.util.List;

import static com.plaid.client.internal.Util.notNull;

public class AssetReportCreateRequest extends BaseClientRequest {
  private List<String> accessTokens;
  private Integer daysRequested;
  private Optional<Options> options = Optional.empty();

  public AssetReportCreateRequest(List<String> accessTokens, int daysRequested) {
    this.accessTokens = accessTokens;
    this.daysRequested = daysRequested;
  }

  public AssetReportCreateRequest withWebhook(String webhook) {
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
    options.get().user.get().firstName = firstName;
    return this;
  }

  public AssetReportCreateRequest withMiddleName(String middleName) {
    notNull(middleName, "middleName");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().middleName = middleName;
    return this;
  }

  public AssetReportCreateRequest withLastName(String lastName) {
    notNull(lastName, "lastName");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().lastName = lastName;
    return this;
  }

  public AssetReportCreateRequest withSsn(String ssn) {
    notNull(ssn, "ssn");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().ssn = ssn;
    return this;
  }

  public AssetReportCreateRequest withPhoneNumber(String phoneNumber) {
    notNull(phoneNumber, "phoneNumber");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().phoneNumber = phoneNumber;
    return this;
  }

  public AssetReportCreateRequest withEmail(String email) {
    notNull(email, "email");
    options = options.orElse(new Options());
    options.get().user = options.get().user.orElse(new Options.UserOptions());
    options.get().user.get().email = email;
    return this;
  }

  public static class Options {
    private String webhook;
    private Optional<UserOptions> user = Optional.empty();
    private String clientReportId;

    public String getClientReportId() {
      return clientReportId;
    }

    public void setClientReportId(String clientReportId) {
      this.clientReportId = clientReportId;
    }

    public Optional<UserOptions> getUser() {
      return user;
    }

    public void setUser(
        Optional<UserOptions> user) {
      this.user = user;
    }

    public String getWebhook() {
      return webhook;
    }

    public void setWebhook(String webhook) {
      this.webhook = webhook;
    }

    public static class UserOptions {
      private String clientUserId;
      private String firstName;
      private String middleName;
      private String lastName;
      private String ssn;
      private String phoneNumber;
      private String email;

      public String getClientUserId() {
        return clientUserId;
      }

      public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
      }

      public String getFirstName() {
        return firstName;
      }

      public void setFirstName(String firstName) {
        this.firstName = firstName;
      }

      public String getMiddleName() {
        return middleName;
      }

      public void setMiddleName(String middleName) {
        this.middleName = middleName;
      }

      public String getLastName() {
        return lastName;
      }

      public void setLastName(String lastName) {
        this.lastName = lastName;
      }

      public String getSsn() {
        return ssn;
      }

      public void setSsn(String ssn) {
        this.ssn = ssn;
      }

      public String getPhoneNumber() {
        return phoneNumber;
      }

      public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
      }

      public String getEmail() {
        return email;
      }

      public void setEmail(String email) {
        this.email = email;
      }
    }
  }
}
