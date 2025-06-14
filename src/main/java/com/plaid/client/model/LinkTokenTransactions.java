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
 * Configuration parameters for the Transactions product
 */
@ApiModel(description = "Configuration parameters for the Transactions product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class LinkTokenTransactions {
  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested = 90;


  public LinkTokenTransactions daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The maximum number of days of transaction history to request for the Transactions product. The more transaction history is requested, the longer the historical update poll will take. The default value is 90 days. If a value under 30 is provided, a minimum of 30 days of history will be requested. Once Transactions has been added to an Item, this value cannot be updated.  Customers using [Recurring Transactions](https://plaid.com/docs/api/products/transactions/#transactionsrecurringget) should request at least 180 days of history for optimal results.
   * minimum: 1
   * maximum: 730
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of days of transaction history to request for the Transactions product. The more transaction history is requested, the longer the historical update poll will take. The default value is 90 days. If a value under 30 is provided, a minimum of 30 days of history will be requested. Once Transactions has been added to an Item, this value cannot be updated.  Customers using [Recurring Transactions](https://plaid.com/docs/api/products/transactions/#transactionsrecurringget) should request at least 180 days of history for optimal results.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenTransactions linkTokenTransactions = (LinkTokenTransactions) o;
    return Objects.equals(this.daysRequested, linkTokenTransactions.daysRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenTransactions {\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
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

