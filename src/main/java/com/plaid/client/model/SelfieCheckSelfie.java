/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import com.plaid.client.model.SelfieAnalysis;
import com.plaid.client.model.SelfieCapture;
import com.plaid.client.model.SelfieStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Captures and analysis from a user&#39;s selfie.
 */
@ApiModel(description = "Captures and analysis from a user's selfie.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class SelfieCheckSelfie {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SelfieStatus status;

  public static final String SERIALIZED_NAME_ATTEMPT = "attempt";
  @SerializedName(SERIALIZED_NAME_ATTEMPT)
  private Integer attempt;

  public static final String SERIALIZED_NAME_CAPTURE = "capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private SelfieCapture capture;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private SelfieAnalysis analysis;


  public SelfieCheckSelfie status(SelfieStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieStatus getStatus() {
    return status;
  }


  public void setStatus(SelfieStatus status) {
    this.status = status;
  }


  public SelfieCheckSelfie attempt(Integer attempt) {
    
    this.attempt = attempt;
    return this;
  }

   /**
   * The &#x60;attempt&#x60; field begins with 1 and increments with each subsequent selfie upload.
   * @return attempt
  **/
  @ApiModelProperty(example = "1", required = true, value = "The `attempt` field begins with 1 and increments with each subsequent selfie upload.")

  public Integer getAttempt() {
    return attempt;
  }


  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }


  public SelfieCheckSelfie capture(SelfieCapture capture) {
    
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieCapture getCapture() {
    return capture;
  }


  public void setCapture(SelfieCapture capture) {
    this.capture = capture;
  }


  public SelfieCheckSelfie analysis(SelfieAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(SelfieAnalysis analysis) {
    this.analysis = analysis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfieCheckSelfie selfieCheckSelfie = (SelfieCheckSelfie) o;
    return Objects.equals(this.status, selfieCheckSelfie.status) &&
        Objects.equals(this.attempt, selfieCheckSelfie.attempt) &&
        Objects.equals(this.capture, selfieCheckSelfie.capture) &&
        Objects.equals(this.analysis, selfieCheckSelfie.analysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, attempt, capture, analysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfieCheckSelfie {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
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

