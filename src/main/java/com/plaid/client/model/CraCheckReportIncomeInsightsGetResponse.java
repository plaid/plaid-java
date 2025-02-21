/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.CraIncomeInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CraCheckReportIncomeInsightsGetResponse defines the response schema for &#x60;/cra/check_report/income_insights/get&#x60;.
 */
@ApiModel(description = "CraCheckReportIncomeInsightsGetResponse defines the response schema for `/cra/check_report/income_insights/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class CraCheckReportIncomeInsightsGetResponse {
  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private CraIncomeInsights report;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CraCheckReportIncomeInsightsGetResponse report(CraIncomeInsights report) {
    
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraIncomeInsights getReport() {
    return report;
  }


  public void setReport(CraIncomeInsights report) {
    this.report = report;
  }


  public CraCheckReportIncomeInsightsGetResponse requestId(String requestId) {
    
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
    CraCheckReportIncomeInsightsGetResponse craCheckReportIncomeInsightsGetResponse = (CraCheckReportIncomeInsightsGetResponse) o;
    return Objects.equals(this.report, craCheckReportIncomeInsightsGetResponse.report) &&
        Objects.equals(this.requestId, craCheckReportIncomeInsightsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraCheckReportIncomeInsightsGetResponse {\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

