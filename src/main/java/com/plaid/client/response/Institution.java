package com.plaid.client.response;

import com.plaid.client.request.common.Product;

import java.sql.Timestamp;
import java.util.List;

public class Institution {
  public static class Credential {
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

  public static class InstitutionStatusBreakdown {
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

  public static class ItemLogins {
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

  public static class TransactionsUpdates {
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

  public static class Auth {
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

  public static class Balance {
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

  public static class Identity {
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

  public static class InstitutionStatus {
    private ItemLogins itemLogins;
    private TransactionsUpdates transactionsUpdates;
    private Auth auth;
    private Balance balance;
    private Identity identity;

    public ItemLogins getItemLogins() {
      return itemLogins;
    }

    public TransactionsUpdates getTransactionsUpdates() {
      return transactionsUpdates;
    }

    public Auth getAuth() {
      return auth;
    }

    public Balance getBalance() {
      return balance;
    }

    public Identity getIdentity() {
      return identity;
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
  private boolean oauth;
  private List<String> routingNumbers;

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

  public boolean getOAuth() {
    return oauth;
  }

  public List<String> getRoutingNumbers() {
    return routingNumbers;
  }
}
