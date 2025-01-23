/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import com.plaid.client.model.PartnerEndCustomer;
import com.plaid.client.model.PartnerEndCustomerSecrets;
import com.plaid.client.model.PartnerEndCustomerStatus;
import com.plaid.client.model.PartnerEndCustomerWithSecretsAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The details for the newly created end customer, including secrets for Sandbox and Limited Production.
 */
@ApiModel(description = "The details for the newly created end customer, including secrets for Sandbox and Limited Production.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T20:55:58.809242Z[Etc/UTC]")
public class PartnerEndCustomerWithSecrets {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PartnerEndCustomerStatus status;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private PartnerEndCustomerSecrets secrets;


  public PartnerEndCustomerWithSecrets clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The &#x60;client_id&#x60; of the end customer.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `client_id` of the end customer.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PartnerEndCustomerWithSecrets companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * The company name associated with the end customer.
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company name associated with the end customer.")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public PartnerEndCustomerWithSecrets status(PartnerEndCustomerStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerStatus getStatus() {
    return status;
  }


  public void setStatus(PartnerEndCustomerStatus status) {
    this.status = status;
  }


  public PartnerEndCustomerWithSecrets secrets(PartnerEndCustomerSecrets secrets) {
    
    this.secrets = secrets;
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerSecrets getSecrets() {
    return secrets;
  }


  public void setSecrets(PartnerEndCustomerSecrets secrets) {
    this.secrets = secrets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerWithSecrets partnerEndCustomerWithSecrets = (PartnerEndCustomerWithSecrets) o;
    return Objects.equals(this.clientId, partnerEndCustomerWithSecrets.clientId) &&
        Objects.equals(this.companyName, partnerEndCustomerWithSecrets.companyName) &&
        Objects.equals(this.status, partnerEndCustomerWithSecrets.status) &&
        Objects.equals(this.secrets, partnerEndCustomerWithSecrets.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, companyName, status, secrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerWithSecrets {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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

