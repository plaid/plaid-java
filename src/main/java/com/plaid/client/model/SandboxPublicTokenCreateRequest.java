/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.20.6
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
import com.plaid.client.model.Products;
import com.plaid.client.model.SandboxPublicTokenCreateRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SandboxPublicTokenCreateRequest defines the request schema for &#x60;/sandbox/public_token/create&#x60;
 */
@ApiModel(description = "SandboxPublicTokenCreateRequest defines the request schema for `/sandbox/public_token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-13T06:10:09.571Z[GMT]")
public class SandboxPublicTokenCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INITIAL_PRODUCTS = "initial_products";
  @SerializedName(SERIALIZED_NAME_INITIAL_PRODUCTS)
  private List<Products> initialProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private SandboxPublicTokenCreateRequestOptions options;


  public SandboxPublicTokenCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SandboxPublicTokenCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SandboxPublicTokenCreateRequest institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID of the institution the Item will be associated with
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the institution the Item will be associated with")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public SandboxPublicTokenCreateRequest initialProducts(List<Products> initialProducts) {
    
    this.initialProducts = initialProducts;
    return this;
  }

  public SandboxPublicTokenCreateRequest addInitialProductsItem(Products initialProductsItem) {
    this.initialProducts.add(initialProductsItem);
    return this;
  }

   /**
   * The products to initially pull for the Item. May be any products that the specified &#x60;institution_id&#x60;  supports. This array may not be empty.
   * @return initialProducts
  **/
  @ApiModelProperty(required = true, value = "The products to initially pull for the Item. May be any products that the specified `institution_id`  supports. This array may not be empty.")

  public List<Products> getInitialProducts() {
    return initialProducts;
  }


  public void setInitialProducts(List<Products> initialProducts) {
    this.initialProducts = initialProducts;
  }


  public SandboxPublicTokenCreateRequest options(SandboxPublicTokenCreateRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SandboxPublicTokenCreateRequestOptions getOptions() {
    return options;
  }


  public void setOptions(SandboxPublicTokenCreateRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPublicTokenCreateRequest sandboxPublicTokenCreateRequest = (SandboxPublicTokenCreateRequest) o;
    return Objects.equals(this.clientId, sandboxPublicTokenCreateRequest.clientId) &&
        Objects.equals(this.secret, sandboxPublicTokenCreateRequest.secret) &&
        Objects.equals(this.institutionId, sandboxPublicTokenCreateRequest.institutionId) &&
        Objects.equals(this.initialProducts, sandboxPublicTokenCreateRequest.initialProducts) &&
        Objects.equals(this.options, sandboxPublicTokenCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, institutionId, initialProducts, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPublicTokenCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    initialProducts: ").append(toIndentedString(initialProducts)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

