package com.plaid.client.response;

import com.plaid.client.request.common.Product;

import java.sql.Timestamp;
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

  public static final class InstitutionStatusBreakdown {
    private Float success;
    private Float errorPlaid;
    private Float errorInstitution;

    public Float getSuccess() {
      return success;
    }

    public Float getErrorPlaid() {
      return errorPlaid;
    }

    public Float getErrorInstitution() {
      return errorInstitution;
    }
  }

  public static final class ItemLogins {
    private String status;
    private Timestamp lastStatusChange;
    private InstitutionStatusBreakdown breakdown;

    public String getStatus() {
      return status;
    }

    public Timestamp getLastStatusChange() {
      return lastStatusChange;
    }

    public InstitutionStatusBreakdown getBreakdown() {
      return breakdown;
    }
  }

  public static final class InstitutionStatus {
    private ItemLogins itemLogins;

    public ItemLogins getItemLogins() {
      return itemLogins;
    }
  }

  private List<String> countryCodes;
  private List<Credential> credentials;
  private boolean hasMfa;
  private String institutionId;
  private List<String> mfa;
  private String name;
  private List<Product> products;
  private InstitutionStatus status;

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

  public InstitutionStatus getStatus() {
    return status;
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
