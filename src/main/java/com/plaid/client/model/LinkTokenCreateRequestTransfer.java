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

/**
 * Specifies options for initializing Link for use with the Transfer product.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Transfer product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkTokenCreateRequestTransfer {
  public static final String SERIALIZED_NAME_INTENT_ID = "intent_id";
  @SerializedName(SERIALIZED_NAME_INTENT_ID)
  private String intentId;

  public static final String SERIALIZED_NAME_AUTHORIZATION_ID = "authorization_id";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_ID)
  private String authorizationId;

  public static final String SERIALIZED_NAME_PAYMENT_PROFILE_TOKEN = "payment_profile_token";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PROFILE_TOKEN)
  private String paymentProfileToken;


  public LinkTokenCreateRequestTransfer intentId(String intentId) {
    
    this.intentId = intentId;
    return this;
  }

   /**
   * The &#x60;id&#x60; returned by the &#x60;/transfer/intent/create&#x60; endpoint.
   * @return intentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `id` returned by the `/transfer/intent/create` endpoint.")

  public String getIntentId() {
    return intentId;
  }


  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }


  public LinkTokenCreateRequestTransfer authorizationId(String authorizationId) {
    
    this.authorizationId = authorizationId;
    return this;
  }

   /**
   * The &#x60;id&#x60; returned by the &#x60;/transfer/authorization/create&#x60; endpoint. Used to indicate Link session to complete required user action in order to make a decision for the authorization. If set, &#x60;access_token&#x60; can be omitted.
   * @return authorizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `id` returned by the `/transfer/authorization/create` endpoint. Used to indicate Link session to complete required user action in order to make a decision for the authorization. If set, `access_token` can be omitted.")

  public String getAuthorizationId() {
    return authorizationId;
  }


  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }


  public LinkTokenCreateRequestTransfer paymentProfileToken(String paymentProfileToken) {
    
    this.paymentProfileToken = paymentProfileToken;
    return this;
  }

   /**
   * The &#x60;payment_profile_token&#x60; returned by the &#x60;/payment_profile/create&#x60; endpoint.
   * @return paymentProfileToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `payment_profile_token` returned by the `/payment_profile/create` endpoint.")

  public String getPaymentProfileToken() {
    return paymentProfileToken;
  }


  public void setPaymentProfileToken(String paymentProfileToken) {
    this.paymentProfileToken = paymentProfileToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestTransfer linkTokenCreateRequestTransfer = (LinkTokenCreateRequestTransfer) o;
    return Objects.equals(this.intentId, linkTokenCreateRequestTransfer.intentId) &&
        Objects.equals(this.authorizationId, linkTokenCreateRequestTransfer.authorizationId) &&
        Objects.equals(this.paymentProfileToken, linkTokenCreateRequestTransfer.paymentProfileToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentId, authorizationId, paymentProfileToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestTransfer {\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    paymentProfileToken: ").append(toIndentedString(paymentProfileToken)).append("\n");
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

