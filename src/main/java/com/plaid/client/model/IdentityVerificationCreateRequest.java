/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
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
import com.plaid.client.model.IdentityVerificationCreateRequestUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request schema for &#39;/identity_verification/create&#39;
 */
@ApiModel(description = "Request schema for '/identity_verification/create'")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class IdentityVerificationCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_IS_SHAREABLE = "is_shareable";
  @SerializedName(SERIALIZED_NAME_IS_SHAREABLE)
  private Boolean isShareable;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_GAVE_CONSENT = "gave_consent";
  @SerializedName(SERIALIZED_NAME_GAVE_CONSENT)
  private Boolean gaveConsent = false;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private IdentityVerificationCreateRequestUser user;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_IS_IDEMPOTENT = "is_idempotent";
  @SerializedName(SERIALIZED_NAME_IS_IDEMPOTENT)
  private Boolean isIdempotent;


  public IdentityVerificationCreateRequest clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the &#x60;/link/token/create&#x60; &#x60;client_user_id&#x60; to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;.
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-db-id-3b24110", value = "A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the `/link/token/create` `client_user_id` to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public IdentityVerificationCreateRequest isShareable(Boolean isShareable) {
    
    this.isShareable = isShareable;
    return this;
  }

   /**
   * A flag specifying whether you would like Plaid to expose a shareable URL for the verification being created.
   * @return isShareable
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag specifying whether you would like Plaid to expose a shareable URL for the verification being created.")

  public Boolean getIsShareable() {
    return isShareable;
  }


  public void setIsShareable(Boolean isShareable) {
    this.isShareable = isShareable;
  }


  public IdentityVerificationCreateRequest templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * ID of the associated Identity Verification template.
   * @return templateId
  **/
  @ApiModelProperty(example = "idvtmp_4FrXJvfQU3zGUR", required = true, value = "ID of the associated Identity Verification template.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public IdentityVerificationCreateRequest gaveConsent(Boolean gaveConsent) {
    
    this.gaveConsent = gaveConsent;
    return this;
  }

   /**
   * A flag specifying whether the end user has already agreed to a privacy policy specifying that their data will be shared with Plaid for verification purposes.  If &#x60;gave_consent&#x60; is set to &#x60;true&#x60;, the &#x60;accept_tos&#x60; step will be marked as &#x60;skipped&#x60; and the end user&#39;s session will start at the next step requirement.
   * @return gaveConsent
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag specifying whether the end user has already agreed to a privacy policy specifying that their data will be shared with Plaid for verification purposes.  If `gave_consent` is set to `true`, the `accept_tos` step will be marked as `skipped` and the end user's session will start at the next step requirement.")

  public Boolean getGaveConsent() {
    return gaveConsent;
  }


  public void setGaveConsent(Boolean gaveConsent) {
    this.gaveConsent = gaveConsent;
  }


  public IdentityVerificationCreateRequest user(IdentityVerificationCreateRequestUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationCreateRequestUser getUser() {
    return user;
  }


  public void setUser(IdentityVerificationCreateRequestUser user) {
    this.user = user;
  }


  public IdentityVerificationCreateRequest clientId(String clientId) {
    
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


  public IdentityVerificationCreateRequest secret(String secret) {
    
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


  public IdentityVerificationCreateRequest isIdempotent(Boolean isIdempotent) {
    
    this.isIdempotent = isIdempotent;
    return this;
  }

   /**
   * An optional flag specifying how you would like Plaid to handle attempts to create an Identity Verification when an Identity Verification already exists for the provided &#x60;client_user_id&#x60; and &#x60;template_id&#x60;. If idempotency is enabled, Plaid will return the existing Identity Verification. If idempotency is disabled, Plaid will reject the request with a &#x60;400 Bad Request&#x60; status code if an Identity Verification already exists for the supplied &#x60;client_user_id&#x60; and &#x60;template_id&#x60;.
   * @return isIdempotent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "An optional flag specifying how you would like Plaid to handle attempts to create an Identity Verification when an Identity Verification already exists for the provided `client_user_id` and `template_id`. If idempotency is enabled, Plaid will return the existing Identity Verification. If idempotency is disabled, Plaid will reject the request with a `400 Bad Request` status code if an Identity Verification already exists for the supplied `client_user_id` and `template_id`.")

  public Boolean getIsIdempotent() {
    return isIdempotent;
  }


  public void setIsIdempotent(Boolean isIdempotent) {
    this.isIdempotent = isIdempotent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationCreateRequest identityVerificationCreateRequest = (IdentityVerificationCreateRequest) o;
    return Objects.equals(this.clientUserId, identityVerificationCreateRequest.clientUserId) &&
        Objects.equals(this.isShareable, identityVerificationCreateRequest.isShareable) &&
        Objects.equals(this.templateId, identityVerificationCreateRequest.templateId) &&
        Objects.equals(this.gaveConsent, identityVerificationCreateRequest.gaveConsent) &&
        Objects.equals(this.user, identityVerificationCreateRequest.user) &&
        Objects.equals(this.clientId, identityVerificationCreateRequest.clientId) &&
        Objects.equals(this.secret, identityVerificationCreateRequest.secret) &&
        Objects.equals(this.isIdempotent, identityVerificationCreateRequest.isIdempotent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, isShareable, templateId, gaveConsent, user, clientId, secret, isIdempotent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationCreateRequest {\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    isShareable: ").append(toIndentedString(isShareable)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    gaveConsent: ").append(toIndentedString(gaveConsent)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    isIdempotent: ").append(toIndentedString(isIdempotent)).append("\n");
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

