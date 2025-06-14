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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transactions are related when they have a logical connection.  For example, a &#x60;PAYOUT&#x60; transaction can be returned by the sender, creating a &#x60;RETURN&#x60; transaction. Each &#x60;PAYOUT&#x60; transaction can have at most one corresponding &#x60;RETURN&#x60; transaction in case of reversal.  These relationships are bi-directional, meaning that both entities have references to each other. For instance, when a transaction of type RETURN occurs, it is linked to the original transaction being returned. Likewise, the original transaction has a reference back to the RETURN transaction that represents the return.  This field is only populated for transactions of type &#x60;RETURN&#x60;, &#x60;FUNDS_SWEEP&#x60;, &#x60;REFUND&#x60; and &#x60;PAYOUT&#x60;.  The relationship between a &#x60;PIS_PAY_IN&#x60; payment and its corresponding &#x60;REFUND&#x60; transactions is only available through &#x60;refund_ids&#x60; property in the payment object. See[&#x60;/payment_initiation/payment/get&#x60;](https://plaid.com/docs/api/products/payment-initiation/#payment_initiation-payment-get-response-refund-ids).
 */
@ApiModel(description = "Transactions are related when they have a logical connection.  For example, a `PAYOUT` transaction can be returned by the sender, creating a `RETURN` transaction. Each `PAYOUT` transaction can have at most one corresponding `RETURN` transaction in case of reversal.  These relationships are bi-directional, meaning that both entities have references to each other. For instance, when a transaction of type RETURN occurs, it is linked to the original transaction being returned. Likewise, the original transaction has a reference back to the RETURN transaction that represents the return.  This field is only populated for transactions of type `RETURN`, `FUNDS_SWEEP`, `REFUND` and `PAYOUT`.  The relationship between a `PIS_PAY_IN` payment and its corresponding `REFUND` transactions is only available through `refund_ids` property in the payment object. See[`/payment_initiation/payment/get`](https://plaid.com/docs/api/products/payment-initiation/#payment_initiation-payment-get-response-refund-ids).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class WalletTransactionRelation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of the transaction.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYOUT("PAYOUT"),
    
    RETURN("RETURN"),
    
    REFUND("REFUND"),
    
    FUNDS_SWEEP("FUNDS_SWEEP");

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


  public WalletTransactionRelation id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the related transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the related transaction.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WalletTransactionRelation type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transaction.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the transaction.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionRelation walletTransactionRelation = (WalletTransactionRelation) o;
    return Objects.equals(this.id, walletTransactionRelation.id) &&
        Objects.equals(this.type, walletTransactionRelation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionRelation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

