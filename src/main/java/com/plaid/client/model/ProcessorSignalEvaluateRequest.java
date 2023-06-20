/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
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
import com.plaid.client.model.SignalDevice;
import com.plaid.client.model.SignalUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProcessorSignalEvaluateRequest defines the request schema for &#x60;/processor/signal/evaluate&#x60;
 */
@ApiModel(description = "ProcessorSignalEvaluateRequest defines the request schema for `/processor/signal/evaluate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class ProcessorSignalEvaluateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PROCESSOR_TOKEN = "processor_token";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TOKEN)
  private String processorToken;

  public static final String SERIALIZED_NAME_CLIENT_TRANSACTION_ID = "client_transaction_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_TRANSACTION_ID)
  private String clientTransactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_USER_PRESENT = "user_present";
  @SerializedName(SERIALIZED_NAME_USER_PRESENT)
  private Boolean userPresent;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_IS_RECURRING = "is_recurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_METHOD = "default_payment_method";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_METHOD)
  private String defaultPaymentMethod;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SignalUser user;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private SignalDevice device;


  public ProcessorSignalEvaluateRequest clientId(String clientId) {
    
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


  public ProcessorSignalEvaluateRequest secret(String secret) {
    
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


  public ProcessorSignalEvaluateRequest processorToken(String processorToken) {
    
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


  public ProcessorSignalEvaluateRequest clientTransactionId(String clientTransactionId) {
    
    this.clientTransactionId = clientTransactionId;
    return this;
  }

   /**
   * The unique ID that you would like to use to refer to this transaction. For your convenience mapping your internal data, you could use your internal ID/identifier for this transaction. The max length for this field is 36 characters.
   * @return clientTransactionId
  **/
  @ApiModelProperty(required = true, value = "The unique ID that you would like to use to refer to this transaction. For your convenience mapping your internal data, you could use your internal ID/identifier for this transaction. The max length for this field is 36 characters.")

  public String getClientTransactionId() {
    return clientTransactionId;
  }


  public void setClientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
  }


  public ProcessorSignalEvaluateRequest amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount, in USD (e.g. &#x60;102.05&#x60;)
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount, in USD (e.g. `102.05`)")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public ProcessorSignalEvaluateRequest userPresent(Boolean userPresent) {
    
    this.userPresent = userPresent;
    return this;
  }

   /**
   * &#x60;true&#x60; if the end user is present while initiating the ACH transfer and the endpoint is being called; &#x60;false&#x60; otherwise (for example, when the ACH transfer is scheduled and the end user is not present, or you call this endpoint after the ACH transfer but before submitting the Nacha file for ACH processing).
   * @return userPresent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if the end user is present while initiating the ACH transfer and the endpoint is being called; `false` otherwise (for example, when the ACH transfer is scheduled and the end user is not present, or you call this endpoint after the ACH transfer but before submitting the Nacha file for ACH processing).")

  public Boolean getUserPresent() {
    return userPresent;
  }


  public void setUserPresent(Boolean userPresent) {
    this.userPresent = userPresent;
  }


  public ProcessorSignalEvaluateRequest clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID is used to correlate requests by a user with multiple Items. The max length for this field is 36 characters. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;.
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID that identifies the end user in your system. This ID is used to correlate requests by a user with multiple Items. The max length for this field is 36 characters. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public ProcessorSignalEvaluateRequest isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * **true** if the ACH transaction is a recurring transaction; **false** otherwise 
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**true** if the ACH transaction is a recurring transaction; **false** otherwise ")

  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public ProcessorSignalEvaluateRequest defaultPaymentMethod(String defaultPaymentMethod) {
    
    this.defaultPaymentMethod = defaultPaymentMethod;
    return this;
  }

   /**
   * The default ACH or non-ACH payment method to complete the transaction. &#x60;SAME_DAY_ACH&#x60;: Same Day ACH by NACHA. The debit transaction is processed and settled on the same day &#x60;NEXT_DAY_ACH&#x60;: Next Day ACH settlement for debit transactions, offered by some payment processors &#x60;STANDARD_ACH&#x60;: standard ACH by NACHA &#x60;REAL_TIME_PAYMENTS&#x60;: real-time payments such as RTP and FedNow &#x60;DEBIT_CARD&#x60;: if the default payment is over debit card networks &#x60;MULTIPLE_PAYMENT_METHODS&#x60;: if there is no default debit rail or there are multiple payment methods Possible values:  &#x60;SAME_DAY_ACH&#x60;, &#x60;NEXT_DAY_ACH&#x60;, &#x60;STANDARD_ACH&#x60;, &#x60;REAL_TIME_PAYMENTS&#x60;, &#x60;DEBIT_CARD&#x60;, &#x60;MULTIPLE_PAYMENT_METHODS&#x60;
   * @return defaultPaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default ACH or non-ACH payment method to complete the transaction. `SAME_DAY_ACH`: Same Day ACH by NACHA. The debit transaction is processed and settled on the same day `NEXT_DAY_ACH`: Next Day ACH settlement for debit transactions, offered by some payment processors `STANDARD_ACH`: standard ACH by NACHA `REAL_TIME_PAYMENTS`: real-time payments such as RTP and FedNow `DEBIT_CARD`: if the default payment is over debit card networks `MULTIPLE_PAYMENT_METHODS`: if there is no default debit rail or there are multiple payment methods Possible values:  `SAME_DAY_ACH`, `NEXT_DAY_ACH`, `STANDARD_ACH`, `REAL_TIME_PAYMENTS`, `DEBIT_CARD`, `MULTIPLE_PAYMENT_METHODS`")

  public String getDefaultPaymentMethod() {
    return defaultPaymentMethod;
  }


  public void setDefaultPaymentMethod(String defaultPaymentMethod) {
    this.defaultPaymentMethod = defaultPaymentMethod;
  }


  public ProcessorSignalEvaluateRequest user(SignalUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalUser getUser() {
    return user;
  }


  public void setUser(SignalUser user) {
    this.user = user;
  }


  public ProcessorSignalEvaluateRequest device(SignalDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalDevice getDevice() {
    return device;
  }


  public void setDevice(SignalDevice device) {
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
    ProcessorSignalEvaluateRequest processorSignalEvaluateRequest = (ProcessorSignalEvaluateRequest) o;
    return Objects.equals(this.clientId, processorSignalEvaluateRequest.clientId) &&
        Objects.equals(this.secret, processorSignalEvaluateRequest.secret) &&
        Objects.equals(this.processorToken, processorSignalEvaluateRequest.processorToken) &&
        Objects.equals(this.clientTransactionId, processorSignalEvaluateRequest.clientTransactionId) &&
        Objects.equals(this.amount, processorSignalEvaluateRequest.amount) &&
        Objects.equals(this.userPresent, processorSignalEvaluateRequest.userPresent) &&
        Objects.equals(this.clientUserId, processorSignalEvaluateRequest.clientUserId) &&
        Objects.equals(this.isRecurring, processorSignalEvaluateRequest.isRecurring) &&
        Objects.equals(this.defaultPaymentMethod, processorSignalEvaluateRequest.defaultPaymentMethod) &&
        Objects.equals(this.user, processorSignalEvaluateRequest.user) &&
        Objects.equals(this.device, processorSignalEvaluateRequest.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, processorToken, clientTransactionId, amount, userPresent, clientUserId, isRecurring, defaultPaymentMethod, user, device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorSignalEvaluateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    clientTransactionId: ").append(toIndentedString(clientTransactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    userPresent: ").append(toIndentedString(userPresent)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    defaultPaymentMethod: ").append(toIndentedString(defaultPaymentMethod)).append("\n");
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

