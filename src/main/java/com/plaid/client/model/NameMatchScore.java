/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
 * Score found by matching name provided by the API with the name on the account at the financial institution. If the account contains multiple owners, the maximum match score is filled.
 */
@ApiModel(description = "Score found by matching name provided by the API with the name on the account at the financial institution. If the account contains multiple owners, the maximum match score is filled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T17:51:05.669516Z[Etc/UTC]")
public class NameMatchScore {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_IS_FIRST_NAME_OR_LAST_NAME_MATCH = "is_first_name_or_last_name_match";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_NAME_OR_LAST_NAME_MATCH)
  private Boolean isFirstNameOrLastNameMatch;

  public static final String SERIALIZED_NAME_IS_NICKNAME_MATCH = "is_nickname_match";
  @SerializedName(SERIALIZED_NAME_IS_NICKNAME_MATCH)
  private Boolean isNicknameMatch;

  public static final String SERIALIZED_NAME_IS_BUSINESS_NAME_DETECTED = "is_business_name_detected";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS_NAME_DETECTED)
  private Boolean isBusinessNameDetected;


  public NameMatchScore score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * Represents the match score for name. 100 is a perfect score, 85-99 means a strong match, 50-84 is a partial match, less than 50 is a weak match and 0 is a complete mismatch. If the name is missing from either the API or financial institution, this is empty.
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the match score for name. 100 is a perfect score, 85-99 means a strong match, 50-84 is a partial match, less than 50 is a weak match and 0 is a complete mismatch. If the name is missing from either the API or financial institution, this is empty.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public NameMatchScore isFirstNameOrLastNameMatch(Boolean isFirstNameOrLastNameMatch) {
    
    this.isFirstNameOrLastNameMatch = isFirstNameOrLastNameMatch;
    return this;
  }

   /**
   * first or last name completely matched
   * @return isFirstNameOrLastNameMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "first or last name completely matched")

  public Boolean getIsFirstNameOrLastNameMatch() {
    return isFirstNameOrLastNameMatch;
  }


  public void setIsFirstNameOrLastNameMatch(Boolean isFirstNameOrLastNameMatch) {
    this.isFirstNameOrLastNameMatch = isFirstNameOrLastNameMatch;
  }


  public NameMatchScore isNicknameMatch(Boolean isNicknameMatch) {
    
    this.isNicknameMatch = isNicknameMatch;
    return this;
  }

   /**
   * nickname matched, example Jennifer and Jenn.
   * @return isNicknameMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "nickname matched, example Jennifer and Jenn.")

  public Boolean getIsNicknameMatch() {
    return isNicknameMatch;
  }


  public void setIsNicknameMatch(Boolean isNicknameMatch) {
    this.isNicknameMatch = isNicknameMatch;
  }


  public NameMatchScore isBusinessNameDetected(Boolean isBusinessNameDetected) {
    
    this.isBusinessNameDetected = isBusinessNameDetected;
    return this;
  }

   /**
   * If the name on either of the names that was matched for the score was a business name, with corp, llc, ltd etc in the name. While this being true confirms business name, false means it was either not a business name or Plaid could not detect it as such, since a lot of business names match owner names and are hard to detect.
   * @return isBusinessNameDetected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the name on either of the names that was matched for the score was a business name, with corp, llc, ltd etc in the name. While this being true confirms business name, false means it was either not a business name or Plaid could not detect it as such, since a lot of business names match owner names and are hard to detect.")

  public Boolean getIsBusinessNameDetected() {
    return isBusinessNameDetected;
  }


  public void setIsBusinessNameDetected(Boolean isBusinessNameDetected) {
    this.isBusinessNameDetected = isBusinessNameDetected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameMatchScore nameMatchScore = (NameMatchScore) o;
    return Objects.equals(this.score, nameMatchScore.score) &&
        Objects.equals(this.isFirstNameOrLastNameMatch, nameMatchScore.isFirstNameOrLastNameMatch) &&
        Objects.equals(this.isNicknameMatch, nameMatchScore.isNicknameMatch) &&
        Objects.equals(this.isBusinessNameDetected, nameMatchScore.isBusinessNameDetected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, isFirstNameOrLastNameMatch, isNicknameMatch, isBusinessNameDetected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchScore {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    isFirstNameOrLastNameMatch: ").append(toIndentedString(isFirstNameOrLastNameMatch)).append("\n");
    sb.append("    isNicknameMatch: ").append(toIndentedString(isNicknameMatch)).append("\n");
    sb.append("    isBusinessNameDetected: ").append(toIndentedString(isBusinessNameDetected)).append("\n");
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

