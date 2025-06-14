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
import java.time.LocalDate;

/**
 * Data to populate as test transaction data.
 */
@ApiModel(description = "Data to populate as test transaction data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CustomSandboxTransaction {
  public static final String SERIALIZED_NAME_DATE_TRANSACTED = "date_transacted";
  @SerializedName(SERIALIZED_NAME_DATE_TRANSACTED)
  private LocalDate dateTransacted;

  public static final String SERIALIZED_NAME_DATE_POSTED = "date_posted";
  @SerializedName(SERIALIZED_NAME_DATE_POSTED)
  private LocalDate datePosted;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public CustomSandboxTransaction dateTransacted(LocalDate dateTransacted) {
    
    this.dateTransacted = dateTransacted;
    return this;
  }

   /**
   * The date of the transaction, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Transaction date must be the present date or a date up to 14 days in the past. Future dates are not allowed.
   * @return dateTransacted
  **/
  @ApiModelProperty(required = true, value = "The date of the transaction, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Transaction date must be the present date or a date up to 14 days in the past. Future dates are not allowed.")

  public LocalDate getDateTransacted() {
    return dateTransacted;
  }


  public void setDateTransacted(LocalDate dateTransacted) {
    this.dateTransacted = dateTransacted;
  }


  public CustomSandboxTransaction datePosted(LocalDate datePosted) {
    
    this.datePosted = datePosted;
    return this;
  }

   /**
   * The date the transaction posted, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Posted date must be the present date or a date up to 14 days in the past. Future dates are not allowed.
   * @return datePosted
  **/
  @ApiModelProperty(required = true, value = "The date the transaction posted, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Posted date must be the present date or a date up to 14 days in the past. Future dates are not allowed.")

  public LocalDate getDatePosted() {
    return datePosted;
  }


  public void setDatePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
  }


  public CustomSandboxTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount. Can be negative.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount. Can be negative.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public CustomSandboxTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The transaction description.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The transaction description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomSandboxTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 format currency code for the transaction. Defaults to USD.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 format currency code for the transaction. Defaults to USD.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSandboxTransaction customSandboxTransaction = (CustomSandboxTransaction) o;
    return Objects.equals(this.dateTransacted, customSandboxTransaction.dateTransacted) &&
        Objects.equals(this.datePosted, customSandboxTransaction.datePosted) &&
        Objects.equals(this.amount, customSandboxTransaction.amount) &&
        Objects.equals(this.description, customSandboxTransaction.description) &&
        Objects.equals(this.isoCurrencyCode, customSandboxTransaction.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTransacted, datePosted, amount, description, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSandboxTransaction {\n");
    sb.append("    dateTransacted: ").append(toIndentedString(dateTransacted)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
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

