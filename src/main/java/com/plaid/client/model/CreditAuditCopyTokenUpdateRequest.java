/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
import java.util.ArrayList;
import java.util.List;

/**
 * CreditAuditCopyTokenUpdateRequest defines the request schema for &#x60;/credit/audit_copy_token/update&#x60;
 */
@ApiModel(description = "CreditAuditCopyTokenUpdateRequest defines the request schema for `/credit/audit_copy_token/update`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class CreditAuditCopyTokenUpdateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_AUDIT_COPY_TOKEN = "audit_copy_token";
  @SerializedName(SERIALIZED_NAME_AUDIT_COPY_TOKEN)
  private String auditCopyToken;

  public static final String SERIALIZED_NAME_REPORT_TOKENS = "report_tokens";
  @SerializedName(SERIALIZED_NAME_REPORT_TOKENS)
  private List<String> reportTokens = new ArrayList<>();


  public CreditAuditCopyTokenUpdateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public CreditAuditCopyTokenUpdateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public CreditAuditCopyTokenUpdateRequest auditCopyToken(String auditCopyToken) {
    
    this.auditCopyToken = auditCopyToken;
    return this;
  }

   /**
   * The &#x60;audit_copy_token&#x60; you would like to update.
   * @return auditCopyToken
  **/
  @ApiModelProperty(required = true, value = "The `audit_copy_token` you would like to update.")

  public String getAuditCopyToken() {
    return auditCopyToken;
  }


  public void setAuditCopyToken(String auditCopyToken) {
    this.auditCopyToken = auditCopyToken;
  }


  public CreditAuditCopyTokenUpdateRequest reportTokens(List<String> reportTokens) {
    
    this.reportTokens = reportTokens;
    return this;
  }

  public CreditAuditCopyTokenUpdateRequest addReportTokensItem(String reportTokensItem) {
    this.reportTokens.add(reportTokensItem);
    return this;
  }

   /**
   * Array of tokens which the specified Audit Copy Token will be updated with. The types of token supported are asset report token and employment report token. There can be at most 1 of each token type in the array.
   * @return reportTokens
  **/
  @ApiModelProperty(required = true, value = "Array of tokens which the specified Audit Copy Token will be updated with. The types of token supported are asset report token and employment report token. There can be at most 1 of each token type in the array.")

  public List<String> getReportTokens() {
    return reportTokens;
  }


  public void setReportTokens(List<String> reportTokens) {
    this.reportTokens = reportTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditAuditCopyTokenUpdateRequest creditAuditCopyTokenUpdateRequest = (CreditAuditCopyTokenUpdateRequest) o;
    return Objects.equals(this.clientId, creditAuditCopyTokenUpdateRequest.clientId) &&
        Objects.equals(this.secret, creditAuditCopyTokenUpdateRequest.secret) &&
        Objects.equals(this.auditCopyToken, creditAuditCopyTokenUpdateRequest.auditCopyToken) &&
        Objects.equals(this.reportTokens, creditAuditCopyTokenUpdateRequest.reportTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, auditCopyToken, reportTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditAuditCopyTokenUpdateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    auditCopyToken: ").append(toIndentedString(auditCopyToken)).append("\n");
    sb.append("    reportTokens: ").append(toIndentedString(reportTokens)).append("\n");
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

