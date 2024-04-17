/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.IncomeSummaryFieldNumber;
import com.plaid.client.model.VerificationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The employee&#39;s estimated annual salary, as derived from information reported on the paystub.
 */
@ApiModel(description = "The employee's estimated annual salary, as derived from information reported on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class ProjectedIncomeSummaryFieldNumber {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatus verificationStatus;


  public ProjectedIncomeSummaryFieldNumber value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the field.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the field.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public ProjectedIncomeSummaryFieldNumber verificationStatus(VerificationStatus verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public VerificationStatus getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(VerificationStatus verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectedIncomeSummaryFieldNumber projectedIncomeSummaryFieldNumber = (ProjectedIncomeSummaryFieldNumber) o;
    return Objects.equals(this.value, projectedIncomeSummaryFieldNumber.value) &&
        Objects.equals(this.verificationStatus, projectedIncomeSummaryFieldNumber.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectedIncomeSummaryFieldNumber {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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

