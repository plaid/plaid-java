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
 * Score found by matching address provided by the API with the address on the account at the financial institution. The score can range from 0 to 100 where 100 is a perfect match and 0 is a no match. If the account contains multiple owners, the maximum match score is filled.
 */
@ApiModel(description = "Score found by matching address provided by the API with the address on the account at the financial institution. The score can range from 0 to 100 where 100 is a perfect match and 0 is a no match. If the account contains multiple owners, the maximum match score is filled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class AddressMatchScore {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_IS_POSTAL_CODE_MATCH = "is_postal_code_match";
  @SerializedName(SERIALIZED_NAME_IS_POSTAL_CODE_MATCH)
  private Boolean isPostalCodeMatch;


  public AddressMatchScore score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * Match score for address. 100 is a perfect match, 99-90 is a strong match, 89-70 is a partial match, anything below 70 is considered a weak match. Typically, the match threshold should be set to a score of 70 or higher. If the address is missing from either the API or financial institution, this is null.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match score for address. 100 is a perfect match, 99-90 is a strong match, 89-70 is a partial match, anything below 70 is considered a weak match. Typically, the match threshold should be set to a score of 70 or higher. If the address is missing from either the API or financial institution, this is null.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public AddressMatchScore isPostalCodeMatch(Boolean isPostalCodeMatch) {
    
    this.isPostalCodeMatch = isPostalCodeMatch;
    return this;
  }

   /**
   * postal code was provided for both and was a match
   * @return isPostalCodeMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "postal code was provided for both and was a match")

  public Boolean getIsPostalCodeMatch() {
    return isPostalCodeMatch;
  }


  public void setIsPostalCodeMatch(Boolean isPostalCodeMatch) {
    this.isPostalCodeMatch = isPostalCodeMatch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressMatchScore addressMatchScore = (AddressMatchScore) o;
    return Objects.equals(this.score, addressMatchScore.score) &&
        Objects.equals(this.isPostalCodeMatch, addressMatchScore.isPostalCodeMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, isPostalCodeMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressMatchScore {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    isPostalCodeMatch: ").append(toIndentedString(isPostalCodeMatch)).append("\n");
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

