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
 * The details of a Link error.
 */
@ApiModel(description = "The details of a Link error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class CreditSessionError {
  public static final String SERIALIZED_NAME_ERROR_TYPE = "error_type";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_DISPLAY_MESSAGE = "display_message";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MESSAGE)
  private String displayMessage;


  public CreditSessionError errorType(String errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * A broad categorization of the error.
   * @return errorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A broad categorization of the error.")

  public String getErrorType() {
    return errorType;
  }


  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public CreditSessionError errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The particular error code.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The particular error code.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CreditSessionError errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A developer-friendly representation of the error code.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A developer-friendly representation of the error code.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CreditSessionError displayMessage(String displayMessage) {
    
    this.displayMessage = displayMessage;
    return this;
  }

   /**
   * A user-friendly representation of the error code. &#x60;null&#x60; if the error is not related to user action.
   * @return displayMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A user-friendly representation of the error code. `null` if the error is not related to user action.")

  public String getDisplayMessage() {
    return displayMessage;
  }


  public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionError creditSessionError = (CreditSessionError) o;
    return Objects.equals(this.errorType, creditSessionError.errorType) &&
        Objects.equals(this.errorCode, creditSessionError.errorCode) &&
        Objects.equals(this.errorMessage, creditSessionError.errorMessage) &&
        Objects.equals(this.displayMessage, creditSessionError.displayMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, errorCode, errorMessage, displayMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionError {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
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

