/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import com.plaid.client.model.ItemAuthMethod;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata about the Item.
 */
@ApiModel(description = "Metadata about the Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class Item {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_AUTH_METHOD = "auth_method";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD)
  private ItemAuthMethod authMethod;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_AVAILABLE_PRODUCTS = "available_products";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PRODUCTS)
  private List<Products> availableProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_BILLED_PRODUCTS = "billed_products";
  @SerializedName(SERIALIZED_NAME_BILLED_PRODUCTS)
  private List<Products> billedProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = null;

  public static final String SERIALIZED_NAME_CONSENTED_PRODUCTS = "consented_products";
  @SerializedName(SERIALIZED_NAME_CONSENTED_PRODUCTS)
  private List<Products> consentedProducts = null;

  public static final String SERIALIZED_NAME_CONSENT_EXPIRATION_TIME = "consent_expiration_time";
  @SerializedName(SERIALIZED_NAME_CONSENT_EXPIRATION_TIME)
  private OffsetDateTime consentExpirationTime;

  /**
   * Indicates whether an Item requires user interaction to be updated, which can be the case for Items with some forms of two-factor authentication.  &#x60;background&#x60; - Item can be updated in the background  &#x60;user_present_required&#x60; - Item requires user interaction to be updated
   */
  @JsonAdapter(UpdateTypeEnum.Adapter.class)
  public enum UpdateTypeEnum {
    BACKGROUND("background"),
    
    USER_PRESENT_REQUIRED("user_present_required");

    private String value;

    UpdateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateTypeEnum fromValue(String value) {
      for (UpdateTypeEnum b : UpdateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_TYPE = "update_type";
  @SerializedName(SERIALIZED_NAME_UPDATE_TYPE)
  private UpdateTypeEnum updateType;


  public Item itemId(String itemId) {
    
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


  public Item institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The Plaid Institution ID associated with the Item. Field is &#x60;null&#x60; for Items created without an institution connection, such as Items created via Same Day Micro-deposits.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid Institution ID associated with the Item. Field is `null` for Items created without an institution connection, such as Items created via Same Day Micro-deposits.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Item institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the institution associated with the Item. Field is &#x60;null&#x60; for Items created without an institution connection, such as Items created via Same Day Micro-deposits.
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the institution associated with the Item. Field is `null` for Items created without an institution connection, such as Items created via Same Day Micro-deposits.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public Item webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The URL registered to receive webhooks for the Item.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL registered to receive webhooks for the Item.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public Item authMethod(ItemAuthMethod authMethod) {
    
    this.authMethod = authMethod;
    return this;
  }

   /**
   * Get authMethod
   * @return authMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemAuthMethod getAuthMethod() {
    return authMethod;
  }


  public void setAuthMethod(ItemAuthMethod authMethod) {
    this.authMethod = authMethod;
  }


  public Item error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public Item availableProducts(List<Products> availableProducts) {
    
    this.availableProducts = availableProducts;
    return this;
  }

  public Item addAvailableProductsItem(Products availableProductsItem) {
    this.availableProducts.add(availableProductsItem);
    return this;
  }

   /**
   * A list of products available for the Item that have not yet been accessed. The contents of this array will be mutually exclusive with &#x60;billed_products&#x60;.
   * @return availableProducts
  **/
  @ApiModelProperty(required = true, value = "A list of products available for the Item that have not yet been accessed. The contents of this array will be mutually exclusive with `billed_products`.")

  public List<Products> getAvailableProducts() {
    return availableProducts;
  }


  public void setAvailableProducts(List<Products> availableProducts) {
    this.availableProducts = availableProducts;
  }


  public Item billedProducts(List<Products> billedProducts) {
    
    this.billedProducts = billedProducts;
    return this;
  }

  public Item addBilledProductsItem(Products billedProductsItem) {
    this.billedProducts.add(billedProductsItem);
    return this;
  }

   /**
   * A list of products that have been billed for the Item. The contents of this array will be mutually exclusive with &#x60;available_products&#x60;. Note - &#x60;billed_products&#x60; is populated in all environments but only requests in Production are billed. Also note that products that are billed on a pay-per-call basis rather than a pay-per-Item basis, such as &#x60;balance&#x60;, will not appear here. 
   * @return billedProducts
  **/
  @ApiModelProperty(required = true, value = "A list of products that have been billed for the Item. The contents of this array will be mutually exclusive with `available_products`. Note - `billed_products` is populated in all environments but only requests in Production are billed. Also note that products that are billed on a pay-per-call basis rather than a pay-per-Item basis, such as `balance`, will not appear here. ")

  public List<Products> getBilledProducts() {
    return billedProducts;
  }


  public void setBilledProducts(List<Products> billedProducts) {
    this.billedProducts = billedProducts;
  }


  public Item products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public Item addProductsItem(Products productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * A list of products added to the Item. In almost all cases, this will be the same as the &#x60;billed_products&#x60; field. For some products, it is possible for the product to be added to an Item but not yet billed (e.g. Assets, before &#x60;/asset_report/create&#x60; has been called, or Auth or Identity when added as Optional Products but before their endpoints have been called), in which case the product may appear in &#x60;products&#x60; but not in &#x60;billed_products&#x60;. 
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of products added to the Item. In almost all cases, this will be the same as the `billed_products` field. For some products, it is possible for the product to be added to an Item but not yet billed (e.g. Assets, before `/asset_report/create` has been called, or Auth or Identity when added as Optional Products but before their endpoints have been called), in which case the product may appear in `products` but not in `billed_products`. ")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public Item consentedProducts(List<Products> consentedProducts) {
    
    this.consentedProducts = consentedProducts;
    return this;
  }

  public Item addConsentedProductsItem(Products consentedProductsItem) {
    if (this.consentedProducts == null) {
      this.consentedProducts = new ArrayList<>();
    }
    this.consentedProducts.add(consentedProductsItem);
    return this;
  }

   /**
   * A list of products that the user has consented to for the Item via [Data Transparency Messaging](/docs/link/data-transparency-messaging-migration-guide). This will consist of all products where both of the following are true: the user has consented to the required data scopes for that product and you have Production access for that product. 
   * @return consentedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of products that the user has consented to for the Item via [Data Transparency Messaging](/docs/link/data-transparency-messaging-migration-guide). This will consist of all products where both of the following are true: the user has consented to the required data scopes for that product and you have Production access for that product. ")

  public List<Products> getConsentedProducts() {
    return consentedProducts;
  }


  public void setConsentedProducts(List<Products> consentedProducts) {
    this.consentedProducts = consentedProducts;
  }


  public Item consentExpirationTime(OffsetDateTime consentExpirationTime) {
    
    this.consentExpirationTime = consentExpirationTime;
    return this;
  }

   /**
   * The date and time at which the Item&#39;s access consent will expire, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. If the Item does not have consent expiration scheduled, this field will be &#x60;null&#x60;. Currently, only institutions in Europe and a small number of institutions in the US have expiring consent. Closer to the 1033 compliance deadline of April 1, 2026, expiration times will be populated more widely. For more details, see [Data Transparency Messaging consent expiration](https://plaid.com/docs/link/data-transparency-messaging-migration-guide/#consent-expiration-and-reauthorization.)
   * @return consentExpirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date and time at which the Item's access consent will expire, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. If the Item does not have consent expiration scheduled, this field will be `null`. Currently, only institutions in Europe and a small number of institutions in the US have expiring consent. Closer to the 1033 compliance deadline of April 1, 2026, expiration times will be populated more widely. For more details, see [Data Transparency Messaging consent expiration](https://plaid.com/docs/link/data-transparency-messaging-migration-guide/#consent-expiration-and-reauthorization.)")

  public OffsetDateTime getConsentExpirationTime() {
    return consentExpirationTime;
  }


  public void setConsentExpirationTime(OffsetDateTime consentExpirationTime) {
    this.consentExpirationTime = consentExpirationTime;
  }


  public Item updateType(UpdateTypeEnum updateType) {
    
    this.updateType = updateType;
    return this;
  }

   /**
   * Indicates whether an Item requires user interaction to be updated, which can be the case for Items with some forms of two-factor authentication.  &#x60;background&#x60; - Item can be updated in the background  &#x60;user_present_required&#x60; - Item requires user interaction to be updated
   * @return updateType
  **/
  @ApiModelProperty(required = true, value = "Indicates whether an Item requires user interaction to be updated, which can be the case for Items with some forms of two-factor authentication.  `background` - Item can be updated in the background  `user_present_required` - Item requires user interaction to be updated")

  public UpdateTypeEnum getUpdateType() {
    return updateType;
  }


  public void setUpdateType(UpdateTypeEnum updateType) {
    this.updateType = updateType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemId, item.itemId) &&
        Objects.equals(this.institutionId, item.institutionId) &&
        Objects.equals(this.institutionName, item.institutionName) &&
        Objects.equals(this.webhook, item.webhook) &&
        Objects.equals(this.authMethod, item.authMethod) &&
        Objects.equals(this.error, item.error) &&
        Objects.equals(this.availableProducts, item.availableProducts) &&
        Objects.equals(this.billedProducts, item.billedProducts) &&
        Objects.equals(this.products, item.products) &&
        Objects.equals(this.consentedProducts, item.consentedProducts) &&
        Objects.equals(this.consentExpirationTime, item.consentExpirationTime) &&
        Objects.equals(this.updateType, item.updateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, institutionId, institutionName, webhook, authMethod, error, availableProducts, billedProducts, products, consentedProducts, consentExpirationTime, updateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    availableProducts: ").append(toIndentedString(availableProducts)).append("\n");
    sb.append("    billedProducts: ").append(toIndentedString(billedProducts)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    consentedProducts: ").append(toIndentedString(consentedProducts)).append("\n");
    sb.append("    consentExpirationTime: ").append(toIndentedString(consentExpirationTime)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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

