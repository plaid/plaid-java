/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains the state of a completed Link session, along with the public token if available. By default, the &#x60;SESSION_FINISHED&#x60; webhook is enabled only for clients that are enabled for Hosted Link. If you would like to receive this webhook and are not using Hosted Link, contact your Account Manager.
 */
@ApiModel(description = "Contains the state of a completed Link session, along with the public token if available. By default, the `SESSION_FINISHED` webhook is enabled only for clients that are enabled for Hosted Link. If you would like to receive this webhook and are not using Hosted Link, contact your Account Manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class LinkSessionFinishedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;

  public static final String SERIALIZED_NAME_PUBLIC_TOKEN = "public_token";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKEN)
  private String publicToken;

  public static final String SERIALIZED_NAME_PUBLIC_TOKENS = "public_tokens";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKENS)
  private List<String> publicTokens = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public LinkSessionFinishedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;LINK&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`LINK`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public LinkSessionFinishedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;SESSION_FINISHED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`SESSION_FINISHED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public LinkSessionFinishedWebhook status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The final status of the Link session. Will always be \&quot;SUCCESS\&quot; or \&quot;EXITED\&quot;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The final status of the Link session. Will always be \"SUCCESS\" or \"EXITED\".")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public LinkSessionFinishedWebhook linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * The identifier for the Link session.
   * @return linkSessionId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the Link session.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkSessionFinishedWebhook linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * The link token used to create the Link session.
   * @return linkToken
  **/
  @ApiModelProperty(required = true, value = "The link token used to create the Link session.")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  public LinkSessionFinishedWebhook publicToken(String publicToken) {
    
    this.publicToken = publicToken;
    return this;
  }

   /**
   * The public token generated by the Link session. This field has been deprecated; please use &#x60;public_tokens&#x60; instead.
   * @return publicToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public token generated by the Link session. This field has been deprecated; please use `public_tokens` instead.")

  public String getPublicToken() {
    return publicToken;
  }


  public void setPublicToken(String publicToken) {
    this.publicToken = publicToken;
  }


  public LinkSessionFinishedWebhook publicTokens(List<String> publicTokens) {
    
    this.publicTokens = publicTokens;
    return this;
  }

  public LinkSessionFinishedWebhook addPublicTokensItem(String publicTokensItem) {
    if (this.publicTokens == null) {
      this.publicTokens = new ArrayList<>();
    }
    this.publicTokens.add(publicTokensItem);
    return this;
  }

   /**
   * The public tokens generated by the Link session.
   * @return publicTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public tokens generated by the Link session.")

  public List<String> getPublicTokens() {
    return publicTokens;
  }


  public void setPublicTokens(List<String> publicTokens) {
    this.publicTokens = publicTokens;
  }


  public LinkSessionFinishedWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionFinishedWebhook linkSessionFinishedWebhook = (LinkSessionFinishedWebhook) o;
    return Objects.equals(this.webhookType, linkSessionFinishedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, linkSessionFinishedWebhook.webhookCode) &&
        Objects.equals(this.status, linkSessionFinishedWebhook.status) &&
        Objects.equals(this.linkSessionId, linkSessionFinishedWebhook.linkSessionId) &&
        Objects.equals(this.linkToken, linkSessionFinishedWebhook.linkToken) &&
        Objects.equals(this.publicToken, linkSessionFinishedWebhook.publicToken) &&
        Objects.equals(this.publicTokens, linkSessionFinishedWebhook.publicTokens) &&
        Objects.equals(this.environment, linkSessionFinishedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, status, linkSessionId, linkToken, publicToken, publicTokens, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionFinishedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
    sb.append("    publicTokens: ").append(toIndentedString(publicTokens)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

