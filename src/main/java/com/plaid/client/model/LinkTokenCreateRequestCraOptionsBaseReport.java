/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
 * Specifies options for initializing Link for use with the Base Report product.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Base Report product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class LinkTokenCreateRequestCraOptionsBaseReport {
  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;


  public LinkTokenCreateRequestCraOptionsBaseReport clientReportId(String clientReportId) {
    
    this.clientReportId = clientReportId;
    return this;
  }

   /**
   * Client-generated identifier, which can be used by lenders to track loan applications.
   * @return clientReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client-generated identifier, which can be used by lenders to track loan applications.")

  public String getClientReportId() {
    return clientReportId;
  }


  public void setClientReportId(String clientReportId) {
    this.clientReportId = clientReportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestCraOptionsBaseReport linkTokenCreateRequestCraOptionsBaseReport = (LinkTokenCreateRequestCraOptionsBaseReport) o;
    return Objects.equals(this.clientReportId, linkTokenCreateRequestCraOptionsBaseReport.clientReportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestCraOptionsBaseReport {\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
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

