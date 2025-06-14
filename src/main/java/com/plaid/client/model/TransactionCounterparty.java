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
import com.plaid.client.model.CounterpartyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The counterparty, such as the merchant or financial institution, is extracted by Plaid from the raw description.
 */
@ApiModel(description = "The counterparty, such as the merchant or financial institution, is extracted by Plaid from the raw description.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class TransactionCounterparty {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CounterpartyType type;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_CONFIDENCE_LEVEL = "confidence_level";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_LEVEL)
  private String confidenceLevel;


  public TransactionCounterparty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the counterparty, such as the merchant or the financial institution, as extracted by Plaid from the raw description.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the counterparty, such as the merchant or the financial institution, as extracted by Plaid from the raw description.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TransactionCounterparty entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * A unique, stable, Plaid-generated ID that maps to the counterparty.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique, stable, Plaid-generated ID that maps to the counterparty.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public TransactionCounterparty type(CounterpartyType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public CounterpartyType getType() {
    return type;
  }


  public void setType(CounterpartyType type) {
    this.type = type;
  }


  public TransactionCounterparty website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * The website associated with the counterparty.
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The website associated with the counterparty.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public TransactionCounterparty logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The URL of a logo associated with the counterparty, if available. The logo will always be 100×100 pixel PNG file.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL of a logo associated with the counterparty, if available. The logo will always be 100×100 pixel PNG file.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public TransactionCounterparty confidenceLevel(String confidenceLevel) {
    
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * A description of how confident we are that the provided counterparty is involved in the transaction.  &#x60;VERY_HIGH&#x60;: We recognize this counterparty and we are more than 98% confident that it is involved in this transaction. &#x60;HIGH&#x60;: We recognize this counterparty and we are more than 90% confident that it is involved in this transaction. &#x60;MEDIUM&#x60;: We are moderately confident that this counterparty was involved in this transaction, but some details may differ from our records. &#x60;LOW&#x60;: We didn’t find a matching counterparty in our records, so we are returning a cleansed name parsed out of the request description. &#x60;UNKNOWN&#x60;: We don’t know the confidence level for this counterparty.
   * @return confidenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of how confident we are that the provided counterparty is involved in the transaction.  `VERY_HIGH`: We recognize this counterparty and we are more than 98% confident that it is involved in this transaction. `HIGH`: We recognize this counterparty and we are more than 90% confident that it is involved in this transaction. `MEDIUM`: We are moderately confident that this counterparty was involved in this transaction, but some details may differ from our records. `LOW`: We didn’t find a matching counterparty in our records, so we are returning a cleansed name parsed out of the request description. `UNKNOWN`: We don’t know the confidence level for this counterparty.")

  public String getConfidenceLevel() {
    return confidenceLevel;
  }


  public void setConfidenceLevel(String confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCounterparty transactionCounterparty = (TransactionCounterparty) o;
    return Objects.equals(this.name, transactionCounterparty.name) &&
        Objects.equals(this.entityId, transactionCounterparty.entityId) &&
        Objects.equals(this.type, transactionCounterparty.type) &&
        Objects.equals(this.website, transactionCounterparty.website) &&
        Objects.equals(this.logoUrl, transactionCounterparty.logoUrl) &&
        Objects.equals(this.confidenceLevel, transactionCounterparty.confidenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityId, type, website, logoUrl, confidenceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCounterparty {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
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

