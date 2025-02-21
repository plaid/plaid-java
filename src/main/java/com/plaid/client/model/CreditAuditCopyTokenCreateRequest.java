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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreditAuditCopyTokenCreateRequest defines the request schema for &#x60;/credit/audit_copy_token/create&#x60;
 */
@ApiModel(description = "CreditAuditCopyTokenCreateRequest defines the request schema for `/credit/audit_copy_token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class CreditAuditCopyTokenCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_REPORT_TOKENS = "report_tokens";
  @SerializedName(SERIALIZED_NAME_REPORT_TOKENS)
  private List<String> reportTokens = new ArrayList<>();


  public CreditAuditCopyTokenCreateRequest clientId(String clientId) {
    
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


  public CreditAuditCopyTokenCreateRequest secret(String secret) {
    
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


  public CreditAuditCopyTokenCreateRequest reportTokens(List<String> reportTokens) {
    
    this.reportTokens = reportTokens;
    return this;
  }

  public CreditAuditCopyTokenCreateRequest addReportTokensItem(String reportTokensItem) {
    this.reportTokens.add(reportTokensItem);
    return this;
  }

   /**
   * List of report tokens; can include at most one VOA/standard Asset Report tokens and one VOE Asset Report Token.
   * @return reportTokens
  **/
  @ApiModelProperty(required = true, value = "List of report tokens; can include at most one VOA/standard Asset Report tokens and one VOE Asset Report Token.")

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
    CreditAuditCopyTokenCreateRequest creditAuditCopyTokenCreateRequest = (CreditAuditCopyTokenCreateRequest) o;
    return Objects.equals(this.clientId, creditAuditCopyTokenCreateRequest.clientId) &&
        Objects.equals(this.secret, creditAuditCopyTokenCreateRequest.secret) &&
        Objects.equals(this.reportTokens, creditAuditCopyTokenCreateRequest.reportTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, reportTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditAuditCopyTokenCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

