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
import com.plaid.client.model.FinancialInstitutionInsights;
import com.plaid.client.model.MerchantInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Insights around a user&#39;s counterparties
 */
@ApiModel(description = "Insights around a user's counterparties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class CounterpartyInsights {
  public static final String SERIALIZED_NAME_FINANCIAL_INSTITUTION_INSIGHTS = "financial_institution_insights";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INSTITUTION_INSIGHTS)
  private List<FinancialInstitutionInsights> financialInstitutionInsights = null;

  public static final String SERIALIZED_NAME_MERCHANT_INSIGHTS = "merchant_insights";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INSIGHTS)
  private List<MerchantInsights> merchantInsights = null;


  public CounterpartyInsights financialInstitutionInsights(List<FinancialInstitutionInsights> financialInstitutionInsights) {
    
    this.financialInstitutionInsights = financialInstitutionInsights;
    return this;
  }

  public CounterpartyInsights addFinancialInstitutionInsightsItem(FinancialInstitutionInsights financialInstitutionInsightsItem) {
    if (this.financialInstitutionInsights == null) {
      this.financialInstitutionInsights = new ArrayList<>();
    }
    this.financialInstitutionInsights.add(financialInstitutionInsightsItem);
    return this;
  }

   /**
   * Insights related to a user’s transactions with other financial institutions, including detected account types.
   * @return financialInstitutionInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Insights related to a user’s transactions with other financial institutions, including detected account types.")

  public List<FinancialInstitutionInsights> getFinancialInstitutionInsights() {
    return financialInstitutionInsights;
  }


  public void setFinancialInstitutionInsights(List<FinancialInstitutionInsights> financialInstitutionInsights) {
    this.financialInstitutionInsights = financialInstitutionInsights;
  }


  public CounterpartyInsights merchantInsights(List<MerchantInsights> merchantInsights) {
    
    this.merchantInsights = merchantInsights;
    return this;
  }

  public CounterpartyInsights addMerchantInsightsItem(MerchantInsights merchantInsightsItem) {
    if (this.merchantInsights == null) {
      this.merchantInsights = new ArrayList<>();
    }
    this.merchantInsights.add(merchantInsightsItem);
    return this;
  }

   /**
   * Insights about a user’s top merchants, ranked by spend.
   * @return merchantInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Insights about a user’s top merchants, ranked by spend.")

  public List<MerchantInsights> getMerchantInsights() {
    return merchantInsights;
  }


  public void setMerchantInsights(List<MerchantInsights> merchantInsights) {
    this.merchantInsights = merchantInsights;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyInsights counterpartyInsights = (CounterpartyInsights) o;
    return Objects.equals(this.financialInstitutionInsights, counterpartyInsights.financialInstitutionInsights) &&
        Objects.equals(this.merchantInsights, counterpartyInsights.merchantInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialInstitutionInsights, merchantInsights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyInsights {\n");
    sb.append("    financialInstitutionInsights: ").append(toIndentedString(financialInstitutionInsights)).append("\n");
    sb.append("    merchantInsights: ").append(toIndentedString(merchantInsights)).append("\n");
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

