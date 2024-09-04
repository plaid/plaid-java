/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when an end user has completed a step of the Identity Verification process.
 */
@ApiModel(description = "Fired when an end user has completed a step of the Identity Verification process.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class IdentityVerificationStepUpdatedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_ID = "identity_verification_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_ID)
  private String identityVerificationId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public IdentityVerificationStepUpdatedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;IDENTITY_VERIFICATION&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`IDENTITY_VERIFICATION`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IdentityVerificationStepUpdatedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;STEP_UPDATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`STEP_UPDATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IdentityVerificationStepUpdatedWebhook identityVerificationId(String identityVerificationId) {
    
    this.identityVerificationId = identityVerificationId;
    return this;
  }

   /**
   * The ID of the associated Identity Verification attempt.
   * @return identityVerificationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated Identity Verification attempt.")

  public String getIdentityVerificationId() {
    return identityVerificationId;
  }


  public void setIdentityVerificationId(String identityVerificationId) {
    this.identityVerificationId = identityVerificationId;
  }


  public IdentityVerificationStepUpdatedWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationStepUpdatedWebhook identityVerificationStepUpdatedWebhook = (IdentityVerificationStepUpdatedWebhook) o;
    return Objects.equals(this.webhookType, identityVerificationStepUpdatedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, identityVerificationStepUpdatedWebhook.webhookCode) &&
        Objects.equals(this.identityVerificationId, identityVerificationStepUpdatedWebhook.identityVerificationId) &&
        Objects.equals(this.environment, identityVerificationStepUpdatedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, identityVerificationId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationStepUpdatedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    identityVerificationId: ").append(toIndentedString(identityVerificationId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

