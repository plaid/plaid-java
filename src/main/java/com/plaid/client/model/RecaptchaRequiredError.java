/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.0
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
 * The request was flagged by Plaid&#39;s fraud system, and requires additional verification to ensure they are not a bot.
 */
@ApiModel(description = "The request was flagged by Plaid's fraud system, and requires additional verification to ensure they are not a bot.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-30T23:52:40.867Z[GMT]")
public class RecaptchaRequiredError {
  public static final String SERIALIZED_NAME_ERROR_TYPE = "error_type";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_DISPLAY_MESSAGE = "display_message";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MESSAGE)
  private String displayMessage;

  public static final String SERIALIZED_NAME_HTTP_CODE = "http_code";
  @SerializedName(SERIALIZED_NAME_HTTP_CODE)
  private String httpCode;

  public static final String SERIALIZED_NAME_LINK_USER_EXPERIENCE = "link_user_experience";
  @SerializedName(SERIALIZED_NAME_LINK_USER_EXPERIENCE)
  private String linkUserExperience;

  public static final String SERIALIZED_NAME_COMMON_CAUSES = "common_causes";
  @SerializedName(SERIALIZED_NAME_COMMON_CAUSES)
  private String commonCauses;

  public static final String SERIALIZED_NAME_TROUBLESHOOTING_STEPS = "troubleshooting_steps";
  @SerializedName(SERIALIZED_NAME_TROUBLESHOOTING_STEPS)
  private String troubleshootingSteps;


  public RecaptchaRequiredError errorType(String errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * RECAPTCHA_ERROR
   * @return errorType
  **/
  @ApiModelProperty(required = true, value = "RECAPTCHA_ERROR")

  public String getErrorType() {
    return errorType;
  }


  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public RecaptchaRequiredError errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * RECAPTCHA_REQUIRED
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "RECAPTCHA_REQUIRED")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public RecaptchaRequiredError displayMessage(String displayMessage) {
    
    this.displayMessage = displayMessage;
    return this;
  }

   /**
   * Get displayMessage
   * @return displayMessage
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDisplayMessage() {
    return displayMessage;
  }


  public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
  }


  public RecaptchaRequiredError httpCode(String httpCode) {
    
    this.httpCode = httpCode;
    return this;
  }

   /**
   * 400
   * @return httpCode
  **/
  @ApiModelProperty(required = true, value = "400")

  public String getHttpCode() {
    return httpCode;
  }


  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }


  public RecaptchaRequiredError linkUserExperience(String linkUserExperience) {
    
    this.linkUserExperience = linkUserExperience;
    return this;
  }

   /**
   * Your user will be prompted to solve a Google reCAPTCHA challenge in the Link Recaptcha pane. If they solve the challenge successfully, the user&#39;s request is resubmitted and they are directed to the next Item creation step.
   * @return linkUserExperience
  **/
  @ApiModelProperty(required = true, value = "Your user will be prompted to solve a Google reCAPTCHA challenge in the Link Recaptcha pane. If they solve the challenge successfully, the user's request is resubmitted and they are directed to the next Item creation step.")

  public String getLinkUserExperience() {
    return linkUserExperience;
  }


  public void setLinkUserExperience(String linkUserExperience) {
    this.linkUserExperience = linkUserExperience;
  }


  public RecaptchaRequiredError commonCauses(String commonCauses) {
    
    this.commonCauses = commonCauses;
    return this;
  }

   /**
   * Plaid&#39;s fraud system detects abusive traffic and considers a variety of parameters throughout Item creation requests. When a request is considered risky or possibly fraudulent, Link presents a reCAPTCHA for the user to solve.
   * @return commonCauses
  **/
  @ApiModelProperty(required = true, value = "Plaid's fraud system detects abusive traffic and considers a variety of parameters throughout Item creation requests. When a request is considered risky or possibly fraudulent, Link presents a reCAPTCHA for the user to solve.")

  public String getCommonCauses() {
    return commonCauses;
  }


  public void setCommonCauses(String commonCauses) {
    this.commonCauses = commonCauses;
  }


  public RecaptchaRequiredError troubleshootingSteps(String troubleshootingSteps) {
    
    this.troubleshootingSteps = troubleshootingSteps;
    return this;
  }

   /**
   * Link will automatically guide your user through reCAPTCHA verification. As a general rule, we recommend instrumenting basic fraud monitoring to detect and protect your website from spam and abuse.  If your user cannot verify their session, please submit a Support ticket with the following identifiers: &#x60;link_session_id&#x60; or &#x60;request_id&#x60;
   * @return troubleshootingSteps
  **/
  @ApiModelProperty(required = true, value = "Link will automatically guide your user through reCAPTCHA verification. As a general rule, we recommend instrumenting basic fraud monitoring to detect and protect your website from spam and abuse.  If your user cannot verify their session, please submit a Support ticket with the following identifiers: `link_session_id` or `request_id`")

  public String getTroubleshootingSteps() {
    return troubleshootingSteps;
  }


  public void setTroubleshootingSteps(String troubleshootingSteps) {
    this.troubleshootingSteps = troubleshootingSteps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecaptchaRequiredError recaptchaRequiredError = (RecaptchaRequiredError) o;
    return Objects.equals(this.errorType, recaptchaRequiredError.errorType) &&
        Objects.equals(this.errorCode, recaptchaRequiredError.errorCode) &&
        Objects.equals(this.displayMessage, recaptchaRequiredError.displayMessage) &&
        Objects.equals(this.httpCode, recaptchaRequiredError.httpCode) &&
        Objects.equals(this.linkUserExperience, recaptchaRequiredError.linkUserExperience) &&
        Objects.equals(this.commonCauses, recaptchaRequiredError.commonCauses) &&
        Objects.equals(this.troubleshootingSteps, recaptchaRequiredError.troubleshootingSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, errorCode, displayMessage, httpCode, linkUserExperience, commonCauses, troubleshootingSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecaptchaRequiredError {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    linkUserExperience: ").append(toIndentedString(linkUserExperience)).append("\n");
    sb.append("    commonCauses: ").append(toIndentedString(commonCauses)).append("\n");
    sb.append("    troubleshootingSteps: ").append(toIndentedString(troubleshootingSteps)).append("\n");
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

