/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
 * Information about an report identifier and a report name.
 */
@ApiModel(description = "Information about an report identifier and a report name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class ReportingInformation {
  public static final String SERIALIZED_NAME_REPORTING_INFORMATION_IDENTIFIER = "ReportingInformationIdentifier";
  @SerializedName(SERIALIZED_NAME_REPORTING_INFORMATION_IDENTIFIER)
  private String reportingInformationIdentifier;


  public ReportingInformation reportingInformationIdentifier(String reportingInformationIdentifier) {
    
    this.reportingInformationIdentifier = reportingInformationIdentifier;
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return reportingInformationIdentifier
  **/
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public String getReportingInformationIdentifier() {
    return reportingInformationIdentifier;
  }


  public void setReportingInformationIdentifier(String reportingInformationIdentifier) {
    this.reportingInformationIdentifier = reportingInformationIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingInformation reportingInformation = (ReportingInformation) o;
    return Objects.equals(this.reportingInformationIdentifier, reportingInformation.reportingInformationIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingInformationIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingInformation {\n");
    sb.append("    reportingInformationIdentifier: ").append(toIndentedString(reportingInformationIdentifier)).append("\n");
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

