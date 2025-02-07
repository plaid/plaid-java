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
import com.plaid.client.model.BeaconMatchSummaryAnalysis;
import com.plaid.client.model.BeaconUserRevision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Beacon Duplicate represents a pair of matching Beacon Users and an analysis of the fields they matched on.
 */
@ApiModel(description = "A Beacon Duplicate represents a pair of matching Beacon Users and an analysis of the fields they matched on.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class BeaconDuplicateGetResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEACON_USER1 = "beacon_user1";
  @SerializedName(SERIALIZED_NAME_BEACON_USER1)
  private BeaconUserRevision beaconUser1;

  public static final String SERIALIZED_NAME_BEACON_USER2 = "beacon_user2";
  @SerializedName(SERIALIZED_NAME_BEACON_USER2)
  private BeaconUserRevision beaconUser2;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private BeaconMatchSummaryAnalysis analysis;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BeaconDuplicateGetResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Beacon Duplicate.
   * @return id
  **/
  @ApiModelProperty(example = "becdup_11111111111111", required = true, value = "ID of the associated Beacon Duplicate.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BeaconDuplicateGetResponse beaconUser1(BeaconUserRevision beaconUser1) {
    
    this.beaconUser1 = beaconUser1;
    return this;
  }

   /**
   * Get beaconUser1
   * @return beaconUser1
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserRevision getBeaconUser1() {
    return beaconUser1;
  }


  public void setBeaconUser1(BeaconUserRevision beaconUser1) {
    this.beaconUser1 = beaconUser1;
  }


  public BeaconDuplicateGetResponse beaconUser2(BeaconUserRevision beaconUser2) {
    
    this.beaconUser2 = beaconUser2;
    return this;
  }

   /**
   * Get beaconUser2
   * @return beaconUser2
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserRevision getBeaconUser2() {
    return beaconUser2;
  }


  public void setBeaconUser2(BeaconUserRevision beaconUser2) {
    this.beaconUser2 = beaconUser2;
  }


  public BeaconDuplicateGetResponse analysis(BeaconMatchSummaryAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(BeaconMatchSummaryAnalysis analysis) {
    this.analysis = analysis;
  }


  public BeaconDuplicateGetResponse requestId(String requestId) {
    
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
    BeaconDuplicateGetResponse beaconDuplicateGetResponse = (BeaconDuplicateGetResponse) o;
    return Objects.equals(this.id, beaconDuplicateGetResponse.id) &&
        Objects.equals(this.beaconUser1, beaconDuplicateGetResponse.beaconUser1) &&
        Objects.equals(this.beaconUser2, beaconDuplicateGetResponse.beaconUser2) &&
        Objects.equals(this.analysis, beaconDuplicateGetResponse.analysis) &&
        Objects.equals(this.requestId, beaconDuplicateGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beaconUser1, beaconUser2, analysis, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconDuplicateGetResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beaconUser1: ").append(toIndentedString(beaconUser1)).append("\n");
    sb.append("    beaconUser2: ").append(toIndentedString(beaconUser2)).append("\n");
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

