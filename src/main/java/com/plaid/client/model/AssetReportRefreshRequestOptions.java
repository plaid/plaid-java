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
import com.plaid.client.model.AssetReportUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional object to filter &#x60;/asset_report/refresh&#x60; results. If provided, cannot be &#x60;null&#x60;. If not specified, the &#x60;options&#x60; from the original call to &#x60;/asset_report/create&#x60; will be used.
 */
@ApiModel(description = "An optional object to filter `/asset_report/refresh` results. If provided, cannot be `null`. If not specified, the `options` from the original call to `/asset_report/create` will be used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class AssetReportRefreshRequestOptions {
  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private AssetReportUser user;


  public AssetReportRefreshRequestOptions clientReportId(String clientReportId) {
    
    this.clientReportId = clientReportId;
    return this;
  }

   /**
   * Client-generated identifier, which can be used by lenders to track loan applications.
   * @return clientReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client-generated identifier, which can be used by lenders to track loan applications.")

  public String getClientReportId() {
    return clientReportId;
  }


  public void setClientReportId(String clientReportId) {
    this.clientReportId = clientReportId;
  }


  public AssetReportRefreshRequestOptions webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * URL to which Plaid will send Assets webhooks, for example when the requested Asset Report is ready.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to which Plaid will send Assets webhooks, for example when the requested Asset Report is ready.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public AssetReportRefreshRequestOptions user(AssetReportUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetReportUser getUser() {
    return user;
  }


  public void setUser(AssetReportUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportRefreshRequestOptions assetReportRefreshRequestOptions = (AssetReportRefreshRequestOptions) o;
    return Objects.equals(this.clientReportId, assetReportRefreshRequestOptions.clientReportId) &&
        Objects.equals(this.webhook, assetReportRefreshRequestOptions.webhook) &&
        Objects.equals(this.user, assetReportRefreshRequestOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReportId, webhook, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportRefreshRequestOptions {\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

