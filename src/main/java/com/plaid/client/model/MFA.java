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
import java.math.BigDecimal;

/**
 * Specifies the multi-factor authentication settings to use with this test account
 */
@ApiModel(description = "Specifies the multi-factor authentication settings to use with this test account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T19:36:14.619905Z[Etc/UTC]")
public class MFA {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_QUESTION_ROUNDS = "question_rounds";
  @SerializedName(SERIALIZED_NAME_QUESTION_ROUNDS)
  private Double questionRounds;

  public static final String SERIALIZED_NAME_QUESTIONS_PER_ROUND = "questions_per_round";
  @SerializedName(SERIALIZED_NAME_QUESTIONS_PER_ROUND)
  private Double questionsPerRound;

  public static final String SERIALIZED_NAME_SELECTION_ROUNDS = "selection_rounds";
  @SerializedName(SERIALIZED_NAME_SELECTION_ROUNDS)
  private Double selectionRounds;

  public static final String SERIALIZED_NAME_SELECTIONS_PER_QUESTION = "selections_per_question";
  @SerializedName(SERIALIZED_NAME_SELECTIONS_PER_QUESTION)
  private Double selectionsPerQuestion;


  public MFA type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Possible values are &#x60;device&#x60;, &#x60;selections&#x60;, or &#x60;questions&#x60;.  If value is &#x60;device&#x60;, the MFA answer is &#x60;1234&#x60;.  If value is &#x60;selections&#x60;, the MFA answer is always the first option.  If value is &#x60;questions&#x60;, the MFA answer is  &#x60;answer_&lt;i&gt;_&lt;j&gt;&#x60; for the j-th question in the i-th round, starting from 0. For example, the answer to the first question in the second round is &#x60;answer_1_0&#x60;.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Possible values are `device`, `selections`, or `questions`.  If value is `device`, the MFA answer is `1234`.  If value is `selections`, the MFA answer is always the first option.  If value is `questions`, the MFA answer is  `answer_<i>_<j>` for the j-th question in the i-th round, starting from 0. For example, the answer to the first question in the second round is `answer_1_0`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MFA questionRounds(Double questionRounds) {
    
    this.questionRounds = questionRounds;
    return this;
  }

   /**
   * Number of rounds of questions. Required if value of &#x60;type&#x60; is &#x60;questions&#x60;. 
   * @return questionRounds
  **/
  @ApiModelProperty(required = true, value = "Number of rounds of questions. Required if value of `type` is `questions`. ")

  public Double getQuestionRounds() {
    return questionRounds;
  }


  public void setQuestionRounds(Double questionRounds) {
    this.questionRounds = questionRounds;
  }


  public MFA questionsPerRound(Double questionsPerRound) {
    
    this.questionsPerRound = questionsPerRound;
    return this;
  }

   /**
   * Number of questions per round. Required if value of &#x60;type&#x60; is &#x60;questions&#x60;. If value of type is &#x60;selections&#x60;, default value is 2.
   * @return questionsPerRound
  **/
  @ApiModelProperty(required = true, value = "Number of questions per round. Required if value of `type` is `questions`. If value of type is `selections`, default value is 2.")

  public Double getQuestionsPerRound() {
    return questionsPerRound;
  }


  public void setQuestionsPerRound(Double questionsPerRound) {
    this.questionsPerRound = questionsPerRound;
  }


  public MFA selectionRounds(Double selectionRounds) {
    
    this.selectionRounds = selectionRounds;
    return this;
  }

   /**
   * Number of rounds of selections, used if &#x60;type&#x60; is &#x60;selections&#x60;. Defaults to 1.
   * @return selectionRounds
  **/
  @ApiModelProperty(required = true, value = "Number of rounds of selections, used if `type` is `selections`. Defaults to 1.")

  public Double getSelectionRounds() {
    return selectionRounds;
  }


  public void setSelectionRounds(Double selectionRounds) {
    this.selectionRounds = selectionRounds;
  }


  public MFA selectionsPerQuestion(Double selectionsPerQuestion) {
    
    this.selectionsPerQuestion = selectionsPerQuestion;
    return this;
  }

   /**
   * Number of available answers per question, used if &#x60;type&#x60; is &#x60;selection&#x60;. Defaults to 2. 
   * @return selectionsPerQuestion
  **/
  @ApiModelProperty(required = true, value = "Number of available answers per question, used if `type` is `selection`. Defaults to 2. ")

  public Double getSelectionsPerQuestion() {
    return selectionsPerQuestion;
  }


  public void setSelectionsPerQuestion(Double selectionsPerQuestion) {
    this.selectionsPerQuestion = selectionsPerQuestion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MFA MFA = (MFA) o;
    return Objects.equals(this.type, MFA.type) &&
        Objects.equals(this.questionRounds, MFA.questionRounds) &&
        Objects.equals(this.questionsPerRound, MFA.questionsPerRound) &&
        Objects.equals(this.selectionRounds, MFA.selectionRounds) &&
        Objects.equals(this.selectionsPerQuestion, MFA.selectionsPerQuestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, questionRounds, questionsPerRound, selectionRounds, selectionsPerQuestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MFA {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    questionRounds: ").append(toIndentedString(questionRounds)).append("\n");
    sb.append("    questionsPerRound: ").append(toIndentedString(questionsPerRound)).append("\n");
    sb.append("    selectionRounds: ").append(toIndentedString(selectionRounds)).append("\n");
    sb.append("    selectionsPerQuestion: ").append(toIndentedString(selectionsPerQuestion)).append("\n");
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

