/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.WebhookType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SandboxItemFireWebhookRequest defines the request schema for &#x60;/sandbox/item/fire_webhook&#x60;
 */
@ApiModel(description = "SandboxItemFireWebhookRequest defines the request schema for `/sandbox/item/fire_webhook`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class SandboxItemFireWebhookRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private WebhookType webhookType;

  /**
   * The webhook codes that can be fired by this test endpoint.
   */
  @JsonAdapter(WebhookCodeEnum.Adapter.class)
  public enum WebhookCodeEnum {
    DEFAULT_UPDATE("DEFAULT_UPDATE"),
    
    NEW_ACCOUNTS_AVAILABLE("NEW_ACCOUNTS_AVAILABLE"),
    
    SMS_MICRODEPOSITS_VERIFICATION("SMS_MICRODEPOSITS_VERIFICATION"),
    
    AUTHORIZATION_GRANTED("AUTHORIZATION_GRANTED"),
    
    PENDING_DISCONNECT("PENDING_DISCONNECT"),
    
    RECURRING_TRANSACTIONS_UPDATE("RECURRING_TRANSACTIONS_UPDATE"),
    
    LOGIN_REPAIRED("LOGIN_REPAIRED"),
    
    SYNC_UPDATES_AVAILABLE("SYNC_UPDATES_AVAILABLE"),
    
    PRODUCT_READY("PRODUCT_READY"),
    
    ERROR("ERROR");

    USER_PERMISSION_REVOKED("USER_PERMISSION_REVOKED");

    USER_ACCOUNT_REVOKED("USER_ACCOUNT_REVOKED");

    private String value;

    WebhookCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WebhookCodeEnum fromValue(String value) {
      for (WebhookCodeEnum b : WebhookCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WebhookCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebhookCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebhookCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WebhookCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private WebhookCodeEnum webhookCode;


  public SandboxItemFireWebhookRequest clientId(String clientId) {
    
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


  public SandboxItemFireWebhookRequest secret(String secret) {
    
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


  public SandboxItemFireWebhookRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The access token associated with the Item data is being requested for.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public SandboxItemFireWebhookRequest webhookType(WebhookType webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * Get webhookType
   * @return webhookType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookType getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(WebhookType webhookType) {
    this.webhookType = webhookType;
  }


  public SandboxItemFireWebhookRequest webhookCode(WebhookCodeEnum webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * The webhook codes that can be fired by this test endpoint.
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "The webhook codes that can be fired by this test endpoint.")

  public WebhookCodeEnum getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(WebhookCodeEnum webhookCode) {
    this.webhookCode = webhookCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxItemFireWebhookRequest sandboxItemFireWebhookRequest = (SandboxItemFireWebhookRequest) o;
    return Objects.equals(this.clientId, sandboxItemFireWebhookRequest.clientId) &&
        Objects.equals(this.secret, sandboxItemFireWebhookRequest.secret) &&
        Objects.equals(this.accessToken, sandboxItemFireWebhookRequest.accessToken) &&
        Objects.equals(this.webhookType, sandboxItemFireWebhookRequest.webhookType) &&
        Objects.equals(this.webhookCode, sandboxItemFireWebhookRequest.webhookCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accessToken, webhookType, webhookCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxItemFireWebhookRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
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

