/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.555.0
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
import com.plaid.client.model.WalletPaymentScheme;
import com.plaid.client.model.WalletTransactionAmount;
import com.plaid.client.model.WalletTransactionCounterparty;
import com.plaid.client.model.WalletTransactionFailureReason;
import com.plaid.client.model.WalletTransactionRelation;
import com.plaid.client.model.WalletTransactionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The transaction details
 */
@ApiModel(description = "The transaction details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T15:13:56.933796Z[Etc/UTC]")
public class WalletTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The type of the transaction. The supported transaction types that are returned are: &#x60;BANK_TRANSFER:&#x60; a transaction which credits an e-wallet through an external bank transfer.  &#x60;PAYOUT:&#x60; a transaction which debits an e-wallet by disbursing funds to a counterparty.  &#x60;PIS_PAY_IN:&#x60; a payment which credits an e-wallet through Plaid&#39;s Payment Initiation Services (PIS) APIs. For more information see the [Payment Initiation endpoints](https://plaid.com/docs/api/products/payment-initiation/).  &#x60;REFUND:&#x60; a transaction which debits an e-wallet by refunding a previously initiated payment made through Plaid&#39;s [PIS APIs](https://plaid.com/docs/api/products/payment-initiation/).  &#x60;FUNDS_SWEEP&#x60;: an automated transaction which debits funds from an e-wallet to a designated client-owned account.  &#x60;RETURN&#x60;: an automated transaction where a debit transaction was reversed and money moved back to originating account.  &#x60;RECALL&#x60;: a transaction where the sending bank has requested the return of funds due to a fraud claim, technical error, or other issue associated with the payment.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANK_TRANSFER("BANK_TRANSFER"),
    
    PAYOUT("PAYOUT"),
    
    PIS_PAY_IN("PIS_PAY_IN"),
    
    REFUND("REFUND"),
    
    FUNDS_SWEEP("FUNDS_SWEEP"),
    
    RETURN("RETURN"),
    
    RECALL("RECALL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private WalletPaymentScheme scheme;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private WalletTransactionAmount amount;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private WalletTransactionCounterparty counterparty;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WalletTransactionStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_STATUS_UPDATE = "last_status_update";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_UPDATE)
  private OffsetDateTime lastStatusUpdate;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private WalletTransactionFailureReason failureReason;

  public static final String SERIALIZED_NAME_RELATED_TRANSACTIONS = "related_transactions";
  @SerializedName(SERIALIZED_NAME_RELATED_TRANSACTIONS)
  private List<WalletTransactionRelation> relatedTransactions = null;


  public WalletTransaction transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * A unique ID identifying the transaction
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying the transaction")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public WalletTransaction walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The EMI (E-Money Institution) wallet that this payment is associated with, if any. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The EMI (E-Money Institution) wallet that this payment is associated with, if any. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public WalletTransaction reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the transaction
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the transaction")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public WalletTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transaction. The supported transaction types that are returned are: &#x60;BANK_TRANSFER:&#x60; a transaction which credits an e-wallet through an external bank transfer.  &#x60;PAYOUT:&#x60; a transaction which debits an e-wallet by disbursing funds to a counterparty.  &#x60;PIS_PAY_IN:&#x60; a payment which credits an e-wallet through Plaid&#39;s Payment Initiation Services (PIS) APIs. For more information see the [Payment Initiation endpoints](https://plaid.com/docs/api/products/payment-initiation/).  &#x60;REFUND:&#x60; a transaction which debits an e-wallet by refunding a previously initiated payment made through Plaid&#39;s [PIS APIs](https://plaid.com/docs/api/products/payment-initiation/).  &#x60;FUNDS_SWEEP&#x60;: an automated transaction which debits funds from an e-wallet to a designated client-owned account.  &#x60;RETURN&#x60;: an automated transaction where a debit transaction was reversed and money moved back to originating account.  &#x60;RECALL&#x60;: a transaction where the sending bank has requested the return of funds due to a fraud claim, technical error, or other issue associated with the payment.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the transaction. The supported transaction types that are returned are: `BANK_TRANSFER:` a transaction which credits an e-wallet through an external bank transfer.  `PAYOUT:` a transaction which debits an e-wallet by disbursing funds to a counterparty.  `PIS_PAY_IN:` a payment which credits an e-wallet through Plaid's Payment Initiation Services (PIS) APIs. For more information see the [Payment Initiation endpoints](https://plaid.com/docs/api/products/payment-initiation/).  `REFUND:` a transaction which debits an e-wallet by refunding a previously initiated payment made through Plaid's [PIS APIs](https://plaid.com/docs/api/products/payment-initiation/).  `FUNDS_SWEEP`: an automated transaction which debits funds from an e-wallet to a designated client-owned account.  `RETURN`: an automated transaction where a debit transaction was reversed and money moved back to originating account.  `RECALL`: a transaction where the sending bank has requested the return of funds due to a fraud claim, technical error, or other issue associated with the payment.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WalletTransaction scheme(WalletPaymentScheme scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WalletPaymentScheme getScheme() {
    return scheme;
  }


  public void setScheme(WalletPaymentScheme scheme) {
    this.scheme = scheme;
  }


  public WalletTransaction amount(WalletTransactionAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionAmount getAmount() {
    return amount;
  }


  public void setAmount(WalletTransactionAmount amount) {
    this.amount = amount;
  }


  public WalletTransaction counterparty(WalletTransactionCounterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionCounterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(WalletTransactionCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public WalletTransaction status(WalletTransactionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionStatus getStatus() {
    return status;
  }


  public void setStatus(WalletTransactionStatus status) {
    this.status = status;
  }


  public WalletTransaction createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the transaction was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Timestamp when the transaction was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WalletTransaction lastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    
    this.lastStatusUpdate = lastStatusUpdate;
    return this;
  }

   /**
   * The date and time of the last time the &#x60;status&#x60; was updated, in IS0 8601 format
   * @return lastStatusUpdate
  **/
  @ApiModelProperty(required = true, value = "The date and time of the last time the `status` was updated, in IS0 8601 format")

  public OffsetDateTime getLastStatusUpdate() {
    return lastStatusUpdate;
  }


  public void setLastStatusUpdate(OffsetDateTime lastStatusUpdate) {
    this.lastStatusUpdate = lastStatusUpdate;
  }


  public WalletTransaction paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The payment id that this transaction is associated with, if any. This is present only for transaction types &#x60;PIS_PAY_IN&#x60; and &#x60;REFUND&#x60;.
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment id that this transaction is associated with, if any. This is present only for transaction types `PIS_PAY_IN` and `REFUND`.")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public WalletTransaction failureReason(WalletTransactionFailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WalletTransactionFailureReason getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(WalletTransactionFailureReason failureReason) {
    this.failureReason = failureReason;
  }


  public WalletTransaction relatedTransactions(List<WalletTransactionRelation> relatedTransactions) {
    
    this.relatedTransactions = relatedTransactions;
    return this;
  }

  public WalletTransaction addRelatedTransactionsItem(WalletTransactionRelation relatedTransactionsItem) {
    if (this.relatedTransactions == null) {
      this.relatedTransactions = new ArrayList<>();
    }
    this.relatedTransactions.add(relatedTransactionsItem);
    return this;
  }

   /**
   * A list of wallet transactions that this transaction is associated with, if any.
   * @return relatedTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of wallet transactions that this transaction is associated with, if any.")

  public List<WalletTransactionRelation> getRelatedTransactions() {
    return relatedTransactions;
  }


  public void setRelatedTransactions(List<WalletTransactionRelation> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransaction walletTransaction = (WalletTransaction) o;
    return Objects.equals(this.transactionId, walletTransaction.transactionId) &&
        Objects.equals(this.walletId, walletTransaction.walletId) &&
        Objects.equals(this.reference, walletTransaction.reference) &&
        Objects.equals(this.type, walletTransaction.type) &&
        Objects.equals(this.scheme, walletTransaction.scheme) &&
        Objects.equals(this.amount, walletTransaction.amount) &&
        Objects.equals(this.counterparty, walletTransaction.counterparty) &&
        Objects.equals(this.status, walletTransaction.status) &&
        Objects.equals(this.createdAt, walletTransaction.createdAt) &&
        Objects.equals(this.lastStatusUpdate, walletTransaction.lastStatusUpdate) &&
        Objects.equals(this.paymentId, walletTransaction.paymentId) &&
        Objects.equals(this.failureReason, walletTransaction.failureReason) &&
        Objects.equals(this.relatedTransactions, walletTransaction.relatedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, walletId, reference, type, scheme, amount, counterparty, status, createdAt, lastStatusUpdate, paymentId, failureReason, relatedTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransaction {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastStatusUpdate: ").append(toIndentedString(lastStatusUpdate)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    relatedTransactions: ").append(toIndentedString(relatedTransactions)).append("\n");
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

