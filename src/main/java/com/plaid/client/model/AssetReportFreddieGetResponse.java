/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
import com.plaid.client.model.AssetReportFreddie;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * AssetReportFreddieGetResponse defines the response schema for &#x60;/asset_report/get&#x60;
 */
@ApiModel(description = "AssetReportFreddieGetResponse defines the response schema for `/asset_report/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class AssetReportFreddieGetResponse {
  public static final String SERIALIZED_NAME_D_E_A_L = "DEAL";
  @SerializedName(SERIALIZED_NAME_D_E_A_L)
  private AssetReportFreddie DEAL;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "SchemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Double schemaVersion;


  public AssetReportFreddieGetResponse DEAL(AssetReportFreddie DEAL) {
    
    this.DEAL = DEAL;
    return this;
  }

   /**
   * Get DEAL
   * @return DEAL
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetReportFreddie getDEAL() {
    return DEAL;
  }


  public void setDEAL(AssetReportFreddie DEAL) {
    this.DEAL = DEAL;
  }


  public AssetReportFreddieGetResponse requestId(String requestId) {
    
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


  public AssetReportFreddieGetResponse schemaVersion(Double schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * The Verification Of Assets (aka VOA or Freddie Mac Schema) schema version.
   * @return schemaVersion
  **/
  @ApiModelProperty(required = true, value = "The Verification Of Assets (aka VOA or Freddie Mac Schema) schema version.")

  public Double getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Double schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportFreddieGetResponse assetReportFreddieGetResponse = (AssetReportFreddieGetResponse) o;
    return Objects.equals(this.DEAL, assetReportFreddieGetResponse.DEAL) &&
        Objects.equals(this.requestId, assetReportFreddieGetResponse.requestId) &&
        Objects.equals(this.schemaVersion, assetReportFreddieGetResponse.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DEAL, requestId, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportFreddieGetResponse {\n");
    sb.append("    DEAL: ").append(toIndentedString(DEAL)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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

