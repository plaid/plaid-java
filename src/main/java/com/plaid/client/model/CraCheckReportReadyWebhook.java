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
import com.plaid.client.model.Products;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fired when the Check Report are ready to be retrieved. Once this webhook has fired, the report will be available to retrieve for 24 hours.
 */
@ApiModel(description = "Fired when the Check Report are ready to be retrieved. Once this webhook has fired, the report will be available to retrieve for 24 hours.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CraCheckReportReadyWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_SUCCESSFUL_PRODUCTS = "successful_products";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_PRODUCTS)
  private List<Products> successfulProducts = null;

  public static final String SERIALIZED_NAME_FAILED_PRODUCTS = "failed_products";
  @SerializedName(SERIALIZED_NAME_FAILED_PRODUCTS)
  private List<Products> failedProducts = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public CraCheckReportReadyWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;CHECK_REPORT&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`CHECK_REPORT`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public CraCheckReportReadyWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;CHECK_REPORT_READY&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`CHECK_REPORT_READY`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public CraCheckReportReadyWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The &#x60;user_id&#x60; corresponding to the user the webhook has fired for.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The `user_id` corresponding to the user the webhook has fired for.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CraCheckReportReadyWebhook successfulProducts(List<Products> successfulProducts) {
    
    this.successfulProducts = successfulProducts;
    return this;
  }

  public CraCheckReportReadyWebhook addSuccessfulProductsItem(Products successfulProductsItem) {
    if (this.successfulProducts == null) {
      this.successfulProducts = new ArrayList<>();
    }
    this.successfulProducts.add(successfulProductsItem);
    return this;
  }

   /**
   * Specifies a list of products that have successfully been generated for the report.
   * @return successfulProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a list of products that have successfully been generated for the report.")

  public List<Products> getSuccessfulProducts() {
    return successfulProducts;
  }


  public void setSuccessfulProducts(List<Products> successfulProducts) {
    this.successfulProducts = successfulProducts;
  }


  public CraCheckReportReadyWebhook failedProducts(List<Products> failedProducts) {
    
    this.failedProducts = failedProducts;
    return this;
  }

  public CraCheckReportReadyWebhook addFailedProductsItem(Products failedProductsItem) {
    if (this.failedProducts == null) {
      this.failedProducts = new ArrayList<>();
    }
    this.failedProducts.add(failedProductsItem);
    return this;
  }

   /**
   * Specifies a list of products that have failed to generate for the report. Additional detail on what caused the failure can be found by calling the product /get endpoint.
   * @return failedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a list of products that have failed to generate for the report. Additional detail on what caused the failure can be found by calling the product /get endpoint.")

  public List<Products> getFailedProducts() {
    return failedProducts;
  }


  public void setFailedProducts(List<Products> failedProducts) {
    this.failedProducts = failedProducts;
  }


  public CraCheckReportReadyWebhook itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public CraCheckReportReadyWebhook addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * A list of &#x60;item_ids&#x60; that is included in the Check Report.
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of `item_ids` that is included in the Check Report.")

  public List<String> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  public CraCheckReportReadyWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraCheckReportReadyWebhook craCheckReportReadyWebhook = (CraCheckReportReadyWebhook) o;
    return Objects.equals(this.webhookType, craCheckReportReadyWebhook.webhookType) &&
        Objects.equals(this.webhookCode, craCheckReportReadyWebhook.webhookCode) &&
        Objects.equals(this.userId, craCheckReportReadyWebhook.userId) &&
        Objects.equals(this.successfulProducts, craCheckReportReadyWebhook.successfulProducts) &&
        Objects.equals(this.failedProducts, craCheckReportReadyWebhook.failedProducts) &&
        Objects.equals(this.itemIds, craCheckReportReadyWebhook.itemIds) &&
        Objects.equals(this.environment, craCheckReportReadyWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, userId, successfulProducts, failedProducts, itemIds, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraCheckReportReadyWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    successfulProducts: ").append(toIndentedString(successfulProducts)).append("\n");
    sb.append("    failedProducts: ").append(toIndentedString(failedProducts)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

