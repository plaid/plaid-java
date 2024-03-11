/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
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
import com.plaid.client.model.ExternalPaymentInitiationConsentOptions;
import com.plaid.client.model.PaymentInitiationConsentConstraints;
import com.plaid.client.model.PaymentInitiationConsentScope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * PaymentInitiationConsentCreateRequest defines the request schema for &#x60;/payment_initiation/consent/create&#x60;
 */
@ApiModel(description = "PaymentInitiationConsentCreateRequest defines the request schema for `/payment_initiation/consent/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class PaymentInitiationConsentCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private Set<PaymentInitiationConsentScope> scopes = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
  @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
  private PaymentInitiationConsentConstraints constraints;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ExternalPaymentInitiationConsentOptions options;


  public PaymentInitiationConsentCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PaymentInitiationConsentCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public PaymentInitiationConsentCreateRequest recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient the payment consent is for. The created consent can be used to transfer funds to this recipient only.
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the recipient the payment consent is for. The created consent can be used to transfer funds to this recipient only.")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationConsentCreateRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the payment consent. This must be an alphanumeric string with at most 18 characters and must not contain any special characters.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the payment consent. This must be an alphanumeric string with at most 18 characters and must not contain any special characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationConsentCreateRequest scopes(Set<PaymentInitiationConsentScope> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public PaymentInitiationConsentCreateRequest addScopesItem(PaymentInitiationConsentScope scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * An array of payment consent scopes.
   * @return scopes
  **/
  @ApiModelProperty(required = true, value = "An array of payment consent scopes.")

  public Set<PaymentInitiationConsentScope> getScopes() {
    return scopes;
  }


  public void setScopes(Set<PaymentInitiationConsentScope> scopes) {
    this.scopes = scopes;
  }


  public PaymentInitiationConsentCreateRequest constraints(PaymentInitiationConsentConstraints constraints) {
    
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentConstraints getConstraints() {
    return constraints;
  }


  public void setConstraints(PaymentInitiationConsentConstraints constraints) {
    this.constraints = constraints;
  }


  public PaymentInitiationConsentCreateRequest options(ExternalPaymentInitiationConsentOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentInitiationConsentOptions getOptions() {
    return options;
  }


  public void setOptions(ExternalPaymentInitiationConsentOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationConsentCreateRequest paymentInitiationConsentCreateRequest = (PaymentInitiationConsentCreateRequest) o;
    return Objects.equals(this.clientId, paymentInitiationConsentCreateRequest.clientId) &&
        Objects.equals(this.secret, paymentInitiationConsentCreateRequest.secret) &&
        Objects.equals(this.recipientId, paymentInitiationConsentCreateRequest.recipientId) &&
        Objects.equals(this.reference, paymentInitiationConsentCreateRequest.reference) &&
        Objects.equals(this.scopes, paymentInitiationConsentCreateRequest.scopes) &&
        Objects.equals(this.constraints, paymentInitiationConsentCreateRequest.constraints) &&
        Objects.equals(this.options, paymentInitiationConsentCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, recipientId, reference, scopes, constraints, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

