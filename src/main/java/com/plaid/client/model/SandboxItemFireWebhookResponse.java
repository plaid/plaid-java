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
 * SandboxItemFireWebhookResponse defines the response schema for &#x60;/sandbox/item/fire_webhook&#x60;
 */
@ApiModel(description = "SandboxItemFireWebhookResponse defines the response schema for `/sandbox/item/fire_webhook`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class SandboxItemFireWebhookResponse {
  public static final String SERIALIZED_NAME_WEBHOOK_FIRED = "webhook_fired";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_FIRED)
  private Boolean webhookFired;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public SandboxItemFireWebhookResponse webhookFired(Boolean webhookFired) {
    
    this.webhookFired = webhookFired;
    return this;
  }

   /**
   * Value is &#x60;true&#x60;  if the test&#x60; webhook_code&#x60;  was successfully fired.
   * @return webhookFired
  **/
  @ApiModelProperty(required = true, value = "Value is `true`  if the test` webhook_code`  was successfully fired.")

  public Boolean getWebhookFired() {
    return webhookFired;
  }


  public void setWebhookFired(Boolean webhookFired) {
    this.webhookFired = webhookFired;
  }


  public SandboxItemFireWebhookResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxItemFireWebhookResponse sandboxItemFireWebhookResponse = (SandboxItemFireWebhookResponse) o;
    return Objects.equals(this.webhookFired, sandboxItemFireWebhookResponse.webhookFired) &&
        Objects.equals(this.requestId, sandboxItemFireWebhookResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookFired, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxItemFireWebhookResponse {\n");
    sb.append("    webhookFired: ").append(toIndentedString(webhookFired)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

