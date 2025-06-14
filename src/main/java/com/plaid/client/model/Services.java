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
import com.plaid.client.model.Service;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A collection of objects that describe requests and responses for services.
 */
@ApiModel(description = "A collection of objects that describe requests and responses for services.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class Services {
  public static final String SERIALIZED_NAME_S_E_R_V_I_C_E = "SERVICE";
  @SerializedName(SERIALIZED_NAME_S_E_R_V_I_C_E)
  private Service SERVICE;


  public Services SERVICE(Service SERVICE) {
    
    this.SERVICE = SERVICE;
    return this;
  }

   /**
   * Get SERVICE
   * @return SERVICE
  **/
  @ApiModelProperty(required = true, value = "")

  public Service getSERVICE() {
    return SERVICE;
  }


  public void setSERVICE(Service SERVICE) {
    this.SERVICE = SERVICE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Services services = (Services) o;
    return Objects.equals(this.SERVICE, services.SERVICE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SERVICE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Services {\n");
    sb.append("    SERVICE: ").append(toIndentedString(SERVICE)).append("\n");
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

