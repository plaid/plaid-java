package com.plaid.client.request;

import com.google.gson.annotations.JsonAdapter;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.internal.gson.OptionalDateTypeAdapterFactory;
import com.plaid.client.request.common.BaseClientRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LinkTokenCreateRequest extends BaseClientRequest {
  private User user;
  private String clientName;
  private List<String> products;
  private List<String> countryCodes;
  private String language;
  private String webhook;
  private String accessToken;
  private String linkCustomizationName;
  private String redirectUri;
  private String androidPackageName;
  private Map<String, SubtypeFilters> accountFilters;
  private LinkTokenCreateRequest.CrossAppItemAdd crossAppItemAdd;
  private PaymentInitiation paymentInitiation;
  private DepositSwitch depositSwitch;

  public LinkTokenCreateRequest(
    User user,
    String clientName,
    List<String> products,
    List<String> countryCodes,
    String language
  ) {
    this.user = user;
    this.clientName = clientName;
    this.products = products;
    this.countryCodes = countryCodes;
    this.language = language;
  }

  public static class SubtypeFilters {
    private List<String> accountSubtypes;

    public SubtypeFilters(List<String> accountSubtypes) {
      this.accountSubtypes = accountSubtypes;
    }

    @Override public boolean equals(Object other) {
      if (this == other) {
        return true;
      }
      if (other == null || getClass() != other.getClass()) {
        return false;
      }
      SubtypeFilters that = (SubtypeFilters) other;
      return Objects.equals(accountSubtypes, that.accountSubtypes);
    }

    @Override public int hashCode() {
      return Objects.hash(accountSubtypes);
    }
  }

  public static class User {
    private String clientUserId;
    private String legalName;
    private String phoneNumber;
    private String emailAddress;
    @JsonAdapter(OptionalDateTypeAdapterFactory.class)
    private Optional<Date> phoneNumberVerifiedTime = Optional.empty();
    @JsonAdapter(OptionalDateTypeAdapterFactory.class)
    private Optional<Date> emailAddressVerifiedTime = Optional.empty();

    public User(String clientUserId) {
      this.clientUserId = clientUserId;
    }

    public User withClientUserId(String clientUserId) {
      this.clientUserId = clientUserId;
      return this;
    }

    public User withLegalName(String legalName) {
      this.legalName = legalName;
      return this;
    }

    public User withPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public User withEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
      return this;
    }

    public User withPhoneNumberVerifiedTime(Date phoneNumberVerifiedTime) {
      if (phoneNumberVerifiedTime == null) {
        this.phoneNumberVerifiedTime = Optional.empty();
      } else {
        this.phoneNumberVerifiedTime = Optional.of(phoneNumberVerifiedTime);
      }
      return this;
    }

    public User withEmailAddressVerifiedTime(Date emailAddressVerifiedTime) {
      if (emailAddressVerifiedTime == null) {
        this.emailAddressVerifiedTime = Optional.empty();
      } else {
        this.emailAddressVerifiedTime = Optional.of(emailAddressVerifiedTime);
      }
      return this;
    }
  }

  public static class CrossAppItemAdd {
    private String targetApplicationToken;
    private String foreignId;

    public CrossAppItemAdd(String targetApplicationToken) {
      this.targetApplicationToken = targetApplicationToken;
    }

    public CrossAppItemAdd withForeignID(String foreignId) {
      this.foreignId = foreignId;
      return this;
    }
  }

  public static class PaymentInitiation {
    private String paymentId;

    public PaymentInitiation(String paymentId) {
      this.paymentId = paymentId;
    }
  }

  public static class DepositSwitch {
    private String depositSwitchId;

    public DepositSwitch(String depositSwitchId) {
      this.depositSwitchId = depositSwitchId;
    }
  }

  public LinkTokenCreateRequest withUser(User user) {
    this.user = user;
    return this;
  }

  public LinkTokenCreateRequest withClientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  public LinkTokenCreateRequest withProducts(List<String> products) {
    this.products = products;
    return this;
  }

  public LinkTokenCreateRequest withWebhook(String webhook) {
    this.webhook = webhook;
    return this;
  }

  public LinkTokenCreateRequest withAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public LinkTokenCreateRequest withLinkCustomizationName(String linkCustomizationName) {
    this.linkCustomizationName = linkCustomizationName;
    return this;
  }

  public LinkTokenCreateRequest withRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public LinkTokenCreateRequest withAndroidPackageName(String androidPackageName) {
    this.androidPackageName = androidPackageName;
    return this;
  }

  public LinkTokenCreateRequest withAccountFilters(Map<String, SubtypeFilters> accountFilters) {
    this.accountFilters = accountFilters;
    return this;
  }

  public LinkTokenCreateRequest withCrossAppItemAdd(CrossAppItemAdd crossAppItemAdd) {
    this.crossAppItemAdd = crossAppItemAdd;
    return this;
  }

  public LinkTokenCreateRequest withPaymentInitiation(PaymentInitiation paymentInitiation) {
    this.paymentInitiation = paymentInitiation;
    return this;
  }

  public LinkTokenCreateRequest withDepositSwitch(DepositSwitch depositSwitch) {
    this.depositSwitch = depositSwitch;
    return this;
  }
}
