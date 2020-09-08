package com.plaid.client.response;

import com.plaid.client.request.LinkTokenCreateRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class LinkTokenGetResponse extends BaseResponse {
  private String linkToken;
  private Date expiration;
  private Date createdAt;
  private LinkTokenMetadata metadata;

  public String getLinkToken() {
    return linkToken;
  }

  public Date getExpiration() {
    return expiration;
  }

  public LinkTokenMetadata getMetadata() {
    return metadata;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public static class LinkTokenMetadata {
    private List<String> initialProducts;
    private String webhook;
    private List<String> countryCodes;
    private String language;
    private Map<String, LinkTokenCreateRequest.SubtypeFilters> accountFilters;
    private String redirectUri;
    private String clientName;

    public List<String> getInitialProducts() {
      return initialProducts;
    }

    public String getWebhook() {
      return webhook;
    }

    public List<String> getCountryCodes() {
      return countryCodes;
    }

    public String getLanguage() {
      return language;
    }

    public Map<String, LinkTokenCreateRequest.SubtypeFilters> getAccountFilters() {
      return accountFilters;
    }

    public String getRedirectUri() {
      return redirectUri;
    }

    public String getClientName() {
      return clientName;
    }
  }
}
