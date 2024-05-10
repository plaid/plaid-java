/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
import com.plaid.client.model.LinkSessionSuccessMetadataInstitution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The details of a digital payroll income verification in Link.
 */
@ApiModel(description = "The details of a digital payroll income verification in Link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class LinkSessionPayrollIncomeResult {
  public static final String SERIALIZED_NAME_NUM_PAYSTUBS_RETRIEVED = "num_paystubs_retrieved";
  @SerializedName(SERIALIZED_NAME_NUM_PAYSTUBS_RETRIEVED)
  private Integer numPaystubsRetrieved;

  public static final String SERIALIZED_NAME_NUM_W2S_RETRIEVED = "num_w2s_retrieved";
  @SerializedName(SERIALIZED_NAME_NUM_W2S_RETRIEVED)
  private Integer numW2sRetrieved;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private LinkSessionSuccessMetadataInstitution institution;


  public LinkSessionPayrollIncomeResult numPaystubsRetrieved(Integer numPaystubsRetrieved) {
    
    this.numPaystubsRetrieved = numPaystubsRetrieved;
    return this;
  }

   /**
   * The number of paystubs retrieved from a payroll provider.
   * @return numPaystubsRetrieved
  **/
  @ApiModelProperty(required = true, value = "The number of paystubs retrieved from a payroll provider.")

  public Integer getNumPaystubsRetrieved() {
    return numPaystubsRetrieved;
  }


  public void setNumPaystubsRetrieved(Integer numPaystubsRetrieved) {
    this.numPaystubsRetrieved = numPaystubsRetrieved;
  }


  public LinkSessionPayrollIncomeResult numW2sRetrieved(Integer numW2sRetrieved) {
    
    this.numW2sRetrieved = numW2sRetrieved;
    return this;
  }

   /**
   * The number of W-2s retrieved from a payroll provider.
   * @return numW2sRetrieved
  **/
  @ApiModelProperty(required = true, value = "The number of W-2s retrieved from a payroll provider.")

  public Integer getNumW2sRetrieved() {
    return numW2sRetrieved;
  }


  public void setNumW2sRetrieved(Integer numW2sRetrieved) {
    this.numW2sRetrieved = numW2sRetrieved;
  }


  public LinkSessionPayrollIncomeResult institution(LinkSessionSuccessMetadataInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public LinkSessionSuccessMetadataInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(LinkSessionSuccessMetadataInstitution institution) {
    this.institution = institution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionPayrollIncomeResult linkSessionPayrollIncomeResult = (LinkSessionPayrollIncomeResult) o;
    return Objects.equals(this.numPaystubsRetrieved, linkSessionPayrollIncomeResult.numPaystubsRetrieved) &&
        Objects.equals(this.numW2sRetrieved, linkSessionPayrollIncomeResult.numW2sRetrieved) &&
        Objects.equals(this.institution, linkSessionPayrollIncomeResult.institution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPaystubsRetrieved, numW2sRetrieved, institution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionPayrollIncomeResult {\n");
    sb.append("    numPaystubsRetrieved: ").append(toIndentedString(numPaystubsRetrieved)).append("\n");
    sb.append("    numW2sRetrieved: ").append(toIndentedString(numW2sRetrieved)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
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

