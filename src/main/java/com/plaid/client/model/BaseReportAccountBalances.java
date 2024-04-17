/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.AccountBalance;
import com.plaid.client.model.BaseReportAccountBalancesAllOf;
import com.plaid.client.model.BaseReportAverageMonthlyBalances;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Base Report information about an account&#39;s balances
 */
@ApiModel(description = "Base Report information about an account's balances")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class BaseReportAccountBalances {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Double available;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private Double current;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Double limit;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATETIME = "last_updated_datetime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATETIME)
  private OffsetDateTime lastUpdatedDatetime;

  public static final String SERIALIZED_NAME_AVERAGE_BALANCE = "average_balance";
  @SerializedName(SERIALIZED_NAME_AVERAGE_BALANCE)
  private Double averageBalance;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_BALANCES = "average_monthly_balances";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_BALANCES)
  private List<BaseReportAverageMonthlyBalances> averageMonthlyBalances = null;

  public static final String SERIALIZED_NAME_MOST_RECENT_THIRTY_DAY_AVERAGE_BALANCE = "most_recent_thirty_day_average_balance";
  @SerializedName(SERIALIZED_NAME_MOST_RECENT_THIRTY_DAY_AVERAGE_BALANCE)
  private Double mostRecentThirtyDayAverageBalance;


  public BaseReportAccountBalances available(Double available) {
    
    this.available = available;
    return this;
  }

   /**
   * The amount of funds available to be withdrawn from the account, as determined by the financial institution.  For &#x60;credit&#x60;-type accounts, the &#x60;available&#x60; balance typically equals the &#x60;limit&#x60; less the &#x60;current&#x60; balance, less any pending outflows plus any pending inflows.  For &#x60;depository&#x60;-type accounts, the &#x60;available&#x60; balance typically equals the &#x60;current&#x60; balance less any pending outflows plus any pending inflows. For &#x60;depository&#x60;-type accounts, the &#x60;available&#x60; balance does not include the overdraft limit.  For &#x60;investment&#x60;-type accounts (or &#x60;brokerage&#x60;-type accounts for API versions 2018-05-22 and earlier), the &#x60;available&#x60; balance is the total cash available to withdraw as presented by the institution.  Note that not all institutions calculate the &#x60;available&#x60;  balance. In the event that &#x60;available&#x60; balance is unavailable, Plaid will return an &#x60;available&#x60; balance value of &#x60;null&#x60;.  Available balance may be cached and is not guaranteed to be up-to-date in realtime unless the value was returned by &#x60;/accounts/balance/get&#x60;.  If &#x60;current&#x60; is &#x60;null&#x60; this field is guaranteed not to be &#x60;null&#x60;.
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of funds available to be withdrawn from the account, as determined by the financial institution.  For `credit`-type accounts, the `available` balance typically equals the `limit` less the `current` balance, less any pending outflows plus any pending inflows.  For `depository`-type accounts, the `available` balance typically equals the `current` balance less any pending outflows plus any pending inflows. For `depository`-type accounts, the `available` balance does not include the overdraft limit.  For `investment`-type accounts (or `brokerage`-type accounts for API versions 2018-05-22 and earlier), the `available` balance is the total cash available to withdraw as presented by the institution.  Note that not all institutions calculate the `available`  balance. In the event that `available` balance is unavailable, Plaid will return an `available` balance value of `null`.  Available balance may be cached and is not guaranteed to be up-to-date in realtime unless the value was returned by `/accounts/balance/get`.  If `current` is `null` this field is guaranteed not to be `null`.")

  public Double getAvailable() {
    return available;
  }


  public void setAvailable(Double available) {
    this.available = available;
  }


  public BaseReportAccountBalances current(Double current) {
    
    this.current = current;
    return this;
  }

   /**
   * The total amount of funds in or owed by the account.  For &#x60;credit&#x60;-type accounts, a positive balance indicates the amount owed; a negative amount indicates the lender owing the account holder.  For &#x60;loan&#x60;-type accounts, the current balance is the principal remaining on the loan, except in the case of student loan accounts at Sallie Mae (&#x60;ins_116944&#x60;). For Sallie Mae student loans, the account&#39;s balance includes both principal and any outstanding interest.  For &#x60;investment&#x60;-type accounts (or &#x60;brokerage&#x60;-type accounts for API versions 2018-05-22 and earlier), the current balance is the total value of assets as presented by the institution.  Note that balance information may be cached unless the value was returned by &#x60;/accounts/balance/get&#x60;; if the Item is enabled for Transactions, the balance will be at least as recent as the most recent Transaction update. If you require realtime balance information, use the &#x60;available&#x60; balance as provided by &#x60;/accounts/balance/get&#x60;.  When returned by &#x60;/accounts/balance/get&#x60;, this field may be &#x60;null&#x60;. When this happens, &#x60;available&#x60; is guaranteed not to be &#x60;null&#x60;.
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The total amount of funds in or owed by the account.  For `credit`-type accounts, a positive balance indicates the amount owed; a negative amount indicates the lender owing the account holder.  For `loan`-type accounts, the current balance is the principal remaining on the loan, except in the case of student loan accounts at Sallie Mae (`ins_116944`). For Sallie Mae student loans, the account's balance includes both principal and any outstanding interest.  For `investment`-type accounts (or `brokerage`-type accounts for API versions 2018-05-22 and earlier), the current balance is the total value of assets as presented by the institution.  Note that balance information may be cached unless the value was returned by `/accounts/balance/get`; if the Item is enabled for Transactions, the balance will be at least as recent as the most recent Transaction update. If you require realtime balance information, use the `available` balance as provided by `/accounts/balance/get`.  When returned by `/accounts/balance/get`, this field may be `null`. When this happens, `available` is guaranteed not to be `null`.")

  public Double getCurrent() {
    return current;
  }


  public void setCurrent(Double current) {
    this.current = current;
  }


  public BaseReportAccountBalances limit(Double limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * For &#x60;credit&#x60;-type accounts, this represents the credit limit.  For &#x60;depository&#x60;-type accounts, this represents the pre-arranged overdraft limit, which is common for current (checking) accounts in Europe.  In North America, this field is typically only available for &#x60;credit&#x60;-type accounts.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "For `credit`-type accounts, this represents the credit limit.  For `depository`-type accounts, this represents the pre-arranged overdraft limit, which is common for current (checking) accounts in Europe.  In North America, this field is typically only available for `credit`-type accounts.")

  public Double getLimit() {
    return limit;
  }


  public void setLimit(Double limit) {
    this.limit = limit;
  }


  public BaseReportAccountBalances isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the balance. Always null if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the balance. Always null if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public BaseReportAccountBalances unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the balance. Always null if &#x60;iso_currency_code&#x60; is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;unofficial_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the balance. Always null if `iso_currency_code` is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `unofficial_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public BaseReportAccountBalances lastUpdatedDatetime(OffsetDateTime lastUpdatedDatetime) {
    
    this.lastUpdatedDatetime = lastUpdatedDatetime;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the oldest acceptable balance when making a request to &#x60;/accounts/balance/get&#x60;.  This field is only used and expected when the institution is &#x60;ins_128026&#x60; (Capital One) and the Item contains one or more accounts with a non-depository account type, in which case a value must be provided or an &#x60;INVALID_REQUEST&#x60; error with the code of &#x60;INVALID_FIELD&#x60; will be returned. For Capital One depository accounts as well as all other account types on all other institutions, this field is ignored. See [account type schema](https://en.wikipedia.org/wiki/ISO_8601) for a full list of account types.  If the balance that is pulled is older than the given timestamp for Items with this field required, an &#x60;INVALID_REQUEST&#x60; error with the code of &#x60;LAST_UPDATED_DATETIME_OUT_OF_RANGE&#x60; will be returned with the most recent timestamp for the requested account contained in the response.
   * @return lastUpdatedDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the oldest acceptable balance when making a request to `/accounts/balance/get`.  This field is only used and expected when the institution is `ins_128026` (Capital One) and the Item contains one or more accounts with a non-depository account type, in which case a value must be provided or an `INVALID_REQUEST` error with the code of `INVALID_FIELD` will be returned. For Capital One depository accounts as well as all other account types on all other institutions, this field is ignored. See [account type schema](https://en.wikipedia.org/wiki/ISO_8601) for a full list of account types.  If the balance that is pulled is older than the given timestamp for Items with this field required, an `INVALID_REQUEST` error with the code of `LAST_UPDATED_DATETIME_OUT_OF_RANGE` will be returned with the most recent timestamp for the requested account contained in the response.")

  public OffsetDateTime getLastUpdatedDatetime() {
    return lastUpdatedDatetime;
  }


  public void setLastUpdatedDatetime(OffsetDateTime lastUpdatedDatetime) {
    this.lastUpdatedDatetime = lastUpdatedDatetime;
  }


  public BaseReportAccountBalances averageBalance(Double averageBalance) {
    
    this.averageBalance = averageBalance;
    return this;
  }

   /**
   * The average historical balance for the entire report
   * @return averageBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average historical balance for the entire report")

  public Double getAverageBalance() {
    return averageBalance;
  }


  public void setAverageBalance(Double averageBalance) {
    this.averageBalance = averageBalance;
  }


  public BaseReportAccountBalances averageMonthlyBalances(List<BaseReportAverageMonthlyBalances> averageMonthlyBalances) {
    
    this.averageMonthlyBalances = averageMonthlyBalances;
    return this;
  }

  public BaseReportAccountBalances addAverageMonthlyBalancesItem(BaseReportAverageMonthlyBalances averageMonthlyBalancesItem) {
    if (this.averageMonthlyBalances == null) {
      this.averageMonthlyBalances = new ArrayList<>();
    }
    this.averageMonthlyBalances.add(averageMonthlyBalancesItem);
    return this;
  }

   /**
   * The average historical balance of each calendar month
   * @return averageMonthlyBalances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average historical balance of each calendar month")

  public List<BaseReportAverageMonthlyBalances> getAverageMonthlyBalances() {
    return averageMonthlyBalances;
  }


  public void setAverageMonthlyBalances(List<BaseReportAverageMonthlyBalances> averageMonthlyBalances) {
    this.averageMonthlyBalances = averageMonthlyBalances;
  }


  public BaseReportAccountBalances mostRecentThirtyDayAverageBalance(Double mostRecentThirtyDayAverageBalance) {
    
    this.mostRecentThirtyDayAverageBalance = mostRecentThirtyDayAverageBalance;
    return this;
  }

   /**
   * The average historical balance from the most recent 30 days
   * @return mostRecentThirtyDayAverageBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average historical balance from the most recent 30 days")

  public Double getMostRecentThirtyDayAverageBalance() {
    return mostRecentThirtyDayAverageBalance;
  }


  public void setMostRecentThirtyDayAverageBalance(Double mostRecentThirtyDayAverageBalance) {
    this.mostRecentThirtyDayAverageBalance = mostRecentThirtyDayAverageBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportAccountBalances baseReportAccountBalances = (BaseReportAccountBalances) o;
    return Objects.equals(this.available, baseReportAccountBalances.available) &&
        Objects.equals(this.current, baseReportAccountBalances.current) &&
        Objects.equals(this.limit, baseReportAccountBalances.limit) &&
        Objects.equals(this.isoCurrencyCode, baseReportAccountBalances.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, baseReportAccountBalances.unofficialCurrencyCode) &&
        Objects.equals(this.lastUpdatedDatetime, baseReportAccountBalances.lastUpdatedDatetime) &&
        Objects.equals(this.averageBalance, baseReportAccountBalances.averageBalance) &&
        Objects.equals(this.averageMonthlyBalances, baseReportAccountBalances.averageMonthlyBalances) &&
        Objects.equals(this.mostRecentThirtyDayAverageBalance, baseReportAccountBalances.mostRecentThirtyDayAverageBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, current, limit, isoCurrencyCode, unofficialCurrencyCode, lastUpdatedDatetime, averageBalance, averageMonthlyBalances, mostRecentThirtyDayAverageBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportAccountBalances {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
    sb.append("    averageBalance: ").append(toIndentedString(averageBalance)).append("\n");
    sb.append("    averageMonthlyBalances: ").append(toIndentedString(averageMonthlyBalances)).append("\n");
    sb.append("    mostRecentThirtyDayAverageBalance: ").append(toIndentedString(mostRecentThirtyDayAverageBalance)).append("\n");
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

