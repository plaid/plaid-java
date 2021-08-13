/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.20.6
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
import com.plaid.client.model.InstitutionsSearchPaymentInitiationOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional object to filter &#x60;/institutions/search&#x60; results.
 */
@ApiModel(description = "An optional object to filter `/institutions/search` results.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-13T23:02:46.991Z[GMT]")
public class InstitutionsSearchRequestOptions {
  public static final String SERIALIZED_NAME_OAUTH = "oauth";
  @SerializedName(SERIALIZED_NAME_OAUTH)
  private Boolean oauth;

  public static final String SERIALIZED_NAME_INCLUDE_OPTIONAL_METADATA = "include_optional_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OPTIONAL_METADATA)
  private Boolean includeOptionalMetadata;

  public static final String SERIALIZED_NAME_INCLUDE_PAYMENT_INITIATION_METADATA = "include_payment_initiation_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAYMENT_INITIATION_METADATA)
  private Boolean includePaymentInitiationMetadata = false;

  public static final String SERIALIZED_NAME_PAYMENT_INITIATION = "payment_initiation";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INITIATION)
  private InstitutionsSearchPaymentInitiationOptions paymentInitiation;


  public InstitutionsSearchRequestOptions oauth(Boolean oauth) {
    
    this.oauth = oauth;
    return this;
  }

   /**
   * Limit results to institutions with or without OAuth login flows. This is primarily relevant to institutions with European country codes
   * @return oauth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit results to institutions with or without OAuth login flows. This is primarily relevant to institutions with European country codes")

  public Boolean getOauth() {
    return oauth;
  }


  public void setOauth(Boolean oauth) {
    this.oauth = oauth;
  }


  public InstitutionsSearchRequestOptions includeOptionalMetadata(Boolean includeOptionalMetadata) {
    
    this.includeOptionalMetadata = includeOptionalMetadata;
    return this;
  }

   /**
   * When true, return the institution&#39;s homepage URL, logo and primary brand color.
   * @return includeOptionalMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, return the institution's homepage URL, logo and primary brand color.")

  public Boolean getIncludeOptionalMetadata() {
    return includeOptionalMetadata;
  }


  public void setIncludeOptionalMetadata(Boolean includeOptionalMetadata) {
    this.includeOptionalMetadata = includeOptionalMetadata;
  }


  public InstitutionsSearchRequestOptions includePaymentInitiationMetadata(Boolean includePaymentInitiationMetadata) {
    
    this.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
    return this;
  }

   /**
   * When &#x60;true&#x60;, returns metadata related to the Payment Initiation product indicating which payment configurations are supported.
   * @return includePaymentInitiationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, returns metadata related to the Payment Initiation product indicating which payment configurations are supported.")

  public Boolean getIncludePaymentInitiationMetadata() {
    return includePaymentInitiationMetadata;
  }


  public void setIncludePaymentInitiationMetadata(Boolean includePaymentInitiationMetadata) {
    this.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
  }


  public InstitutionsSearchRequestOptions paymentInitiation(InstitutionsSearchPaymentInitiationOptions paymentInitiation) {
    
    this.paymentInitiation = paymentInitiation;
    return this;
  }

   /**
   * Get paymentInitiation
   * @return paymentInitiation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstitutionsSearchPaymentInitiationOptions getPaymentInitiation() {
    return paymentInitiation;
  }


  public void setPaymentInitiation(InstitutionsSearchPaymentInitiationOptions paymentInitiation) {
    this.paymentInitiation = paymentInitiation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsSearchRequestOptions institutionsSearchRequestOptions = (InstitutionsSearchRequestOptions) o;
    return Objects.equals(this.oauth, institutionsSearchRequestOptions.oauth) &&
        Objects.equals(this.includeOptionalMetadata, institutionsSearchRequestOptions.includeOptionalMetadata) &&
        Objects.equals(this.includePaymentInitiationMetadata, institutionsSearchRequestOptions.includePaymentInitiationMetadata) &&
        Objects.equals(this.paymentInitiation, institutionsSearchRequestOptions.paymentInitiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauth, includeOptionalMetadata, includePaymentInitiationMetadata, paymentInitiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsSearchRequestOptions {\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    includeOptionalMetadata: ").append(toIndentedString(includeOptionalMetadata)).append("\n");
    sb.append("    includePaymentInitiationMetadata: ").append(toIndentedString(includePaymentInitiationMetadata)).append("\n");
    sb.append("    paymentInitiation: ").append(toIndentedString(paymentInitiation)).append("\n");
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

