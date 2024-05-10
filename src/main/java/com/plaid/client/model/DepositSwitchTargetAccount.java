/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * The deposit switch destination account
 */
@ApiModel(description = "The deposit switch destination account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class DepositSwitchTargetAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  /**
   * The account subtype of the account, either &#x60;checking&#x60; or &#x60;savings&#x60;.
   */
  @JsonAdapter(AccountSubtypeEnum.Adapter.class)
  public enum AccountSubtypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings");

    private String value;

    AccountSubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountSubtypeEnum fromValue(String value) {
      for (AccountSubtypeEnum b : AccountSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountSubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountSubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountSubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountSubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPE = "account_subtype";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPE)
  private AccountSubtypeEnum accountSubtype;


  public DepositSwitchTargetAccount accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number for deposit switch destination
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Account number for deposit switch destination")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public DepositSwitchTargetAccount routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Routing number for deposit switch destination
   * @return routingNumber
  **/
  @ApiModelProperty(required = true, value = "Routing number for deposit switch destination")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public DepositSwitchTargetAccount accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * The name of the deposit switch destination account, as it will be displayed to the end user in the Deposit Switch interface. It is not required to match the name used in online banking.
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "The name of the deposit switch destination account, as it will be displayed to the end user in the Deposit Switch interface. It is not required to match the name used in online banking.")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public DepositSwitchTargetAccount accountSubtype(AccountSubtypeEnum accountSubtype) {
    
    this.accountSubtype = accountSubtype;
    return this;
  }

   /**
   * The account subtype of the account, either &#x60;checking&#x60; or &#x60;savings&#x60;.
   * @return accountSubtype
  **/
  @ApiModelProperty(required = true, value = "The account subtype of the account, either `checking` or `savings`.")

  public AccountSubtypeEnum getAccountSubtype() {
    return accountSubtype;
  }


  public void setAccountSubtype(AccountSubtypeEnum accountSubtype) {
    this.accountSubtype = accountSubtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchTargetAccount depositSwitchTargetAccount = (DepositSwitchTargetAccount) o;
    return Objects.equals(this.accountNumber, depositSwitchTargetAccount.accountNumber) &&
        Objects.equals(this.routingNumber, depositSwitchTargetAccount.routingNumber) &&
        Objects.equals(this.accountName, depositSwitchTargetAccount.accountName) &&
        Objects.equals(this.accountSubtype, depositSwitchTargetAccount.accountSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, routingNumber, accountName, accountSubtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchTargetAccount {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSubtype: ").append(toIndentedString(accountSubtype)).append("\n");
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

