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
import com.plaid.client.model.Pay;
import com.plaid.client.model.TotalCanonicalDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing both the current pay period and year to date amount for a category.
 */
@ApiModel(description = "An object representing both the current pay period and year to date amount for a category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class Total {
  public static final String SERIALIZED_NAME_CANONICAL_DESCRIPTION = "canonical_description";
  @SerializedName(SERIALIZED_NAME_CANONICAL_DESCRIPTION)
  private TotalCanonicalDescription canonicalDescription;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENT_PAY = "current_pay";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAY)
  private Pay currentPay;

  public static final String SERIALIZED_NAME_YTD_PAY = "ytd_pay";
  @SerializedName(SERIALIZED_NAME_YTD_PAY)
  private Pay ytdPay;


  public Total canonicalDescription(TotalCanonicalDescription canonicalDescription) {
    
    this.canonicalDescription = canonicalDescription;
    return this;
  }

   /**
   * Get canonicalDescription
   * @return canonicalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TotalCanonicalDescription getCanonicalDescription() {
    return canonicalDescription;
  }


  public void setCanonicalDescription(TotalCanonicalDescription canonicalDescription) {
    this.canonicalDescription = canonicalDescription;
  }


  public Total description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Text of the line item as printed on the paystub.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text of the line item as printed on the paystub.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Total currentPay(Pay currentPay) {
    
    this.currentPay = currentPay;
    return this;
  }

   /**
   * Get currentPay
   * @return currentPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getCurrentPay() {
    return currentPay;
  }


  public void setCurrentPay(Pay currentPay) {
    this.currentPay = currentPay;
  }


  public Total ytdPay(Pay ytdPay) {
    
    this.ytdPay = ytdPay;
    return this;
  }

   /**
   * Get ytdPay
   * @return ytdPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getYtdPay() {
    return ytdPay;
  }


  public void setYtdPay(Pay ytdPay) {
    this.ytdPay = ytdPay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Total total = (Total) o;
    return Objects.equals(this.canonicalDescription, total.canonicalDescription) &&
        Objects.equals(this.description, total.description) &&
        Objects.equals(this.currentPay, total.currentPay) &&
        Objects.equals(this.ytdPay, total.ytdPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalDescription, description, currentPay, ytdPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Total {\n");
    sb.append("    canonicalDescription: ").append(toIndentedString(canonicalDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentPay: ").append(toIndentedString(currentPay)).append("\n");
    sb.append("    ytdPay: ").append(toIndentedString(ytdPay)).append("\n");
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

