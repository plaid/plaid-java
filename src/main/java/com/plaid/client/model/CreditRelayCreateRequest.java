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
import java.util.ArrayList;
import java.util.List;

/**
 * CreditRelayCreateRequest defines the request schema for &#x60;/credit/relay/create&#x60;
 */
@ApiModel(description = "CreditRelayCreateRequest defines the request schema for `/credit/relay/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditRelayCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_REPORT_TOKENS = "report_tokens";
  @SerializedName(SERIALIZED_NAME_REPORT_TOKENS)
  private List<String> reportTokens = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECONDARY_CLIENT_ID = "secondary_client_id";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CLIENT_ID)
  private String secondaryClientId;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;


  public CreditRelayCreateRequest clientId(String clientId) {
    
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


  public CreditRelayCreateRequest secret(String secret) {
    
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


  public CreditRelayCreateRequest reportTokens(List<String> reportTokens) {
    
    this.reportTokens = reportTokens;
    return this;
  }

  public CreditRelayCreateRequest addReportTokensItem(String reportTokensItem) {
    this.reportTokens.add(reportTokensItem);
    return this;
  }

   /**
   * List of report token strings, with at most one token of each report type. Currently only Asset Report token is supported.
   * @return reportTokens
  **/
  @ApiModelProperty(required = true, value = "List of report token strings, with at most one token of each report type. Currently only Asset Report token is supported.")

  public List<String> getReportTokens() {
    return reportTokens;
  }


  public void setReportTokens(List<String> reportTokens) {
    this.reportTokens = reportTokens;
  }


  public CreditRelayCreateRequest secondaryClientId(String secondaryClientId) {
    
    this.secondaryClientId = secondaryClientId;
    return this;
  }

   /**
   * The &#x60;secondary_client_id&#x60; is the client id of the third party with whom you would like to share the relay token.
   * @return secondaryClientId
  **/
  @ApiModelProperty(required = true, value = "The `secondary_client_id` is the client id of the third party with whom you would like to share the relay token.")

  public String getSecondaryClientId() {
    return secondaryClientId;
  }


  public void setSecondaryClientId(String secondaryClientId) {
    this.secondaryClientId = secondaryClientId;
  }


  public CreditRelayCreateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * URL to which Plaid will send webhooks when the Secondary Client successfully retrieves an Asset Report by calling &#x60;/credit/relay/get&#x60;.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to which Plaid will send webhooks when the Secondary Client successfully retrieves an Asset Report by calling `/credit/relay/get`.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditRelayCreateRequest creditRelayCreateRequest = (CreditRelayCreateRequest) o;
    return Objects.equals(this.clientId, creditRelayCreateRequest.clientId) &&
        Objects.equals(this.secret, creditRelayCreateRequest.secret) &&
        Objects.equals(this.reportTokens, creditRelayCreateRequest.reportTokens) &&
        Objects.equals(this.secondaryClientId, creditRelayCreateRequest.secondaryClientId) &&
        Objects.equals(this.webhook, creditRelayCreateRequest.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, reportTokens, secondaryClientId, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditRelayCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    reportTokens: ").append(toIndentedString(reportTokens)).append("\n");
    sb.append("    secondaryClientId: ").append(toIndentedString(secondaryClientId)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

