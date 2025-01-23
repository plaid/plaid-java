/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import java.time.OffsetDateTime;

/**
 * In closed beta. Object representing metadata pertaining to the document.
 */
@ApiModel(description = "In closed beta. Object representing metadata pertaining to the document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class IdentityDocumentMetadata {
  public static final String SERIALIZED_NAME_IS_ACCOUNT_NUMBER_MATCH = "is_account_number_match";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_NUMBER_MATCH)
  private Boolean isAccountNumberMatch;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_UPLOADED_AT = "uploaded_at";
  @SerializedName(SERIALIZED_NAME_UPLOADED_AT)
  private OffsetDateTime uploadedAt;


  public IdentityDocumentMetadata isAccountNumberMatch(Boolean isAccountNumberMatch) {
    
    this.isAccountNumberMatch = isAccountNumberMatch;
    return this;
  }

   /**
   * Boolean field indicating if the uploaded document&#39;s account number matches the account number we have on file
   * @return isAccountNumberMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean field indicating if the uploaded document's account number matches the account number we have on file")

  public Boolean getIsAccountNumberMatch() {
    return isAccountNumberMatch;
  }


  public void setIsAccountNumberMatch(Boolean isAccountNumberMatch) {
    this.isAccountNumberMatch = isAccountNumberMatch;
  }


  public IdentityDocumentMetadata lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public IdentityDocumentMetadata uploadedAt(OffsetDateTime uploadedAt) {
    
    this.uploadedAt = uploadedAt;
    return this;
  }

   /**
   * Get uploadedAt
   * @return uploadedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUploadedAt() {
    return uploadedAt;
  }


  public void setUploadedAt(OffsetDateTime uploadedAt) {
    this.uploadedAt = uploadedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDocumentMetadata identityDocumentMetadata = (IdentityDocumentMetadata) o;
    return Objects.equals(this.isAccountNumberMatch, identityDocumentMetadata.isAccountNumberMatch) &&
        Objects.equals(this.lastUpdated, identityDocumentMetadata.lastUpdated) &&
        Objects.equals(this.uploadedAt, identityDocumentMetadata.uploadedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAccountNumberMatch, lastUpdated, uploadedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDocumentMetadata {\n");
    sb.append("    isAccountNumberMatch: ").append(toIndentedString(isAccountNumberMatch)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
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

