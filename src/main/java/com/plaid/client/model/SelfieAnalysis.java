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
import com.plaid.client.model.SelfieAnalysisDocumentComparison;
import com.plaid.client.model.SelfieAnalysisFacialAnalysis;
import com.plaid.client.model.SelfieAnalysisLivenessCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * High level descriptions of how the associated selfie was processed. If a selfie fails verification, the details in the &#x60;analysis&#x60; object should help clarify why the selfie was rejected.
 */
@ApiModel(description = "High level descriptions of how the associated selfie was processed. If a selfie fails verification, the details in the `analysis` object should help clarify why the selfie was rejected.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SelfieAnalysis {
  public static final String SERIALIZED_NAME_DOCUMENT_COMPARISON = "document_comparison";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_COMPARISON)
  private SelfieAnalysisDocumentComparison documentComparison;

  public static final String SERIALIZED_NAME_LIVENESS_CHECK = "liveness_check";
  @SerializedName(SERIALIZED_NAME_LIVENESS_CHECK)
  private SelfieAnalysisLivenessCheck livenessCheck;

  public static final String SERIALIZED_NAME_FACIAL_ANALYSIS = "facial_analysis";
  @SerializedName(SERIALIZED_NAME_FACIAL_ANALYSIS)
  private SelfieAnalysisFacialAnalysis facialAnalysis;


  public SelfieAnalysis documentComparison(SelfieAnalysisDocumentComparison documentComparison) {
    
    this.documentComparison = documentComparison;
    return this;
  }

   /**
   * Get documentComparison
   * @return documentComparison
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisDocumentComparison getDocumentComparison() {
    return documentComparison;
  }


  public void setDocumentComparison(SelfieAnalysisDocumentComparison documentComparison) {
    this.documentComparison = documentComparison;
  }


  public SelfieAnalysis livenessCheck(SelfieAnalysisLivenessCheck livenessCheck) {
    
    this.livenessCheck = livenessCheck;
    return this;
  }

   /**
   * Get livenessCheck
   * @return livenessCheck
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisLivenessCheck getLivenessCheck() {
    return livenessCheck;
  }


  public void setLivenessCheck(SelfieAnalysisLivenessCheck livenessCheck) {
    this.livenessCheck = livenessCheck;
  }


  public SelfieAnalysis facialAnalysis(SelfieAnalysisFacialAnalysis facialAnalysis) {
    
    this.facialAnalysis = facialAnalysis;
    return this;
  }

   /**
   * Get facialAnalysis
   * @return facialAnalysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SelfieAnalysisFacialAnalysis getFacialAnalysis() {
    return facialAnalysis;
  }


  public void setFacialAnalysis(SelfieAnalysisFacialAnalysis facialAnalysis) {
    this.facialAnalysis = facialAnalysis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfieAnalysis selfieAnalysis = (SelfieAnalysis) o;
    return Objects.equals(this.documentComparison, selfieAnalysis.documentComparison) &&
        Objects.equals(this.livenessCheck, selfieAnalysis.livenessCheck) &&
        Objects.equals(this.facialAnalysis, selfieAnalysis.facialAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentComparison, livenessCheck, facialAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfieAnalysis {\n");
    sb.append("    documentComparison: ").append(toIndentedString(documentComparison)).append("\n");
    sb.append("    livenessCheck: ").append(toIndentedString(livenessCheck)).append("\n");
    sb.append("    facialAnalysis: ").append(toIndentedString(facialAnalysis)).append("\n");
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

