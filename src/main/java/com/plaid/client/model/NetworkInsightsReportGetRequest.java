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
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkInsightsReportGetRequest defines the request schema for &#x60;/network_insights/report/get&#x60;.
 */
@ApiModel(description = "NetworkInsightsReportGetRequest defines the request schema for `/network_insights/report/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class NetworkInsightsReportGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCESS_TOKENS = "access_tokens";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS)
  private List<String> accessTokens = new ArrayList<>();


  public NetworkInsightsReportGetRequest clientId(String clientId) {
    
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


  public NetworkInsightsReportGetRequest secret(String secret) {
    
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


  public NetworkInsightsReportGetRequest accessTokens(List<String> accessTokens) {
    
    this.accessTokens = accessTokens;
    return this;
  }

  public NetworkInsightsReportGetRequest addAccessTokensItem(String accessTokensItem) {
    this.accessTokens.add(accessTokensItem);
    return this;
  }

   /**
   * A list of access tokens that the Network Insights will be requested for. These correspond to previous Items a user has connected.
   * @return accessTokens
  **/
  @ApiModelProperty(required = true, value = "A list of access tokens that the Network Insights will be requested for. These correspond to previous Items a user has connected.")

  public List<String> getAccessTokens() {
    return accessTokens;
  }


  public void setAccessTokens(List<String> accessTokens) {
    this.accessTokens = accessTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInsightsReportGetRequest networkInsightsReportGetRequest = (NetworkInsightsReportGetRequest) o;
    return Objects.equals(this.clientId, networkInsightsReportGetRequest.clientId) &&
        Objects.equals(this.secret, networkInsightsReportGetRequest.secret) &&
        Objects.equals(this.accessTokens, networkInsightsReportGetRequest.accessTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accessTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInsightsReportGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accessTokens: ").append(toIndentedString(accessTokens)).append("\n");
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

