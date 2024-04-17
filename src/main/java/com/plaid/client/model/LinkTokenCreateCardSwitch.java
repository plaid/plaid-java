/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
 * A map containing data to pass in for the Card Switch flow.
 */
@ApiModel(description = "A map containing data to pass in for the Card Switch flow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class LinkTokenCreateCardSwitch {
  public static final String SERIALIZED_NAME_CARD_BIN = "card_bin";
  @SerializedName(SERIALIZED_NAME_CARD_BIN)
  private String cardBin;


  public LinkTokenCreateCardSwitch cardBin(String cardBin) {
    
    this.cardBin = cardBin;
    return this;
  }

   /**
   * The BIN (Bank Identification Number) of the card to switch.
   * @return cardBin
  **/
  @ApiModelProperty(required = true, value = "The BIN (Bank Identification Number) of the card to switch.")

  public String getCardBin() {
    return cardBin;
  }


  public void setCardBin(String cardBin) {
    this.cardBin = cardBin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateCardSwitch linkTokenCreateCardSwitch = (LinkTokenCreateCardSwitch) o;
    return Objects.equals(this.cardBin, linkTokenCreateCardSwitch.cardBin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardBin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateCardSwitch {\n");
    sb.append("    cardBin: ").append(toIndentedString(cardBin)).append("\n");
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

