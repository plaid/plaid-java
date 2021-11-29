/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.0
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
import com.plaid.client.model.BankTransferNetwork;
import com.plaid.client.model.BankTransferType;
import com.plaid.client.model.BankTransferUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines the request schema for &#x60;/processor/bank_transfer/create&#x60;
 */
@ApiModel(description = "Defines the request schema for `/processor/bank_transfer/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T18:47:05.830Z[GMT]")
public class ProcessorBankTransferCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_PROCESSOR_TOKEN = "processor_token";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TOKEN)
  private String processorToken;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BankTransferType type;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private BankTransferNetwork network;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private BankTransferUser user;

  public static final String SERIALIZED_NAME_CUSTOM_TAG = "custom_tag";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TAG)
  private String customTag;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;


  public ProcessorBankTransferCreateRequest clientId(String clientId) {
    
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


  public ProcessorBankTransferCreateRequest secret(String secret) {
    
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


  public ProcessorBankTransferCreateRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique bank transfer. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a bank transfer fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single bank transfer is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A random key provided by the client, per unique bank transfer. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a bank transfer fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single bank transfer is created.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public ProcessorBankTransferCreateRequest processorToken(String processorToken) {
    
    this.processorToken = processorToken;
    return this;
  }

   /**
   * The processor token obtained from the Plaid integration partner. Processor tokens are in the format: &#x60;processor-&lt;environment&gt;-&lt;identifier&gt;&#x60;
   * @return processorToken
  **/
  @ApiModelProperty(required = true, value = "The processor token obtained from the Plaid integration partner. Processor tokens are in the format: `processor-<environment>-<identifier>`")

  public String getProcessorToken() {
    return processorToken;
  }


  public void setProcessorToken(String processorToken) {
    this.processorToken = processorToken;
  }


  public ProcessorBankTransferCreateRequest type(BankTransferType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferType getType() {
    return type;
  }


  public void setType(BankTransferType type) {
    this.type = type;
  }


  public ProcessorBankTransferCreateRequest network(BankTransferNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferNetwork getNetwork() {
    return network;
  }


  public void setNetwork(BankTransferNetwork network) {
    this.network = network;
  }


  public ProcessorBankTransferCreateRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the bank transfer (decimal string with two digits of precision e.g. “10.00”).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the bank transfer (decimal string with two digits of precision e.g. “10.00”).")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ProcessorBankTransferCreateRequest isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount – should be set to \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the transfer amount – should be set to \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public ProcessorBankTransferCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The transfer description. Maximum of 10 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The transfer description. Maximum of 10 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProcessorBankTransferCreateRequest achClass(ACHClass achClass) {
    
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


  public ProcessorBankTransferCreateRequest user(BankTransferUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferUser getUser() {
    return user;
  }


  public void setUser(BankTransferUser user) {
    this.user = user;
  }


  public ProcessorBankTransferCreateRequest customTag(String customTag) {
    
    this.customTag = customTag;
    return this;
  }

   /**
   * An arbitrary string provided by the client for storage with the bank transfer. May be up to 100 characters.
   * @return customTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An arbitrary string provided by the client for storage with the bank transfer. May be up to 100 characters.")

  public String getCustomTag() {
    return customTag;
  }


  public void setCustomTag(String customTag) {
    this.customTag = customTag;
  }


  public ProcessorBankTransferCreateRequest metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ProcessorBankTransferCreateRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public ProcessorBankTransferCreateRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account for this transfer. If you have more than one origination account, this value must be specified.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for the origination account for this transfer. If you have more than one origination account, this value must be specified.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorBankTransferCreateRequest processorBankTransferCreateRequest = (ProcessorBankTransferCreateRequest) o;
    return Objects.equals(this.clientId, processorBankTransferCreateRequest.clientId) &&
        Objects.equals(this.secret, processorBankTransferCreateRequest.secret) &&
        Objects.equals(this.idempotencyKey, processorBankTransferCreateRequest.idempotencyKey) &&
        Objects.equals(this.processorToken, processorBankTransferCreateRequest.processorToken) &&
        Objects.equals(this.type, processorBankTransferCreateRequest.type) &&
        Objects.equals(this.network, processorBankTransferCreateRequest.network) &&
        Objects.equals(this.amount, processorBankTransferCreateRequest.amount) &&
        Objects.equals(this.isoCurrencyCode, processorBankTransferCreateRequest.isoCurrencyCode) &&
        Objects.equals(this.description, processorBankTransferCreateRequest.description) &&
        Objects.equals(this.achClass, processorBankTransferCreateRequest.achClass) &&
        Objects.equals(this.user, processorBankTransferCreateRequest.user) &&
        Objects.equals(this.customTag, processorBankTransferCreateRequest.customTag) &&
        Objects.equals(this.metadata, processorBankTransferCreateRequest.metadata) &&
        Objects.equals(this.originationAccountId, processorBankTransferCreateRequest.originationAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, idempotencyKey, processorToken, type, network, amount, isoCurrencyCode, description, achClass, user, customTag, metadata, originationAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorBankTransferCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
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

