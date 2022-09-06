/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
import com.plaid.client.model.AssetHolderName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class AssetHolder {
  public static final String SERIALIZED_NAME_N_A_M_E = "NAME";
  @SerializedName(SERIALIZED_NAME_N_A_M_E)
  private AssetHolderName NAME;


  public AssetHolder NAME(AssetHolderName NAME) {
    
    this.NAME = NAME;
    return this;
  }

   /**
   * Get NAME
   * @return NAME
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetHolderName getNAME() {
    return NAME;
  }


  public void setNAME(AssetHolderName NAME) {
    this.NAME = NAME;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetHolder assetHolder = (AssetHolder) o;
    return Objects.equals(this.NAME, assetHolder.NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetHolder {\n");
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
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
