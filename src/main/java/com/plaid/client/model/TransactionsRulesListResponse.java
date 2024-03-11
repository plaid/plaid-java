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
import com.plaid.client.model.TransactionsCategoryRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsRulesListResponse defines the response schema for &#x60;/beta/transactions/rules/v1/list&#x60;
 */
@ApiModel(description = "TransactionsRulesListResponse defines the response schema for `/beta/transactions/rules/v1/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class TransactionsRulesListResponse {
  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<TransactionsCategoryRule> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransactionsRulesListResponse rules(List<TransactionsCategoryRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public TransactionsRulesListResponse addRulesItem(TransactionsCategoryRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of the Item&#39;s transaction rules
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "A list of the Item's transaction rules")

  public List<TransactionsCategoryRule> getRules() {
    return rules;
  }


  public void setRules(List<TransactionsCategoryRule> rules) {
    this.rules = rules;
  }


  public TransactionsRulesListResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRulesListResponse transactionsRulesListResponse = (TransactionsRulesListResponse) o;
    return Objects.equals(this.rules, transactionsRulesListResponse.rules) &&
        Objects.equals(this.requestId, transactionsRulesListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRulesListResponse {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

