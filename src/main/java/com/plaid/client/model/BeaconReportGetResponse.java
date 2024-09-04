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
import com.plaid.client.model.BeaconAuditTrail;
import com.plaid.client.model.BeaconReportType;
import com.plaid.client.model.FraudAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A Beacon Report describes the type of fraud committed by a user as well as the date the fraud was committed and the total amount of money lost due to the fraud incident.  This information is used to block similar fraud attempts on your platform as well as alert other companies who screen a user with matching identity information. Other companies will not receive any new identity information, just what matched, plus information such as industry, type of fraud, and date of fraud.  You can manage your fraud reports by adding, deleting, or editing reports as you get additional information on fraudulent users.
 */
@ApiModel(description = "A Beacon Report describes the type of fraud committed by a user as well as the date the fraud was committed and the total amount of money lost due to the fraud incident.  This information is used to block similar fraud attempts on your platform as well as alert other companies who screen a user with matching identity information. Other companies will not receive any new identity information, just what matched, plus information such as industry, type of fraud, and date of fraud.  You can manage your fraud reports by adding, deleting, or editing reports as you get additional information on fraudulent users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class BeaconReportGetResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEACON_USER_ID = "beacon_user_id";
  @SerializedName(SERIALIZED_NAME_BEACON_USER_ID)
  private String beaconUserId;

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

  public static final String SERIALIZED_NAME_FRAUD_AMOUNT = "fraud_amount";
  @SerializedName(SERIALIZED_NAME_FRAUD_AMOUNT)
  private FraudAmount fraudAmount;

  public static final String SERIALIZED_NAME_AUDIT_TRAIL = "audit_trail";
  @SerializedName(SERIALIZED_NAME_AUDIT_TRAIL)
  private BeaconAuditTrail auditTrail;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BeaconReportGetResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Beacon Report.
   * @return id
  **/
  @ApiModelProperty(example = "becrpt_11111111111111", required = true, value = "ID of the associated Beacon Report.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BeaconReportGetResponse beaconUserId(String beaconUserId) {
    
    this.beaconUserId = beaconUserId;
    return this;
  }

   /**
   * ID of the associated Beacon User.
   * @return beaconUserId
  **/
  @ApiModelProperty(example = "becusr_42cF1MNo42r9Xj", required = true, value = "ID of the associated Beacon User.")

  public String getBeaconUserId() {
    return beaconUserId;
  }


  public void setBeaconUserId(String beaconUserId) {
    this.beaconUserId = beaconUserId;
  }


  public BeaconReportGetResponse createdAt(java.sql.Timestamp createdAt) {
    
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


  public BeaconReportGetResponse type(BeaconReportType type) {
    
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


  public BeaconReportGetResponse fraudDate(LocalDate fraudDate) {
    
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


  public BeaconReportGetResponse eventDate(LocalDate eventDate) {
    
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


  public BeaconReportGetResponse fraudAmount(FraudAmount fraudAmount) {
    
    this.fraudAmount = fraudAmount;
    return this;
  }

   /**
   * Get fraudAmount
   * @return fraudAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public FraudAmount getFraudAmount() {
    return fraudAmount;
  }


  public void setFraudAmount(FraudAmount fraudAmount) {
    this.fraudAmount = fraudAmount;
  }


  public BeaconReportGetResponse auditTrail(BeaconAuditTrail auditTrail) {
    
    this.auditTrail = auditTrail;
    return this;
  }

   /**
   * Get auditTrail
   * @return auditTrail
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconAuditTrail getAuditTrail() {
    return auditTrail;
  }


  public void setAuditTrail(BeaconAuditTrail auditTrail) {
    this.auditTrail = auditTrail;
  }


  public BeaconReportGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconReportGetResponse beaconReportGetResponse = (BeaconReportGetResponse) o;
    return Objects.equals(this.id, beaconReportGetResponse.id) &&
        Objects.equals(this.beaconUserId, beaconReportGetResponse.beaconUserId) &&
        Objects.equals(this.createdAt, beaconReportGetResponse.createdAt) &&
        Objects.equals(this.type, beaconReportGetResponse.type) &&
        Objects.equals(this.fraudDate, beaconReportGetResponse.fraudDate) &&
        Objects.equals(this.eventDate, beaconReportGetResponse.eventDate) &&
        Objects.equals(this.fraudAmount, beaconReportGetResponse.fraudAmount) &&
        Objects.equals(this.auditTrail, beaconReportGetResponse.auditTrail) &&
        Objects.equals(this.requestId, beaconReportGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beaconUserId, createdAt, type, fraudDate, eventDate, fraudAmount, auditTrail, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReportGetResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beaconUserId: ").append(toIndentedString(beaconUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fraudDate: ").append(toIndentedString(fraudDate)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    fraudAmount: ").append(toIndentedString(fraudAmount)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

