/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * The failure reason if the event type for a refund is &#x60;\&quot;failed\&quot;&#x60; or &#x60;\&quot;returned\&quot;&#x60;. Null value otherwise.
 */
@ApiModel(description = "The failure reason if the event type for a refund is `\"failed\"` or `\"returned\"`. Null value otherwise.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class TransferRefundFailure {
  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_ACH_RETURN_CODE = "ach_return_code";
  @SerializedName(SERIALIZED_NAME_ACH_RETURN_CODE)
  private String achReturnCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public TransferRefundFailure failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * The failure code, e.g. &#x60;R01&#x60;.  A failure code will be provided if and only if the refund status is &#x60;returned&#x60;. See [ACH return codes](https://plaid.com/docs/errors/transfer/#ach-return-codes) for a full listing of ACH return codes and [RTP error codes](https://plaid.com/docs/errors/transfer/#rtp-error-codes) for RTP error codes.
   * @return failureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The failure code, e.g. `R01`.  A failure code will be provided if and only if the refund status is `returned`. See [ACH return codes](https://plaid.com/docs/errors/transfer/#ach-return-codes) for a full listing of ACH return codes and [RTP error codes](https://plaid.com/docs/errors/transfer/#rtp-error-codes) for RTP error codes.")

  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public TransferRefundFailure achReturnCode(String achReturnCode) {
    
    this.achReturnCode = achReturnCode;
    return this;
  }

   /**
   * The ACH return code, e.g. &#x60;R01&#x60;.  A return code will be provided if and only if the refund status is &#x60;returned&#x60;. For a full listing of ACH return codes, see [Transfer errors](https://plaid.com/docs/errors/transfer/#ach-return-codes). This field is deprecated in favor of the more versatile &#x60;failure_code&#x60;, which encompasses non-ACH failure codes as well.
   * @return achReturnCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ACH return code, e.g. `R01`.  A return code will be provided if and only if the refund status is `returned`. For a full listing of ACH return codes, see [Transfer errors](https://plaid.com/docs/errors/transfer/#ach-return-codes). This field is deprecated in favor of the more versatile `failure_code`, which encompasses non-ACH failure codes as well.")

  public String getAchReturnCode() {
    return achReturnCode;
  }


  public void setAchReturnCode(String achReturnCode) {
    this.achReturnCode = achReturnCode;
  }


  public TransferRefundFailure description(String description) {
    
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
    TransferRefundFailure transferRefundFailure = (TransferRefundFailure) o;
    return Objects.equals(this.failureCode, transferRefundFailure.failureCode) &&
        Objects.equals(this.achReturnCode, transferRefundFailure.achReturnCode) &&
        Objects.equals(this.description, transferRefundFailure.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCode, achReturnCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRefundFailure {\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    achReturnCode: ").append(toIndentedString(achReturnCode)).append("\n");
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

