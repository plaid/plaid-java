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
import com.plaid.client.model.TaxpayerIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The collection of TAXPAYER_IDENTIFICATION elements
 */
@ApiModel(description = "The collection of TAXPAYER_IDENTIFICATION elements")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class TaxpayerIdentifiers {
  public static final String SERIALIZED_NAME_T_A_X_P_A_Y_E_R_I_D_E_N_T_I_F_I_E_R = "TAXPAYER_IDENTIFIER";
  @SerializedName(SERIALIZED_NAME_T_A_X_P_A_Y_E_R_I_D_E_N_T_I_F_I_E_R)
  private TaxpayerIdentifier TAXPAYER_IDENTIFIER;


  public TaxpayerIdentifiers TAXPAYER_IDENTIFIER(TaxpayerIdentifier TAXPAYER_IDENTIFIER) {
    
    this.TAXPAYER_IDENTIFIER = TAXPAYER_IDENTIFIER;
    return this;
  }

   /**
   * Get TAXPAYER_IDENTIFIER
   * @return TAXPAYER_IDENTIFIER
  **/
  @ApiModelProperty(required = true, value = "")

  public TaxpayerIdentifier getTAXPAYERIDENTIFIER() {
    return TAXPAYER_IDENTIFIER;
  }


  public void setTAXPAYERIDENTIFIER(TaxpayerIdentifier TAXPAYER_IDENTIFIER) {
    this.TAXPAYER_IDENTIFIER = TAXPAYER_IDENTIFIER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxpayerIdentifiers taxpayerIdentifiers = (TaxpayerIdentifiers) o;
    return Objects.equals(this.TAXPAYER_IDENTIFIER, taxpayerIdentifiers.TAXPAYER_IDENTIFIER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TAXPAYER_IDENTIFIER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxpayerIdentifiers {\n");
    sb.append("    TAXPAYER_IDENTIFIER: ").append(toIndentedString(TAXPAYER_IDENTIFIER)).append("\n");
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

