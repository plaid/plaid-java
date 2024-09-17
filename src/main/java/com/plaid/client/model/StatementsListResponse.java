/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.StatementsAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatementsListResponse defines the response schema for &#x60;/statements/list&#x60;
 */
@ApiModel(description = "StatementsListResponse defines the response schema for `/statements/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class StatementsListResponse {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<StatementsAccount> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public StatementsListResponse accounts(List<StatementsAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public StatementsListResponse addAccountsItem(StatementsAccount accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "")

  public List<StatementsAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<StatementsAccount> accounts) {
    this.accounts = accounts;
  }


  public StatementsListResponse institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The Plaid Institution ID associated with the Item.
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The Plaid Institution ID associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public StatementsListResponse institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the institution associated with the Item.
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The name of the institution associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public StatementsListResponse itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Plaid Item ID. The &#x60;item_id&#x60; is always unique; linking the same account at the same institution twice will result in two Items with different &#x60;item_id&#x60; values. Like all Plaid identifiers, the &#x60;item_id&#x60; is case-sensitive.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The Plaid Item ID. The `item_id` is always unique; linking the same account at the same institution twice will result in two Items with different `item_id` values. Like all Plaid identifiers, the `item_id` is case-sensitive.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public StatementsListResponse requestId(String requestId) {
    
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
    StatementsListResponse statementsListResponse = (StatementsListResponse) o;
    return Objects.equals(this.accounts, statementsListResponse.accounts) &&
        Objects.equals(this.institutionId, statementsListResponse.institutionId) &&
        Objects.equals(this.institutionName, statementsListResponse.institutionName) &&
        Objects.equals(this.itemId, statementsListResponse.itemId) &&
        Objects.equals(this.requestId, statementsListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, institutionId, institutionName, itemId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementsListResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

