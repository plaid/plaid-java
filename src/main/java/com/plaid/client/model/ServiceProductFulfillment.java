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
import com.plaid.client.model.ServiceProductFulfillmentDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A collection of details related to a fulfillment service or product in terms of request, process and result.
 */
@ApiModel(description = "A collection of details related to a fulfillment service or product in terms of request, process and result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class ServiceProductFulfillment {
  public static final String SERIALIZED_NAME_S_E_R_V_I_C_E_P_R_O_D_U_C_T_F_U_L_F_I_L_L_M_E_N_T_D_E_T_A_I_L = "SERVICE_PRODUCT_FULFILLMENT_DETAIL";
  @SerializedName(SERIALIZED_NAME_S_E_R_V_I_C_E_P_R_O_D_U_C_T_F_U_L_F_I_L_L_M_E_N_T_D_E_T_A_I_L)
  private ServiceProductFulfillmentDetail SERVICE_PRODUCT_FULFILLMENT_DETAIL;


  public ServiceProductFulfillment SERVICE_PRODUCT_FULFILLMENT_DETAIL(ServiceProductFulfillmentDetail SERVICE_PRODUCT_FULFILLMENT_DETAIL) {
    
    this.SERVICE_PRODUCT_FULFILLMENT_DETAIL = SERVICE_PRODUCT_FULFILLMENT_DETAIL;
    return this;
  }

   /**
   * Get SERVICE_PRODUCT_FULFILLMENT_DETAIL
   * @return SERVICE_PRODUCT_FULFILLMENT_DETAIL
  **/
  @ApiModelProperty(required = true, value = "")

  public ServiceProductFulfillmentDetail getSERVICEPRODUCTFULFILLMENTDETAIL() {
    return SERVICE_PRODUCT_FULFILLMENT_DETAIL;
  }


  public void setSERVICEPRODUCTFULFILLMENTDETAIL(ServiceProductFulfillmentDetail SERVICE_PRODUCT_FULFILLMENT_DETAIL) {
    this.SERVICE_PRODUCT_FULFILLMENT_DETAIL = SERVICE_PRODUCT_FULFILLMENT_DETAIL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProductFulfillment serviceProductFulfillment = (ServiceProductFulfillment) o;
    return Objects.equals(this.SERVICE_PRODUCT_FULFILLMENT_DETAIL, serviceProductFulfillment.SERVICE_PRODUCT_FULFILLMENT_DETAIL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SERVICE_PRODUCT_FULFILLMENT_DETAIL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProductFulfillment {\n");
    sb.append("    SERVICE_PRODUCT_FULFILLMENT_DETAIL: ").append(toIndentedString(SERVICE_PRODUCT_FULFILLMENT_DETAIL)).append("\n");
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

