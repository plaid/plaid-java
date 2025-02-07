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
import com.plaid.client.model.LinkDeliveryWebhookCommunicationMethod;
import com.plaid.client.model.LinkDeliveryWebhookDeliveryStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information related to the related to the delivery of the link session to users
 */
@ApiModel(description = "Information related to the related to the delivery of the link session to users")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class LinkDeliveryMetadata {
  public static final String SERIALIZED_NAME_COMMUNICATION_METHOD = "communication_method";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_METHOD)
  private LinkDeliveryWebhookCommunicationMethod communicationMethod;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "delivery_status";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private LinkDeliveryWebhookDeliveryStatus deliveryStatus;


  public LinkDeliveryMetadata communicationMethod(LinkDeliveryWebhookCommunicationMethod communicationMethod) {
    
    this.communicationMethod = communicationMethod;
    return this;
  }

   /**
   * Get communicationMethod
   * @return communicationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkDeliveryWebhookCommunicationMethod getCommunicationMethod() {
    return communicationMethod;
  }


  public void setCommunicationMethod(LinkDeliveryWebhookCommunicationMethod communicationMethod) {
    this.communicationMethod = communicationMethod;
  }


  public LinkDeliveryMetadata deliveryStatus(LinkDeliveryWebhookDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkDeliveryWebhookDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(LinkDeliveryWebhookDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDeliveryMetadata linkDeliveryMetadata = (LinkDeliveryMetadata) o;
    return Objects.equals(this.communicationMethod, linkDeliveryMetadata.communicationMethod) &&
        Objects.equals(this.deliveryStatus, linkDeliveryMetadata.deliveryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationMethod, deliveryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryMetadata {\n");
    sb.append("    communicationMethod: ").append(toIndentedString(communicationMethod)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
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

