/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
 * Insights into a user’s top merchants.
 */
@ApiModel(description = "Insights into a user’s top merchants.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class MerchantInsights {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_PRIMARY = "personal_finance_category_primary";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_PRIMARY)
  private String personalFinanceCategoryPrimary;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_DETAILED = "personal_finance_category_detailed";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_DETAILED)
  private String personalFinanceCategoryDetailed;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOWS = "total_outflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOWS)
  private Double totalOutflows;

  public static final String SERIALIZED_NAME_TOTAL_INFLOWS = "total_inflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOWS)
  private Double totalInflows;


  public MerchantInsights name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The counterparty name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The counterparty name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MerchantInsights entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * A unique, stable, Plaid-generated id that maps to the merchant.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique, stable, Plaid-generated id that maps to the merchant.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public MerchantInsights website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * The website associated with the merchant.
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The website associated with the merchant.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public MerchantInsights transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * The number of transactions associated with merchant of this type.
   * @return transactionCount
  **/
  @ApiModelProperty(required = true, value = "The number of transactions associated with merchant of this type.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public MerchantInsights personalFinanceCategoryPrimary(String personalFinanceCategoryPrimary) {
    
    this.personalFinanceCategoryPrimary = personalFinanceCategoryPrimary;
    return this;
  }

   /**
   * The primary personal finance category associated with this merchant.
   * @return personalFinanceCategoryPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The primary personal finance category associated with this merchant.")

  public String getPersonalFinanceCategoryPrimary() {
    return personalFinanceCategoryPrimary;
  }


  public void setPersonalFinanceCategoryPrimary(String personalFinanceCategoryPrimary) {
    this.personalFinanceCategoryPrimary = personalFinanceCategoryPrimary;
  }


  public MerchantInsights personalFinanceCategoryDetailed(String personalFinanceCategoryDetailed) {
    
    this.personalFinanceCategoryDetailed = personalFinanceCategoryDetailed;
    return this;
  }

   /**
   * The detailed personal finance category associated with this merchant.
   * @return personalFinanceCategoryDetailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The detailed personal finance category associated with this merchant.")

  public String getPersonalFinanceCategoryDetailed() {
    return personalFinanceCategoryDetailed;
  }


  public void setPersonalFinanceCategoryDetailed(String personalFinanceCategoryDetailed) {
    this.personalFinanceCategoryDetailed = personalFinanceCategoryDetailed;
  }


  public MerchantInsights totalOutflows(Double totalOutflows) {
    
    this.totalOutflows = totalOutflows;
    return this;
  }

   /**
   * Sum of outflow amounts.
   * @return totalOutflows
  **/
  @ApiModelProperty(required = true, value = "Sum of outflow amounts.")

  public Double getTotalOutflows() {
    return totalOutflows;
  }


  public void setTotalOutflows(Double totalOutflows) {
    this.totalOutflows = totalOutflows;
  }


  public MerchantInsights totalInflows(Double totalInflows) {
    
    this.totalInflows = totalInflows;
    return this;
  }

   /**
   * Sum of inflow amounts.
   * @return totalInflows
  **/
  @ApiModelProperty(required = true, value = "Sum of inflow amounts.")

  public Double getTotalInflows() {
    return totalInflows;
  }


  public void setTotalInflows(Double totalInflows) {
    this.totalInflows = totalInflows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantInsights merchantInsights = (MerchantInsights) o;
    return Objects.equals(this.name, merchantInsights.name) &&
        Objects.equals(this.entityId, merchantInsights.entityId) &&
        Objects.equals(this.website, merchantInsights.website) &&
        Objects.equals(this.transactionCount, merchantInsights.transactionCount) &&
        Objects.equals(this.personalFinanceCategoryPrimary, merchantInsights.personalFinanceCategoryPrimary) &&
        Objects.equals(this.personalFinanceCategoryDetailed, merchantInsights.personalFinanceCategoryDetailed) &&
        Objects.equals(this.totalOutflows, merchantInsights.totalOutflows) &&
        Objects.equals(this.totalInflows, merchantInsights.totalInflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityId, website, transactionCount, personalFinanceCategoryPrimary, personalFinanceCategoryDetailed, totalOutflows, totalInflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantInsights {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    personalFinanceCategoryPrimary: ").append(toIndentedString(personalFinanceCategoryPrimary)).append("\n");
    sb.append("    personalFinanceCategoryDetailed: ").append(toIndentedString(personalFinanceCategoryDetailed)).append("\n");
    sb.append("    totalOutflows: ").append(toIndentedString(totalOutflows)).append("\n");
    sb.append("    totalInflows: ").append(toIndentedString(totalInflows)).append("\n");
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

