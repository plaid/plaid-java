/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * Specifies options for initializing Link for use with the Payment Initiation (Europe) product. This field is required if &#x60;payment_initiation&#x60; is included in the &#x60;products&#x60; array. Either &#x60;payment_id&#x60; or &#x60;consent_id&#x60; must be provided.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Payment Initiation (Europe) product. This field is required if `payment_initiation` is included in the `products` array. Either `payment_id` or `consent_id` must be provided.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class LinkTokenCreateRequestPaymentInitiation {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;


  public LinkTokenCreateRequestPaymentInitiation paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The &#x60;payment_id&#x60; provided by the &#x60;/payment_initiation/payment/create&#x60; endpoint.
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `payment_id` provided by the `/payment_initiation/payment/create` endpoint.")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public LinkTokenCreateRequestPaymentInitiation consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * The &#x60;consent_id&#x60; provided by the &#x60;/payment_initiation/consent/create&#x60; endpoint.
   * @return consentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `consent_id` provided by the `/payment_initiation/consent/create` endpoint.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestPaymentInitiation linkTokenCreateRequestPaymentInitiation = (LinkTokenCreateRequestPaymentInitiation) o;
    return Objects.equals(this.paymentId, linkTokenCreateRequestPaymentInitiation.paymentId) &&
        Objects.equals(this.consentId, linkTokenCreateRequestPaymentInitiation.consentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, consentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestPaymentInitiation {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

