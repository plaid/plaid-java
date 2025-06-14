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
import com.plaid.client.model.CraVoaReport;
import com.plaid.client.model.CraVoeReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains data for the CRA Verification Report.
 */
@ApiModel(description = "Contains data for the CRA Verification Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CraVerificationReport {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;

  public static final String SERIALIZED_NAME_VOA = "voa";
  @SerializedName(SERIALIZED_NAME_VOA)
  private CraVoaReport voa;

  public static final String SERIALIZED_NAME_VOE = "voe";
  @SerializedName(SERIALIZED_NAME_VOE)
  private CraVoeReport voe;


  public CraVerificationReport reportId(String reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * The unique identifier associated with the Verification Report object. This ID will be the same as the Base Report ID.
   * @return reportId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier associated with the Verification Report object. This ID will be the same as the Base Report ID.")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public CraVerificationReport clientReportId(String clientReportId) {
    
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


  public CraVerificationReport voa(CraVoaReport voa) {
    
    this.voa = voa;
    return this;
  }

   /**
   * Get voa
   * @return voa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraVoaReport getVoa() {
    return voa;
  }


  public void setVoa(CraVoaReport voa) {
    this.voa = voa;
  }


  public CraVerificationReport voe(CraVoeReport voe) {
    
    this.voe = voe;
    return this;
  }

   /**
   * Get voe
   * @return voe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraVoeReport getVoe() {
    return voe;
  }


  public void setVoe(CraVoeReport voe) {
    this.voe = voe;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraVerificationReport craVerificationReport = (CraVerificationReport) o;
    return Objects.equals(this.reportId, craVerificationReport.reportId) &&
        Objects.equals(this.clientReportId, craVerificationReport.clientReportId) &&
        Objects.equals(this.voa, craVerificationReport.voa) &&
        Objects.equals(this.voe, craVerificationReport.voe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, clientReportId, voa, voe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraVerificationReport {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
    sb.append("    voa: ").append(toIndentedString(voa)).append("\n");
    sb.append("    voe: ").append(toIndentedString(voe)).append("\n");
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

