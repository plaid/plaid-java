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
import com.plaid.client.model.PrismCashScoreMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The data from the FirstDetect product returned by Prism Data.
 */
@ApiModel(description = "The data from the FirstDetect product returned by Prism Data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class PrismFirstDetect {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_MODEL_VERSION = "model_version";
  @SerializedName(SERIALIZED_NAME_MODEL_VERSION)
  private String modelVersion;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_REASON_CODES = "reason_codes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<String> reasonCodes = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PrismCashScoreMetadata metadata;

  public static final String SERIALIZED_NAME_ERROR_REASON = "error_reason";
  @SerializedName(SERIALIZED_NAME_ERROR_REASON)
  private String errorReason;


  public PrismFirstDetect version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of Prism Data&#39;s FirstDetect model used. This field is deprecated in favor of &#x60;model_version&#x60;.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of Prism Data's FirstDetect model used. This field is deprecated in favor of `model_version`.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public PrismFirstDetect modelVersion(String modelVersion) {
    
    this.modelVersion = modelVersion;
    return this;
  }

   /**
   * The version of Prism Data&#39;s FirstDetect model used.
   * @return modelVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of Prism Data's FirstDetect model used.")

  public String getModelVersion() {
    return modelVersion;
  }


  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }


  public PrismFirstDetect score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * The score returned by Prism Data. Ranges from 1-999, with higher score indicating lower risk.
   * @return score
  **/
  @ApiModelProperty(required = true, value = "The score returned by Prism Data. Ranges from 1-999, with higher score indicating lower risk.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public PrismFirstDetect reasonCodes(List<String> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public PrismFirstDetect addReasonCodesItem(String reasonCodesItem) {
    if (this.reasonCodes == null) {
      this.reasonCodes = new ArrayList<>();
    }
    this.reasonCodes.add(reasonCodesItem);
    return this;
  }

   /**
   * The reasons for an individual having risk according to the FirstDetect score.
   * @return reasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reasons for an individual having risk according to the FirstDetect score.")

  public List<String> getReasonCodes() {
    return reasonCodes;
  }


  public void setReasonCodes(List<String> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  public PrismFirstDetect metadata(PrismCashScoreMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrismCashScoreMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PrismCashScoreMetadata metadata) {
    this.metadata = metadata;
  }


  public PrismFirstDetect errorReason(String errorReason) {
    
    this.errorReason = errorReason;
    return this;
  }

   /**
   * The error returned by Prism for this product.
   * @return errorReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error returned by Prism for this product.")

  public String getErrorReason() {
    return errorReason;
  }


  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrismFirstDetect prismFirstDetect = (PrismFirstDetect) o;
    return Objects.equals(this.version, prismFirstDetect.version) &&
        Objects.equals(this.modelVersion, prismFirstDetect.modelVersion) &&
        Objects.equals(this.score, prismFirstDetect.score) &&
        Objects.equals(this.reasonCodes, prismFirstDetect.reasonCodes) &&
        Objects.equals(this.metadata, prismFirstDetect.metadata) &&
        Objects.equals(this.errorReason, prismFirstDetect.errorReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, modelVersion, score, reasonCodes, metadata, errorReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrismFirstDetect {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
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

