/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
import com.plaid.client.model.ReportType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreditRelayGetRequest defines the request schema for &#x60;/credit/relay/get&#x60;
 */
@ApiModel(description = "CreditRelayGetRequest defines the request schema for `/credit/relay/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class CreditRelayGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_RELAY_TOKEN = "relay_token";
  @SerializedName(SERIALIZED_NAME_RELAY_TOKEN)
  private String relayToken;

  public static final String SERIALIZED_NAME_REPORT_TYPE = "report_type";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private ReportType reportType;

  public static final String SERIALIZED_NAME_INCLUDE_INSIGHTS = "include_insights";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INSIGHTS)
  private Boolean includeInsights = false;


  public CreditRelayGetRequest clientId(String clientId) {
    
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


  public CreditRelayGetRequest secret(String secret) {
    
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


  public CreditRelayGetRequest relayToken(String relayToken) {
    
    this.relayToken = relayToken;
    return this;
  }

   /**
   * The &#x60;relay_token&#x60; granting access to the report you would like to get.
   * @return relayToken
  **/
  @ApiModelProperty(required = true, value = "The `relay_token` granting access to the report you would like to get.")

  public String getRelayToken() {
    return relayToken;
  }


  public void setRelayToken(String relayToken) {
    this.relayToken = relayToken;
  }


  public CreditRelayGetRequest reportType(ReportType reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(required = true, value = "")

  public ReportType getReportType() {
    return reportType;
  }


  public void setReportType(ReportType reportType) {
    this.reportType = reportType;
  }


  public CreditRelayGetRequest includeInsights(Boolean includeInsights) {
    
    this.includeInsights = includeInsights;
    return this;
  }

   /**
   * &#x60;true&#x60; if you would like to retrieve the Asset Report with Insights, &#x60;false&#x60; otherwise. This field defaults to &#x60;false&#x60; if omitted.
   * @return includeInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if you would like to retrieve the Asset Report with Insights, `false` otherwise. This field defaults to `false` if omitted.")

  public Boolean getIncludeInsights() {
    return includeInsights;
  }


  public void setIncludeInsights(Boolean includeInsights) {
    this.includeInsights = includeInsights;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditRelayGetRequest creditRelayGetRequest = (CreditRelayGetRequest) o;
    return Objects.equals(this.clientId, creditRelayGetRequest.clientId) &&
        Objects.equals(this.secret, creditRelayGetRequest.secret) &&
        Objects.equals(this.relayToken, creditRelayGetRequest.relayToken) &&
        Objects.equals(this.reportType, creditRelayGetRequest.reportType) &&
        Objects.equals(this.includeInsights, creditRelayGetRequest.includeInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, relayToken, reportType, includeInsights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditRelayGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    relayToken: ").append(toIndentedString(relayToken)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    includeInsights: ").append(toIndentedString(includeInsights)).append("\n");
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

