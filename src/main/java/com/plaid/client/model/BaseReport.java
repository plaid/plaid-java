/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.BaseReportItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing a Base Report
 */
@ApiModel(description = "An object representing a Base Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class BaseReport {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_DATE_GENERATED = "date_generated";
  @SerializedName(SERIALIZED_NAME_DATE_GENERATED)
  private OffsetDateTime dateGenerated;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Double daysRequested;

  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BaseReportItem> items = new ArrayList<>();


  public BaseReport reportId(String reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * A unique ID identifying an Base Report. Like all Plaid identifiers, this ID is case sensitive.
   * @return reportId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying an Base Report. Like all Plaid identifiers, this ID is case sensitive.")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public BaseReport dateGenerated(OffsetDateTime dateGenerated) {
    
    this.dateGenerated = dateGenerated;
    return this;
  }

   /**
   * The date and time when the Base Report was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \&quot;2018-04-12T03:32:11Z\&quot;).
   * @return dateGenerated
  **/
  @ApiModelProperty(required = true, value = "The date and time when the Base Report was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \"2018-04-12T03:32:11Z\").")

  public OffsetDateTime getDateGenerated() {
    return dateGenerated;
  }


  public void setDateGenerated(OffsetDateTime dateGenerated) {
    this.dateGenerated = dateGenerated;
  }


  public BaseReport daysRequested(Double daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The number of days of transaction history requested.
   * @return daysRequested
  **/
  @ApiModelProperty(required = true, value = "The number of days of transaction history requested.")

  public Double getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Double daysRequested) {
    this.daysRequested = daysRequested;
  }


  public BaseReport clientReportId(String clientReportId) {
    
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


  public BaseReport items(List<BaseReportItem> items) {
    
    this.items = items;
    return this;
  }

  public BaseReport addItemsItem(BaseReportItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Data returned by Plaid about each of the Items included in the Base Report.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Data returned by Plaid about each of the Items included in the Base Report.")

  public List<BaseReportItem> getItems() {
    return items;
  }


  public void setItems(List<BaseReportItem> items) {
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
    BaseReport baseReport = (BaseReport) o;
    return Objects.equals(this.reportId, baseReport.reportId) &&
        Objects.equals(this.dateGenerated, baseReport.dateGenerated) &&
        Objects.equals(this.daysRequested, baseReport.daysRequested) &&
        Objects.equals(this.clientReportId, baseReport.clientReportId) &&
        Objects.equals(this.items, baseReport.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, dateGenerated, daysRequested, clientReportId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReport {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    dateGenerated: ").append(toIndentedString(dateGenerated)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
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

