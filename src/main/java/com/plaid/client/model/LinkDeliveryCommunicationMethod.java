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
import com.plaid.client.model.LinkDeliveryDeliveryMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The communication method containing both the type and address to send the URL.
 */
@ApiModel(description = "The communication method containing both the type and address to send the URL.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkDeliveryCommunicationMethod {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private LinkDeliveryDeliveryMethod method;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;


  public LinkDeliveryCommunicationMethod method(LinkDeliveryDeliveryMethod method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkDeliveryDeliveryMethod getMethod() {
    return method;
  }


  public void setMethod(LinkDeliveryDeliveryMethod method) {
    this.method = method;
  }


  public LinkDeliveryCommunicationMethod address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The phone number / email address that Hosted Link sessions are delivered to. Phone numbers must be in E.164 format.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number / email address that Hosted Link sessions are delivered to. Phone numbers must be in E.164 format.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDeliveryCommunicationMethod linkDeliveryCommunicationMethod = (LinkDeliveryCommunicationMethod) o;
    return Objects.equals(this.method, linkDeliveryCommunicationMethod.method) &&
        Objects.equals(this.address, linkDeliveryCommunicationMethod.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryCommunicationMethod {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

