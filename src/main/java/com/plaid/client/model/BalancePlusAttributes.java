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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains additional data that can be used to assess the ACH return risk
 */
@ApiModel(description = "Contains additional data that can be used to assess the ACH return risk")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class BalancePlusAttributes {
  public static final String SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT7D = "unauthorized_transactions_count_7d";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT7D)
  private Integer unauthorizedTransactionsCount7d;

  public static final String SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT30D = "unauthorized_transactions_count_30d";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT30D)
  private Integer unauthorizedTransactionsCount30d;

  public static final String SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT60D = "unauthorized_transactions_count_60d";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT60D)
  private Integer unauthorizedTransactionsCount60d;

  public static final String SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT90D = "unauthorized_transactions_count_90d";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED_TRANSACTIONS_COUNT90D)
  private Integer unauthorizedTransactionsCount90d;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT7D = "nsf_overdraft_transactions_count_7d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT7D)
  private Integer nsfOverdraftTransactionsCount7d;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT30D = "nsf_overdraft_transactions_count_30d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT30D)
  private Integer nsfOverdraftTransactionsCount30d;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT60D = "nsf_overdraft_transactions_count_60d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT60D)
  private Integer nsfOverdraftTransactionsCount60d;

  public static final String SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT90D = "nsf_overdraft_transactions_count_90d";
  @SerializedName(SERIALIZED_NAME_NSF_OVERDRAFT_TRANSACTIONS_COUNT90D)
  private Integer nsfOverdraftTransactionsCount90d;

  public static final String SERIALIZED_NAME_DAYS_SINCE_FIRST_PLAID_CONNECTION = "days_since_first_plaid_connection";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_FIRST_PLAID_CONNECTION)
  private Integer daysSinceFirstPlaidConnection;

  public static final String SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT7D = "plaid_connections_count_7d";
  @SerializedName(SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT7D)
  private Integer plaidConnectionsCount7d;

  public static final String SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT30D = "plaid_connections_count_30d";
  @SerializedName(SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT30D)
  private Integer plaidConnectionsCount30d;

  public static final String SERIALIZED_NAME_TOTAL_PLAID_CONNECTIONS_COUNT = "total_plaid_connections_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAID_CONNECTIONS_COUNT)
  private Integer totalPlaidConnectionsCount;

  public static final String SERIALIZED_NAME_IS_SAVINGS_OR_MONEY_MARKET_ACCOUNT = "is_savings_or_money_market_account";
  @SerializedName(SERIALIZED_NAME_IS_SAVINGS_OR_MONEY_MARKET_ACCOUNT)
  private Boolean isSavingsOrMoneyMarketAccount;

  public static final String SERIALIZED_NAME_PHONE_CHANGE_COUNT28D = "phone_change_count_28d";
  @SerializedName(SERIALIZED_NAME_PHONE_CHANGE_COUNT28D)
  private Integer phoneChangeCount28d;

  public static final String SERIALIZED_NAME_PHONE_CHANGE_COUNT90D = "phone_change_count_90d";
  @SerializedName(SERIALIZED_NAME_PHONE_CHANGE_COUNT90D)
  private Integer phoneChangeCount90d;

  public static final String SERIALIZED_NAME_EMAIL_CHANGE_COUNT28D = "email_change_count_28d";
  @SerializedName(SERIALIZED_NAME_EMAIL_CHANGE_COUNT28D)
  private Integer emailChangeCount28d;

  public static final String SERIALIZED_NAME_EMAIL_CHANGE_COUNT90D = "email_change_count_90d";
  @SerializedName(SERIALIZED_NAME_EMAIL_CHANGE_COUNT90D)
  private Integer emailChangeCount90d;

  public static final String SERIALIZED_NAME_ADDRESS_CHANGE_COUNT28D = "address_change_count_28d";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CHANGE_COUNT28D)
  private Integer addressChangeCount28d;

  public static final String SERIALIZED_NAME_ADDRESS_CHANGE_COUNT90D = "address_change_count_90d";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CHANGE_COUNT90D)
  private Integer addressChangeCount90d;

  public static final String SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D = "plaid_non_oauth_authentication_attempts_count_3d";
  @SerializedName(SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D)
  private Integer plaidNonOauthAuthenticationAttemptsCount3d;

  public static final String SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D = "plaid_non_oauth_authentication_attempts_count_7d";
  @SerializedName(SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D)
  private Integer plaidNonOauthAuthenticationAttemptsCount7d;

  public static final String SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D = "plaid_non_oauth_authentication_attempts_count_30d";
  @SerializedName(SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D)
  private Integer plaidNonOauthAuthenticationAttemptsCount30d;

  public static final String SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D = "failed_plaid_non_oauth_authentication_attempts_count_3d";
  @SerializedName(SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D)
  private Integer failedPlaidNonOauthAuthenticationAttemptsCount3d;

  public static final String SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D = "failed_plaid_non_oauth_authentication_attempts_count_7d";
  @SerializedName(SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D)
  private Integer failedPlaidNonOauthAuthenticationAttemptsCount7d;

  public static final String SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D = "failed_plaid_non_oauth_authentication_attempts_count_30d";
  @SerializedName(SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D)
  private Integer failedPlaidNonOauthAuthenticationAttemptsCount30d;

  public static final String SERIALIZED_NAME_IS_ACCOUNT_CLOSED = "is_account_closed";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_CLOSED)
  private Boolean isAccountClosed;

  public static final String SERIALIZED_NAME_IS_ACCOUNT_FROZEN_OR_RESTRICTED = "is_account_frozen_or_restricted";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_FROZEN_OR_RESTRICTED)
  private Boolean isAccountFrozenOrRestricted;


  public BalancePlusAttributes unauthorizedTransactionsCount7d(Integer unauthorizedTransactionsCount7d) {
    
    this.unauthorizedTransactionsCount7d = unauthorizedTransactionsCount7d;
    return this;
  }

   /**
   * The number of possible past returns due to unauthorized transactions over the past 7 days from the account that will be debited
   * @return unauthorizedTransactionsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to unauthorized transactions over the past 7 days from the account that will be debited")

  public Integer getUnauthorizedTransactionsCount7d() {
    return unauthorizedTransactionsCount7d;
  }


  public void setUnauthorizedTransactionsCount7d(Integer unauthorizedTransactionsCount7d) {
    this.unauthorizedTransactionsCount7d = unauthorizedTransactionsCount7d;
  }


  public BalancePlusAttributes unauthorizedTransactionsCount30d(Integer unauthorizedTransactionsCount30d) {
    
    this.unauthorizedTransactionsCount30d = unauthorizedTransactionsCount30d;
    return this;
  }

   /**
   * The number of possible past returns due to unauthorized transactions over the past 30 days from the account that will be debited
   * @return unauthorizedTransactionsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to unauthorized transactions over the past 30 days from the account that will be debited")

  public Integer getUnauthorizedTransactionsCount30d() {
    return unauthorizedTransactionsCount30d;
  }


  public void setUnauthorizedTransactionsCount30d(Integer unauthorizedTransactionsCount30d) {
    this.unauthorizedTransactionsCount30d = unauthorizedTransactionsCount30d;
  }


  public BalancePlusAttributes unauthorizedTransactionsCount60d(Integer unauthorizedTransactionsCount60d) {
    
    this.unauthorizedTransactionsCount60d = unauthorizedTransactionsCount60d;
    return this;
  }

   /**
   * The number of possible past returns due to unauthorized transactions over the past 60 days from the account that will be debited
   * @return unauthorizedTransactionsCount60d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to unauthorized transactions over the past 60 days from the account that will be debited")

  public Integer getUnauthorizedTransactionsCount60d() {
    return unauthorizedTransactionsCount60d;
  }


  public void setUnauthorizedTransactionsCount60d(Integer unauthorizedTransactionsCount60d) {
    this.unauthorizedTransactionsCount60d = unauthorizedTransactionsCount60d;
  }


  public BalancePlusAttributes unauthorizedTransactionsCount90d(Integer unauthorizedTransactionsCount90d) {
    
    this.unauthorizedTransactionsCount90d = unauthorizedTransactionsCount90d;
    return this;
  }

   /**
   * The number of possible past returns due to unauthorized transactions over the past 90 days from the account that will be debited
   * @return unauthorizedTransactionsCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to unauthorized transactions over the past 90 days from the account that will be debited")

  public Integer getUnauthorizedTransactionsCount90d() {
    return unauthorizedTransactionsCount90d;
  }


  public void setUnauthorizedTransactionsCount90d(Integer unauthorizedTransactionsCount90d) {
    this.unauthorizedTransactionsCount90d = unauthorizedTransactionsCount90d;
  }


  public BalancePlusAttributes nsfOverdraftTransactionsCount7d(Integer nsfOverdraftTransactionsCount7d) {
    
    this.nsfOverdraftTransactionsCount7d = nsfOverdraftTransactionsCount7d;
    return this;
  }

   /**
   * The number of possible past returns due to non-sufficient funds/overdrafts over the past 7 days from the account that will be debited
   * @return nsfOverdraftTransactionsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to non-sufficient funds/overdrafts over the past 7 days from the account that will be debited")

  public Integer getNsfOverdraftTransactionsCount7d() {
    return nsfOverdraftTransactionsCount7d;
  }


  public void setNsfOverdraftTransactionsCount7d(Integer nsfOverdraftTransactionsCount7d) {
    this.nsfOverdraftTransactionsCount7d = nsfOverdraftTransactionsCount7d;
  }


  public BalancePlusAttributes nsfOverdraftTransactionsCount30d(Integer nsfOverdraftTransactionsCount30d) {
    
    this.nsfOverdraftTransactionsCount30d = nsfOverdraftTransactionsCount30d;
    return this;
  }

   /**
   * The number of possible past returns due to non-sufficient funds/overdrafts over the past 30 days from the account that will be debited
   * @return nsfOverdraftTransactionsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to non-sufficient funds/overdrafts over the past 30 days from the account that will be debited")

  public Integer getNsfOverdraftTransactionsCount30d() {
    return nsfOverdraftTransactionsCount30d;
  }


  public void setNsfOverdraftTransactionsCount30d(Integer nsfOverdraftTransactionsCount30d) {
    this.nsfOverdraftTransactionsCount30d = nsfOverdraftTransactionsCount30d;
  }


  public BalancePlusAttributes nsfOverdraftTransactionsCount60d(Integer nsfOverdraftTransactionsCount60d) {
    
    this.nsfOverdraftTransactionsCount60d = nsfOverdraftTransactionsCount60d;
    return this;
  }

   /**
   * The number of possible past returns due to non-sufficient funds/overdrafts over the past 60 days from the account that will be debited
   * @return nsfOverdraftTransactionsCount60d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to non-sufficient funds/overdrafts over the past 60 days from the account that will be debited")

  public Integer getNsfOverdraftTransactionsCount60d() {
    return nsfOverdraftTransactionsCount60d;
  }


  public void setNsfOverdraftTransactionsCount60d(Integer nsfOverdraftTransactionsCount60d) {
    this.nsfOverdraftTransactionsCount60d = nsfOverdraftTransactionsCount60d;
  }


  public BalancePlusAttributes nsfOverdraftTransactionsCount90d(Integer nsfOverdraftTransactionsCount90d) {
    
    this.nsfOverdraftTransactionsCount90d = nsfOverdraftTransactionsCount90d;
    return this;
  }

   /**
   * The number of possible past returns due to non-sufficient funds/overdrafts over the past 90 days from the account that will be debited
   * @return nsfOverdraftTransactionsCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of possible past returns due to non-sufficient funds/overdrafts over the past 90 days from the account that will be debited")

  public Integer getNsfOverdraftTransactionsCount90d() {
    return nsfOverdraftTransactionsCount90d;
  }


  public void setNsfOverdraftTransactionsCount90d(Integer nsfOverdraftTransactionsCount90d) {
    this.nsfOverdraftTransactionsCount90d = nsfOverdraftTransactionsCount90d;
  }


  public BalancePlusAttributes daysSinceFirstPlaidConnection(Integer daysSinceFirstPlaidConnection) {
    
    this.daysSinceFirstPlaidConnection = daysSinceFirstPlaidConnection;
    return this;
  }

   /**
   * The number of days since the first time the Item was connected to an application via Plaid
   * @return daysSinceFirstPlaidConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of days since the first time the Item was connected to an application via Plaid")

  public Integer getDaysSinceFirstPlaidConnection() {
    return daysSinceFirstPlaidConnection;
  }


  public void setDaysSinceFirstPlaidConnection(Integer daysSinceFirstPlaidConnection) {
    this.daysSinceFirstPlaidConnection = daysSinceFirstPlaidConnection;
  }


  public BalancePlusAttributes plaidConnectionsCount7d(Integer plaidConnectionsCount7d) {
    
    this.plaidConnectionsCount7d = plaidConnectionsCount7d;
    return this;
  }

   /**
   * The number of times the Item has been connected to applications via Plaid over the past 7 days
   * @return plaidConnectionsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the Item has been connected to applications via Plaid over the past 7 days")

  public Integer getPlaidConnectionsCount7d() {
    return plaidConnectionsCount7d;
  }


  public void setPlaidConnectionsCount7d(Integer plaidConnectionsCount7d) {
    this.plaidConnectionsCount7d = plaidConnectionsCount7d;
  }


  public BalancePlusAttributes plaidConnectionsCount30d(Integer plaidConnectionsCount30d) {
    
    this.plaidConnectionsCount30d = plaidConnectionsCount30d;
    return this;
  }

   /**
   * The number of times the Item has been connected to applications via Plaid over the past 30 days
   * @return plaidConnectionsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the Item has been connected to applications via Plaid over the past 30 days")

  public Integer getPlaidConnectionsCount30d() {
    return plaidConnectionsCount30d;
  }


  public void setPlaidConnectionsCount30d(Integer plaidConnectionsCount30d) {
    this.plaidConnectionsCount30d = plaidConnectionsCount30d;
  }


  public BalancePlusAttributes totalPlaidConnectionsCount(Integer totalPlaidConnectionsCount) {
    
    this.totalPlaidConnectionsCount = totalPlaidConnectionsCount;
    return this;
  }

   /**
   * The total number of times the Item has been connected to applications via Plaid
   * @return totalPlaidConnectionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The total number of times the Item has been connected to applications via Plaid")

  public Integer getTotalPlaidConnectionsCount() {
    return totalPlaidConnectionsCount;
  }


  public void setTotalPlaidConnectionsCount(Integer totalPlaidConnectionsCount) {
    this.totalPlaidConnectionsCount = totalPlaidConnectionsCount;
  }


  public BalancePlusAttributes isSavingsOrMoneyMarketAccount(Boolean isSavingsOrMoneyMarketAccount) {
    
    this.isSavingsOrMoneyMarketAccount = isSavingsOrMoneyMarketAccount;
    return this;
  }

   /**
   * Indicates if the ACH transaction funding account is a savings/money market account
   * @return isSavingsOrMoneyMarketAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates if the ACH transaction funding account is a savings/money market account")

  public Boolean getIsSavingsOrMoneyMarketAccount() {
    return isSavingsOrMoneyMarketAccount;
  }


  public void setIsSavingsOrMoneyMarketAccount(Boolean isSavingsOrMoneyMarketAccount) {
    this.isSavingsOrMoneyMarketAccount = isSavingsOrMoneyMarketAccount;
  }


  public BalancePlusAttributes phoneChangeCount28d(Integer phoneChangeCount28d) {
    
    this.phoneChangeCount28d = phoneChangeCount28d;
    return this;
  }

   /**
   * The number of times the account&#39;s phone numbers on file have changed over the past 28 days
   * @return phoneChangeCount28d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the account's phone numbers on file have changed over the past 28 days")

  public Integer getPhoneChangeCount28d() {
    return phoneChangeCount28d;
  }


  public void setPhoneChangeCount28d(Integer phoneChangeCount28d) {
    this.phoneChangeCount28d = phoneChangeCount28d;
  }


  public BalancePlusAttributes phoneChangeCount90d(Integer phoneChangeCount90d) {
    
    this.phoneChangeCount90d = phoneChangeCount90d;
    return this;
  }

   /**
   * The number of times the account&#39;s phone numbers on file have changed over the past 90 days
   * @return phoneChangeCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the account's phone numbers on file have changed over the past 90 days")

  public Integer getPhoneChangeCount90d() {
    return phoneChangeCount90d;
  }


  public void setPhoneChangeCount90d(Integer phoneChangeCount90d) {
    this.phoneChangeCount90d = phoneChangeCount90d;
  }


  public BalancePlusAttributes emailChangeCount28d(Integer emailChangeCount28d) {
    
    this.emailChangeCount28d = emailChangeCount28d;
    return this;
  }

   /**
   * The number of times the account&#39;s email addresses on file have changed over the past 28 days
   * @return emailChangeCount28d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the account's email addresses on file have changed over the past 28 days")

  public Integer getEmailChangeCount28d() {
    return emailChangeCount28d;
  }


  public void setEmailChangeCount28d(Integer emailChangeCount28d) {
    this.emailChangeCount28d = emailChangeCount28d;
  }


  public BalancePlusAttributes emailChangeCount90d(Integer emailChangeCount90d) {
    
    this.emailChangeCount90d = emailChangeCount90d;
    return this;
  }

   /**
   * The number of times the account&#39;s email addresses on file have changed over the past 90 days
   * @return emailChangeCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the account's email addresses on file have changed over the past 90 days")

  public Integer getEmailChangeCount90d() {
    return emailChangeCount90d;
  }


  public void setEmailChangeCount90d(Integer emailChangeCount90d) {
    this.emailChangeCount90d = emailChangeCount90d;
  }


  public BalancePlusAttributes addressChangeCount28d(Integer addressChangeCount28d) {
    
    this.addressChangeCount28d = addressChangeCount28d;
    return this;
  }

   /**
   * The number of times the account&#39;s addresses on file have changed over the past 28 days
   * @return addressChangeCount28d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the account's addresses on file have changed over the past 28 days")

  public Integer getAddressChangeCount28d() {
    return addressChangeCount28d;
  }


  public void setAddressChangeCount28d(Integer addressChangeCount28d) {
    this.addressChangeCount28d = addressChangeCount28d;
  }


  public BalancePlusAttributes addressChangeCount90d(Integer addressChangeCount90d) {
    
    this.addressChangeCount90d = addressChangeCount90d;
    return this;
  }

   /**
   * The number of times the account&#39;s addresses on file have changed over the past 90 days
   * @return addressChangeCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of times the account's addresses on file have changed over the past 90 days")

  public Integer getAddressChangeCount90d() {
    return addressChangeCount90d;
  }


  public void setAddressChangeCount90d(Integer addressChangeCount90d) {
    this.addressChangeCount90d = addressChangeCount90d;
  }


  public BalancePlusAttributes plaidNonOauthAuthenticationAttemptsCount3d(Integer plaidNonOauthAuthenticationAttemptsCount3d) {
    
    this.plaidNonOauthAuthenticationAttemptsCount3d = plaidNonOauthAuthenticationAttemptsCount3d;
    return this;
  }

   /**
   * The number of non-OAuth authentication attempts via Plaid for this bank account over the past 3 days
   * @return plaidNonOauthAuthenticationAttemptsCount3d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of non-OAuth authentication attempts via Plaid for this bank account over the past 3 days")

  public Integer getPlaidNonOauthAuthenticationAttemptsCount3d() {
    return plaidNonOauthAuthenticationAttemptsCount3d;
  }


  public void setPlaidNonOauthAuthenticationAttemptsCount3d(Integer plaidNonOauthAuthenticationAttemptsCount3d) {
    this.plaidNonOauthAuthenticationAttemptsCount3d = plaidNonOauthAuthenticationAttemptsCount3d;
  }


  public BalancePlusAttributes plaidNonOauthAuthenticationAttemptsCount7d(Integer plaidNonOauthAuthenticationAttemptsCount7d) {
    
    this.plaidNonOauthAuthenticationAttemptsCount7d = plaidNonOauthAuthenticationAttemptsCount7d;
    return this;
  }

   /**
   * The number of non-OAuth authentication attempts via Plaid for this bank account over the past 7 days
   * @return plaidNonOauthAuthenticationAttemptsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of non-OAuth authentication attempts via Plaid for this bank account over the past 7 days")

  public Integer getPlaidNonOauthAuthenticationAttemptsCount7d() {
    return plaidNonOauthAuthenticationAttemptsCount7d;
  }


  public void setPlaidNonOauthAuthenticationAttemptsCount7d(Integer plaidNonOauthAuthenticationAttemptsCount7d) {
    this.plaidNonOauthAuthenticationAttemptsCount7d = plaidNonOauthAuthenticationAttemptsCount7d;
  }


  public BalancePlusAttributes plaidNonOauthAuthenticationAttemptsCount30d(Integer plaidNonOauthAuthenticationAttemptsCount30d) {
    
    this.plaidNonOauthAuthenticationAttemptsCount30d = plaidNonOauthAuthenticationAttemptsCount30d;
    return this;
  }

   /**
   * The number of non-OAuth authentication attempts via Plaid for this bank account over the past 30 days
   * @return plaidNonOauthAuthenticationAttemptsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of non-OAuth authentication attempts via Plaid for this bank account over the past 30 days")

  public Integer getPlaidNonOauthAuthenticationAttemptsCount30d() {
    return plaidNonOauthAuthenticationAttemptsCount30d;
  }


  public void setPlaidNonOauthAuthenticationAttemptsCount30d(Integer plaidNonOauthAuthenticationAttemptsCount30d) {
    this.plaidNonOauthAuthenticationAttemptsCount30d = plaidNonOauthAuthenticationAttemptsCount30d;
  }


  public BalancePlusAttributes failedPlaidNonOauthAuthenticationAttemptsCount3d(Integer failedPlaidNonOauthAuthenticationAttemptsCount3d) {
    
    this.failedPlaidNonOauthAuthenticationAttemptsCount3d = failedPlaidNonOauthAuthenticationAttemptsCount3d;
    return this;
  }

   /**
   * The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 3 days
   * @return failedPlaidNonOauthAuthenticationAttemptsCount3d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 3 days")

  public Integer getFailedPlaidNonOauthAuthenticationAttemptsCount3d() {
    return failedPlaidNonOauthAuthenticationAttemptsCount3d;
  }


  public void setFailedPlaidNonOauthAuthenticationAttemptsCount3d(Integer failedPlaidNonOauthAuthenticationAttemptsCount3d) {
    this.failedPlaidNonOauthAuthenticationAttemptsCount3d = failedPlaidNonOauthAuthenticationAttemptsCount3d;
  }


  public BalancePlusAttributes failedPlaidNonOauthAuthenticationAttemptsCount7d(Integer failedPlaidNonOauthAuthenticationAttemptsCount7d) {
    
    this.failedPlaidNonOauthAuthenticationAttemptsCount7d = failedPlaidNonOauthAuthenticationAttemptsCount7d;
    return this;
  }

   /**
   * The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 7 days
   * @return failedPlaidNonOauthAuthenticationAttemptsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 7 days")

  public Integer getFailedPlaidNonOauthAuthenticationAttemptsCount7d() {
    return failedPlaidNonOauthAuthenticationAttemptsCount7d;
  }


  public void setFailedPlaidNonOauthAuthenticationAttemptsCount7d(Integer failedPlaidNonOauthAuthenticationAttemptsCount7d) {
    this.failedPlaidNonOauthAuthenticationAttemptsCount7d = failedPlaidNonOauthAuthenticationAttemptsCount7d;
  }


  public BalancePlusAttributes failedPlaidNonOauthAuthenticationAttemptsCount30d(Integer failedPlaidNonOauthAuthenticationAttemptsCount30d) {
    
    this.failedPlaidNonOauthAuthenticationAttemptsCount30d = failedPlaidNonOauthAuthenticationAttemptsCount30d;
    return this;
  }

   /**
   * The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 30 days
   * @return failedPlaidNonOauthAuthenticationAttemptsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 30 days")

  public Integer getFailedPlaidNonOauthAuthenticationAttemptsCount30d() {
    return failedPlaidNonOauthAuthenticationAttemptsCount30d;
  }


  public void setFailedPlaidNonOauthAuthenticationAttemptsCount30d(Integer failedPlaidNonOauthAuthenticationAttemptsCount30d) {
    this.failedPlaidNonOauthAuthenticationAttemptsCount30d = failedPlaidNonOauthAuthenticationAttemptsCount30d;
  }


  public BalancePlusAttributes isAccountClosed(Boolean isAccountClosed) {
    
    this.isAccountClosed = isAccountClosed;
    return this;
  }

   /**
   * Indicates if the receiver bank account is closed
   * @return isAccountClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates if the receiver bank account is closed")

  public Boolean getIsAccountClosed() {
    return isAccountClosed;
  }


  public void setIsAccountClosed(Boolean isAccountClosed) {
    this.isAccountClosed = isAccountClosed;
  }


  public BalancePlusAttributes isAccountFrozenOrRestricted(Boolean isAccountFrozenOrRestricted) {
    
    this.isAccountFrozenOrRestricted = isAccountFrozenOrRestricted;
    return this;
  }

   /**
   * Indicates if the receiver bank account is either frozen or restricted
   * @return isAccountFrozenOrRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates if the receiver bank account is either frozen or restricted")

  public Boolean getIsAccountFrozenOrRestricted() {
    return isAccountFrozenOrRestricted;
  }


  public void setIsAccountFrozenOrRestricted(Boolean isAccountFrozenOrRestricted) {
    this.isAccountFrozenOrRestricted = isAccountFrozenOrRestricted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancePlusAttributes balancePlusAttributes = (BalancePlusAttributes) o;
    return Objects.equals(this.unauthorizedTransactionsCount7d, balancePlusAttributes.unauthorizedTransactionsCount7d) &&
        Objects.equals(this.unauthorizedTransactionsCount30d, balancePlusAttributes.unauthorizedTransactionsCount30d) &&
        Objects.equals(this.unauthorizedTransactionsCount60d, balancePlusAttributes.unauthorizedTransactionsCount60d) &&
        Objects.equals(this.unauthorizedTransactionsCount90d, balancePlusAttributes.unauthorizedTransactionsCount90d) &&
        Objects.equals(this.nsfOverdraftTransactionsCount7d, balancePlusAttributes.nsfOverdraftTransactionsCount7d) &&
        Objects.equals(this.nsfOverdraftTransactionsCount30d, balancePlusAttributes.nsfOverdraftTransactionsCount30d) &&
        Objects.equals(this.nsfOverdraftTransactionsCount60d, balancePlusAttributes.nsfOverdraftTransactionsCount60d) &&
        Objects.equals(this.nsfOverdraftTransactionsCount90d, balancePlusAttributes.nsfOverdraftTransactionsCount90d) &&
        Objects.equals(this.daysSinceFirstPlaidConnection, balancePlusAttributes.daysSinceFirstPlaidConnection) &&
        Objects.equals(this.plaidConnectionsCount7d, balancePlusAttributes.plaidConnectionsCount7d) &&
        Objects.equals(this.plaidConnectionsCount30d, balancePlusAttributes.plaidConnectionsCount30d) &&
        Objects.equals(this.totalPlaidConnectionsCount, balancePlusAttributes.totalPlaidConnectionsCount) &&
        Objects.equals(this.isSavingsOrMoneyMarketAccount, balancePlusAttributes.isSavingsOrMoneyMarketAccount) &&
        Objects.equals(this.phoneChangeCount28d, balancePlusAttributes.phoneChangeCount28d) &&
        Objects.equals(this.phoneChangeCount90d, balancePlusAttributes.phoneChangeCount90d) &&
        Objects.equals(this.emailChangeCount28d, balancePlusAttributes.emailChangeCount28d) &&
        Objects.equals(this.emailChangeCount90d, balancePlusAttributes.emailChangeCount90d) &&
        Objects.equals(this.addressChangeCount28d, balancePlusAttributes.addressChangeCount28d) &&
        Objects.equals(this.addressChangeCount90d, balancePlusAttributes.addressChangeCount90d) &&
        Objects.equals(this.plaidNonOauthAuthenticationAttemptsCount3d, balancePlusAttributes.plaidNonOauthAuthenticationAttemptsCount3d) &&
        Objects.equals(this.plaidNonOauthAuthenticationAttemptsCount7d, balancePlusAttributes.plaidNonOauthAuthenticationAttemptsCount7d) &&
        Objects.equals(this.plaidNonOauthAuthenticationAttemptsCount30d, balancePlusAttributes.plaidNonOauthAuthenticationAttemptsCount30d) &&
        Objects.equals(this.failedPlaidNonOauthAuthenticationAttemptsCount3d, balancePlusAttributes.failedPlaidNonOauthAuthenticationAttemptsCount3d) &&
        Objects.equals(this.failedPlaidNonOauthAuthenticationAttemptsCount7d, balancePlusAttributes.failedPlaidNonOauthAuthenticationAttemptsCount7d) &&
        Objects.equals(this.failedPlaidNonOauthAuthenticationAttemptsCount30d, balancePlusAttributes.failedPlaidNonOauthAuthenticationAttemptsCount30d) &&
        Objects.equals(this.isAccountClosed, balancePlusAttributes.isAccountClosed) &&
        Objects.equals(this.isAccountFrozenOrRestricted, balancePlusAttributes.isAccountFrozenOrRestricted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unauthorizedTransactionsCount7d, unauthorizedTransactionsCount30d, unauthorizedTransactionsCount60d, unauthorizedTransactionsCount90d, nsfOverdraftTransactionsCount7d, nsfOverdraftTransactionsCount30d, nsfOverdraftTransactionsCount60d, nsfOverdraftTransactionsCount90d, daysSinceFirstPlaidConnection, plaidConnectionsCount7d, plaidConnectionsCount30d, totalPlaidConnectionsCount, isSavingsOrMoneyMarketAccount, phoneChangeCount28d, phoneChangeCount90d, emailChangeCount28d, emailChangeCount90d, addressChangeCount28d, addressChangeCount90d, plaidNonOauthAuthenticationAttemptsCount3d, plaidNonOauthAuthenticationAttemptsCount7d, plaidNonOauthAuthenticationAttemptsCount30d, failedPlaidNonOauthAuthenticationAttemptsCount3d, failedPlaidNonOauthAuthenticationAttemptsCount7d, failedPlaidNonOauthAuthenticationAttemptsCount30d, isAccountClosed, isAccountFrozenOrRestricted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancePlusAttributes {\n");
    sb.append("    unauthorizedTransactionsCount7d: ").append(toIndentedString(unauthorizedTransactionsCount7d)).append("\n");
    sb.append("    unauthorizedTransactionsCount30d: ").append(toIndentedString(unauthorizedTransactionsCount30d)).append("\n");
    sb.append("    unauthorizedTransactionsCount60d: ").append(toIndentedString(unauthorizedTransactionsCount60d)).append("\n");
    sb.append("    unauthorizedTransactionsCount90d: ").append(toIndentedString(unauthorizedTransactionsCount90d)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount7d: ").append(toIndentedString(nsfOverdraftTransactionsCount7d)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount30d: ").append(toIndentedString(nsfOverdraftTransactionsCount30d)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount60d: ").append(toIndentedString(nsfOverdraftTransactionsCount60d)).append("\n");
    sb.append("    nsfOverdraftTransactionsCount90d: ").append(toIndentedString(nsfOverdraftTransactionsCount90d)).append("\n");
    sb.append("    daysSinceFirstPlaidConnection: ").append(toIndentedString(daysSinceFirstPlaidConnection)).append("\n");
    sb.append("    plaidConnectionsCount7d: ").append(toIndentedString(plaidConnectionsCount7d)).append("\n");
    sb.append("    plaidConnectionsCount30d: ").append(toIndentedString(plaidConnectionsCount30d)).append("\n");
    sb.append("    totalPlaidConnectionsCount: ").append(toIndentedString(totalPlaidConnectionsCount)).append("\n");
    sb.append("    isSavingsOrMoneyMarketAccount: ").append(toIndentedString(isSavingsOrMoneyMarketAccount)).append("\n");
    sb.append("    phoneChangeCount28d: ").append(toIndentedString(phoneChangeCount28d)).append("\n");
    sb.append("    phoneChangeCount90d: ").append(toIndentedString(phoneChangeCount90d)).append("\n");
    sb.append("    emailChangeCount28d: ").append(toIndentedString(emailChangeCount28d)).append("\n");
    sb.append("    emailChangeCount90d: ").append(toIndentedString(emailChangeCount90d)).append("\n");
    sb.append("    addressChangeCount28d: ").append(toIndentedString(addressChangeCount28d)).append("\n");
    sb.append("    addressChangeCount90d: ").append(toIndentedString(addressChangeCount90d)).append("\n");
    sb.append("    plaidNonOauthAuthenticationAttemptsCount3d: ").append(toIndentedString(plaidNonOauthAuthenticationAttemptsCount3d)).append("\n");
    sb.append("    plaidNonOauthAuthenticationAttemptsCount7d: ").append(toIndentedString(plaidNonOauthAuthenticationAttemptsCount7d)).append("\n");
    sb.append("    plaidNonOauthAuthenticationAttemptsCount30d: ").append(toIndentedString(plaidNonOauthAuthenticationAttemptsCount30d)).append("\n");
    sb.append("    failedPlaidNonOauthAuthenticationAttemptsCount3d: ").append(toIndentedString(failedPlaidNonOauthAuthenticationAttemptsCount3d)).append("\n");
    sb.append("    failedPlaidNonOauthAuthenticationAttemptsCount7d: ").append(toIndentedString(failedPlaidNonOauthAuthenticationAttemptsCount7d)).append("\n");
    sb.append("    failedPlaidNonOauthAuthenticationAttemptsCount30d: ").append(toIndentedString(failedPlaidNonOauthAuthenticationAttemptsCount30d)).append("\n");
    sb.append("    isAccountClosed: ").append(toIndentedString(isAccountClosed)).append("\n");
    sb.append("    isAccountFrozenOrRestricted: ").append(toIndentedString(isAccountFrozenOrRestricted)).append("\n");
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

