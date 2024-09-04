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
import com.plaid.client.model.AuthSupportedMethods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Metadata that captures information about the Auth features of an institution.
 */
@ApiModel(description = "Metadata that captures information about the Auth features of an institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class AuthMetadata {
  public static final String SERIALIZED_NAME_SUPPORTED_METHODS = "supported_methods";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_METHODS)
  private AuthSupportedMethods supportedMethods;


  public AuthMetadata supportedMethods(AuthSupportedMethods supportedMethods) {
    
    this.supportedMethods = supportedMethods;
    return this;
  }

   /**
   * Get supportedMethods
   * @return supportedMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AuthSupportedMethods getSupportedMethods() {
    return supportedMethods;
  }


  public void setSupportedMethods(AuthSupportedMethods supportedMethods) {
    this.supportedMethods = supportedMethods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMetadata authMetadata = (AuthMetadata) o;
    return Objects.equals(this.supportedMethods, authMetadata.supportedMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMetadata {\n");
    sb.append("    supportedMethods: ").append(toIndentedString(supportedMethods)).append("\n");
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

