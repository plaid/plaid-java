/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.PaymentAmountCurrency;
import com.plaid.client.model.PaymentAmountNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The amount and currency of a payment
 */
@ApiModel(description = "The amount and currency of a payment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class PaymentAmountToRefund {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private PaymentAmountCurrency currency;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;


  public PaymentAmountToRefund currency(PaymentAmountCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentAmountCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(PaymentAmountCurrency currency) {
    this.currency = currency;
  }


  public PaymentAmountToRefund value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount of the payment. Must contain at most two digits of precision e.g. &#x60;1.23&#x60;.
   * minimum: 0.01
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The amount of the payment. Must contain at most two digits of precision e.g. `1.23`.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAmountToRefund paymentAmountToRefund = (PaymentAmountToRefund) o;
    return Objects.equals(this.currency, paymentAmountToRefund.currency) &&
        Objects.equals(this.value, paymentAmountToRefund.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAmountToRefund {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

