/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
import com.plaid.client.model.CreditBankStatementUploadObject;
import com.plaid.client.model.PayrollItemStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing information about the bank statement upload Item.
 */
@ApiModel(description = "An object containing information about the bank statement upload Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class CreditBankStatementUploadItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_BANK_STATEMENTS = "bank_statements";
  @SerializedName(SERIALIZED_NAME_BANK_STATEMENTS)
  private List<CreditBankStatementUploadObject> bankStatements = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PayrollItemStatus status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public CreditBankStatementUploadItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditBankStatementUploadItem bankStatements(List<CreditBankStatementUploadObject> bankStatements) {
    
    this.bankStatements = bankStatements;
    return this;
  }

  public CreditBankStatementUploadItem addBankStatementsItem(CreditBankStatementUploadObject bankStatementsItem) {
    this.bankStatements.add(bankStatementsItem);
    return this;
  }

   /**
   * Get bankStatements
   * @return bankStatements
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreditBankStatementUploadObject> getBankStatements() {
    return bankStatements;
  }


  public void setBankStatements(List<CreditBankStatementUploadObject> bankStatements) {
    this.bankStatements = bankStatements;
  }


  public CreditBankStatementUploadItem status(PayrollItemStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PayrollItemStatus getStatus() {
    return status;
  }


  public void setStatus(PayrollItemStatus status) {
    this.status = status;
  }


  public CreditBankStatementUploadItem updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DDTHH:mm:ssZ) indicating the last time that the Item was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DDTHH:mm:ssZ) indicating the last time that the Item was updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankStatementUploadItem creditBankStatementUploadItem = (CreditBankStatementUploadItem) o;
    return Objects.equals(this.itemId, creditBankStatementUploadItem.itemId) &&
        Objects.equals(this.bankStatements, creditBankStatementUploadItem.bankStatements) &&
        Objects.equals(this.status, creditBankStatementUploadItem.status) &&
        Objects.equals(this.updatedAt, creditBankStatementUploadItem.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, bankStatements, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankStatementUploadItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    bankStatements: ").append(toIndentedString(bankStatements)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

