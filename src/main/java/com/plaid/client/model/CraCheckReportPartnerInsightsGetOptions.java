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
import com.plaid.client.model.PrismProduct;
import com.plaid.client.model.PrismVersions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines configuration options to generate Partner Insights
 */
@ApiModel(description = "Defines configuration options to generate Partner Insights")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class CraCheckReportPartnerInsightsGetOptions {
  public static final String SERIALIZED_NAME_PRISM_PRODUCTS = "prism_products";
  @SerializedName(SERIALIZED_NAME_PRISM_PRODUCTS)
  private List<PrismProduct> prismProducts = null;

  public static final String SERIALIZED_NAME_PRISM_VERSIONS = "prism_versions";
  @SerializedName(SERIALIZED_NAME_PRISM_VERSIONS)
  private PrismVersions prismVersions;


  public CraCheckReportPartnerInsightsGetOptions prismProducts(List<PrismProduct> prismProducts) {
    
    this.prismProducts = prismProducts;
    return this;
  }

  public CraCheckReportPartnerInsightsGetOptions addPrismProductsItem(PrismProduct prismProductsItem) {
    if (this.prismProducts == null) {
      this.prismProducts = new ArrayList<>();
    }
    this.prismProducts.add(prismProductsItem);
    return this;
  }

   /**
   * The specific Prism Data products to return. If none are passed in, then all products will be returned.
   * @return prismProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specific Prism Data products to return. If none are passed in, then all products will be returned.")

  public List<PrismProduct> getPrismProducts() {
    return prismProducts;
  }


  public void setPrismProducts(List<PrismProduct> prismProducts) {
    this.prismProducts = prismProducts;
  }


  public CraCheckReportPartnerInsightsGetOptions prismVersions(PrismVersions prismVersions) {
    
    this.prismVersions = prismVersions;
    return this;
  }

   /**
   * Get prismVersions
   * @return prismVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrismVersions getPrismVersions() {
    return prismVersions;
  }


  public void setPrismVersions(PrismVersions prismVersions) {
    this.prismVersions = prismVersions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraCheckReportPartnerInsightsGetOptions craCheckReportPartnerInsightsGetOptions = (CraCheckReportPartnerInsightsGetOptions) o;
    return Objects.equals(this.prismProducts, craCheckReportPartnerInsightsGetOptions.prismProducts) &&
        Objects.equals(this.prismVersions, craCheckReportPartnerInsightsGetOptions.prismVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prismProducts, prismVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraCheckReportPartnerInsightsGetOptions {\n");
    sb.append("    prismProducts: ").append(toIndentedString(prismProducts)).append("\n");
    sb.append("    prismVersions: ").append(toIndentedString(prismVersions)).append("\n");
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

