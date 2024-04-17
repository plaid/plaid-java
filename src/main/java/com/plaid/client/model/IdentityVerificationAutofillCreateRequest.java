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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request input to autofill an Identity Verification
 */
@ApiModel(description = "Request input to autofill an Identity Verification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class IdentityVerificationAutofillCreateRequest {
  public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_ID = "identity_verification_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_ID)
  private String identityVerificationId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;


  public IdentityVerificationAutofillCreateRequest identityVerificationId(String identityVerificationId) {
    
    this.identityVerificationId = identityVerificationId;
    return this;
  }

   /**
   * ID of the associated Identity Verification attempt.
   * @return identityVerificationId
  **/
  @ApiModelProperty(example = "idv_52xR9LKo77r1Np", required = true, value = "ID of the associated Identity Verification attempt.")

  public String getIdentityVerificationId() {
    return identityVerificationId;
  }


  public void setIdentityVerificationId(String identityVerificationId) {
    this.identityVerificationId = identityVerificationId;
  }


  public IdentityVerificationAutofillCreateRequest clientId(String clientId) {
    
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


  public IdentityVerificationAutofillCreateRequest secret(String secret) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationAutofillCreateRequest identityVerificationAutofillCreateRequest = (IdentityVerificationAutofillCreateRequest) o;
    return Objects.equals(this.identityVerificationId, identityVerificationAutofillCreateRequest.identityVerificationId) &&
        Objects.equals(this.clientId, identityVerificationAutofillCreateRequest.clientId) &&
        Objects.equals(this.secret, identityVerificationAutofillCreateRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityVerificationId, clientId, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationAutofillCreateRequest {\n");
    sb.append("    identityVerificationId: ").append(toIndentedString(identityVerificationId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

