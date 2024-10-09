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
import com.plaid.client.model.AssetDetail;
import com.plaid.client.model.AssetHolder;
import com.plaid.client.model.AssetOwners;
import com.plaid.client.model.CreditFreddieMacAssetTransactions;
import com.plaid.client.model.ValidationSources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class CreditFreddieMacAsset {
  public static final String SERIALIZED_NAME_A_S_S_E_T_D_E_T_A_I_L = "ASSET_DETAIL";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_D_E_T_A_I_L)
  private AssetDetail ASSET_DETAIL;

  public static final String SERIALIZED_NAME_A_S_S_E_T_O_W_N_E_R_S = "ASSET_OWNERS";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_O_W_N_E_R_S)
  private AssetOwners ASSET_OWNERS;

  public static final String SERIALIZED_NAME_A_S_S_E_T_H_O_L_D_E_R = "ASSET_HOLDER";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_H_O_L_D_E_R)
  private AssetHolder ASSET_HOLDER;

  public static final String SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_S = "ASSET_TRANSACTIONS";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_S)
  private CreditFreddieMacAssetTransactions ASSET_TRANSACTIONS;

  public static final String SERIALIZED_NAME_V_A_L_I_D_A_T_I_O_N_S_O_U_R_C_E_S = "VALIDATION_SOURCES";
  @SerializedName(SERIALIZED_NAME_V_A_L_I_D_A_T_I_O_N_S_O_U_R_C_E_S)
  private ValidationSources VALIDATION_SOURCES;


  public CreditFreddieMacAsset ASSET_DETAIL(AssetDetail ASSET_DETAIL) {
    
    this.ASSET_DETAIL = ASSET_DETAIL;
    return this;
  }

   /**
   * Get ASSET_DETAIL
   * @return ASSET_DETAIL
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetDetail getASSETDETAIL() {
    return ASSET_DETAIL;
  }


  public void setASSETDETAIL(AssetDetail ASSET_DETAIL) {
    this.ASSET_DETAIL = ASSET_DETAIL;
  }


  public CreditFreddieMacAsset ASSET_OWNERS(AssetOwners ASSET_OWNERS) {
    
    this.ASSET_OWNERS = ASSET_OWNERS;
    return this;
  }

   /**
   * Get ASSET_OWNERS
   * @return ASSET_OWNERS
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetOwners getASSETOWNERS() {
    return ASSET_OWNERS;
  }


  public void setASSETOWNERS(AssetOwners ASSET_OWNERS) {
    this.ASSET_OWNERS = ASSET_OWNERS;
  }


  public CreditFreddieMacAsset ASSET_HOLDER(AssetHolder ASSET_HOLDER) {
    
    this.ASSET_HOLDER = ASSET_HOLDER;
    return this;
  }

   /**
   * Get ASSET_HOLDER
   * @return ASSET_HOLDER
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetHolder getASSETHOLDER() {
    return ASSET_HOLDER;
  }


  public void setASSETHOLDER(AssetHolder ASSET_HOLDER) {
    this.ASSET_HOLDER = ASSET_HOLDER;
  }


  public CreditFreddieMacAsset ASSET_TRANSACTIONS(CreditFreddieMacAssetTransactions ASSET_TRANSACTIONS) {
    
    this.ASSET_TRANSACTIONS = ASSET_TRANSACTIONS;
    return this;
  }

   /**
   * Get ASSET_TRANSACTIONS
   * @return ASSET_TRANSACTIONS
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacAssetTransactions getASSETTRANSACTIONS() {
    return ASSET_TRANSACTIONS;
  }


  public void setASSETTRANSACTIONS(CreditFreddieMacAssetTransactions ASSET_TRANSACTIONS) {
    this.ASSET_TRANSACTIONS = ASSET_TRANSACTIONS;
  }


  public CreditFreddieMacAsset VALIDATION_SOURCES(ValidationSources VALIDATION_SOURCES) {
    
    this.VALIDATION_SOURCES = VALIDATION_SOURCES;
    return this;
  }

   /**
   * Get VALIDATION_SOURCES
   * @return VALIDATION_SOURCES
  **/
  @ApiModelProperty(required = true, value = "")

  public ValidationSources getVALIDATIONSOURCES() {
    return VALIDATION_SOURCES;
  }


  public void setVALIDATIONSOURCES(ValidationSources VALIDATION_SOURCES) {
    this.VALIDATION_SOURCES = VALIDATION_SOURCES;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAsset creditFreddieMacAsset = (CreditFreddieMacAsset) o;
    return Objects.equals(this.ASSET_DETAIL, creditFreddieMacAsset.ASSET_DETAIL) &&
        Objects.equals(this.ASSET_OWNERS, creditFreddieMacAsset.ASSET_OWNERS) &&
        Objects.equals(this.ASSET_HOLDER, creditFreddieMacAsset.ASSET_HOLDER) &&
        Objects.equals(this.ASSET_TRANSACTIONS, creditFreddieMacAsset.ASSET_TRANSACTIONS) &&
        Objects.equals(this.VALIDATION_SOURCES, creditFreddieMacAsset.VALIDATION_SOURCES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET_DETAIL, ASSET_OWNERS, ASSET_HOLDER, ASSET_TRANSACTIONS, VALIDATION_SOURCES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAsset {\n");
    sb.append("    ASSET_DETAIL: ").append(toIndentedString(ASSET_DETAIL)).append("\n");
    sb.append("    ASSET_OWNERS: ").append(toIndentedString(ASSET_OWNERS)).append("\n");
    sb.append("    ASSET_HOLDER: ").append(toIndentedString(ASSET_HOLDER)).append("\n");
    sb.append("    ASSET_TRANSACTIONS: ").append(toIndentedString(ASSET_TRANSACTIONS)).append("\n");
    sb.append("    VALIDATION_SOURCES: ").append(toIndentedString(VALIDATION_SOURCES)).append("\n");
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

