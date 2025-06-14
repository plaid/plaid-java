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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Status information about the account and routing number in the Plaid network.
 */
@ApiModel(description = "Status information about the account and routing number in the Plaid network.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class AccountVerificationInsightsNetworkStatus {
  public static final String SERIALIZED_NAME_HAS_NUMBERS_MATCH = "has_numbers_match";
  @SerializedName(SERIALIZED_NAME_HAS_NUMBERS_MATCH)
  private Boolean hasNumbersMatch;

  public static final String SERIALIZED_NAME_IS_NUMBERS_MATCH_VERIFIED = "is_numbers_match_verified";
  @SerializedName(SERIALIZED_NAME_IS_NUMBERS_MATCH_VERIFIED)
  private Boolean isNumbersMatchVerified;


  public AccountVerificationInsightsNetworkStatus hasNumbersMatch(Boolean hasNumbersMatch) {
    
    this.hasNumbersMatch = hasNumbersMatch;
    return this;
  }

   /**
   * Indicates whether we found at least one matching account for the ACH account and routing number.
   * @return hasNumbersMatch
  **/
  @ApiModelProperty(required = true, value = "Indicates whether we found at least one matching account for the ACH account and routing number.")

  public Boolean getHasNumbersMatch() {
    return hasNumbersMatch;
  }


  public void setHasNumbersMatch(Boolean hasNumbersMatch) {
    this.hasNumbersMatch = hasNumbersMatch;
  }


  public AccountVerificationInsightsNetworkStatus isNumbersMatchVerified(Boolean isNumbersMatchVerified) {
    
    this.isNumbersMatchVerified = isNumbersMatchVerified;
    return this;
  }

   /**
   * Indicates if at least one matching account for the ACH account and routing number is already verified.
   * @return isNumbersMatchVerified
  **/
  @ApiModelProperty(required = true, value = "Indicates if at least one matching account for the ACH account and routing number is already verified.")

  public Boolean getIsNumbersMatchVerified() {
    return isNumbersMatchVerified;
  }


  public void setIsNumbersMatchVerified(Boolean isNumbersMatchVerified) {
    this.isNumbersMatchVerified = isNumbersMatchVerified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerificationInsightsNetworkStatus accountVerificationInsightsNetworkStatus = (AccountVerificationInsightsNetworkStatus) o;
    return Objects.equals(this.hasNumbersMatch, accountVerificationInsightsNetworkStatus.hasNumbersMatch) &&
        Objects.equals(this.isNumbersMatchVerified, accountVerificationInsightsNetworkStatus.isNumbersMatchVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNumbersMatch, isNumbersMatchVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerificationInsightsNetworkStatus {\n");
    sb.append("    hasNumbersMatch: ").append(toIndentedString(hasNumbersMatch)).append("\n");
    sb.append("    isNumbersMatchVerified: ").append(toIndentedString(isNumbersMatchVerified)).append("\n");
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

