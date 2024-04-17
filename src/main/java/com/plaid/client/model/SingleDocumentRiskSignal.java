/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.DocumentRiskSignal;
import com.plaid.client.model.DocumentRiskSummary;
import com.plaid.client.model.RiskSignalDocumentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object containing all risk signals and relevant metadata for a single document
 */
@ApiModel(description = "Object containing all risk signals and relevant metadata for a single document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class SingleDocumentRiskSignal {
  public static final String SERIALIZED_NAME_DOCUMENT_REFERENCE = "document_reference";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_REFERENCE)
  private RiskSignalDocumentReference documentReference;

  public static final String SERIALIZED_NAME_RISK_SIGNALS = "risk_signals";
  @SerializedName(SERIALIZED_NAME_RISK_SIGNALS)
  private List<DocumentRiskSignal> riskSignals = new ArrayList<>();

  public static final String SERIALIZED_NAME_RISK_SUMMARY = "risk_summary";
  @SerializedName(SERIALIZED_NAME_RISK_SUMMARY)
  private DocumentRiskSummary riskSummary;


  public SingleDocumentRiskSignal documentReference(RiskSignalDocumentReference documentReference) {
    
    this.documentReference = documentReference;
    return this;
  }

   /**
   * Get documentReference
   * @return documentReference
  **/
  @ApiModelProperty(required = true, value = "")

  public RiskSignalDocumentReference getDocumentReference() {
    return documentReference;
  }


  public void setDocumentReference(RiskSignalDocumentReference documentReference) {
    this.documentReference = documentReference;
  }


  public SingleDocumentRiskSignal riskSignals(List<DocumentRiskSignal> riskSignals) {
    
    this.riskSignals = riskSignals;
    return this;
  }

  public SingleDocumentRiskSignal addRiskSignalsItem(DocumentRiskSignal riskSignalsItem) {
    this.riskSignals.add(riskSignalsItem);
    return this;
  }

   /**
   * Array of attributes that indicate whether or not there is fraud risk with a document
   * @return riskSignals
  **/
  @ApiModelProperty(required = true, value = "Array of attributes that indicate whether or not there is fraud risk with a document")

  public List<DocumentRiskSignal> getRiskSignals() {
    return riskSignals;
  }


  public void setRiskSignals(List<DocumentRiskSignal> riskSignals) {
    this.riskSignals = riskSignals;
  }


  public SingleDocumentRiskSignal riskSummary(DocumentRiskSummary riskSummary) {
    
    this.riskSummary = riskSummary;
    return this;
  }

   /**
   * Get riskSummary
   * @return riskSummary
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentRiskSummary getRiskSummary() {
    return riskSummary;
  }


  public void setRiskSummary(DocumentRiskSummary riskSummary) {
    this.riskSummary = riskSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleDocumentRiskSignal singleDocumentRiskSignal = (SingleDocumentRiskSignal) o;
    return Objects.equals(this.documentReference, singleDocumentRiskSignal.documentReference) &&
        Objects.equals(this.riskSignals, singleDocumentRiskSignal.riskSignals) &&
        Objects.equals(this.riskSummary, singleDocumentRiskSignal.riskSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentReference, riskSignals, riskSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleDocumentRiskSignal {\n");
    sb.append("    documentReference: ").append(toIndentedString(documentReference)).append("\n");
    sb.append("    riskSignals: ").append(toIndentedString(riskSignals)).append("\n");
    sb.append("    riskSummary: ").append(toIndentedString(riskSummary)).append("\n");
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

