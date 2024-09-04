/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
import com.plaid.client.model.BeaconReportType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A subset of information from a Beacon Report that has been syndicated to a matching Beacon User in your program.  The &#x60;id&#x60; field in the response is the ID of the original report that was syndicated. If the original report was created by your organization, the field will be filled with the ID of the report. Otherwise, the field will be &#x60;null&#x60; indicating that the original report was created by another Beacon customer.
 */
@ApiModel(description = "A subset of information from a Beacon Report that has been syndicated to a matching Beacon User in your program.  The `id` field in the response is the ID of the original report that was syndicated. If the original report was created by your organization, the field will be filled with the ID of the report. Otherwise, the field will be `null` indicating that the original report was created by another Beacon customer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class BeaconReportSyndicationOriginalReport {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private java.sql.Timestamp createdAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BeaconReportType type;

  public static final String SERIALIZED_NAME_FRAUD_DATE = "fraud_date";
  @SerializedName(SERIALIZED_NAME_FRAUD_DATE)
  private LocalDate fraudDate;

  public static final String SERIALIZED_NAME_EVENT_DATE = "event_date";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private LocalDate eventDate;


  public BeaconReportSyndicationOriginalReport id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Beacon Report.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "becrpt_11111111111111", required = true, value = "ID of the associated Beacon Report.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BeaconReportSyndicationOriginalReport createdAt(java.sql.Timestamp createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public BeaconReportSyndicationOriginalReport type(BeaconReportType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconReportType getType() {
    return type;
  }


  public void setType(BeaconReportType type) {
    this.type = type;
  }


  public BeaconReportSyndicationOriginalReport fraudDate(LocalDate fraudDate) {
    
    this.fraudDate = fraudDate;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return fraudDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getFraudDate() {
    return fraudDate;
  }


  public void setFraudDate(LocalDate fraudDate) {
    this.fraudDate = fraudDate;
  }


  public BeaconReportSyndicationOriginalReport eventDate(LocalDate eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return eventDate
  **/
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getEventDate() {
    return eventDate;
  }


  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconReportSyndicationOriginalReport beaconReportSyndicationOriginalReport = (BeaconReportSyndicationOriginalReport) o;
    return Objects.equals(this.id, beaconReportSyndicationOriginalReport.id) &&
        Objects.equals(this.createdAt, beaconReportSyndicationOriginalReport.createdAt) &&
        Objects.equals(this.type, beaconReportSyndicationOriginalReport.type) &&
        Objects.equals(this.fraudDate, beaconReportSyndicationOriginalReport.fraudDate) &&
        Objects.equals(this.eventDate, beaconReportSyndicationOriginalReport.eventDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, type, fraudDate, eventDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReportSyndicationOriginalReport {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fraudDate: ").append(toIndentedString(fraudDate)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
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

