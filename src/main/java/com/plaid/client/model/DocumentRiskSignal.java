/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.DocumentRiskSignalInstitutionMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about a certain reason as to why a document could potentially be fraudulent.
 */
@ApiModel(description = "Details about a certain reason as to why a document could potentially be fraudulent.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class DocumentRiskSignal {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_HAS_FRAUD_RISK = "has_fraud_risk";
  @SerializedName(SERIALIZED_NAME_HAS_FRAUD_RISK)
  private Boolean hasFraudRisk;

  public static final String SERIALIZED_NAME_INSTITUTION_METADATA = "institution_metadata";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_METADATA)
  private DocumentRiskSignalInstitutionMetadata institutionMetadata;

  public static final String SERIALIZED_NAME_EXPECTED_VALUE = "expected_value";
  @SerializedName(SERIALIZED_NAME_EXPECTED_VALUE)
  private String expectedValue;

  public static final String SERIALIZED_NAME_ACTUAL_VALUE = "actual_value";
  @SerializedName(SERIALIZED_NAME_ACTUAL_VALUE)
  private String actualValue;

  public static final String SERIALIZED_NAME_SIGNAL_DESCRIPTION = "signal_description";
  @SerializedName(SERIALIZED_NAME_SIGNAL_DESCRIPTION)
  private String signalDescription;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;


  public DocumentRiskSignal type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of risk found in the risk signal check.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of risk found in the risk signal check.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DocumentRiskSignal field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * The field which the risk signal was computed for
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The field which the risk signal was computed for")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public DocumentRiskSignal hasFraudRisk(Boolean hasFraudRisk) {
    
    this.hasFraudRisk = hasFraudRisk;
    return this;
  }

   /**
   * A flag used to quickly identify if the signal indicates that this field is authentic or fraudulent
   * @return hasFraudRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A flag used to quickly identify if the signal indicates that this field is authentic or fraudulent")

  public Boolean getHasFraudRisk() {
    return hasFraudRisk;
  }


  public void setHasFraudRisk(Boolean hasFraudRisk) {
    this.hasFraudRisk = hasFraudRisk;
  }


  public DocumentRiskSignal institutionMetadata(DocumentRiskSignalInstitutionMetadata institutionMetadata) {
    
    this.institutionMetadata = institutionMetadata;
    return this;
  }

   /**
   * Get institutionMetadata
   * @return institutionMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public DocumentRiskSignalInstitutionMetadata getInstitutionMetadata() {
    return institutionMetadata;
  }


  public void setInstitutionMetadata(DocumentRiskSignalInstitutionMetadata institutionMetadata) {
    this.institutionMetadata = institutionMetadata;
  }


  public DocumentRiskSignal expectedValue(String expectedValue) {
    
    this.expectedValue = expectedValue;
    return this;
  }

   /**
   * The expected value of the field, as seen on the document
   * @return expectedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The expected value of the field, as seen on the document")

  public String getExpectedValue() {
    return expectedValue;
  }


  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
  }


  public DocumentRiskSignal actualValue(String actualValue) {
    
    this.actualValue = actualValue;
    return this;
  }

   /**
   * The derived value obtained in the risk signal calculation process for this field
   * @return actualValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The derived value obtained in the risk signal calculation process for this field")

  public String getActualValue() {
    return actualValue;
  }


  public void setActualValue(String actualValue) {
    this.actualValue = actualValue;
  }


  public DocumentRiskSignal signalDescription(String signalDescription) {
    
    this.signalDescription = signalDescription;
    return this;
  }

   /**
   * A human-readable explanation providing more detail into the particular risk signal
   * @return signalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A human-readable explanation providing more detail into the particular risk signal")

  public String getSignalDescription() {
    return signalDescription;
  }


  public void setSignalDescription(String signalDescription) {
    this.signalDescription = signalDescription;
  }


  public DocumentRiskSignal pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The relevant page associated with the risk signal. If the risk signal is not associated with a specific page, the value will be 0.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The relevant page associated with the risk signal. If the risk signal is not associated with a specific page, the value will be 0.")

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
    DocumentRiskSignal documentRiskSignal = (DocumentRiskSignal) o;
    return Objects.equals(this.type, documentRiskSignal.type) &&
        Objects.equals(this.field, documentRiskSignal.field) &&
        Objects.equals(this.hasFraudRisk, documentRiskSignal.hasFraudRisk) &&
        Objects.equals(this.institutionMetadata, documentRiskSignal.institutionMetadata) &&
        Objects.equals(this.expectedValue, documentRiskSignal.expectedValue) &&
        Objects.equals(this.actualValue, documentRiskSignal.actualValue) &&
        Objects.equals(this.signalDescription, documentRiskSignal.signalDescription) &&
        Objects.equals(this.pageNumber, documentRiskSignal.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, field, hasFraudRisk, institutionMetadata, expectedValue, actualValue, signalDescription, pageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRiskSignal {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    hasFraudRisk: ").append(toIndentedString(hasFraudRisk)).append("\n");
    sb.append("    institutionMetadata: ").append(toIndentedString(institutionMetadata)).append("\n");
    sb.append("    expectedValue: ").append(toIndentedString(expectedValue)).append("\n");
    sb.append("    actualValue: ").append(toIndentedString(actualValue)).append("\n");
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

