/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
import com.plaid.client.model.ItemStatus;
import com.plaid.client.model.ItemStatusInvestments;
import com.plaid.client.model.ItemStatusLastWebhook;
import com.plaid.client.model.ItemStatusTransactions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NullableItemStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T22:11:20.181Z[GMT]")
public class NullableItemStatus {
  public static final String SERIALIZED_NAME_INVESTMENTS = "investments";
  @SerializedName(SERIALIZED_NAME_INVESTMENTS)
  private ItemStatusInvestments investments;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private ItemStatusTransactions transactions;

  public static final String SERIALIZED_NAME_LAST_WEBHOOK = "last_webhook";
  @SerializedName(SERIALIZED_NAME_LAST_WEBHOOK)
  private ItemStatusLastWebhook lastWebhook;


  public NullableItemStatus investments(ItemStatusInvestments investments) {
    
    this.investments = investments;
    return this;
  }

   /**
   * Get investments
   * @return investments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemStatusInvestments getInvestments() {
    return investments;
  }


  public void setInvestments(ItemStatusInvestments investments) {
    this.investments = investments;
  }


  public NullableItemStatus transactions(ItemStatusTransactions transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemStatusTransactions getTransactions() {
    return transactions;
  }


  public void setTransactions(ItemStatusTransactions transactions) {
    this.transactions = transactions;
  }


  public NullableItemStatus lastWebhook(ItemStatusLastWebhook lastWebhook) {
    
    this.lastWebhook = lastWebhook;
    return this;
  }

   /**
   * Get lastWebhook
   * @return lastWebhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemStatusLastWebhook getLastWebhook() {
    return lastWebhook;
  }


  public void setLastWebhook(ItemStatusLastWebhook lastWebhook) {
    this.lastWebhook = lastWebhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableItemStatus nullableItemStatus = (NullableItemStatus) o;
    return Objects.equals(this.investments, nullableItemStatus.investments) &&
        Objects.equals(this.transactions, nullableItemStatus.transactions) &&
        Objects.equals(this.lastWebhook, nullableItemStatus.lastWebhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investments, transactions, lastWebhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableItemStatus {\n");
    sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    lastWebhook: ").append(toIndentedString(lastWebhook)).append("\n");
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

