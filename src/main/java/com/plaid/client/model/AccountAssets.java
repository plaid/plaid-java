/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.AccountHolderCategory;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.AssetReportAccountBalance;
import com.plaid.client.model.AssetReportInvestments;
import com.plaid.client.model.AssetReportTransaction;
import com.plaid.client.model.HistoricalBalance;
import com.plaid.client.model.Owner;
import com.plaid.client.model.OwnershipType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Asset information about an account
 */
@ApiModel(description = "Asset information about an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class AccountAssets {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private AssetReportAccountBalance balances;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccountType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private AccountSubtype subtype;

  /**
   * The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  &#x60;pending_automatic_verification&#x60;: The Item is pending automatic verification  &#x60;pending_manual_verification&#x60;: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the micro-deposit.  &#x60;automatically_verified&#x60;: The Item has successfully been automatically verified   &#x60;manually_verified&#x60;: The Item has successfully been manually verified  &#x60;verification_expired&#x60;: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  &#x60;verification_failed&#x60;: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.  &#x60;database_matched&#x60;: The Item has successfully been verified using Plaid&#39;s data sources. Note: Database Match is currently a beta feature, please contact your account manager for more information.   
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    AUTOMATICALLY_VERIFIED("automatically_verified"),
    
    PENDING_AUTOMATIC_VERIFICATION("pending_automatic_verification"),
    
    PENDING_MANUAL_VERIFICATION("pending_manual_verification"),
    
    MANUALLY_VERIFIED("manually_verified"),
    
    VERIFICATION_EXPIRED("verification_expired"),
    
    VERIFICATION_FAILED("verification_failed"),
    
    DATABASE_MATCHED("database_matched");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatusEnum verificationStatus;

  public static final String SERIALIZED_NAME_PERSISTENT_ACCOUNT_ID = "persistent_account_id";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_ACCOUNT_ID)
  private String persistentAccountId;

  public static final String SERIALIZED_NAME_HOLDER_CATEGORY = "holder_category";
  @SerializedName(SERIALIZED_NAME_HOLDER_CATEGORY)
  private AccountHolderCategory holderCategory;

  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "days_available";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private Double daysAvailable;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<AssetReportTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVESTMENTS = "investments";
  @SerializedName(SERIALIZED_NAME_INVESTMENTS)
  private AssetReportInvestments investments;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownership_type";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private OwnershipType ownershipType;

  public static final String SERIALIZED_NAME_HISTORICAL_BALANCES = "historical_balances";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_BALANCES)
  private List<HistoricalBalance> historicalBalances = new ArrayList<>();


  public AccountAssets accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the account. This value will not change unless Plaid can&#39;t reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new &#x60;account_id&#x60; will be assigned to the account.  The &#x60;account_id&#x60; can also change if the &#x60;access_token&#x60; is deleted and the same credentials that were used to generate that &#x60;access_token&#x60; are used to generate a new &#x60;access_token&#x60; on a later date. In that case, the new &#x60;account_id&#x60; will be different from the old &#x60;account_id&#x60;.  If an account with a specific &#x60;account_id&#x60; disappears instead of changing, the account is likely closed. Closed accounts are not returned by the Plaid API.  Like all Plaid identifiers, the &#x60;account_id&#x60; is case sensitive.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the account. This value will not change unless Plaid can't reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new `account_id` will be assigned to the account.  The `account_id` can also change if the `access_token` is deleted and the same credentials that were used to generate that `access_token` are used to generate a new `access_token` on a later date. In that case, the new `account_id` will be different from the old `account_id`.  If an account with a specific `account_id` disappears instead of changing, the account is likely closed. Closed accounts are not returned by the Plaid API.  Like all Plaid identifiers, the `account_id` is case sensitive.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccountAssets balances(AssetReportAccountBalance balances) {
    
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetReportAccountBalance getBalances() {
    return balances;
  }


  public void setBalances(AssetReportAccountBalance balances) {
    this.balances = balances;
  }


  public AccountAssets mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The last 2-4 alphanumeric characters of an account&#39;s official account number. Note that the mask may be non-unique between an Item&#39;s accounts, and it may also not match the mask that the bank displays to the user.
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts, and it may also not match the mask that the bank displays to the user.")

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public AccountAssets name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the account, either assigned by the user or by the financial institution itself
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the account, either assigned by the user or by the financial institution itself")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountAssets officialName(String officialName) {
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The official name of the account as given by the financial institution
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The official name of the account as given by the financial institution")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }


  public AccountAssets type(AccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountType getType() {
    return type;
  }


  public void setType(AccountType type) {
    this.type = type;
  }


  public AccountAssets subtype(AccountSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AccountSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(AccountSubtype subtype) {
    this.subtype = subtype;
  }


  public AccountAssets verificationStatus(VerificationStatusEnum verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  &#x60;pending_automatic_verification&#x60;: The Item is pending automatic verification  &#x60;pending_manual_verification&#x60;: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the micro-deposit.  &#x60;automatically_verified&#x60;: The Item has successfully been automatically verified   &#x60;manually_verified&#x60;: The Item has successfully been manually verified  &#x60;verification_expired&#x60;: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  &#x60;verification_failed&#x60;: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.  &#x60;database_matched&#x60;: The Item has successfully been verified using Plaid&#39;s data sources. Note: Database Match is currently a beta feature, please contact your account manager for more information.   
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  `pending_automatic_verification`: The Item is pending automatic verification  `pending_manual_verification`: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the micro-deposit.  `automatically_verified`: The Item has successfully been automatically verified   `manually_verified`: The Item has successfully been manually verified  `verification_expired`: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  `verification_failed`: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.  `database_matched`: The Item has successfully been verified using Plaid's data sources. Note: Database Match is currently a beta feature, please contact your account manager for more information.   ")

  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public AccountAssets persistentAccountId(String persistentAccountId) {
    
    this.persistentAccountId = persistentAccountId;
    return this;
  }

   /**
   * A unique and persistent identifier for accounts that can be used to trace multiple instances of the same account across different Items for depository accounts. This is currently an opt-in field and only supported for Chase Items.
   * @return persistentAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique and persistent identifier for accounts that can be used to trace multiple instances of the same account across different Items for depository accounts. This is currently an opt-in field and only supported for Chase Items.")

  public String getPersistentAccountId() {
    return persistentAccountId;
  }


  public void setPersistentAccountId(String persistentAccountId) {
    this.persistentAccountId = persistentAccountId;
  }


  public AccountAssets holderCategory(AccountHolderCategory holderCategory) {
    
    this.holderCategory = holderCategory;
    return this;
  }

   /**
   * Get holderCategory
   * @return holderCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountHolderCategory getHolderCategory() {
    return holderCategory;
  }


  public void setHolderCategory(AccountHolderCategory holderCategory) {
    this.holderCategory = holderCategory;
  }


  public AccountAssets daysAvailable(Double daysAvailable) {
    
    this.daysAvailable = daysAvailable;
    return this;
  }

   /**
   * The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account.
   * @return daysAvailable
  **/
  @ApiModelProperty(required = true, value = "The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account.")

  public Double getDaysAvailable() {
    return daysAvailable;
  }


  public void setDaysAvailable(Double daysAvailable) {
    this.daysAvailable = daysAvailable;
  }


  public AccountAssets transactions(List<AssetReportTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public AccountAssets addTransactionsItem(AssetReportTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Transaction history associated with the account.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "Transaction history associated with the account.")

  public List<AssetReportTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<AssetReportTransaction> transactions) {
    this.transactions = transactions;
  }


  public AccountAssets investments(AssetReportInvestments investments) {
    
    this.investments = investments;
    return this;
  }

   /**
   * Get investments
   * @return investments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetReportInvestments getInvestments() {
    return investments;
  }


  public void setInvestments(AssetReportInvestments investments) {
    this.investments = investments;
  }


  public AccountAssets owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public AccountAssets addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners.For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners.For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the `owners` object is not returned, and instead identity information is returned in the top level `identity` object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  public AccountAssets ownershipType(OwnershipType ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Get ownershipType
   * @return ownershipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OwnershipType getOwnershipType() {
    return ownershipType;
  }


  public void setOwnershipType(OwnershipType ownershipType) {
    this.ownershipType = ownershipType;
  }


  public AccountAssets historicalBalances(List<HistoricalBalance> historicalBalances) {
    
    this.historicalBalances = historicalBalances;
    return this;
  }

  public AccountAssets addHistoricalBalancesItem(HistoricalBalance historicalBalancesItem) {
    this.historicalBalances.add(historicalBalancesItem);
    return this;
  }

   /**
   * Calculated data about the historical balances on the account.
   * @return historicalBalances
  **/
  @ApiModelProperty(required = true, value = "Calculated data about the historical balances on the account.")

  public List<HistoricalBalance> getHistoricalBalances() {
    return historicalBalances;
  }


  public void setHistoricalBalances(List<HistoricalBalance> historicalBalances) {
    this.historicalBalances = historicalBalances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAssets accountAssets = (AccountAssets) o;
    return Objects.equals(this.accountId, accountAssets.accountId) &&
        Objects.equals(this.balances, accountAssets.balances) &&
        Objects.equals(this.mask, accountAssets.mask) &&
        Objects.equals(this.name, accountAssets.name) &&
        Objects.equals(this.officialName, accountAssets.officialName) &&
        Objects.equals(this.type, accountAssets.type) &&
        Objects.equals(this.subtype, accountAssets.subtype) &&
        Objects.equals(this.verificationStatus, accountAssets.verificationStatus) &&
        Objects.equals(this.persistentAccountId, accountAssets.persistentAccountId) &&
        Objects.equals(this.holderCategory, accountAssets.holderCategory) &&
        Objects.equals(this.daysAvailable, accountAssets.daysAvailable) &&
        Objects.equals(this.transactions, accountAssets.transactions) &&
        Objects.equals(this.investments, accountAssets.investments) &&
        Objects.equals(this.owners, accountAssets.owners) &&
        Objects.equals(this.ownershipType, accountAssets.ownershipType) &&
        Objects.equals(this.historicalBalances, accountAssets.historicalBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balances, mask, name, officialName, type, subtype, verificationStatus, persistentAccountId, holderCategory, daysAvailable, transactions, investments, owners, ownershipType, historicalBalances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAssets {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    persistentAccountId: ").append(toIndentedString(persistentAccountId)).append("\n");
    sb.append("    holderCategory: ").append(toIndentedString(holderCategory)).append("\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    historicalBalances: ").append(toIndentedString(historicalBalances)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

