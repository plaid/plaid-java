/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * Contains the supported service types in RTP
 */
@ApiModel(description = "Contains the supported service types in RTP")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class TransferCapabilitiesGetRTP {
  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private Boolean credit = false;


  public TransferCapabilitiesGetRTP credit(Boolean credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * When &#x60;true&#x60;, the linked Item&#39;s institution supports RTP credit transfer.
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, the linked Item's institution supports RTP credit transfer.")

  public Boolean getCredit() {
    return credit;
  }


  public void setCredit(Boolean credit) {
    this.credit = credit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCapabilitiesGetRTP transferCapabilitiesGetRTP = (TransferCapabilitiesGetRTP) o;
    return Objects.equals(this.credit, transferCapabilitiesGetRTP.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCapabilitiesGetRTP {\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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

