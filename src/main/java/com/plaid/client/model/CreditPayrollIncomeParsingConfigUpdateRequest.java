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
import com.plaid.client.model.IncomeVerificationDocParsingConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreditPayrollIncomeParsingConfigUpdateRequest defines the request schema for &#x60;/credit/payroll_income/documents/update&#x60;.
 */
@ApiModel(description = "CreditPayrollIncomeParsingConfigUpdateRequest defines the request schema for `/credit/payroll_income/documents/update`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class CreditPayrollIncomeParsingConfigUpdateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_PARSING_CONFIG = "parsing_config";
  @SerializedName(SERIALIZED_NAME_PARSING_CONFIG)
  private List<IncomeVerificationDocParsingConfig> parsingConfig = new ArrayList<>();


  public CreditPayrollIncomeParsingConfigUpdateRequest clientId(String clientId) {
    
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


  public CreditPayrollIncomeParsingConfigUpdateRequest secret(String secret) {
    
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


  public CreditPayrollIncomeParsingConfigUpdateRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public CreditPayrollIncomeParsingConfigUpdateRequest itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditPayrollIncomeParsingConfigUpdateRequest parsingConfig(List<IncomeVerificationDocParsingConfig> parsingConfig) {
    
    this.parsingConfig = parsingConfig;
    return this;
  }

  public CreditPayrollIncomeParsingConfigUpdateRequest addParsingConfigItem(IncomeVerificationDocParsingConfig parsingConfigItem) {
    this.parsingConfig.add(parsingConfigItem);
    return this;
  }

   /**
   * The types of analysis to enable for the document income verification session
   * @return parsingConfig
  **/
  @ApiModelProperty(required = true, value = "The types of analysis to enable for the document income verification session")

  public List<IncomeVerificationDocParsingConfig> getParsingConfig() {
    return parsingConfig;
  }


  public void setParsingConfig(List<IncomeVerificationDocParsingConfig> parsingConfig) {
    this.parsingConfig = parsingConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayrollIncomeParsingConfigUpdateRequest creditPayrollIncomeParsingConfigUpdateRequest = (CreditPayrollIncomeParsingConfigUpdateRequest) o;
    return Objects.equals(this.clientId, creditPayrollIncomeParsingConfigUpdateRequest.clientId) &&
        Objects.equals(this.secret, creditPayrollIncomeParsingConfigUpdateRequest.secret) &&
        Objects.equals(this.userToken, creditPayrollIncomeParsingConfigUpdateRequest.userToken) &&
        Objects.equals(this.itemId, creditPayrollIncomeParsingConfigUpdateRequest.itemId) &&
        Objects.equals(this.parsingConfig, creditPayrollIncomeParsingConfigUpdateRequest.parsingConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, itemId, parsingConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayrollIncomeParsingConfigUpdateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    parsingConfig: ").append(toIndentedString(parsingConfig)).append("\n");
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

