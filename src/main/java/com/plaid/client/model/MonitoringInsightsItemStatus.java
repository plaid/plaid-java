/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
import com.plaid.client.model.MonitoringItemStatusCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object with details of the Monitoring Insights Item&#39;s status.
 */
@ApiModel(description = "An object with details of the Monitoring Insights Item's status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class MonitoringInsightsItemStatus {
  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private MonitoringItemStatusCode statusCode;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public MonitoringInsightsItemStatus statusCode(MonitoringItemStatusCode statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "")

  public MonitoringItemStatusCode getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(MonitoringItemStatusCode statusCode) {
    this.statusCode = statusCode;
  }


  public MonitoringInsightsItemStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * A reason for why a Monitoring Insights Report is not available. This field will only be populated when the &#x60;status_code&#x60; is not &#x60;AVAILABLE&#x60;
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reason for why a Monitoring Insights Report is not available. This field will only be populated when the `status_code` is not `AVAILABLE`")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringInsightsItemStatus monitoringInsightsItemStatus = (MonitoringInsightsItemStatus) o;
    return Objects.equals(this.statusCode, monitoringInsightsItemStatus.statusCode) &&
        Objects.equals(this.reason, monitoringInsightsItemStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringInsightsItemStatus {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

