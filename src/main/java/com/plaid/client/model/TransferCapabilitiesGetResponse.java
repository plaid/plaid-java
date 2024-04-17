/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.InstitutionSupportedNetworks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the response schema for &#x60;/transfer/capabilities/get&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/capabilities/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class TransferCapabilitiesGetResponse {
  public static final String SERIALIZED_NAME_INSTITUTION_SUPPORTED_NETWORKS = "institution_supported_networks";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_SUPPORTED_NETWORKS)
  private InstitutionSupportedNetworks institutionSupportedNetworks;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransferCapabilitiesGetResponse institutionSupportedNetworks(InstitutionSupportedNetworks institutionSupportedNetworks) {
    
    this.institutionSupportedNetworks = institutionSupportedNetworks;
    return this;
  }

   /**
   * Get institutionSupportedNetworks
   * @return institutionSupportedNetworks
  **/
  @ApiModelProperty(required = true, value = "")

  public InstitutionSupportedNetworks getInstitutionSupportedNetworks() {
    return institutionSupportedNetworks;
  }


  public void setInstitutionSupportedNetworks(InstitutionSupportedNetworks institutionSupportedNetworks) {
    this.institutionSupportedNetworks = institutionSupportedNetworks;
  }


  public TransferCapabilitiesGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCapabilitiesGetResponse transferCapabilitiesGetResponse = (TransferCapabilitiesGetResponse) o;
    return Objects.equals(this.institutionSupportedNetworks, transferCapabilitiesGetResponse.institutionSupportedNetworks) &&
        Objects.equals(this.requestId, transferCapabilitiesGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionSupportedNetworks, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCapabilitiesGetResponse {\n");
    sb.append("    institutionSupportedNetworks: ").append(toIndentedString(institutionSupportedNetworks)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

