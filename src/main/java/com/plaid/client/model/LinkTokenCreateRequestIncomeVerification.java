/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
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
import com.plaid.client.model.IncomeVerificationSourceType;
import com.plaid.client.model.LinkTokenCreateRequestIncomeVerificationBankIncome;
import com.plaid.client.model.LinkTokenCreateRequestIncomeVerificationPayrollIncome;
import com.plaid.client.model.LinkTokenCreateRequestUserStatedIncomeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies options for initializing Link for use with the Income product. This field is required if &#x60;income_verification&#x60; is included in the &#x60;products&#x60; array.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Income product. This field is required if `income_verification` is included in the `products` array.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkTokenCreateRequestIncomeVerification {
  public static final String SERIALIZED_NAME_INCOME_VERIFICATION_ID = "income_verification_id";
  @SerializedName(SERIALIZED_NAME_INCOME_VERIFICATION_ID)
  private String incomeVerificationId;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public static final String SERIALIZED_NAME_ACCESS_TOKENS = "access_tokens";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS)
  private List<String> accessTokens = null;

  public static final String SERIALIZED_NAME_INCOME_SOURCE_TYPES = "income_source_types";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCE_TYPES)
  private List<IncomeVerificationSourceType> incomeSourceTypes = null;

  public static final String SERIALIZED_NAME_BANK_INCOME = "bank_income";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME)
  private LinkTokenCreateRequestIncomeVerificationBankIncome bankIncome;

  public static final String SERIALIZED_NAME_PAYROLL_INCOME = "payroll_income";
  @SerializedName(SERIALIZED_NAME_PAYROLL_INCOME)
  private LinkTokenCreateRequestIncomeVerificationPayrollIncome payrollIncome;

  public static final String SERIALIZED_NAME_STATED_INCOME_SOURCES = "stated_income_sources";
  @SerializedName(SERIALIZED_NAME_STATED_INCOME_SOURCES)
  private List<LinkTokenCreateRequestUserStatedIncomeSource> statedIncomeSources = null;


  public LinkTokenCreateRequestIncomeVerification incomeVerificationId(String incomeVerificationId) {
    
    this.incomeVerificationId = incomeVerificationId;
    return this;
  }

   /**
   * The &#x60;income_verification_id&#x60; of the verification instance, as provided by &#x60;/income/verification/create&#x60;. Replaced by the user token.
   * @return incomeVerificationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `income_verification_id` of the verification instance, as provided by `/income/verification/create`. Replaced by the user token.")

  public String getIncomeVerificationId() {
    return incomeVerificationId;
  }


  public void setIncomeVerificationId(String incomeVerificationId) {
    this.incomeVerificationId = incomeVerificationId;
  }


  public LinkTokenCreateRequestIncomeVerification assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * The &#x60;asset_report_id&#x60; of an asset report associated with the user, as provided by &#x60;/asset_report/create&#x60;. Providing an &#x60;asset_report_id&#x60; is optional and can be used to verify the user through a streamlined flow. If provided, the bank linking flow will be skipped.
   * @return assetReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `asset_report_id` of an asset report associated with the user, as provided by `/asset_report/create`. Providing an `asset_report_id` is optional and can be used to verify the user through a streamlined flow. If provided, the bank linking flow will be skipped.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  public LinkTokenCreateRequestIncomeVerification accessTokens(List<String> accessTokens) {
    
    this.accessTokens = accessTokens;
    return this;
  }

  public LinkTokenCreateRequestIncomeVerification addAccessTokensItem(String accessTokensItem) {
    if (this.accessTokens == null) {
      this.accessTokens = new ArrayList<>();
    }
    this.accessTokens.add(accessTokensItem);
    return this;
  }

   /**
   * An array of access tokens corresponding to Items that a user has previously connected with. Data from these institutions will be cross-referenced with document data received during the Document Income flow to help verify that the uploaded documents are accurate. If the &#x60;transactions&#x60; product was not initialized for these Items during link, it will be initialized after this Link session.  This field should only be used with the &#x60;payroll&#x60; income source type.
   * @return accessTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of access tokens corresponding to Items that a user has previously connected with. Data from these institutions will be cross-referenced with document data received during the Document Income flow to help verify that the uploaded documents are accurate. If the `transactions` product was not initialized for these Items during link, it will be initialized after this Link session.  This field should only be used with the `payroll` income source type.")

  public List<String> getAccessTokens() {
    return accessTokens;
  }


  public void setAccessTokens(List<String> accessTokens) {
    this.accessTokens = accessTokens;
  }


  public LinkTokenCreateRequestIncomeVerification incomeSourceTypes(List<IncomeVerificationSourceType> incomeSourceTypes) {
    
    this.incomeSourceTypes = incomeSourceTypes;
    return this;
  }

  public LinkTokenCreateRequestIncomeVerification addIncomeSourceTypesItem(IncomeVerificationSourceType incomeSourceTypesItem) {
    if (this.incomeSourceTypes == null) {
      this.incomeSourceTypes = new ArrayList<>();
    }
    this.incomeSourceTypes.add(incomeSourceTypesItem);
    return this;
  }

   /**
   * The types of source income data that users will be permitted to share. Options include &#x60;bank&#x60; and &#x60;payroll&#x60;. Currently you can only specify one of these options.
   * @return incomeSourceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of source income data that users will be permitted to share. Options include `bank` and `payroll`. Currently you can only specify one of these options.")

  public List<IncomeVerificationSourceType> getIncomeSourceTypes() {
    return incomeSourceTypes;
  }


  public void setIncomeSourceTypes(List<IncomeVerificationSourceType> incomeSourceTypes) {
    this.incomeSourceTypes = incomeSourceTypes;
  }


  public LinkTokenCreateRequestIncomeVerification bankIncome(LinkTokenCreateRequestIncomeVerificationBankIncome bankIncome) {
    
    this.bankIncome = bankIncome;
    return this;
  }

   /**
   * Get bankIncome
   * @return bankIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestIncomeVerificationBankIncome getBankIncome() {
    return bankIncome;
  }


  public void setBankIncome(LinkTokenCreateRequestIncomeVerificationBankIncome bankIncome) {
    this.bankIncome = bankIncome;
  }


  public LinkTokenCreateRequestIncomeVerification payrollIncome(LinkTokenCreateRequestIncomeVerificationPayrollIncome payrollIncome) {
    
    this.payrollIncome = payrollIncome;
    return this;
  }

   /**
   * Get payrollIncome
   * @return payrollIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkTokenCreateRequestIncomeVerificationPayrollIncome getPayrollIncome() {
    return payrollIncome;
  }


  public void setPayrollIncome(LinkTokenCreateRequestIncomeVerificationPayrollIncome payrollIncome) {
    this.payrollIncome = payrollIncome;
  }


  public LinkTokenCreateRequestIncomeVerification statedIncomeSources(List<LinkTokenCreateRequestUserStatedIncomeSource> statedIncomeSources) {
    
    this.statedIncomeSources = statedIncomeSources;
    return this;
  }

  public LinkTokenCreateRequestIncomeVerification addStatedIncomeSourcesItem(LinkTokenCreateRequestUserStatedIncomeSource statedIncomeSourcesItem) {
    if (this.statedIncomeSources == null) {
      this.statedIncomeSources = new ArrayList<>();
    }
    this.statedIncomeSources.add(statedIncomeSourcesItem);
    return this;
  }

   /**
   * A list of user stated income sources
   * @return statedIncomeSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of user stated income sources")

  public List<LinkTokenCreateRequestUserStatedIncomeSource> getStatedIncomeSources() {
    return statedIncomeSources;
  }


  public void setStatedIncomeSources(List<LinkTokenCreateRequestUserStatedIncomeSource> statedIncomeSources) {
    this.statedIncomeSources = statedIncomeSources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestIncomeVerification linkTokenCreateRequestIncomeVerification = (LinkTokenCreateRequestIncomeVerification) o;
    return Objects.equals(this.incomeVerificationId, linkTokenCreateRequestIncomeVerification.incomeVerificationId) &&
        Objects.equals(this.assetReportId, linkTokenCreateRequestIncomeVerification.assetReportId) &&
        Objects.equals(this.accessTokens, linkTokenCreateRequestIncomeVerification.accessTokens) &&
        Objects.equals(this.incomeSourceTypes, linkTokenCreateRequestIncomeVerification.incomeSourceTypes) &&
        Objects.equals(this.bankIncome, linkTokenCreateRequestIncomeVerification.bankIncome) &&
        Objects.equals(this.payrollIncome, linkTokenCreateRequestIncomeVerification.payrollIncome) &&
        Objects.equals(this.statedIncomeSources, linkTokenCreateRequestIncomeVerification.statedIncomeSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeVerificationId, assetReportId, accessTokens, incomeSourceTypes, bankIncome, payrollIncome, statedIncomeSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestIncomeVerification {\n");
    sb.append("    incomeVerificationId: ").append(toIndentedString(incomeVerificationId)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
    sb.append("    accessTokens: ").append(toIndentedString(accessTokens)).append("\n");
    sb.append("    incomeSourceTypes: ").append(toIndentedString(incomeSourceTypes)).append("\n");
    sb.append("    bankIncome: ").append(toIndentedString(bankIncome)).append("\n");
    sb.append("    payrollIncome: ").append(toIndentedString(payrollIncome)).append("\n");
    sb.append("    statedIncomeSources: ").append(toIndentedString(statedIncomeSources)).append("\n");
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

