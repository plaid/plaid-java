/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.84.5
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
import com.plaid.client.model.DepositSwitchCreateRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DepositSwitchCreateRequest defines the request schema for &#x60;/deposit_switch/create&#x60;
 */
@ApiModel(description = "DepositSwitchCreateRequest defines the request schema for `/deposit_switch/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T20:57:51.039Z[GMT]")
public class DepositSwitchCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TARGET_ACCESS_TOKEN = "target_access_token";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCESS_TOKEN)
  private String targetAccessToken;

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT_ID = "target_account_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT_ID)
  private String targetAccountId;

  /**
   * ISO-3166-1 alpha-2 country code standard.
   */
  @JsonAdapter(CountryCodeEnum.Adapter.class)
  public enum CountryCodeEnum {
    US("US"),
    
    CA("CA");

    private String value;

    CountryCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountryCodeEnum fromValue(String value) {
      for (CountryCodeEnum b : CountryCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CountryCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountryCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountryCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountryCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private CountryCodeEnum countryCode;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private DepositSwitchCreateRequestOptions options;


  public DepositSwitchCreateRequest clientId(String clientId) {
    
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


  public DepositSwitchCreateRequest secret(String secret) {
    
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


  public DepositSwitchCreateRequest targetAccessToken(String targetAccessToken) {
    
    this.targetAccessToken = targetAccessToken;
    return this;
  }

   /**
   * Access token for the target Item, typically provided in the Import Item response. 
   * @return targetAccessToken
  **/
  @ApiModelProperty(required = true, value = "Access token for the target Item, typically provided in the Import Item response. ")

  public String getTargetAccessToken() {
    return targetAccessToken;
  }


  public void setTargetAccessToken(String targetAccessToken) {
    this.targetAccessToken = targetAccessToken;
  }


  public DepositSwitchCreateRequest targetAccountId(String targetAccountId) {
    
    this.targetAccountId = targetAccountId;
    return this;
  }

   /**
   * Plaid Account ID that specifies the target bank account. This account will become the recipient for a user&#39;s direct deposit.
   * @return targetAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid Account ID that specifies the target bank account. This account will become the recipient for a user's direct deposit.")

  public String getTargetAccountId() {
    return targetAccountId;
  }


  public void setTargetAccountId(String targetAccountId) {
    this.targetAccountId = targetAccountId;
  }


  public DepositSwitchCreateRequest countryCode(CountryCodeEnum countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO-3166-1 alpha-2 country code standard.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO-3166-1 alpha-2 country code standard.")

  public CountryCodeEnum getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(CountryCodeEnum countryCode) {
    this.countryCode = countryCode;
  }


  public DepositSwitchCreateRequest options(DepositSwitchCreateRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DepositSwitchCreateRequestOptions getOptions() {
    return options;
  }


  public void setOptions(DepositSwitchCreateRequestOptions options) {
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
    DepositSwitchCreateRequest depositSwitchCreateRequest = (DepositSwitchCreateRequest) o;
    return Objects.equals(this.clientId, depositSwitchCreateRequest.clientId) &&
        Objects.equals(this.secret, depositSwitchCreateRequest.secret) &&
        Objects.equals(this.targetAccessToken, depositSwitchCreateRequest.targetAccessToken) &&
        Objects.equals(this.targetAccountId, depositSwitchCreateRequest.targetAccountId) &&
        Objects.equals(this.countryCode, depositSwitchCreateRequest.countryCode) &&
        Objects.equals(this.options, depositSwitchCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, targetAccessToken, targetAccountId, countryCode, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    targetAccessToken: ").append(toIndentedString(targetAccessToken)).append("\n");
    sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

