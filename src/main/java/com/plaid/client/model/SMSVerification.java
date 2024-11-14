/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.SMSVerificationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Additional information for the individual SMS verification.
 */
@ApiModel(description = "Additional information for the individual SMS verification.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class SMSVerification {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SMSVerificationStatus status;

  public static final String SERIALIZED_NAME_ATTEMPT = "attempt";
  @SerializedName(SERIALIZED_NAME_ATTEMPT)
  private Integer attempt;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_DELIVERY_ATTEMPT_COUNT = "delivery_attempt_count";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ATTEMPT_COUNT)
  private Integer deliveryAttemptCount;

  public static final String SERIALIZED_NAME_SOLVE_ATTEMPT_COUNT = "solve_attempt_count";
  @SerializedName(SERIALIZED_NAME_SOLVE_ATTEMPT_COUNT)
  private Integer solveAttemptCount;

  public static final String SERIALIZED_NAME_INITIALLY_SENT_AT = "initially_sent_at";
  @SerializedName(SERIALIZED_NAME_INITIALLY_SENT_AT)
  private OffsetDateTime initiallySentAt;

  public static final String SERIALIZED_NAME_LAST_SENT_AT = "last_sent_at";
  @SerializedName(SERIALIZED_NAME_LAST_SENT_AT)
  private OffsetDateTime lastSentAt;

  public static final String SERIALIZED_NAME_REDACTED_AT = "redacted_at";
  @SerializedName(SERIALIZED_NAME_REDACTED_AT)
  private OffsetDateTime redactedAt;


  public SMSVerification status(SMSVerificationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public SMSVerificationStatus getStatus() {
    return status;
  }


  public void setStatus(SMSVerificationStatus status) {
    this.status = status;
  }


  public SMSVerification attempt(Integer attempt) {
    
    this.attempt = attempt;
    return this;
  }

   /**
   * The attempt field begins with 1 and increments with each subsequent SMS verification.
   * @return attempt
  **/
  @ApiModelProperty(example = "1", required = true, value = "The attempt field begins with 1 and increments with each subsequent SMS verification.")

  public Integer getAttempt() {
    return attempt;
  }


  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }


  public SMSVerification phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number in E.164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+12345678909", required = true, value = "A phone number in E.164 format.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public SMSVerification deliveryAttemptCount(Integer deliveryAttemptCount) {
    
    this.deliveryAttemptCount = deliveryAttemptCount;
    return this;
  }

   /**
   * The number of delivery attempts made within the verification to send the SMS code to the user. Each delivery attempt represents the user taking action from the front end UI to request creation and delivery of a new SMS verification code, or to resend an existing SMS verification code. There is a limit of 3 delivery attempts per verification.
   * @return deliveryAttemptCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The number of delivery attempts made within the verification to send the SMS code to the user. Each delivery attempt represents the user taking action from the front end UI to request creation and delivery of a new SMS verification code, or to resend an existing SMS verification code. There is a limit of 3 delivery attempts per verification.")

  public Integer getDeliveryAttemptCount() {
    return deliveryAttemptCount;
  }


  public void setDeliveryAttemptCount(Integer deliveryAttemptCount) {
    this.deliveryAttemptCount = deliveryAttemptCount;
  }


  public SMSVerification solveAttemptCount(Integer solveAttemptCount) {
    
    this.solveAttemptCount = solveAttemptCount;
    return this;
  }

   /**
   * The number of attempts made by the user within the verification to verify the SMS code by entering it into the front end UI. There is a limit of 3 solve attempts per verification.
   * @return solveAttemptCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The number of attempts made by the user within the verification to verify the SMS code by entering it into the front end UI. There is a limit of 3 solve attempts per verification.")

  public Integer getSolveAttemptCount() {
    return solveAttemptCount;
  }


  public void setSolveAttemptCount(Integer solveAttemptCount) {
    this.solveAttemptCount = solveAttemptCount;
  }


  public SMSVerification initiallySentAt(OffsetDateTime initiallySentAt) {
    
    this.initiallySentAt = initiallySentAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return initiallySentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getInitiallySentAt() {
    return initiallySentAt;
  }


  public void setInitiallySentAt(OffsetDateTime initiallySentAt) {
    this.initiallySentAt = initiallySentAt;
  }


  public SMSVerification lastSentAt(OffsetDateTime lastSentAt) {
    
    this.lastSentAt = lastSentAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return lastSentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getLastSentAt() {
    return lastSentAt;
  }


  public void setLastSentAt(OffsetDateTime lastSentAt) {
    this.lastSentAt = lastSentAt;
  }


  public SMSVerification redactedAt(OffsetDateTime redactedAt) {
    
    this.redactedAt = redactedAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return redactedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getRedactedAt() {
    return redactedAt;
  }


  public void setRedactedAt(OffsetDateTime redactedAt) {
    this.redactedAt = redactedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSVerification smSVerification = (SMSVerification) o;
    return Objects.equals(this.status, smSVerification.status) &&
        Objects.equals(this.attempt, smSVerification.attempt) &&
        Objects.equals(this.phoneNumber, smSVerification.phoneNumber) &&
        Objects.equals(this.deliveryAttemptCount, smSVerification.deliveryAttemptCount) &&
        Objects.equals(this.solveAttemptCount, smSVerification.solveAttemptCount) &&
        Objects.equals(this.initiallySentAt, smSVerification.initiallySentAt) &&
        Objects.equals(this.lastSentAt, smSVerification.lastSentAt) &&
        Objects.equals(this.redactedAt, smSVerification.redactedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, attempt, phoneNumber, deliveryAttemptCount, solveAttemptCount, initiallySentAt, lastSentAt, redactedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSVerification {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    deliveryAttemptCount: ").append(toIndentedString(deliveryAttemptCount)).append("\n");
    sb.append("    solveAttemptCount: ").append(toIndentedString(solveAttemptCount)).append("\n");
    sb.append("    initiallySentAt: ").append(toIndentedString(initiallySentAt)).append("\n");
    sb.append("    lastSentAt: ").append(toIndentedString(lastSentAt)).append("\n");
    sb.append("    redactedAt: ").append(toIndentedString(redactedAt)).append("\n");
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

