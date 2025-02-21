/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.IDNumberType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The ID number associated with a Beacon User.
 */
@ApiModel(description = "The ID number associated with a Beacon User.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class BeaconUserIDNumber {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private IDNumberType type;


  public BeaconUserIDNumber value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of identity document value typed in by user. Alpha-numeric, with all formatting characters stripped. For specific format requirements by ID type, see [Hybrid Input Validation](https://plaid.com/docs/identity-verification/hybrid-input-validation/).
   * @return value
  **/
  @ApiModelProperty(example = "123456789", required = true, value = "Value of identity document value typed in by user. Alpha-numeric, with all formatting characters stripped. For specific format requirements by ID type, see [Hybrid Input Validation](https://plaid.com/docs/identity-verification/hybrid-input-validation/).")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public BeaconUserIDNumber type(IDNumberType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public IDNumberType getType() {
    return type;
  }


  public void setType(IDNumberType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconUserIDNumber beaconUserIDNumber = (BeaconUserIDNumber) o;
    return Objects.equals(this.value, beaconUserIDNumber.value) &&
        Objects.equals(this.type, beaconUserIDNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconUserIDNumber {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

