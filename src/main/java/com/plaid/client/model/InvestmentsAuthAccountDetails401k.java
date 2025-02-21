/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.InvestmentsAuth401kContributionDetails;
import com.plaid.client.model.InvestmentsAuth401kFeeDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional account fee and contribution information for 401k type accounts.
 */
@ApiModel(description = "Additional account fee and contribution information for 401k type accounts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class InvestmentsAuthAccountDetails401k {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FEE_DETAILS = "fee_details";
  @SerializedName(SERIALIZED_NAME_FEE_DETAILS)
  private InvestmentsAuth401kFeeDetails feeDetails;

  public static final String SERIALIZED_NAME_CONTRIBUTION_DETAILS = "contribution_details";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_DETAILS)
  private InvestmentsAuth401kContributionDetails contributionDetails;


  public InvestmentsAuthAccountDetails401k accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the 401k account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the 401k account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public InvestmentsAuthAccountDetails401k feeDetails(InvestmentsAuth401kFeeDetails feeDetails) {
    
    this.feeDetails = feeDetails;
    return this;
  }

   /**
   * Get feeDetails
   * @return feeDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvestmentsAuth401kFeeDetails getFeeDetails() {
    return feeDetails;
  }


  public void setFeeDetails(InvestmentsAuth401kFeeDetails feeDetails) {
    this.feeDetails = feeDetails;
  }


  public InvestmentsAuthAccountDetails401k contributionDetails(InvestmentsAuth401kContributionDetails contributionDetails) {
    
    this.contributionDetails = contributionDetails;
    return this;
  }

   /**
   * Get contributionDetails
   * @return contributionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvestmentsAuth401kContributionDetails getContributionDetails() {
    return contributionDetails;
  }


  public void setContributionDetails(InvestmentsAuth401kContributionDetails contributionDetails) {
    this.contributionDetails = contributionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsAuthAccountDetails401k investmentsAuthAccountDetails401k = (InvestmentsAuthAccountDetails401k) o;
    return Objects.equals(this.accountId, investmentsAuthAccountDetails401k.accountId) &&
        Objects.equals(this.feeDetails, investmentsAuthAccountDetails401k.feeDetails) &&
        Objects.equals(this.contributionDetails, investmentsAuthAccountDetails401k.contributionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feeDetails, contributionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsAuthAccountDetails401k {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feeDetails: ").append(toIndentedString(feeDetails)).append("\n");
    sb.append("    contributionDetails: ").append(toIndentedString(contributionDetails)).append("\n");
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

