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
import com.plaid.client.model.IncomeVerificationDocParsingConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Identity object used to specify document upload
 */
@ApiModel(description = "Identity object used to specify document upload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkTokenCreateIdentity {
  public static final String SERIALIZED_NAME_IS_DOCUMENT_UPLOAD = "is_document_upload";
  @SerializedName(SERIALIZED_NAME_IS_DOCUMENT_UPLOAD)
  private Boolean isDocumentUpload;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;

  public static final String SERIALIZED_NAME_PARSING_CONFIGS = "parsing_configs";
  @SerializedName(SERIALIZED_NAME_PARSING_CONFIGS)
  private List<IncomeVerificationDocParsingConfig> parsingConfigs = null;


  public LinkTokenCreateIdentity isDocumentUpload(Boolean isDocumentUpload) {
    
    this.isDocumentUpload = isDocumentUpload;
    return this;
  }

   /**
   * Used to specify whether the Link session is Identity Document Upload
   * @return isDocumentUpload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to specify whether the Link session is Identity Document Upload")

  public Boolean getIsDocumentUpload() {
    return isDocumentUpload;
  }


  public void setIsDocumentUpload(Boolean isDocumentUpload) {
    this.isDocumentUpload = isDocumentUpload;
  }


  public LinkTokenCreateIdentity accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public LinkTokenCreateIdentity addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * An array of &#x60;account_ids&#x60;. Currently can only contain one &#x60;account_id&#x60;. Must be populated if using Document Upload.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of `account_ids`. Currently can only contain one `account_id`. Must be populated if using Document Upload.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public LinkTokenCreateIdentity parsingConfigs(List<IncomeVerificationDocParsingConfig> parsingConfigs) {
    
    this.parsingConfigs = parsingConfigs;
    return this;
  }

  public LinkTokenCreateIdentity addParsingConfigsItem(IncomeVerificationDocParsingConfig parsingConfigsItem) {
    if (this.parsingConfigs == null) {
      this.parsingConfigs = new ArrayList<>();
    }
    this.parsingConfigs.add(parsingConfigsItem);
    return this;
  }

   /**
   * An array of parsing configurations. Valid parsing configurations are &#x60;ocr&#x60; and &#x60;risk_signals&#x60;. If parsing configurations are omitted, defaults to &#x60;ocr&#x60;
   * @return parsingConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of parsing configurations. Valid parsing configurations are `ocr` and `risk_signals`. If parsing configurations are omitted, defaults to `ocr`")

  public List<IncomeVerificationDocParsingConfig> getParsingConfigs() {
    return parsingConfigs;
  }


  public void setParsingConfigs(List<IncomeVerificationDocParsingConfig> parsingConfigs) {
    this.parsingConfigs = parsingConfigs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateIdentity linkTokenCreateIdentity = (LinkTokenCreateIdentity) o;
    return Objects.equals(this.isDocumentUpload, linkTokenCreateIdentity.isDocumentUpload) &&
        Objects.equals(this.accountIds, linkTokenCreateIdentity.accountIds) &&
        Objects.equals(this.parsingConfigs, linkTokenCreateIdentity.parsingConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDocumentUpload, accountIds, parsingConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateIdentity {\n");
    sb.append("    isDocumentUpload: ").append(toIndentedString(isDocumentUpload)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    parsingConfigs: ").append(toIndentedString(parsingConfigs)).append("\n");
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

