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
import com.plaid.client.model.DetectedAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Insights surrounding external financial institution counterparties associated with a user.
 */
@ApiModel(description = "Insights surrounding external financial institution counterparties associated with a user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class FinancialInstitutionInsights {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_DETECTED_ACCOUNTS = "detected_accounts";
  @SerializedName(SERIALIZED_NAME_DETECTED_ACCOUNTS)
  private List<DetectedAccount> detectedAccounts = new ArrayList<>();


  public FinancialInstitutionInsights name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the financial institution counterparty.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the financial institution counterparty.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FinancialInstitutionInsights entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * A unique, stable, Plaid-generated id that maps to the counterparty.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique, stable, Plaid-generated id that maps to the counterparty.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public FinancialInstitutionInsights website(String website) {
    
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


  public FinancialInstitutionInsights detectedAccounts(List<DetectedAccount> detectedAccounts) {
    
    this.detectedAccounts = detectedAccounts;
    return this;
  }

  public FinancialInstitutionInsights addDetectedAccountsItem(DetectedAccount detectedAccountsItem) {
    this.detectedAccounts.add(detectedAccountsItem);
    return this;
  }

   /**
   * Associated accounts, detected based on the nature of transfers to/from this institution.
   * @return detectedAccounts
  **/
  @ApiModelProperty(required = true, value = "Associated accounts, detected based on the nature of transfers to/from this institution.")

  public List<DetectedAccount> getDetectedAccounts() {
    return detectedAccounts;
  }


  public void setDetectedAccounts(List<DetectedAccount> detectedAccounts) {
    this.detectedAccounts = detectedAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstitutionInsights financialInstitutionInsights = (FinancialInstitutionInsights) o;
    return Objects.equals(this.name, financialInstitutionInsights.name) &&
        Objects.equals(this.entityId, financialInstitutionInsights.entityId) &&
        Objects.equals(this.website, financialInstitutionInsights.website) &&
        Objects.equals(this.detectedAccounts, financialInstitutionInsights.detectedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityId, website, detectedAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstitutionInsights {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    detectedAccounts: ").append(toIndentedString(detectedAccounts)).append("\n");
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

