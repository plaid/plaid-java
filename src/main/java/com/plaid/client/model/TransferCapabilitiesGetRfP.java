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
 * Contains the supported service types in RfP
 */
@ApiModel(description = "Contains the supported service types in RfP")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class TransferCapabilitiesGetRfP {
  public static final String SERIALIZED_NAME_DEBIT = "debit";
  @SerializedName(SERIALIZED_NAME_DEBIT)
  private Boolean debit = false;


  public TransferCapabilitiesGetRfP debit(Boolean debit) {
    
    this.debit = debit;
    return this;
  }

   /**
   * When &#x60;true&#x60;, the linked Item&#39;s institution supports RfP debit transfer.
   * @return debit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, the linked Item's institution supports RfP debit transfer.")

  public Boolean getDebit() {
    return debit;
  }


  public void setDebit(Boolean debit) {
    this.debit = debit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCapabilitiesGetRfP transferCapabilitiesGetRfP = (TransferCapabilitiesGetRfP) o;
    return Objects.equals(this.debit, transferCapabilitiesGetRfP.debit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCapabilitiesGetRfP {\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
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

