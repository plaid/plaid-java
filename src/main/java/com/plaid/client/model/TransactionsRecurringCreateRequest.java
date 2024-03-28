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
import com.plaid.client.model.TransactionsRecurringCreateInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsRecurringCreateRequest defined the request schema for &#x60;/transactions/recurring/streams/create&#x60; endpoint.
 */
@ApiModel(description = "TransactionsRecurringCreateRequest defined the request schema for `/transactions/recurring/streams/create` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T19:43:00.996446Z[Etc/UTC]")
public class TransactionsRecurringCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private List<TransactionsRecurringCreateInput> inputs = new ArrayList<>();


  public TransactionsRecurringCreateRequest clientId(String clientId) {
    
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


  public TransactionsRecurringCreateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The access token associated with the Item data is being requested for.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public TransactionsRecurringCreateRequest secret(String secret) {
    
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


  public TransactionsRecurringCreateRequest inputs(List<TransactionsRecurringCreateInput> inputs) {
    
    this.inputs = inputs;
    return this;
  }

  public TransactionsRecurringCreateRequest addInputsItem(TransactionsRecurringCreateInput inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * A list of all the operations to be performed. This will either all succeed or all fail.
   * @return inputs
  **/
  @ApiModelProperty(required = true, value = "A list of all the operations to be performed. This will either all succeed or all fail.")

  public List<TransactionsRecurringCreateInput> getInputs() {
    return inputs;
  }


  public void setInputs(List<TransactionsRecurringCreateInput> inputs) {
    this.inputs = inputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRecurringCreateRequest transactionsRecurringCreateRequest = (TransactionsRecurringCreateRequest) o;
    return Objects.equals(this.clientId, transactionsRecurringCreateRequest.clientId) &&
        Objects.equals(this.accessToken, transactionsRecurringCreateRequest.accessToken) &&
        Objects.equals(this.secret, transactionsRecurringCreateRequest.secret) &&
        Objects.equals(this.inputs, transactionsRecurringCreateRequest.inputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, accessToken, secret, inputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRecurringCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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

