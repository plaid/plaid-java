/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.586.4
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
import com.plaid.client.model.ItemConsentedDataScope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemWithConsentFieldsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T16:41:31.650700Z[Etc/UTC]")
public class ItemWithConsentFieldsAllOf {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CONSENTED_USE_CASES = "consented_use_cases";
  @SerializedName(SERIALIZED_NAME_CONSENTED_USE_CASES)
  private List<String> consentedUseCases = null;

  public static final String SERIALIZED_NAME_CONSENTED_DATA_SCOPES = "consented_data_scopes";
  @SerializedName(SERIALIZED_NAME_CONSENTED_DATA_SCOPES)
  private List<ItemConsentedDataScope> consentedDataScopes = null;


  public ItemWithConsentFieldsAllOf createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the Item was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the Item was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ItemWithConsentFieldsAllOf consentedUseCases(List<String> consentedUseCases) {
    
    this.consentedUseCases = consentedUseCases;
    return this;
  }

  public ItemWithConsentFieldsAllOf addConsentedUseCasesItem(String consentedUseCasesItem) {
    if (this.consentedUseCases == null) {
      this.consentedUseCases = new ArrayList<>();
    }
    this.consentedUseCases.add(consentedUseCasesItem);
    return this;
  }

   /**
   * A list of use cases that the user has consented to for the Item via [Data Transparency Messaging](/docs/link/data-transparency-messaging-migration-guide).   You can see the full list of use cases or update the list of use cases to request at any time via the Link Customization section of the [Plaid Dashboard](https://dashboard.plaid.com/link/data-transparency-v5).
   * @return consentedUseCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of use cases that the user has consented to for the Item via [Data Transparency Messaging](/docs/link/data-transparency-messaging-migration-guide).   You can see the full list of use cases or update the list of use cases to request at any time via the Link Customization section of the [Plaid Dashboard](https://dashboard.plaid.com/link/data-transparency-v5).")

  public List<String> getConsentedUseCases() {
    return consentedUseCases;
  }


  public void setConsentedUseCases(List<String> consentedUseCases) {
    this.consentedUseCases = consentedUseCases;
  }


  public ItemWithConsentFieldsAllOf consentedDataScopes(List<ItemConsentedDataScope> consentedDataScopes) {
    
    this.consentedDataScopes = consentedDataScopes;
    return this;
  }

  public ItemWithConsentFieldsAllOf addConsentedDataScopesItem(ItemConsentedDataScope consentedDataScopesItem) {
    if (this.consentedDataScopes == null) {
      this.consentedDataScopes = new ArrayList<>();
    }
    this.consentedDataScopes.add(consentedDataScopesItem);
    return this;
  }

   /**
   * A list of data scopes that the user has consented to for the Item via [Data Transparency Messaging](/docs/link/data-transparency-messaging-migration-guide). These are based on the &#x60;consented_products&#x60;; see the [full mapping](/docs/link/data-transparency-messaging-migration-guide/#data-scopes-by-product) of data scopes and products.
   * @return consentedDataScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of data scopes that the user has consented to for the Item via [Data Transparency Messaging](/docs/link/data-transparency-messaging-migration-guide). These are based on the `consented_products`; see the [full mapping](/docs/link/data-transparency-messaging-migration-guide/#data-scopes-by-product) of data scopes and products.")

  public List<ItemConsentedDataScope> getConsentedDataScopes() {
    return consentedDataScopes;
  }


  public void setConsentedDataScopes(List<ItemConsentedDataScope> consentedDataScopes) {
    this.consentedDataScopes = consentedDataScopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemWithConsentFieldsAllOf itemWithConsentFieldsAllOf = (ItemWithConsentFieldsAllOf) o;
    return Objects.equals(this.createdAt, itemWithConsentFieldsAllOf.createdAt) &&
        Objects.equals(this.consentedUseCases, itemWithConsentFieldsAllOf.consentedUseCases) &&
        Objects.equals(this.consentedDataScopes, itemWithConsentFieldsAllOf.consentedDataScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, consentedUseCases, consentedDataScopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemWithConsentFieldsAllOf {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    consentedUseCases: ").append(toIndentedString(consentedUseCases)).append("\n");
    sb.append("    consentedDataScopes: ").append(toIndentedString(consentedDataScopes)).append("\n");
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
