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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.OriginatorExpectedTransferFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies the originator&#39;s expected usage of debits. For all dollar amounts, use a decimal string with two digits of precision e.g. \&quot;10.00\&quot;. This field is required if the originator is expected to process debit transfers.
 */
@ApiModel(description = "Specifies the originator's expected usage of debits. For all dollar amounts, use a decimal string with two digits of precision e.g. \"10.00\". This field is required if the originator is expected to process debit transfers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class TransferDebitUsageConfiguration {
  public static final String SERIALIZED_NAME_EXPECTED_FREQUENCY = "expected_frequency";
  @SerializedName(SERIALIZED_NAME_EXPECTED_FREQUENCY)
  private OriginatorExpectedTransferFrequency expectedFrequency;

  public static final String SERIALIZED_NAME_EXPECTED_HIGHEST_AMOUNT = "expected_highest_amount";
  @SerializedName(SERIALIZED_NAME_EXPECTED_HIGHEST_AMOUNT)
  private String expectedHighestAmount;

  public static final String SERIALIZED_NAME_EXPECTED_AVERAGE_AMOUNT = "expected_average_amount";
  @SerializedName(SERIALIZED_NAME_EXPECTED_AVERAGE_AMOUNT)
  private String expectedAverageAmount;

  public static final String SERIALIZED_NAME_EXPECTED_MONTHLY_AMOUNT = "expected_monthly_amount";
  @SerializedName(SERIALIZED_NAME_EXPECTED_MONTHLY_AMOUNT)
  private String expectedMonthlyAmount;

  public static final String SERIALIZED_NAME_SEC_CODES = "sec_codes";
  @SerializedName(SERIALIZED_NAME_SEC_CODES)
  private List<ACHClass> secCodes = new ArrayList<>();


  public TransferDebitUsageConfiguration expectedFrequency(OriginatorExpectedTransferFrequency expectedFrequency) {
    
    this.expectedFrequency = expectedFrequency;
    return this;
  }

   /**
   * Get expectedFrequency
   * @return expectedFrequency
  **/
  @ApiModelProperty(required = true, value = "")

  public OriginatorExpectedTransferFrequency getExpectedFrequency() {
    return expectedFrequency;
  }


  public void setExpectedFrequency(OriginatorExpectedTransferFrequency expectedFrequency) {
    this.expectedFrequency = expectedFrequency;
  }


  public TransferDebitUsageConfiguration expectedHighestAmount(String expectedHighestAmount) {
    
    this.expectedHighestAmount = expectedHighestAmount;
    return this;
  }

   /**
   * The originator’s expected highest amount for a single debit transfer.
   * @return expectedHighestAmount
  **/
  @ApiModelProperty(required = true, value = "The originator’s expected highest amount for a single debit transfer.")

  public String getExpectedHighestAmount() {
    return expectedHighestAmount;
  }


  public void setExpectedHighestAmount(String expectedHighestAmount) {
    this.expectedHighestAmount = expectedHighestAmount;
  }


  public TransferDebitUsageConfiguration expectedAverageAmount(String expectedAverageAmount) {
    
    this.expectedAverageAmount = expectedAverageAmount;
    return this;
  }

   /**
   * The originator’s expected average amount per debit.
   * @return expectedAverageAmount
  **/
  @ApiModelProperty(required = true, value = "The originator’s expected average amount per debit.")

  public String getExpectedAverageAmount() {
    return expectedAverageAmount;
  }


  public void setExpectedAverageAmount(String expectedAverageAmount) {
    this.expectedAverageAmount = expectedAverageAmount;
  }


  public TransferDebitUsageConfiguration expectedMonthlyAmount(String expectedMonthlyAmount) {
    
    this.expectedMonthlyAmount = expectedMonthlyAmount;
    return this;
  }

   /**
   * The originator’s monthly expected ACH debit processing amount for the next 6-12 months.
   * @return expectedMonthlyAmount
  **/
  @ApiModelProperty(required = true, value = "The originator’s monthly expected ACH debit processing amount for the next 6-12 months.")

  public String getExpectedMonthlyAmount() {
    return expectedMonthlyAmount;
  }


  public void setExpectedMonthlyAmount(String expectedMonthlyAmount) {
    this.expectedMonthlyAmount = expectedMonthlyAmount;
  }


  public TransferDebitUsageConfiguration secCodes(List<ACHClass> secCodes) {
    
    this.secCodes = secCodes;
    return this;
  }

  public TransferDebitUsageConfiguration addSecCodesItem(ACHClass secCodesItem) {
    this.secCodes.add(secCodesItem);
    return this;
  }

   /**
   * Specifies the expected use cases for the originator’s debit transfers. This should be a list that contains one or more of the following codes:  &#x60;\&quot;ccd\&quot;&#x60; - Corporate Credit or Debit - fund transfer between two corporate bank accounts  &#x60;\&quot;ppd\&quot;&#x60; - Prearranged Payment or Deposit - the transfer is part of a pre-existing relationship with a consumer, eg. bill payment  &#x60;\&quot;tel\&quot;&#x60; - Telephone-Initiated Entry  &#x60;\&quot;web\&quot;&#x60; - Internet-Initiated Entry - debits from a consumer’s account where their authorization is obtained over the Internet
   * @return secCodes
  **/
  @ApiModelProperty(required = true, value = "Specifies the expected use cases for the originator’s debit transfers. This should be a list that contains one or more of the following codes:  `\"ccd\"` - Corporate Credit or Debit - fund transfer between two corporate bank accounts  `\"ppd\"` - Prearranged Payment or Deposit - the transfer is part of a pre-existing relationship with a consumer, eg. bill payment  `\"tel\"` - Telephone-Initiated Entry  `\"web\"` - Internet-Initiated Entry - debits from a consumer’s account where their authorization is obtained over the Internet")

  public List<ACHClass> getSecCodes() {
    return secCodes;
  }


  public void setSecCodes(List<ACHClass> secCodes) {
    this.secCodes = secCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDebitUsageConfiguration transferDebitUsageConfiguration = (TransferDebitUsageConfiguration) o;
    return Objects.equals(this.expectedFrequency, transferDebitUsageConfiguration.expectedFrequency) &&
        Objects.equals(this.expectedHighestAmount, transferDebitUsageConfiguration.expectedHighestAmount) &&
        Objects.equals(this.expectedAverageAmount, transferDebitUsageConfiguration.expectedAverageAmount) &&
        Objects.equals(this.expectedMonthlyAmount, transferDebitUsageConfiguration.expectedMonthlyAmount) &&
        Objects.equals(this.secCodes, transferDebitUsageConfiguration.secCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedFrequency, expectedHighestAmount, expectedAverageAmount, expectedMonthlyAmount, secCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDebitUsageConfiguration {\n");
    sb.append("    expectedFrequency: ").append(toIndentedString(expectedFrequency)).append("\n");
    sb.append("    expectedHighestAmount: ").append(toIndentedString(expectedHighestAmount)).append("\n");
    sb.append("    expectedAverageAmount: ").append(toIndentedString(expectedAverageAmount)).append("\n");
    sb.append("    expectedMonthlyAmount: ").append(toIndentedString(expectedMonthlyAmount)).append("\n");
    sb.append("    secCodes: ").append(toIndentedString(secCodes)).append("\n");
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

