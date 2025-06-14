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
import com.plaid.client.model.AssetTransactionDescription;
import com.plaid.client.model.AssetTransactionDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing...
 */
@ApiModel(description = "An object representing...")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditFreddieMacAssetTransaction {
  public static final String SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_D_E_T_A_I_L = "ASSET_TRANSACTION_DETAIL";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_D_E_T_A_I_L)
  private AssetTransactionDetail ASSET_TRANSACTION_DETAIL;

  public static final String SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_D_E_S_C_R_I_P_T_I_O_N = "ASSET_TRANSACTION_DESCRIPTION";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_D_E_S_C_R_I_P_T_I_O_N)
  private List<AssetTransactionDescription> ASSET_TRANSACTION_DESCRIPTION = new ArrayList<>();


  public CreditFreddieMacAssetTransaction ASSET_TRANSACTION_DETAIL(AssetTransactionDetail ASSET_TRANSACTION_DETAIL) {
    
    this.ASSET_TRANSACTION_DETAIL = ASSET_TRANSACTION_DETAIL;
    return this;
  }

   /**
   * Get ASSET_TRANSACTION_DETAIL
   * @return ASSET_TRANSACTION_DETAIL
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetTransactionDetail getASSETTRANSACTIONDETAIL() {
    return ASSET_TRANSACTION_DETAIL;
  }


  public void setASSETTRANSACTIONDETAIL(AssetTransactionDetail ASSET_TRANSACTION_DETAIL) {
    this.ASSET_TRANSACTION_DETAIL = ASSET_TRANSACTION_DETAIL;
  }


  public CreditFreddieMacAssetTransaction ASSET_TRANSACTION_DESCRIPTION(List<AssetTransactionDescription> ASSET_TRANSACTION_DESCRIPTION) {
    
    this.ASSET_TRANSACTION_DESCRIPTION = ASSET_TRANSACTION_DESCRIPTION;
    return this;
  }

  public CreditFreddieMacAssetTransaction addASSETTRANSACTIONDESCRIPTIONItem(AssetTransactionDescription ASSET_TRANSACTION_DESCRIPTIONItem) {
    this.ASSET_TRANSACTION_DESCRIPTION.add(ASSET_TRANSACTION_DESCRIPTIONItem);
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return ASSET_TRANSACTION_DESCRIPTION
  **/
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public List<AssetTransactionDescription> getASSETTRANSACTIONDESCRIPTION() {
    return ASSET_TRANSACTION_DESCRIPTION;
  }


  public void setASSETTRANSACTIONDESCRIPTION(List<AssetTransactionDescription> ASSET_TRANSACTION_DESCRIPTION) {
    this.ASSET_TRANSACTION_DESCRIPTION = ASSET_TRANSACTION_DESCRIPTION;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAssetTransaction creditFreddieMacAssetTransaction = (CreditFreddieMacAssetTransaction) o;
    return Objects.equals(this.ASSET_TRANSACTION_DETAIL, creditFreddieMacAssetTransaction.ASSET_TRANSACTION_DETAIL) &&
        Objects.equals(this.ASSET_TRANSACTION_DESCRIPTION, creditFreddieMacAssetTransaction.ASSET_TRANSACTION_DESCRIPTION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET_TRANSACTION_DETAIL, ASSET_TRANSACTION_DESCRIPTION);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAssetTransaction {\n");
    sb.append("    ASSET_TRANSACTION_DETAIL: ").append(toIndentedString(ASSET_TRANSACTION_DETAIL)).append("\n");
    sb.append("    ASSET_TRANSACTION_DESCRIPTION: ").append(toIndentedString(ASSET_TRANSACTION_DESCRIPTION)).append("\n");
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

