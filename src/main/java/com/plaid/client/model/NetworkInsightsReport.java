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
import com.plaid.client.model.NetworkInsightsItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains data for the Network Insights Report.
 */
@ApiModel(description = "Contains data for the Network Insights Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class NetworkInsightsReport {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_GENERATED_TIME = "generated_time";
  @SerializedName(SERIALIZED_NAME_GENERATED_TIME)
  private OffsetDateTime generatedTime;

  public static final String SERIALIZED_NAME_NETWORK_ATTRIBUTES = "network_attributes";
  @SerializedName(SERIALIZED_NAME_NETWORK_ATTRIBUTES)
  private Object networkAttributes;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<NetworkInsightsItem> items = new ArrayList<>();


  public NetworkInsightsReport reportId(String reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * The unique identifier associated with the Network Insights report object.
   * @return reportId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier associated with the Network Insights report object.")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public NetworkInsightsReport generatedTime(OffsetDateTime generatedTime) {
    
    this.generatedTime = generatedTime;
    return this;
  }

   /**
   * The time when the Network Insights Report was generated.
   * @return generatedTime
  **/
  @ApiModelProperty(required = true, value = "The time when the Network Insights Report was generated.")

  public OffsetDateTime getGeneratedTime() {
    return generatedTime;
  }


  public void setGeneratedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
  }


  public NetworkInsightsReport networkAttributes(Object networkAttributes) {
    
    this.networkAttributes = networkAttributes;
    return this;
  }

   /**
   * A map of network attributes, where the key is a string, and the value is a float, int, or boolean.
   * @return networkAttributes
  **/
  @ApiModelProperty(required = true, value = "A map of network attributes, where the key is a string, and the value is a float, int, or boolean.")

  public Object getNetworkAttributes() {
    return networkAttributes;
  }


  public void setNetworkAttributes(Object networkAttributes) {
    this.networkAttributes = networkAttributes;
  }


  public NetworkInsightsReport items(List<NetworkInsightsItem> items) {
    
    this.items = items;
    return this;
  }

  public NetworkInsightsReport addItemsItem(NetworkInsightsItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of Items associated with the provided access_tokens.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of Items associated with the provided access_tokens.")

  public List<NetworkInsightsItem> getItems() {
    return items;
  }


  public void setItems(List<NetworkInsightsItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInsightsReport networkInsightsReport = (NetworkInsightsReport) o;
    return Objects.equals(this.reportId, networkInsightsReport.reportId) &&
        Objects.equals(this.generatedTime, networkInsightsReport.generatedTime) &&
        Objects.equals(this.networkAttributes, networkInsightsReport.networkAttributes) &&
        Objects.equals(this.items, networkInsightsReport.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, generatedTime, networkAttributes, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInsightsReport {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
    sb.append("    networkAttributes: ").append(toIndentedString(networkAttributes)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

