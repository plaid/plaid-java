/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
 * The failure reason if the type of this transfer is &#x60;\&quot;failed\&quot;&#x60; or &#x60;\&quot;reversed\&quot;&#x60;. Null value otherwise.
 */
@ApiModel(description = "The failure reason if the type of this transfer is `\"failed\"` or `\"reversed\"`. Null value otherwise.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class BankTransferFailure {
  public static final String SERIALIZED_NAME_ACH_RETURN_CODE = "ach_return_code";
  @SerializedName(SERIALIZED_NAME_ACH_RETURN_CODE)
  private String achReturnCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public BankTransferFailure achReturnCode(String achReturnCode) {
    
    this.achReturnCode = achReturnCode;
    return this;
  }

   /**
   * The ACH return code, e.g. &#x60;R01&#x60;.  A return code will be provided if and only if the transfer status is &#x60;reversed&#x60;. For a full listing of ACH return codes, see [Bank Transfers errors](https://plaid.com/docs/errors/bank-transfers/#ach-return-codes).
   * @return achReturnCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ACH return code, e.g. `R01`.  A return code will be provided if and only if the transfer status is `reversed`. For a full listing of ACH return codes, see [Bank Transfers errors](https://plaid.com/docs/errors/bank-transfers/#ach-return-codes).")

  public String getAchReturnCode() {
    return achReturnCode;
  }


  public void setAchReturnCode(String achReturnCode) {
    this.achReturnCode = achReturnCode;
  }


  public BankTransferFailure description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the reason for the failure or reversal.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the reason for the failure or reversal.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferFailure bankTransferFailure = (BankTransferFailure) o;
    return Objects.equals(this.achReturnCode, bankTransferFailure.achReturnCode) &&
        Objects.equals(this.description, bankTransferFailure.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achReturnCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferFailure {\n");
    sb.append("    achReturnCode: ").append(toIndentedString(achReturnCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

