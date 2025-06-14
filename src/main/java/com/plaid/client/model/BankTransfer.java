/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
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
import com.plaid.client.model.BankTransferDirection;
import com.plaid.client.model.BankTransferFailure;
import com.plaid.client.model.BankTransferNetwork;
import com.plaid.client.model.BankTransferStatus;
import com.plaid.client.model.BankTransferType;
import com.plaid.client.model.BankTransferUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a bank transfer within the Bank Transfers API.
 */
@ApiModel(description = "Represents a bank transfer within the Bank Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class BankTransfer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BankTransferType type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private BankTransferUser user;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BankTransferStatus status;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private BankTransferNetwork network;

  public static final String SERIALIZED_NAME_CANCELLABLE = "cancellable";
  @SerializedName(SERIALIZED_NAME_CANCELLABLE)
  private Boolean cancellable;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private BankTransferFailure failureReason;

  public static final String SERIALIZED_NAME_CUSTOM_TAG = "custom_tag";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TAG)
  private String customTag;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private BankTransferDirection direction;


  public BankTransfer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid’s unique identifier for a bank transfer.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a bank transfer.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BankTransfer achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @ApiModelProperty(required = true, value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public BankTransfer accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID that should be credited/debited for this bank transfer.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The account ID that should be credited/debited for this bank transfer.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public BankTransfer type(BankTransferType type) {
    
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


  public BankTransfer user(BankTransferUser user) {
    
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


  public BankTransfer amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the bank transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the bank transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BankTransfer isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount, e.g. \&quot;USD\&quot;
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the transfer amount, e.g. \"USD\"")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public BankTransfer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the transfer.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the transfer.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BankTransfer created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when this bank transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when this bank transfer was created. This will be of the form `2006-01-02T15:04:05Z`")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public BankTransfer status(BankTransferStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public BankTransferStatus getStatus() {
    return status;
  }


  public void setStatus(BankTransferStatus status) {
    this.status = status;
  }


  public BankTransfer network(BankTransferNetwork network) {
    
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


  public BankTransfer cancellable(Boolean cancellable) {
    
    this.cancellable = cancellable;
    return this;
  }

   /**
   * When &#x60;true&#x60;, you can still cancel this bank transfer.
   * @return cancellable
  **/
  @ApiModelProperty(required = true, value = "When `true`, you can still cancel this bank transfer.")

  public Boolean getCancellable() {
    return cancellable;
  }


  public void setCancellable(Boolean cancellable) {
    this.cancellable = cancellable;
  }


  public BankTransfer failureReason(BankTransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public BankTransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(BankTransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  public BankTransfer customTag(String customTag) {
    
    this.customTag = customTag;
    return this;
  }

   /**
   * A string containing the custom tag provided by the client in the create request. Will be null if not provided.
   * @return customTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string containing the custom tag provided by the client in the create request. Will be null if not provided.")

  public String getCustomTag() {
    return customTag;
  }


  public void setCustomTag(String customTag) {
    this.customTag = customTag;
  }


  public BankTransfer metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public BankTransfer putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public BankTransfer originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account that was used for this transfer.
   * @return originationAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the origination account that was used for this transfer.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public BankTransfer direction(BankTransferDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public BankTransferDirection getDirection() {
    return direction;
  }


  public void setDirection(BankTransferDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransfer bankTransfer = (BankTransfer) o;
    return Objects.equals(this.id, bankTransfer.id) &&
        Objects.equals(this.achClass, bankTransfer.achClass) &&
        Objects.equals(this.accountId, bankTransfer.accountId) &&
        Objects.equals(this.type, bankTransfer.type) &&
        Objects.equals(this.user, bankTransfer.user) &&
        Objects.equals(this.amount, bankTransfer.amount) &&
        Objects.equals(this.isoCurrencyCode, bankTransfer.isoCurrencyCode) &&
        Objects.equals(this.description, bankTransfer.description) &&
        Objects.equals(this.created, bankTransfer.created) &&
        Objects.equals(this.status, bankTransfer.status) &&
        Objects.equals(this.network, bankTransfer.network) &&
        Objects.equals(this.cancellable, bankTransfer.cancellable) &&
        Objects.equals(this.failureReason, bankTransfer.failureReason) &&
        Objects.equals(this.customTag, bankTransfer.customTag) &&
        Objects.equals(this.metadata, bankTransfer.metadata) &&
        Objects.equals(this.originationAccountId, bankTransfer.originationAccountId) &&
        Objects.equals(this.direction, bankTransfer.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, achClass, accountId, type, user, amount, isoCurrencyCode, description, created, status, network, cancellable, failureReason, customTag, metadata, originationAccountId, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransfer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    cancellable: ").append(toIndentedString(cancellable)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

