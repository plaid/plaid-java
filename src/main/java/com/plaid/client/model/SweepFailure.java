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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The failure reason if the status for a sweep is &#x60;\&quot;failed\&quot;&#x60; or &#x60;\&quot;returned\&quot;&#x60;. Null value otherwise.
 */
@ApiModel(description = "The failure reason if the status for a sweep is `\"failed\"` or `\"returned\"`. Null value otherwise.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class SweepFailure {
  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public SweepFailure failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * The failure code, e.g. &#x60;R01&#x60;.  A failure code will be provided if and only if the sweep status is &#x60;returned&#x60;. See [ACH return codes](https://plaid.com/docs/errors/transfer/#ach-return-codes) for a full listing of ACH return codes and [RTP error codes](https://plaid.com/docs/errors/transfer/#rtp-error-codes) for RTP error codes.
   * @return failureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The failure code, e.g. `R01`.  A failure code will be provided if and only if the sweep status is `returned`. See [ACH return codes](https://plaid.com/docs/errors/transfer/#ach-return-codes) for a full listing of ACH return codes and [RTP error codes](https://plaid.com/docs/errors/transfer/#rtp-error-codes) for RTP error codes.")

  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public SweepFailure description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the reason for the failure or reversal.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the reason for the failure or reversal.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepFailure sweepFailure = (SweepFailure) o;
    return Objects.equals(this.failureCode, sweepFailure.failureCode) &&
        Objects.equals(this.description, sweepFailure.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepFailure {\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

