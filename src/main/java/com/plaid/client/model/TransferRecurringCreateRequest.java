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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferDevice;
import com.plaid.client.model.TransferRecurringNetwork;
import com.plaid.client.model.TransferRecurringSchedule;
import com.plaid.client.model.TransferType;
import com.plaid.client.model.TransferUserInRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/recurring/create&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/recurring/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class TransferRecurringCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransferType type;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferRecurringNetwork network;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_USER_PRESENT = "user_present";
  @SerializedName(SERIALIZED_NAME_USER_PRESENT)
  private Boolean userPresent;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private TransferRecurringSchedule schedule;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInRequest user;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private TransferDevice device;


  public TransferRecurringCreateRequest clientId(String clientId) {
    
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


  public TransferRecurringCreateRequest secret(String secret) {
    
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


  public TransferRecurringCreateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The Plaid &#x60;access_token&#x60; for the account that will be debited or credited.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The Plaid `access_token` for the account that will be debited or credited.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public TransferRecurringCreateRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique recurring transfer. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a recurring fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single recurring transfer is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A random key provided by the client, per unique recurring transfer. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a recurring fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single recurring transfer is created.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public TransferRecurringCreateRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; corresponding to the end-user account that will be debited or credited.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `account_id` corresponding to the end-user account that will be debited or credited.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferRecurringCreateRequest fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * Specify the account used to fund the transfer. Customers can find a list of &#x60;funding_account_id&#x60;s in the Accounts page of your Plaid Dashboard, under the \&quot;Account ID\&quot; column. If this field is left blank, it will default to the default &#x60;funding_account_id&#x60; specified during onboarding.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the account used to fund the transfer. Customers can find a list of `funding_account_id`s in the Accounts page of your Plaid Dashboard, under the \"Account ID\" column. If this field is left blank, it will default to the default `funding_account_id` specified during onboarding.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferRecurringCreateRequest type(TransferType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferType getType() {
    return type;
  }


  public void setType(TransferType type) {
    this.type = type;
  }


  public TransferRecurringCreateRequest network(TransferRecurringNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferRecurringNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferRecurringNetwork network) {
    this.network = network;
  }


  public TransferRecurringCreateRequest achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public TransferRecurringCreateRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). When calling &#x60;/transfer/authorization/create&#x60;, specify the maximum amount to authorize. When calling &#x60;/transfer/create&#x60;, specify the exact amount of the transfer, up to a maximum of the amount authorized. If this field is left blank when calling &#x60;/transfer/create&#x60;, the maximum amount authorized in the &#x60;authorization_id&#x60; will be sent.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\"). When calling `/transfer/authorization/create`, specify the maximum amount to authorize. When calling `/transfer/create`, specify the exact amount of the transfer, up to a maximum of the amount authorized. If this field is left blank when calling `/transfer/create`, the maximum amount authorized in the `authorization_id` will be sent.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferRecurringCreateRequest userPresent(Boolean userPresent) {
    
    this.userPresent = userPresent;
    return this;
  }

   /**
   * If the end user is initiating the specific transfer themselves via an interactive UI, this should be &#x60;true&#x60;; for automatic recurring payments where the end user is not actually initiating each individual transfer, it should be &#x60;false&#x60;.
   * @return userPresent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the end user is initiating the specific transfer themselves via an interactive UI, this should be `true`; for automatic recurring payments where the end user is not actually initiating each individual transfer, it should be `false`.")

  public Boolean getUserPresent() {
    return userPresent;
  }


  public void setUserPresent(Boolean userPresent) {
    this.userPresent = userPresent;
  }


  public TransferRecurringCreateRequest isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount. The default value is \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency of the transfer amount. The default value is \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public TransferRecurringCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the recurring transfer.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the recurring transfer.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferRecurringCreateRequest testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock. This field may only be used when using &#x60;sandbox&#x60; environment. If provided, the created &#x60;recurring_transfer&#x60; is associated with the &#x60;test_clock&#x60;. New originations are automatically generated when the associated &#x60;test_clock&#x60; advances.
   * @return testClockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a test clock. This field may only be used when using `sandbox` environment. If provided, the created `recurring_transfer` is associated with the `test_clock`. New originations are automatically generated when the associated `test_clock` advances.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  public TransferRecurringCreateRequest schedule(TransferRecurringSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferRecurringSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(TransferRecurringSchedule schedule) {
    this.schedule = schedule;
  }


  public TransferRecurringCreateRequest user(TransferUserInRequest user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferUserInRequest getUser() {
    return user;
  }


  public void setUser(TransferUserInRequest user) {
    this.user = user;
  }


  public TransferRecurringCreateRequest device(TransferDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferDevice getDevice() {
    return device;
  }


  public void setDevice(TransferDevice device) {
    this.device = device;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRecurringCreateRequest transferRecurringCreateRequest = (TransferRecurringCreateRequest) o;
    return Objects.equals(this.clientId, transferRecurringCreateRequest.clientId) &&
        Objects.equals(this.secret, transferRecurringCreateRequest.secret) &&
        Objects.equals(this.accessToken, transferRecurringCreateRequest.accessToken) &&
        Objects.equals(this.idempotencyKey, transferRecurringCreateRequest.idempotencyKey) &&
        Objects.equals(this.accountId, transferRecurringCreateRequest.accountId) &&
        Objects.equals(this.fundingAccountId, transferRecurringCreateRequest.fundingAccountId) &&
        Objects.equals(this.type, transferRecurringCreateRequest.type) &&
        Objects.equals(this.network, transferRecurringCreateRequest.network) &&
        Objects.equals(this.achClass, transferRecurringCreateRequest.achClass) &&
        Objects.equals(this.amount, transferRecurringCreateRequest.amount) &&
        Objects.equals(this.userPresent, transferRecurringCreateRequest.userPresent) &&
        Objects.equals(this.isoCurrencyCode, transferRecurringCreateRequest.isoCurrencyCode) &&
        Objects.equals(this.description, transferRecurringCreateRequest.description) &&
        Objects.equals(this.testClockId, transferRecurringCreateRequest.testClockId) &&
        Objects.equals(this.schedule, transferRecurringCreateRequest.schedule) &&
        Objects.equals(this.user, transferRecurringCreateRequest.user) &&
        Objects.equals(this.device, transferRecurringCreateRequest.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accessToken, idempotencyKey, accountId, fundingAccountId, type, network, achClass, amount, userPresent, isoCurrencyCode, description, testClockId, schedule, user, device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRecurringCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    userPresent: ").append(toIndentedString(userPresent)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

