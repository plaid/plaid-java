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
import com.plaid.client.model.MonitoringConsumerReportPermissiblePurpose;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CraMonitoringInsightsGetRequest defines the request schema for &#x60;/cra/monitoring_insights/get&#x60;
 */
@ApiModel(description = "CraMonitoringInsightsGetRequest defines the request schema for `/cra/monitoring_insights/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class CraMonitoringInsightsGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_CONSUMER_REPORT_PERMISSIBLE_PURPOSE = "consumer_report_permissible_purpose";
  @SerializedName(SERIALIZED_NAME_CONSUMER_REPORT_PERMISSIBLE_PURPOSE)
  private MonitoringConsumerReportPermissiblePurpose consumerReportPermissiblePurpose;


  public CraMonitoringInsightsGetRequest clientId(String clientId) {
    
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


  public CraMonitoringInsightsGetRequest secret(String secret) {
    
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


  public CraMonitoringInsightsGetRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public CraMonitoringInsightsGetRequest consumerReportPermissiblePurpose(MonitoringConsumerReportPermissiblePurpose consumerReportPermissiblePurpose) {
    
    this.consumerReportPermissiblePurpose = consumerReportPermissiblePurpose;
    return this;
  }

   /**
   * Get consumerReportPermissiblePurpose
   * @return consumerReportPermissiblePurpose
  **/
  @ApiModelProperty(required = true, value = "")

  public MonitoringConsumerReportPermissiblePurpose getConsumerReportPermissiblePurpose() {
    return consumerReportPermissiblePurpose;
  }


  public void setConsumerReportPermissiblePurpose(MonitoringConsumerReportPermissiblePurpose consumerReportPermissiblePurpose) {
    this.consumerReportPermissiblePurpose = consumerReportPermissiblePurpose;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraMonitoringInsightsGetRequest craMonitoringInsightsGetRequest = (CraMonitoringInsightsGetRequest) o;
    return Objects.equals(this.clientId, craMonitoringInsightsGetRequest.clientId) &&
        Objects.equals(this.secret, craMonitoringInsightsGetRequest.secret) &&
        Objects.equals(this.userToken, craMonitoringInsightsGetRequest.userToken) &&
        Objects.equals(this.consumerReportPermissiblePurpose, craMonitoringInsightsGetRequest.consumerReportPermissiblePurpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, consumerReportPermissiblePurpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraMonitoringInsightsGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    consumerReportPermissiblePurpose: ").append(toIndentedString(consumerReportPermissiblePurpose)).append("\n");
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

