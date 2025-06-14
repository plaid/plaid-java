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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Conveys information about the errors causing missing or stale bank data used to construct the /signal/evaluate scores and response
 */
@ApiModel(description = "Conveys information about the errors causing missing or stale bank data used to construct the /signal/evaluate scores and response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SignalWarning {
  public static final String SERIALIZED_NAME_WARNING_TYPE = "warning_type";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPE)
  private String warningType;

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private String warningCode;

  public static final String SERIALIZED_NAME_WARNING_MESSAGE = "warning_message";
  @SerializedName(SERIALIZED_NAME_WARNING_MESSAGE)
  private String warningMessage;


  public SignalWarning warningType(String warningType) {
    
    this.warningType = warningType;
    return this;
  }

   /**
   * A broad categorization of the warning. Safe for programmatic use.
   * @return warningType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A broad categorization of the warning. Safe for programmatic use.")

  public String getWarningType() {
    return warningType;
  }


  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }


  public SignalWarning warningCode(String warningCode) {
    
    this.warningCode = warningCode;
    return this;
  }

   /**
   * The warning code identifies a specific kind of warning that pertains to the error causing bank data to be missing. Safe for programmatic use. For more details on warning codes, please refer to Plaid standard error codes documentation. If you receive the &#x60;ITEM_LOGIN_REQUIRED&#x60; warning, we recommend re-authenticating your user by implementing Link&#39;s update mode. This will guide your user to fix their credentials, allowing Plaid to start fetching data again for future Signal requests.
   * @return warningCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The warning code identifies a specific kind of warning that pertains to the error causing bank data to be missing. Safe for programmatic use. For more details on warning codes, please refer to Plaid standard error codes documentation. If you receive the `ITEM_LOGIN_REQUIRED` warning, we recommend re-authenticating your user by implementing Link's update mode. This will guide your user to fix their credentials, allowing Plaid to start fetching data again for future Signal requests.")

  public String getWarningCode() {
    return warningCode;
  }


  public void setWarningCode(String warningCode) {
    this.warningCode = warningCode;
  }


  public SignalWarning warningMessage(String warningMessage) {
    
    this.warningMessage = warningMessage;
    return this;
  }

   /**
   * A developer-friendly representation of the warning type. This may change over time and is not safe for programmatic use.
   * @return warningMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A developer-friendly representation of the warning type. This may change over time and is not safe for programmatic use.")

  public String getWarningMessage() {
    return warningMessage;
  }


  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalWarning signalWarning = (SignalWarning) o;
    return Objects.equals(this.warningType, signalWarning.warningType) &&
        Objects.equals(this.warningCode, signalWarning.warningCode) &&
        Objects.equals(this.warningMessage, signalWarning.warningMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, warningCode, warningMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalWarning {\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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

