/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class AssetTransactionDescription {
  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_DESCRIPTION = "AssetTransactionDescription";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_DESCRIPTION)
  private String assetTransactionDescription;


  public AssetTransactionDescription assetTransactionDescription(String assetTransactionDescription) {
    
    this.assetTransactionDescription = assetTransactionDescription;
    return this;
  }

   /**
   * Asset Transaction Description String up to 3 occurances 1 required.
   * @return assetTransactionDescription
  **/
  @ApiModelProperty(required = true, value = "Asset Transaction Description String up to 3 occurances 1 required.")

  public String getAssetTransactionDescription() {
    return assetTransactionDescription;
  }


  public void setAssetTransactionDescription(String assetTransactionDescription) {
    this.assetTransactionDescription = assetTransactionDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetTransactionDescription assetTransactionDescription = (AssetTransactionDescription) o;
    return Objects.equals(this.assetTransactionDescription, assetTransactionDescription.assetTransactionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTransactionDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetTransactionDescription {\n");
    sb.append("    assetTransactionDescription: ").append(toIndentedString(assetTransactionDescription)).append("\n");
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

