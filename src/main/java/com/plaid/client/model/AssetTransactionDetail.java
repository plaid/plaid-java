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
import com.plaid.client.model.AssetTransactionCategoryType;
import com.plaid.client.model.AssetTransactionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class AssetTransactionDetail {
  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_UNIQUE_IDENTIFIER = "AssetTransactionUniqueIdentifier";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_UNIQUE_IDENTIFIER)
  private String assetTransactionUniqueIdentifier;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_AMOUNT = "AssetTransactionAmount";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_AMOUNT)
  private Double assetTransactionAmount;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_DATE = "AssetTransactionDate";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_DATE)
  private LocalDate assetTransactionDate;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_POST_DATE = "AssetTransactionPostDate";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_POST_DATE)
  private LocalDate assetTransactionPostDate;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_TYPE = "AssetTransactionType";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_TYPE)
  private AssetTransactionType assetTransactionType;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_PAID_BY_NAME = "AssetTransactionPaidByName";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_PAID_BY_NAME)
  private String assetTransactionPaidByName;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_TYPE_ADDITIONAL_DESCRIPTION = "AssetTransactionTypeAdditionalDescription";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_TYPE_ADDITIONAL_DESCRIPTION)
  private String assetTransactionTypeAdditionalDescription;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_CATEGORY_TYPE = "AssetTransactionCategoryType";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_CATEGORY_TYPE)
  private AssetTransactionCategoryType assetTransactionCategoryType;

  public static final String SERIALIZED_NAME_FINANCIAL_INSTITUTION_TRANSACTION_IDENTIFIER = "FinancialInstitutionTransactionIdentifier";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INSTITUTION_TRANSACTION_IDENTIFIER)
  private String financialInstitutionTransactionIdentifier;


  public AssetTransactionDetail assetTransactionUniqueIdentifier(String assetTransactionUniqueIdentifier) {
    
    this.assetTransactionUniqueIdentifier = assetTransactionUniqueIdentifier;
    return this;
  }

   /**
   * A vendor created unique Identifier.
   * @return assetTransactionUniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A vendor created unique Identifier.")

  public String getAssetTransactionUniqueIdentifier() {
    return assetTransactionUniqueIdentifier;
  }


  public void setAssetTransactionUniqueIdentifier(String assetTransactionUniqueIdentifier) {
    this.assetTransactionUniqueIdentifier = assetTransactionUniqueIdentifier;
  }


  public AssetTransactionDetail assetTransactionAmount(Double assetTransactionAmount) {
    
    this.assetTransactionAmount = assetTransactionAmount;
    return this;
  }

   /**
   * Asset Transaction Amount.
   * @return assetTransactionAmount
  **/
  @ApiModelProperty(required = true, value = "Asset Transaction Amount.")

  public Double getAssetTransactionAmount() {
    return assetTransactionAmount;
  }


  public void setAssetTransactionAmount(Double assetTransactionAmount) {
    this.assetTransactionAmount = assetTransactionAmount;
  }


  public AssetTransactionDetail assetTransactionDate(LocalDate assetTransactionDate) {
    
    this.assetTransactionDate = assetTransactionDate;
    return this;
  }

   /**
   * Asset Transaction Date.
   * @return assetTransactionDate
  **/
  @ApiModelProperty(required = true, value = "Asset Transaction Date.")

  public LocalDate getAssetTransactionDate() {
    return assetTransactionDate;
  }


  public void setAssetTransactionDate(LocalDate assetTransactionDate) {
    this.assetTransactionDate = assetTransactionDate;
  }


  public AssetTransactionDetail assetTransactionPostDate(LocalDate assetTransactionPostDate) {
    
    this.assetTransactionPostDate = assetTransactionPostDate;
    return this;
  }

   /**
   * Asset Transaction Post Date.
   * @return assetTransactionPostDate
  **/
  @ApiModelProperty(required = true, value = "Asset Transaction Post Date.")

  public LocalDate getAssetTransactionPostDate() {
    return assetTransactionPostDate;
  }


  public void setAssetTransactionPostDate(LocalDate assetTransactionPostDate) {
    this.assetTransactionPostDate = assetTransactionPostDate;
  }


  public AssetTransactionDetail assetTransactionType(AssetTransactionType assetTransactionType) {
    
    this.assetTransactionType = assetTransactionType;
    return this;
  }

   /**
   * Get assetTransactionType
   * @return assetTransactionType
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetTransactionType getAssetTransactionType() {
    return assetTransactionType;
  }


  public void setAssetTransactionType(AssetTransactionType assetTransactionType) {
    this.assetTransactionType = assetTransactionType;
  }


  public AssetTransactionDetail assetTransactionPaidByName(String assetTransactionPaidByName) {
    
    this.assetTransactionPaidByName = assetTransactionPaidByName;
    return this;
  }

   /**
   * Populate with who did the transaction.
   * @return assetTransactionPaidByName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Populate with who did the transaction.")

  public String getAssetTransactionPaidByName() {
    return assetTransactionPaidByName;
  }


  public void setAssetTransactionPaidByName(String assetTransactionPaidByName) {
    this.assetTransactionPaidByName = assetTransactionPaidByName;
  }


  public AssetTransactionDetail assetTransactionTypeAdditionalDescription(String assetTransactionTypeAdditionalDescription) {
    
    this.assetTransactionTypeAdditionalDescription = assetTransactionTypeAdditionalDescription;
    return this;
  }

   /**
   * FI Provided - examples are atm, cash, check, credit, debit, deposit, directDebit, directDeposit, dividend, fee, interest, other, payment, pointOfSale, repeatPayment, serviceCharge, transfer.
   * @return assetTransactionTypeAdditionalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "FI Provided - examples are atm, cash, check, credit, debit, deposit, directDebit, directDeposit, dividend, fee, interest, other, payment, pointOfSale, repeatPayment, serviceCharge, transfer.")

  public String getAssetTransactionTypeAdditionalDescription() {
    return assetTransactionTypeAdditionalDescription;
  }


  public void setAssetTransactionTypeAdditionalDescription(String assetTransactionTypeAdditionalDescription) {
    this.assetTransactionTypeAdditionalDescription = assetTransactionTypeAdditionalDescription;
  }


  public AssetTransactionDetail assetTransactionCategoryType(AssetTransactionCategoryType assetTransactionCategoryType) {
    
    this.assetTransactionCategoryType = assetTransactionCategoryType;
    return this;
  }

   /**
   * Get assetTransactionCategoryType
   * @return assetTransactionCategoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AssetTransactionCategoryType getAssetTransactionCategoryType() {
    return assetTransactionCategoryType;
  }


  public void setAssetTransactionCategoryType(AssetTransactionCategoryType assetTransactionCategoryType) {
    this.assetTransactionCategoryType = assetTransactionCategoryType;
  }


  public AssetTransactionDetail financialInstitutionTransactionIdentifier(String financialInstitutionTransactionIdentifier) {
    
    this.financialInstitutionTransactionIdentifier = financialInstitutionTransactionIdentifier;
    return this;
  }

   /**
   * FI provided Transaction Identifier.
   * @return financialInstitutionTransactionIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "FI provided Transaction Identifier.")

  public String getFinancialInstitutionTransactionIdentifier() {
    return financialInstitutionTransactionIdentifier;
  }


  public void setFinancialInstitutionTransactionIdentifier(String financialInstitutionTransactionIdentifier) {
    this.financialInstitutionTransactionIdentifier = financialInstitutionTransactionIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetTransactionDetail assetTransactionDetail = (AssetTransactionDetail) o;
    return Objects.equals(this.assetTransactionUniqueIdentifier, assetTransactionDetail.assetTransactionUniqueIdentifier) &&
        Objects.equals(this.assetTransactionAmount, assetTransactionDetail.assetTransactionAmount) &&
        Objects.equals(this.assetTransactionDate, assetTransactionDetail.assetTransactionDate) &&
        Objects.equals(this.assetTransactionPostDate, assetTransactionDetail.assetTransactionPostDate) &&
        Objects.equals(this.assetTransactionType, assetTransactionDetail.assetTransactionType) &&
        Objects.equals(this.assetTransactionPaidByName, assetTransactionDetail.assetTransactionPaidByName) &&
        Objects.equals(this.assetTransactionTypeAdditionalDescription, assetTransactionDetail.assetTransactionTypeAdditionalDescription) &&
        Objects.equals(this.assetTransactionCategoryType, assetTransactionDetail.assetTransactionCategoryType) &&
        Objects.equals(this.financialInstitutionTransactionIdentifier, assetTransactionDetail.financialInstitutionTransactionIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTransactionUniqueIdentifier, assetTransactionAmount, assetTransactionDate, assetTransactionPostDate, assetTransactionType, assetTransactionPaidByName, assetTransactionTypeAdditionalDescription, assetTransactionCategoryType, financialInstitutionTransactionIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetTransactionDetail {\n");
    sb.append("    assetTransactionUniqueIdentifier: ").append(toIndentedString(assetTransactionUniqueIdentifier)).append("\n");
    sb.append("    assetTransactionAmount: ").append(toIndentedString(assetTransactionAmount)).append("\n");
    sb.append("    assetTransactionDate: ").append(toIndentedString(assetTransactionDate)).append("\n");
    sb.append("    assetTransactionPostDate: ").append(toIndentedString(assetTransactionPostDate)).append("\n");
    sb.append("    assetTransactionType: ").append(toIndentedString(assetTransactionType)).append("\n");
    sb.append("    assetTransactionPaidByName: ").append(toIndentedString(assetTransactionPaidByName)).append("\n");
    sb.append("    assetTransactionTypeAdditionalDescription: ").append(toIndentedString(assetTransactionTypeAdditionalDescription)).append("\n");
    sb.append("    assetTransactionCategoryType: ").append(toIndentedString(assetTransactionCategoryType)).append("\n");
    sb.append("    financialInstitutionTransactionIdentifier: ").append(toIndentedString(financialInstitutionTransactionIdentifier)).append("\n");
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

