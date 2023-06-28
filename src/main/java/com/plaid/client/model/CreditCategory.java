/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
 * Information describing the intent of the transaction. Most relevant for credit use cases, but not limited to such use cases. Please reach out to your account manager or sales representative if you would like to receive this field.  See the [&#x60;taxonomy csv file&#x60;](https://plaid.com/documents/credit-category-taxonomy.csv) for a full list of credit categories.
 */
@ApiModel(description = "Information describing the intent of the transaction. Most relevant for credit use cases, but not limited to such use cases. Please reach out to your account manager or sales representative if you would like to receive this field.  See the [`taxonomy csv file`](https://plaid.com/documents/credit-category-taxonomy.csv) for a full list of credit categories.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class CreditCategory {
  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private String primary;

  public static final String SERIALIZED_NAME_DETAILED = "detailed";
  @SerializedName(SERIALIZED_NAME_DETAILED)
  private String detailed;


  public CreditCategory primary(String primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * A high level category that communicates the broad category of the transaction.
   * @return primary
  **/
  @ApiModelProperty(required = true, value = "A high level category that communicates the broad category of the transaction.")

  public String getPrimary() {
    return primary;
  }


  public void setPrimary(String primary) {
    this.primary = primary;
  }


  public CreditCategory detailed(String detailed) {
    
    this.detailed = detailed;
    return this;
  }

   /**
   * A granular category conveying the transaction&#39;s intent. This field can also be used as a unique identifier for the category.
   * @return detailed
  **/
  @ApiModelProperty(required = true, value = "A granular category conveying the transaction's intent. This field can also be used as a unique identifier for the category.")

  public String getDetailed() {
    return detailed;
  }


  public void setDetailed(String detailed) {
    this.detailed = detailed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCategory creditCategory = (CreditCategory) o;
    return Objects.equals(this.primary, creditCategory.primary) &&
        Objects.equals(this.detailed, creditCategory.detailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, detailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCategory {\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
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

