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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information specific to wire transfers.
 */
@ApiModel(description = "Information specific to wire transfers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class TransferWireDetails {
  public static final String SERIALIZED_NAME_MESSAGE_TO_BENEFICIARY = "message_to_beneficiary";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TO_BENEFICIARY)
  private String messageToBeneficiary;


  public TransferWireDetails messageToBeneficiary(String messageToBeneficiary) {
    
    this.messageToBeneficiary = messageToBeneficiary;
    return this;
  }

   /**
   * Additional information from the wire originator to the beneficiary. Max 140 characters.
   * @return messageToBeneficiary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information from the wire originator to the beneficiary. Max 140 characters.")

  public String getMessageToBeneficiary() {
    return messageToBeneficiary;
  }


  public void setMessageToBeneficiary(String messageToBeneficiary) {
    this.messageToBeneficiary = messageToBeneficiary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferWireDetails transferWireDetails = (TransferWireDetails) o;
    return Objects.equals(this.messageToBeneficiary, transferWireDetails.messageToBeneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageToBeneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferWireDetails {\n");
    sb.append("    messageToBeneficiary: ").append(toIndentedString(messageToBeneficiary)).append("\n");
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

