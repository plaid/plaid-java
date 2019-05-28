package com.plaid.client.response;

import com.plaid.client.request.common.Product;

import java.util.List;

public final class Institution {
  public static final class Credential {
    private String label;
    private String name;
    private String type;

    public String getLabel() {
      return label;
    }

    public String getName() {
      return name;
    }

    public String getType() {
      return type;
    }
  }

  private List<String> countryCodes;
  private List<Credential> credentials;
  private boolean hasMfa;
  private String institutionId;
  private List<String> mfa;
  private String name;
  private List<Product> products;

  private String url;
  private String logo;
  private String primaryColor;

  public String getUrl() {
    return url;
  }

  public String getLogo() {
    return logo;
  }

  public String getPrimaryColor() {
    return primaryColor;
  }

  public List<String> getCountryCodes() {
    return countryCodes;
  }

  public List<Credential> getCredentials() {
    return credentials;
  }

  public boolean hasMfa() {
    return hasMfa;
  }

  public String getInstitutionId() {
    return institutionId;
  }

  public List<String> getMfa() {
    return mfa;
  }

  public String getName() {
    return name;
  }

  public List<Product> getProducts() {
    return products;
  }
}
