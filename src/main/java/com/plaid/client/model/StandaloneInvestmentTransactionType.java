/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.470.1
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
 * Valid values for investment transaction types and subtypes. Note that transactions representing inflow of cash will appear as negative amounts, outflow of cash will appear as positive amounts.
 */
@ApiModel(description = "Valid values for investment transaction types and subtypes. Note that transactions representing inflow of cash will appear as negative amounts, outflow of cash will appear as positive amounts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class StandaloneInvestmentTransactionType {
  public static final String SERIALIZED_NAME_BUY = "buy";
  @SerializedName(SERIALIZED_NAME_BUY)
  private String buy;

  public static final String SERIALIZED_NAME_SELL = "sell";
  @SerializedName(SERIALIZED_NAME_SELL)
  private String sell;

  public static final String SERIALIZED_NAME_CANCEL = "cancel";
  @SerializedName(SERIALIZED_NAME_CANCEL)
  private String cancel;

  public static final String SERIALIZED_NAME_CASH = "cash";
  @SerializedName(SERIALIZED_NAME_CASH)
  private String cash;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  private String transfer;


  public StandaloneInvestmentTransactionType buy(String buy) {
    
    this.buy = buy;
    return this;
  }

   /**
   * Buying an investment
   * @return buy
  **/
  @ApiModelProperty(required = true, value = "Buying an investment")

  public String getBuy() {
    return buy;
  }


  public void setBuy(String buy) {
    this.buy = buy;
  }


  public StandaloneInvestmentTransactionType sell(String sell) {
    
    this.sell = sell;
    return this;
  }

   /**
   * Selling an investment
   * @return sell
  **/
  @ApiModelProperty(required = true, value = "Selling an investment")

  public String getSell() {
    return sell;
  }


  public void setSell(String sell) {
    this.sell = sell;
  }


  public StandaloneInvestmentTransactionType cancel(String cancel) {
    
    this.cancel = cancel;
    return this;
  }

   /**
   * A cancellation of a pending transaction
   * @return cancel
  **/
  @ApiModelProperty(required = true, value = "A cancellation of a pending transaction")

  public String getCancel() {
    return cancel;
  }


  public void setCancel(String cancel) {
    this.cancel = cancel;
  }


  public StandaloneInvestmentTransactionType cash(String cash) {
    
    this.cash = cash;
    return this;
  }

   /**
   * Activity that modifies a cash position
   * @return cash
  **/
  @ApiModelProperty(required = true, value = "Activity that modifies a cash position")

  public String getCash() {
    return cash;
  }


  public void setCash(String cash) {
    this.cash = cash;
  }


  public StandaloneInvestmentTransactionType fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Fees on the account, e.g. commission, bookkeeping, options-related.
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "Fees on the account, e.g. commission, bookkeeping, options-related.")

  public String getFee() {
    return fee;
  }


  public void setFee(String fee) {
    this.fee = fee;
  }


  public StandaloneInvestmentTransactionType transfer(String transfer) {
    
    this.transfer = transfer;
    return this;
  }

   /**
   * Activity that modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer
   * @return transfer
  **/
  @ApiModelProperty(required = true, value = "Activity that modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer")

  public String getTransfer() {
    return transfer;
  }


  public void setTransfer(String transfer) {
    this.transfer = transfer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandaloneInvestmentTransactionType standaloneInvestmentTransactionType = (StandaloneInvestmentTransactionType) o;
    return Objects.equals(this.buy, standaloneInvestmentTransactionType.buy) &&
        Objects.equals(this.sell, standaloneInvestmentTransactionType.sell) &&
        Objects.equals(this.cancel, standaloneInvestmentTransactionType.cancel) &&
        Objects.equals(this.cash, standaloneInvestmentTransactionType.cash) &&
        Objects.equals(this.fee, standaloneInvestmentTransactionType.fee) &&
        Objects.equals(this.transfer, standaloneInvestmentTransactionType.transfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buy, sell, cancel, cash, fee, transfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandaloneInvestmentTransactionType {\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
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

