/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.617.1
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
 * Identifying information for transferring money to or from a US account via ACH or wire transfer.
 */
@ApiModel(description = "Identifying information for transferring money to or from a US account via ACH or wire transfer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class NumbersACH {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_IS_TOKENIZED_ACCOUNT_NUMBER = "is_tokenized_account_number";
  @SerializedName(SERIALIZED_NAME_IS_TOKENIZED_ACCOUNT_NUMBER)
  private Boolean isTokenizedAccountNumber;

  public static final String SERIALIZED_NAME_ROUTING = "routing";
  @SerializedName(SERIALIZED_NAME_ROUTING)
  private String routing;

  public static final String SERIALIZED_NAME_WIRE_ROUTING = "wire_routing";
  @SerializedName(SERIALIZED_NAME_WIRE_ROUTING)
  private String wireRouting;

  public static final String SERIALIZED_NAME_CAN_TRANSFER_IN = "can_transfer_in";
  @SerializedName(SERIALIZED_NAME_CAN_TRANSFER_IN)
  private Boolean canTransferIn;

  public static final String SERIALIZED_NAME_CAN_TRANSFER_OUT = "can_transfer_out";
  @SerializedName(SERIALIZED_NAME_CAN_TRANSFER_OUT)
  private Boolean canTransferOut;


  public NumbersACH accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NumbersACH account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The ACH account number for the account.  At certain institutions, including Chase and PNC, you will receive \&quot;tokenized\&quot; routing and account numbers, which are not the user&#39;s actual account and routing numbers. For important details on how this may impact your integration and on how to avoid fraud, user confusion, and ACH returns, see [Tokenized account numbers](https://plaid.com/docs/auth/#tokenized-account-numbers).
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The ACH account number for the account.  At certain institutions, including Chase and PNC, you will receive \"tokenized\" routing and account numbers, which are not the user's actual account and routing numbers. For important details on how this may impact your integration and on how to avoid fraud, user confusion, and ACH returns, see [Tokenized account numbers](https://plaid.com/docs/auth/#tokenized-account-numbers).")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NumbersACH isTokenizedAccountNumber(Boolean isTokenizedAccountNumber) {
    
    this.isTokenizedAccountNumber = isTokenizedAccountNumber;
    return this;
  }

   /**
   * Indicates whether the account number is tokenized by the institution. For important details on how tokenized account numbers may impact your integration, see [Tokenized account numbers](https://plaid.com/docs/auth/#tokenized-account-numbers).
   * @return isTokenizedAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the account number is tokenized by the institution. For important details on how tokenized account numbers may impact your integration, see [Tokenized account numbers](https://plaid.com/docs/auth/#tokenized-account-numbers).")

  public Boolean getIsTokenizedAccountNumber() {
    return isTokenizedAccountNumber;
  }


  public void setIsTokenizedAccountNumber(Boolean isTokenizedAccountNumber) {
    this.isTokenizedAccountNumber = isTokenizedAccountNumber;
  }


  public NumbersACH routing(String routing) {
    
    this.routing = routing;
    return this;
  }

   /**
   * The ACH routing number for the account. This may be a tokenized routing number. For more information, see [Tokenized account numbers](https://plaid.com/docs/auth/#tokenized-account-numbers).
   * @return routing
  **/
  @ApiModelProperty(required = true, value = "The ACH routing number for the account. This may be a tokenized routing number. For more information, see [Tokenized account numbers](https://plaid.com/docs/auth/#tokenized-account-numbers).")

  public String getRouting() {
    return routing;
  }


  public void setRouting(String routing) {
    this.routing = routing;
  }


  public NumbersACH wireRouting(String wireRouting) {
    
    this.wireRouting = wireRouting;
    return this;
  }

   /**
   * The wire transfer routing number for the account. This field is only populated if the institution is known to use a separate wire transfer routing number. Many institutions do not have a separate wire routing number and use the ACH routing number for wires instead. It is recommended to have the end user manually confirm their wire routing number before sending any wires to their account, especially if this field is &#x60;null&#x60;.
   * @return wireRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The wire transfer routing number for the account. This field is only populated if the institution is known to use a separate wire transfer routing number. Many institutions do not have a separate wire routing number and use the ACH routing number for wires instead. It is recommended to have the end user manually confirm their wire routing number before sending any wires to their account, especially if this field is `null`.")

  public String getWireRouting() {
    return wireRouting;
  }


  public void setWireRouting(String wireRouting) {
    this.wireRouting = wireRouting;
  }


  public NumbersACH canTransferIn(Boolean canTransferIn) {
    
    this.canTransferIn = canTransferIn;
    return this;
  }

   /**
   * Whether the account supports ACH transfers into the account
   * @return canTransferIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account supports ACH transfers into the account")

  public Boolean getCanTransferIn() {
    return canTransferIn;
  }


  public void setCanTransferIn(Boolean canTransferIn) {
    this.canTransferIn = canTransferIn;
  }


  public NumbersACH canTransferOut(Boolean canTransferOut) {
    
    this.canTransferOut = canTransferOut;
    return this;
  }

   /**
   * Whether the account supports ACH transfers out of the account
   * @return canTransferOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the account supports ACH transfers out of the account")

  public Boolean getCanTransferOut() {
    return canTransferOut;
  }


  public void setCanTransferOut(Boolean canTransferOut) {
    this.canTransferOut = canTransferOut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersACH numbersACH = (NumbersACH) o;
    return Objects.equals(this.accountId, numbersACH.accountId) &&
        Objects.equals(this.account, numbersACH.account) &&
        Objects.equals(this.isTokenizedAccountNumber, numbersACH.isTokenizedAccountNumber) &&
        Objects.equals(this.routing, numbersACH.routing) &&
        Objects.equals(this.wireRouting, numbersACH.wireRouting) &&
        Objects.equals(this.canTransferIn, numbersACH.canTransferIn) &&
        Objects.equals(this.canTransferOut, numbersACH.canTransferOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, isTokenizedAccountNumber, routing, wireRouting, canTransferIn, canTransferOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersACH {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    isTokenizedAccountNumber: ").append(toIndentedString(isTokenizedAccountNumber)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    wireRouting: ").append(toIndentedString(wireRouting)).append("\n");
    sb.append("    canTransferIn: ").append(toIndentedString(canTransferIn)).append("\n");
    sb.append("    canTransferOut: ").append(toIndentedString(canTransferOut)).append("\n");
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

