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
import com.plaid.client.model.BeaconReportSyndicationAnalysis;
import com.plaid.client.model.BeaconReportSyndicationOriginalReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Beacon Report Syndication represents a Beacon Report created either by your organization or another Beacon customer that matches a specific Beacon User you&#39;ve created.  The &#x60;analysis&#x60; field in the response indicates which fields matched between the originally reported Beacon User and the Beacon User that the report was syndicated to.  The &#x60;report&#x60; field in the response contains a subset of information from the original report.
 */
@ApiModel(description = "A Beacon Report Syndication represents a Beacon Report created either by your organization or another Beacon customer that matches a specific Beacon User you've created.  The `analysis` field in the response indicates which fields matched between the originally reported Beacon User and the Beacon User that the report was syndicated to.  The `report` field in the response contains a subset of information from the original report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class BeaconReportSyndicationGetResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEACON_USER_ID = "beacon_user_id";
  @SerializedName(SERIALIZED_NAME_BEACON_USER_ID)
  private String beaconUserId;

  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private BeaconReportSyndicationOriginalReport report;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private BeaconReportSyndicationAnalysis analysis;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BeaconReportSyndicationGetResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Beacon Report Syndication.
   * @return id
  **/
  @ApiModelProperty(example = "becrsn_11111111111111", required = true, value = "ID of the associated Beacon Report Syndication.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BeaconReportSyndicationGetResponse beaconUserId(String beaconUserId) {
    
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


  public BeaconReportSyndicationGetResponse report(BeaconReportSyndicationOriginalReport report) {
    
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconReportSyndicationOriginalReport getReport() {
    return report;
  }


  public void setReport(BeaconReportSyndicationOriginalReport report) {
    this.report = report;
  }


  public BeaconReportSyndicationGetResponse analysis(BeaconReportSyndicationAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconReportSyndicationAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(BeaconReportSyndicationAnalysis analysis) {
    this.analysis = analysis;
  }


  public BeaconReportSyndicationGetResponse requestId(String requestId) {
    
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
    BeaconReportSyndicationGetResponse beaconReportSyndicationGetResponse = (BeaconReportSyndicationGetResponse) o;
    return Objects.equals(this.id, beaconReportSyndicationGetResponse.id) &&
        Objects.equals(this.beaconUserId, beaconReportSyndicationGetResponse.beaconUserId) &&
        Objects.equals(this.report, beaconReportSyndicationGetResponse.report) &&
        Objects.equals(this.analysis, beaconReportSyndicationGetResponse.analysis) &&
        Objects.equals(this.requestId, beaconReportSyndicationGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beaconUserId, report, analysis, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReportSyndicationGetResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beaconUserId: ").append(toIndentedString(beaconUserId)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
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

