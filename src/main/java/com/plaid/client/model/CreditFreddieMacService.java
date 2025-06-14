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
import com.plaid.client.model.CreditFreddieMacVerificationOfAsset;
import com.plaid.client.model.Statuses;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of details related to a fulfillment service or product in terms of request, process and result.
 */
@ApiModel(description = "A collection of details related to a fulfillment service or product in terms of request, process and result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditFreddieMacService {
  public static final String SERIALIZED_NAME_V_E_R_I_F_I_C_A_T_I_O_N_O_F_A_S_S_E_T = "VERIFICATION_OF_ASSET";
  @SerializedName(SERIALIZED_NAME_V_E_R_I_F_I_C_A_T_I_O_N_O_F_A_S_S_E_T)
  private List<CreditFreddieMacVerificationOfAsset> VERIFICATION_OF_ASSET = new ArrayList<>();

  public static final String SERIALIZED_NAME_S_T_A_T_U_S_E_S = "STATUSES";
  @SerializedName(SERIALIZED_NAME_S_T_A_T_U_S_E_S)
  private Statuses STATUSES;


  public CreditFreddieMacService VERIFICATION_OF_ASSET(List<CreditFreddieMacVerificationOfAsset> VERIFICATION_OF_ASSET) {
    
    this.VERIFICATION_OF_ASSET = VERIFICATION_OF_ASSET;
    return this;
  }

  public CreditFreddieMacService addVERIFICATIONOFASSETItem(CreditFreddieMacVerificationOfAsset VERIFICATION_OF_ASSETItem) {
    this.VERIFICATION_OF_ASSET.add(VERIFICATION_OF_ASSETItem);
    return this;
  }

   /**
   * Get VERIFICATION_OF_ASSET
   * @return VERIFICATION_OF_ASSET
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreditFreddieMacVerificationOfAsset> getVERIFICATIONOFASSET() {
    return VERIFICATION_OF_ASSET;
  }


  public void setVERIFICATIONOFASSET(List<CreditFreddieMacVerificationOfAsset> VERIFICATION_OF_ASSET) {
    this.VERIFICATION_OF_ASSET = VERIFICATION_OF_ASSET;
  }


  public CreditFreddieMacService STATUSES(Statuses STATUSES) {
    
    this.STATUSES = STATUSES;
    return this;
  }

   /**
   * Get STATUSES
   * @return STATUSES
  **/
  @ApiModelProperty(required = true, value = "")

  public Statuses getSTATUSES() {
    return STATUSES;
  }


  public void setSTATUSES(Statuses STATUSES) {
    this.STATUSES = STATUSES;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacService creditFreddieMacService = (CreditFreddieMacService) o;
    return Objects.equals(this.VERIFICATION_OF_ASSET, creditFreddieMacService.VERIFICATION_OF_ASSET) &&
        Objects.equals(this.STATUSES, creditFreddieMacService.STATUSES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(VERIFICATION_OF_ASSET, STATUSES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacService {\n");
    sb.append("    VERIFICATION_OF_ASSET: ").append(toIndentedString(VERIFICATION_OF_ASSET)).append("\n");
    sb.append("    STATUSES: ").append(toIndentedString(STATUSES)).append("\n");
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

