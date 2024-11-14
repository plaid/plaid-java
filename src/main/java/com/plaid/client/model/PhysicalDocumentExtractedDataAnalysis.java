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
import com.plaid.client.model.DocumentDateOfBirthMatchCode;
import com.plaid.client.model.DocumentNameMatchCode;
import com.plaid.client.model.ExpirationDate;
import com.plaid.client.model.IssuingCountry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analysis of the data extracted from the submitted document.
 */
@ApiModel(description = "Analysis of the data extracted from the submitted document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class PhysicalDocumentExtractedDataAnalysis {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private DocumentNameMatchCode name;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private DocumentDateOfBirthMatchCode dateOfBirth;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private ExpirationDate expirationDate;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private IssuingCountry issuingCountry;


  public PhysicalDocumentExtractedDataAnalysis name(DocumentNameMatchCode name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentNameMatchCode getName() {
    return name;
  }


  public void setName(DocumentNameMatchCode name) {
    this.name = name;
  }


  public PhysicalDocumentExtractedDataAnalysis dateOfBirth(DocumentDateOfBirthMatchCode dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentDateOfBirthMatchCode getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(DocumentDateOfBirthMatchCode dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PhysicalDocumentExtractedDataAnalysis expirationDate(ExpirationDate expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "")

  public ExpirationDate getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(ExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PhysicalDocumentExtractedDataAnalysis issuingCountry(IssuingCountry issuingCountry) {
    
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Get issuingCountry
   * @return issuingCountry
  **/
  @ApiModelProperty(required = true, value = "")

  public IssuingCountry getIssuingCountry() {
    return issuingCountry;
  }


  public void setIssuingCountry(IssuingCountry issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalDocumentExtractedDataAnalysis physicalDocumentExtractedDataAnalysis = (PhysicalDocumentExtractedDataAnalysis) o;
    return Objects.equals(this.name, physicalDocumentExtractedDataAnalysis.name) &&
        Objects.equals(this.dateOfBirth, physicalDocumentExtractedDataAnalysis.dateOfBirth) &&
        Objects.equals(this.expirationDate, physicalDocumentExtractedDataAnalysis.expirationDate) &&
        Objects.equals(this.issuingCountry, physicalDocumentExtractedDataAnalysis.issuingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dateOfBirth, expirationDate, issuingCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalDocumentExtractedDataAnalysis {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
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

