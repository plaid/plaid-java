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
 * Account numbers using the International Bank Account Number and BIC/SWIFT code format.
 */
@ApiModel(description = "Account numbers using the International Bank Account Number and BIC/SWIFT code format.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:05:33.763924Z[Etc/UTC]")
public class NumbersInternationalIBAN {
  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;


  public NumbersInternationalIBAN iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN).
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "International Bank Account Number (IBAN).")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public NumbersInternationalIBAN bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * The Business Identifier Code, also known as SWIFT code, for this bank account.
   * @return bic
  **/
  @ApiModelProperty(required = true, value = "The Business Identifier Code, also known as SWIFT code, for this bank account.")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersInternationalIBAN numbersInternationalIBAN = (NumbersInternationalIBAN) o;
    return Objects.equals(this.iban, numbersInternationalIBAN.iban) &&
        Objects.equals(this.bic, numbersInternationalIBAN.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersInternationalIBAN {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

