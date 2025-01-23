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
 * Metadata pertaining to the document.
 */
@ApiModel(description = "Metadata pertaining to the document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class IdentityDocumentUploadMetadata {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_IS_ACCOUNT_NUMBER_MATCH = "is_account_number_match";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_NUMBER_MATCH)
  private Boolean isAccountNumberMatch;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "page_count";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_UPLOADED_AT = "uploaded_at";
  @SerializedName(SERIALIZED_NAME_UPLOADED_AT)
  private OffsetDateTime uploadedAt;


  public IdentityDocumentUploadMetadata documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * The submitted document type. Currently, this will always be &#x60;BANK_STATEMENT&#x60;.
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The submitted document type. Currently, this will always be `BANK_STATEMENT`.")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public IdentityDocumentUploadMetadata isAccountNumberMatch(Boolean isAccountNumberMatch) {
    
    this.isAccountNumberMatch = isAccountNumberMatch;
    return this;
  }

   /**
   * Boolean field indicating whether the uploaded document&#39;s account number matches the account number we have on file. If &#x60;false&#x60;, it is not recommended to accept the uploaded identity data as accurate without further verification.
   * @return isAccountNumberMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean field indicating whether the uploaded document's account number matches the account number we have on file. If `false`, it is not recommended to accept the uploaded identity data as accurate without further verification.")

  public Boolean getIsAccountNumberMatch() {
    return isAccountNumberMatch;
  }


  public void setIsAccountNumberMatch(Boolean isAccountNumberMatch) {
    this.isAccountNumberMatch = isAccountNumberMatch;
  }


  public IdentityDocumentUploadMetadata pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages in the uploaded document.
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pages in the uploaded document.")

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public IdentityDocumentUploadMetadata lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp when the document was last updated.
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the document was last updated.")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public IdentityDocumentUploadMetadata uploadedAt(OffsetDateTime uploadedAt) {
    
    this.uploadedAt = uploadedAt;
    return this;
  }

   /**
   * The timestamp when the document was originally uploaded.
   * @return uploadedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the document was originally uploaded.")

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
    IdentityDocumentUploadMetadata identityDocumentUploadMetadata = (IdentityDocumentUploadMetadata) o;
    return Objects.equals(this.documentType, identityDocumentUploadMetadata.documentType) &&
        Objects.equals(this.isAccountNumberMatch, identityDocumentUploadMetadata.isAccountNumberMatch) &&
        Objects.equals(this.pageCount, identityDocumentUploadMetadata.pageCount) &&
        Objects.equals(this.lastUpdated, identityDocumentUploadMetadata.lastUpdated) &&
        Objects.equals(this.uploadedAt, identityDocumentUploadMetadata.uploadedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, isAccountNumberMatch, pageCount, lastUpdated, uploadedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDocumentUploadMetadata {\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    isAccountNumberMatch: ").append(toIndentedString(isAccountNumberMatch)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

