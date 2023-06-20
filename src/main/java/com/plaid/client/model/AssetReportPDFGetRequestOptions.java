/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
 * An optional object to filter or add data to &#x60;/asset_report/get&#x60; results. If provided, must be non-&#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to filter or add data to `/asset_report/get` results. If provided, must be non-`null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class AssetReportPDFGetRequestOptions {
  public static final String SERIALIZED_NAME_DAYS_TO_INCLUDE = "days_to_include";
  @SerializedName(SERIALIZED_NAME_DAYS_TO_INCLUDE)
  private Integer daysToInclude;


  public AssetReportPDFGetRequestOptions daysToInclude(Integer daysToInclude) {
    
    this.daysToInclude = daysToInclude;
    return this;
  }

   /**
   * The maximum integer number of days of history to include in the Asset Report.
   * minimum: 0
   * maximum: 731
   * @return daysToInclude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum integer number of days of history to include in the Asset Report.")

  public Integer getDaysToInclude() {
    return daysToInclude;
  }


  public void setDaysToInclude(Integer daysToInclude) {
    this.daysToInclude = daysToInclude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportPDFGetRequestOptions assetReportPDFGetRequestOptions = (AssetReportPDFGetRequestOptions) o;
    return Objects.equals(this.daysToInclude, assetReportPDFGetRequestOptions.daysToInclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysToInclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportPDFGetRequestOptions {\n");
    sb.append("    daysToInclude: ").append(toIndentedString(daysToInclude)).append("\n");
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

