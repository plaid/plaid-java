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
import com.plaid.client.model.CreditFreddieMacParty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of objects that define specific parties to a deal. This includes the direct participating parties, such as borrower and seller and the indirect parties such as the credit report provider.
 */
@ApiModel(description = "A collection of objects that define specific parties to a deal. This includes the direct participating parties, such as borrower and seller and the indirect parties such as the credit report provider.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class CreditFreddieMacParties {
  public static final String SERIALIZED_NAME_P_A_R_T_Y = "PARTY";
  @SerializedName(SERIALIZED_NAME_P_A_R_T_Y)
  private List<CreditFreddieMacParty> PARTY = new ArrayList<>();


  public CreditFreddieMacParties PARTY(List<CreditFreddieMacParty> PARTY) {
    
    this.PARTY = PARTY;
    return this;
  }

  public CreditFreddieMacParties addPARTYItem(CreditFreddieMacParty PARTYItem) {
    this.PARTY.add(PARTYItem);
    return this;
  }

   /**
   * Get PARTY
   * @return PARTY
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreditFreddieMacParty> getPARTY() {
    return PARTY;
  }


  public void setPARTY(List<CreditFreddieMacParty> PARTY) {
    this.PARTY = PARTY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacParties creditFreddieMacParties = (CreditFreddieMacParties) o;
    return Objects.equals(this.PARTY, creditFreddieMacParties.PARTY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PARTY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacParties {\n");
    sb.append("    PARTY: ").append(toIndentedString(PARTY)).append("\n");
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

