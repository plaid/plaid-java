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
import com.plaid.client.model.DocumentAnalysis;
import com.plaid.client.model.DocumentStatus;
import com.plaid.client.model.PhysicalDocumentExtractedData;
import com.plaid.client.model.PhysicalDocumentImages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Images, extracted data, and analysis from a user&#39;s identity document
 */
@ApiModel(description = "Images, extracted data, and analysis from a user's identity document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class DocumentaryVerificationDocument {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentStatus status;

  public static final String SERIALIZED_NAME_ATTEMPT = "attempt";
  @SerializedName(SERIALIZED_NAME_ATTEMPT)
  private Integer attempt;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private PhysicalDocumentImages images;

  public static final String SERIALIZED_NAME_EXTRACTED_DATA = "extracted_data";
  @SerializedName(SERIALIZED_NAME_EXTRACTED_DATA)
  private PhysicalDocumentExtractedData extractedData;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private DocumentAnalysis analysis;

  public static final String SERIALIZED_NAME_REDACTED_AT = "redacted_at";
  @SerializedName(SERIALIZED_NAME_REDACTED_AT)
  private OffsetDateTime redactedAt;


  public DocumentaryVerificationDocument status(DocumentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentStatus getStatus() {
    return status;
  }


  public void setStatus(DocumentStatus status) {
    this.status = status;
  }


  public DocumentaryVerificationDocument attempt(Integer attempt) {
    
    this.attempt = attempt;
    return this;
  }

   /**
   * The &#x60;attempt&#x60; field begins with 1 and increments with each subsequent document upload.
   * @return attempt
  **/
  @ApiModelProperty(example = "1", required = true, value = "The `attempt` field begins with 1 and increments with each subsequent document upload.")

  public Integer getAttempt() {
    return attempt;
  }


  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }


  public DocumentaryVerificationDocument images(PhysicalDocumentImages images) {
    
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(required = true, value = "")

  public PhysicalDocumentImages getImages() {
    return images;
  }


  public void setImages(PhysicalDocumentImages images) {
    this.images = images;
  }


  public DocumentaryVerificationDocument extractedData(PhysicalDocumentExtractedData extractedData) {
    
    this.extractedData = extractedData;
    return this;
  }

   /**
   * Get extractedData
   * @return extractedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PhysicalDocumentExtractedData getExtractedData() {
    return extractedData;
  }


  public void setExtractedData(PhysicalDocumentExtractedData extractedData) {
    this.extractedData = extractedData;
  }


  public DocumentaryVerificationDocument analysis(DocumentAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @ApiModelProperty(required = true, value = "")

  public DocumentAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(DocumentAnalysis analysis) {
    this.analysis = analysis;
  }


  public DocumentaryVerificationDocument redactedAt(OffsetDateTime redactedAt) {
    
    this.redactedAt = redactedAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return redactedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getRedactedAt() {
    return redactedAt;
  }


  public void setRedactedAt(OffsetDateTime redactedAt) {
    this.redactedAt = redactedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentaryVerificationDocument documentaryVerificationDocument = (DocumentaryVerificationDocument) o;
    return Objects.equals(this.status, documentaryVerificationDocument.status) &&
        Objects.equals(this.attempt, documentaryVerificationDocument.attempt) &&
        Objects.equals(this.images, documentaryVerificationDocument.images) &&
        Objects.equals(this.extractedData, documentaryVerificationDocument.extractedData) &&
        Objects.equals(this.analysis, documentaryVerificationDocument.analysis) &&
        Objects.equals(this.redactedAt, documentaryVerificationDocument.redactedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, attempt, images, extractedData, analysis, redactedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentaryVerificationDocument {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    extractedData: ").append(toIndentedString(extractedData)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    redactedAt: ").append(toIndentedString(redactedAt)).append("\n");
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

