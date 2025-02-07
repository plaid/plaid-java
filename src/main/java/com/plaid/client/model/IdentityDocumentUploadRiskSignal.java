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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Risk signals tied to the document
 */
@ApiModel(description = "Risk signals tied to the document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class IdentityDocumentUploadRiskSignal {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_HAS_FRAUD_RISK = "has_fraud_risk";
  @SerializedName(SERIALIZED_NAME_HAS_FRAUD_RISK)
  private Boolean hasFraudRisk;

  public static final String SERIALIZED_NAME_SIGNAL_DESCRIPTION = "signal_description";
  @SerializedName(SERIALIZED_NAME_SIGNAL_DESCRIPTION)
  private String signalDescription;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;


  public IdentityDocumentUploadRiskSignal type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of risk found.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of risk found.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public IdentityDocumentUploadRiskSignal hasFraudRisk(Boolean hasFraudRisk) {
    
    this.hasFraudRisk = hasFraudRisk;
    return this;
  }

   /**
   * Indicates whether fraud risk was detected on the field.
   * @return hasFraudRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether fraud risk was detected on the field.")

  public Boolean getHasFraudRisk() {
    return hasFraudRisk;
  }


  public void setHasFraudRisk(Boolean hasFraudRisk) {
    this.hasFraudRisk = hasFraudRisk;
  }


  public IdentityDocumentUploadRiskSignal signalDescription(String signalDescription) {
    
    this.signalDescription = signalDescription;
    return this;
  }

   /**
   * A human-readable explanation providing more detail about the specific risk signal.
   * @return signalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable explanation providing more detail about the specific risk signal.")

  public String getSignalDescription() {
    return signalDescription;
  }


  public void setSignalDescription(String signalDescription) {
    this.signalDescription = signalDescription;
  }


  public IdentityDocumentUploadRiskSignal pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The relevant page associated with the risk signal. If the risk signal is not associated with a specific page, the value will be 0.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The relevant page associated with the risk signal. If the risk signal is not associated with a specific page, the value will be 0.")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDocumentUploadRiskSignal identityDocumentUploadRiskSignal = (IdentityDocumentUploadRiskSignal) o;
    return Objects.equals(this.type, identityDocumentUploadRiskSignal.type) &&
        Objects.equals(this.hasFraudRisk, identityDocumentUploadRiskSignal.hasFraudRisk) &&
        Objects.equals(this.signalDescription, identityDocumentUploadRiskSignal.signalDescription) &&
        Objects.equals(this.pageNumber, identityDocumentUploadRiskSignal.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hasFraudRisk, signalDescription, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDocumentUploadRiskSignal {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hasFraudRisk: ").append(toIndentedString(hasFraudRisk)).append("\n");
    sb.append("    signalDescription: ").append(toIndentedString(signalDescription)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

