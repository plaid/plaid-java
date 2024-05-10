/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
 * Score found by matching phone number provided by the API with the phone number on the account at the financial institution. 100 is a perfect match and 0 is a no match. If the account contains multiple owners, the maximum match score is filled.
 */
@ApiModel(description = "Score found by matching phone number provided by the API with the phone number on the account at the financial institution. 100 is a perfect match and 0 is a no match. If the account contains multiple owners, the maximum match score is filled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class PhoneNumberMatchScore {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;


  public PhoneNumberMatchScore score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * Match score for normalized phone number. 100 is a perfect match, 99-70 is a partial match (matching the same phone number with extension against one without extension, etc.), anything below 70 is considered a mismatch. Typically, the match threshold should be set to a score of 70 or higher. If the phone number is missing from either the API or financial institution, this is null.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match score for normalized phone number. 100 is a perfect match, 99-70 is a partial match (matching the same phone number with extension against one without extension, etc.), anything below 70 is considered a mismatch. Typically, the match threshold should be set to a score of 70 or higher. If the phone number is missing from either the API or financial institution, this is null.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberMatchScore phoneNumberMatchScore = (PhoneNumberMatchScore) o;
    return Objects.equals(this.score, phoneNumberMatchScore.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberMatchScore {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

