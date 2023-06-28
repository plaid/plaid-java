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
import com.plaid.client.model.CreditFreddieMacAssetTransactionVOE25;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class CreditFreddieMacAssetTransactionsVOE25 {
  public static final String SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N = "ASSET_TRANSACTION";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N)
  private List<CreditFreddieMacAssetTransactionVOE25> ASSET_TRANSACTION = new ArrayList<>();


  public CreditFreddieMacAssetTransactionsVOE25 ASSET_TRANSACTION(List<CreditFreddieMacAssetTransactionVOE25> ASSET_TRANSACTION) {
    
    this.ASSET_TRANSACTION = ASSET_TRANSACTION;
    return this;
  }

  public CreditFreddieMacAssetTransactionsVOE25 addASSETTRANSACTIONItem(CreditFreddieMacAssetTransactionVOE25 ASSET_TRANSACTIONItem) {
    this.ASSET_TRANSACTION.add(ASSET_TRANSACTIONItem);
    return this;
  }

   /**
   * Get ASSET_TRANSACTION
   * @return ASSET_TRANSACTION
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreditFreddieMacAssetTransactionVOE25> getASSETTRANSACTION() {
    return ASSET_TRANSACTION;
  }


  public void setASSETTRANSACTION(List<CreditFreddieMacAssetTransactionVOE25> ASSET_TRANSACTION) {
    this.ASSET_TRANSACTION = ASSET_TRANSACTION;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAssetTransactionsVOE25 creditFreddieMacAssetTransactionsVOE25 = (CreditFreddieMacAssetTransactionsVOE25) o;
    return Objects.equals(this.ASSET_TRANSACTION, creditFreddieMacAssetTransactionsVOE25.ASSET_TRANSACTION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET_TRANSACTION);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAssetTransactionsVOE25 {\n");
    sb.append("    ASSET_TRANSACTION: ").append(toIndentedString(ASSET_TRANSACTION)).append("\n");
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

