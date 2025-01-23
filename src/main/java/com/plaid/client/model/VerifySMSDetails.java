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
import com.plaid.client.model.SMSVerification;
import com.plaid.client.model.VerifySMSDetailsStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional information for the &#x60;verify_sms&#x60; step.
 */
@ApiModel(description = "Additional information for the `verify_sms` step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class VerifySMSDetails {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VerifySMSDetailsStatus status;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private List<SMSVerification> verifications = new ArrayList<>();


  public VerifySMSDetails status(VerifySMSDetailsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public VerifySMSDetailsStatus getStatus() {
    return status;
  }


  public void setStatus(VerifySMSDetailsStatus status) {
    this.status = status;
  }


  public VerifySMSDetails verifications(List<SMSVerification> verifications) {
    
    this.verifications = verifications;
    return this;
  }

  public VerifySMSDetails addVerificationsItem(SMSVerification verificationsItem) {
    this.verifications.add(verificationsItem);
    return this;
  }

   /**
   * An array where each entry represents a verification attempt for the &#x60;verify_sms&#x60; step. Each entry represents one user-submitted phone number. Phone number edits, and in some cases error handling due to edge cases like rate limiting, may generate additional verifications.
   * @return verifications
  **/
  @ApiModelProperty(required = true, value = "An array where each entry represents a verification attempt for the `verify_sms` step. Each entry represents one user-submitted phone number. Phone number edits, and in some cases error handling due to edge cases like rate limiting, may generate additional verifications.")

  public List<SMSVerification> getVerifications() {
    return verifications;
  }


  public void setVerifications(List<SMSVerification> verifications) {
    this.verifications = verifications;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifySMSDetails verifySMSDetails = (VerifySMSDetails) o;
    return Objects.equals(this.status, verifySMSDetails.status) &&
        Objects.equals(this.verifications, verifySMSDetails.verifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, verifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifySMSDetails {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
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

