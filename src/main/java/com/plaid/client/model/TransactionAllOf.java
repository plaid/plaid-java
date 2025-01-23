/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import com.plaid.client.model.PersonalFinanceCategory;
import com.plaid.client.model.TransactionCode;
import com.plaid.client.model.TransactionCounterparty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class TransactionAllOf {
  public static final String SERIALIZED_NAME_AUTHORIZED_DATE = "authorized_date";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DATE)
  private LocalDate authorizedDate;

  public static final String SERIALIZED_NAME_AUTHORIZED_DATETIME = "authorized_datetime";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DATETIME)
  private OffsetDateTime authorizedDatetime;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private OffsetDateTime datetime;

  /**
   * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field. 
   */
  @JsonAdapter(PaymentChannelEnum.Adapter.class)
  public enum PaymentChannelEnum {
    ONLINE("online"),
    
    IN_STORE("in store"),
    
    OTHER("other");

    private String value;

    PaymentChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentChannelEnum fromValue(String value) {
      for (PaymentChannelEnum b : PaymentChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_CHANNEL = "payment_channel";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CHANNEL)
  private PaymentChannelEnum paymentChannel;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private PersonalFinanceCategory personalFinanceCategory;

  public static final String SERIALIZED_NAME_TRANSACTION_CODE = "transaction_code";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CODE)
  private TransactionCode transactionCode;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_ICON_URL = "personal_finance_category_icon_url";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_ICON_URL)
  private String personalFinanceCategoryIconUrl;

  public static final String SERIALIZED_NAME_COUNTERPARTIES = "counterparties";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTIES)
  private List<TransactionCounterparty> counterparties = null;

  public static final String SERIALIZED_NAME_MERCHANT_ENTITY_ID = "merchant_entity_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ENTITY_ID)
  private String merchantEntityId;


  public TransactionAllOf authorizedDate(LocalDate authorizedDate) {
    
    this.authorizedDate = authorizedDate;
    return this;
  }

   /**
   * The date that the transaction was authorized. For posted transactions, the &#x60;date&#x60; field will indicate the posted date, but &#x60;authorized_date&#x60; will indicate the day the transaction was authorized by the financial institution. If presenting transactions to the user in a UI, the &#x60;authorized_date&#x60;, when available, is generally preferable to use over the &#x60;date&#x60; field for posted transactions, as it will generally represent the date the user actually made the transaction. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DD&#x60; ).
   * @return authorizedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date that the transaction was authorized. For posted transactions, the `date` field will indicate the posted date, but `authorized_date` will indicate the day the transaction was authorized by the financial institution. If presenting transactions to the user in a UI, the `authorized_date`, when available, is generally preferable to use over the `date` field for posted transactions, as it will generally represent the date the user actually made the transaction. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ).")

  public LocalDate getAuthorizedDate() {
    return authorizedDate;
  }


  public void setAuthorizedDate(LocalDate authorizedDate) {
    this.authorizedDate = authorizedDate;
  }


  public TransactionAllOf authorizedDatetime(OffsetDateTime authorizedDatetime) {
    
    this.authorizedDatetime = authorizedDatetime;
    return this;
  }

   /**
   * Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ). For posted transactions, the &#x60;datetime&#x60; field will indicate the posted date, but &#x60;authorized_datetime&#x60; will indicate the day the transaction was authorized by the financial institution. If presenting transactions to the user in a UI, the &#x60;authorized_datetime&#x60;, when available, is generally preferable to use over the &#x60;datetime&#x60; field for posted transactions, as it will generally represent the date the user actually made the transaction.  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). This field is only populated in API version 2019-05-29 and later.
   * @return authorizedDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ). For posted transactions, the `datetime` field will indicate the posted date, but `authorized_datetime` will indicate the day the transaction was authorized by the financial institution. If presenting transactions to the user in a UI, the `authorized_datetime`, when available, is generally preferable to use over the `datetime` field for posted transactions, as it will generally represent the date the user actually made the transaction.  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). This field is only populated in API version 2019-05-29 and later.")

  public OffsetDateTime getAuthorizedDatetime() {
    return authorizedDatetime;
  }


  public void setAuthorizedDatetime(OffsetDateTime authorizedDatetime) {
    this.authorizedDatetime = authorizedDatetime;
  }


  public TransactionAllOf datetime(OffsetDateTime datetime) {
    
    this.datetime = datetime;
    return this;
  }

   /**
   * Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ). For the date that the transaction was initiated, rather than posted, see the &#x60;authorized_datetime&#x60; field.  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). This field is only populated in API version 2019-05-29 and later.
   * @return datetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ). For the date that the transaction was initiated, rather than posted, see the `authorized_datetime` field.  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). This field is only populated in API version 2019-05-29 and later.")

  public OffsetDateTime getDatetime() {
    return datetime;
  }


  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }


  public TransactionAllOf paymentChannel(PaymentChannelEnum paymentChannel) {
    
    this.paymentChannel = paymentChannel;
    return this;
  }

   /**
   * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field. 
   * @return paymentChannel
  **/
  @ApiModelProperty(required = true, value = "The channel used to make a payment. `online:` transactions that took place online.  `in store:` transactions that were made at a physical location.  `other:` transactions that relate to banks, e.g. fees or deposits.  This field replaces the `transaction_type` field. ")

  public PaymentChannelEnum getPaymentChannel() {
    return paymentChannel;
  }


  public void setPaymentChannel(PaymentChannelEnum paymentChannel) {
    this.paymentChannel = paymentChannel;
  }


  public TransactionAllOf personalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Get personalFinanceCategory
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonalFinanceCategory getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  public TransactionAllOf transactionCode(TransactionCode transactionCode) {
    
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Get transactionCode
   * @return transactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransactionCode getTransactionCode() {
    return transactionCode;
  }


  public void setTransactionCode(TransactionCode transactionCode) {
    this.transactionCode = transactionCode;
  }


  public TransactionAllOf personalFinanceCategoryIconUrl(String personalFinanceCategoryIconUrl) {
    
    this.personalFinanceCategoryIconUrl = personalFinanceCategoryIconUrl;
    return this;
  }

   /**
   * The URL of an icon associated with the primary personal finance category. The icon will always be 100×100 pixel PNG file.
   * @return personalFinanceCategoryIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of an icon associated with the primary personal finance category. The icon will always be 100×100 pixel PNG file.")

  public String getPersonalFinanceCategoryIconUrl() {
    return personalFinanceCategoryIconUrl;
  }


  public void setPersonalFinanceCategoryIconUrl(String personalFinanceCategoryIconUrl) {
    this.personalFinanceCategoryIconUrl = personalFinanceCategoryIconUrl;
  }


  public TransactionAllOf counterparties(List<TransactionCounterparty> counterparties) {
    
    this.counterparties = counterparties;
    return this;
  }

  public TransactionAllOf addCounterpartiesItem(TransactionCounterparty counterpartiesItem) {
    if (this.counterparties == null) {
      this.counterparties = new ArrayList<>();
    }
    this.counterparties.add(counterpartiesItem);
    return this;
  }

   /**
   * The counterparties present in the transaction. Counterparties, such as the merchant or the financial institution, are extracted by Plaid from the raw description.
   * @return counterparties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The counterparties present in the transaction. Counterparties, such as the merchant or the financial institution, are extracted by Plaid from the raw description.")

  public List<TransactionCounterparty> getCounterparties() {
    return counterparties;
  }


  public void setCounterparties(List<TransactionCounterparty> counterparties) {
    this.counterparties = counterparties;
  }


  public TransactionAllOf merchantEntityId(String merchantEntityId) {
    
    this.merchantEntityId = merchantEntityId;
    return this;
  }

   /**
   * A unique, stable, Plaid-generated ID that maps to the merchant. In the case of a merchant with multiple retail locations, this field will map to the broader merchant, not a specific location or store.
   * @return merchantEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique, stable, Plaid-generated ID that maps to the merchant. In the case of a merchant with multiple retail locations, this field will map to the broader merchant, not a specific location or store.")

  public String getMerchantEntityId() {
    return merchantEntityId;
  }


  public void setMerchantEntityId(String merchantEntityId) {
    this.merchantEntityId = merchantEntityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionAllOf transactionAllOf = (TransactionAllOf) o;
    return Objects.equals(this.authorizedDate, transactionAllOf.authorizedDate) &&
        Objects.equals(this.authorizedDatetime, transactionAllOf.authorizedDatetime) &&
        Objects.equals(this.datetime, transactionAllOf.datetime) &&
        Objects.equals(this.paymentChannel, transactionAllOf.paymentChannel) &&
        Objects.equals(this.personalFinanceCategory, transactionAllOf.personalFinanceCategory) &&
        Objects.equals(this.transactionCode, transactionAllOf.transactionCode) &&
        Objects.equals(this.personalFinanceCategoryIconUrl, transactionAllOf.personalFinanceCategoryIconUrl) &&
        Objects.equals(this.counterparties, transactionAllOf.counterparties) &&
        Objects.equals(this.merchantEntityId, transactionAllOf.merchantEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedDate, authorizedDatetime, datetime, paymentChannel, personalFinanceCategory, transactionCode, personalFinanceCategoryIconUrl, counterparties, merchantEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionAllOf {\n");
    sb.append("    authorizedDate: ").append(toIndentedString(authorizedDate)).append("\n");
    sb.append("    authorizedDatetime: ").append(toIndentedString(authorizedDatetime)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    personalFinanceCategoryIconUrl: ").append(toIndentedString(personalFinanceCategoryIconUrl)).append("\n");
    sb.append("    counterparties: ").append(toIndentedString(counterparties)).append("\n");
    sb.append("    merchantEntityId: ").append(toIndentedString(merchantEntityId)).append("\n");
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

