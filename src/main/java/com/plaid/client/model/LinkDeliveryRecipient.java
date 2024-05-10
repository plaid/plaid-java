/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
import com.plaid.client.model.LinkDeliveryCommunicationMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata related to the recipient. If the information required to populate this field is not available, leave it blank.
 */
@ApiModel(description = "Metadata related to the recipient. If the information required to populate this field is not available, leave it blank.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class LinkDeliveryRecipient {
  public static final String SERIALIZED_NAME_COMMUNICATION_METHODS = "communication_methods";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_METHODS)
  private List<LinkDeliveryCommunicationMethod> communicationMethods = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;


  public LinkDeliveryRecipient communicationMethods(List<LinkDeliveryCommunicationMethod> communicationMethods) {
    
    this.communicationMethods = communicationMethods;
    return this;
  }

  public LinkDeliveryRecipient addCommunicationMethodsItem(LinkDeliveryCommunicationMethod communicationMethodsItem) {
    if (this.communicationMethods == null) {
      this.communicationMethods = new ArrayList<>();
    }
    this.communicationMethods.add(communicationMethodsItem);
    return this;
  }

   /**
   * The list of communication methods to send the Hosted Link session URL to. If delivery is not required, leave this field blank.
   * @return communicationMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of communication methods to send the Hosted Link session URL to. If delivery is not required, leave this field blank.")

  public List<LinkDeliveryCommunicationMethod> getCommunicationMethods() {
    return communicationMethods;
  }


  public void setCommunicationMethods(List<LinkDeliveryCommunicationMethod> communicationMethods) {
    this.communicationMethods = communicationMethods;
  }


  public LinkDeliveryRecipient firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the recipient. Will be used in the body of the email / text (if configured). If this information is not available, leave this field blank.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First name of the recipient. Will be used in the body of the email / text (if configured). If this information is not available, leave this field blank.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDeliveryRecipient linkDeliveryRecipient = (LinkDeliveryRecipient) o;
    return Objects.equals(this.communicationMethods, linkDeliveryRecipient.communicationMethods) &&
        Objects.equals(this.firstName, linkDeliveryRecipient.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationMethods, firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryRecipient {\n");
    sb.append("    communicationMethods: ").append(toIndentedString(communicationMethods)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

