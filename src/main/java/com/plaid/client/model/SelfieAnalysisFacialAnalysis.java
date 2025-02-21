/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.620.0
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
import com.plaid.client.model.SelfieAnalysisFacialAnalysisOutcome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analysis of the facial features of the selfie when compared to the face in the uploaded document, if one is present.
 */
@ApiModel(description = "Analysis of the facial features of the selfie when compared to the face in the uploaded document, if one is present.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class SelfieAnalysisFacialAnalysis {
  public static final String SERIALIZED_NAME_LEFT_EYE = "left_eye";
  @SerializedName(SERIALIZED_NAME_LEFT_EYE)
  private SelfieAnalysisFacialAnalysisOutcome leftEye;

  public static final String SERIALIZED_NAME_RIGHT_EYE = "right_eye";
  @SerializedName(SERIALIZED_NAME_RIGHT_EYE)
  private SelfieAnalysisFacialAnalysisOutcome rightEye;

  public static final String SERIALIZED_NAME_LEFT_BROW = "left_brow";
  @SerializedName(SERIALIZED_NAME_LEFT_BROW)
  private SelfieAnalysisFacialAnalysisOutcome leftBrow;

  public static final String SERIALIZED_NAME_RIGHT_BROW = "right_brow";
  @SerializedName(SERIALIZED_NAME_RIGHT_BROW)
  private SelfieAnalysisFacialAnalysisOutcome rightBrow;

  public static final String SERIALIZED_NAME_FOREHEAD = "forehead";
  @SerializedName(SERIALIZED_NAME_FOREHEAD)
  private SelfieAnalysisFacialAnalysisOutcome forehead;

  public static final String SERIALIZED_NAME_MIDDLE_FOREHEAD = "middle_forehead";
  @SerializedName(SERIALIZED_NAME_MIDDLE_FOREHEAD)
  private SelfieAnalysisFacialAnalysisOutcome middleForehead;

  public static final String SERIALIZED_NAME_NOSE = "nose";
  @SerializedName(SERIALIZED_NAME_NOSE)
  private SelfieAnalysisFacialAnalysisOutcome nose;

  public static final String SERIALIZED_NAME_PHILTRUM = "philtrum";
  @SerializedName(SERIALIZED_NAME_PHILTRUM)
  private SelfieAnalysisFacialAnalysisOutcome philtrum;

  public static final String SERIALIZED_NAME_MOUTH = "mouth";
  @SerializedName(SERIALIZED_NAME_MOUTH)
  private SelfieAnalysisFacialAnalysisOutcome mouth;

  public static final String SERIALIZED_NAME_JAW = "jaw";
  @SerializedName(SERIALIZED_NAME_JAW)
  private SelfieAnalysisFacialAnalysisOutcome jaw;

  public static final String SERIALIZED_NAME_LEFT_CHEEK = "left_cheek";
  @SerializedName(SERIALIZED_NAME_LEFT_CHEEK)
  private SelfieAnalysisFacialAnalysisOutcome leftCheek;

  public static final String SERIALIZED_NAME_RIGHT_CHEEK = "right_cheek";
  @SerializedName(SERIALIZED_NAME_RIGHT_CHEEK)
  private SelfieAnalysisFacialAnalysisOutcome rightCheek;


  public SelfieAnalysisFacialAnalysis leftEye(SelfieAnalysisFacialAnalysisOutcome leftEye) {
    
    this.leftEye = leftEye;
    return this;
  }

   /**
   * Get leftEye
   * @return leftEye
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getLeftEye() {
    return leftEye;
  }


  public void setLeftEye(SelfieAnalysisFacialAnalysisOutcome leftEye) {
    this.leftEye = leftEye;
  }


  public SelfieAnalysisFacialAnalysis rightEye(SelfieAnalysisFacialAnalysisOutcome rightEye) {
    
    this.rightEye = rightEye;
    return this;
  }

   /**
   * Get rightEye
   * @return rightEye
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getRightEye() {
    return rightEye;
  }


  public void setRightEye(SelfieAnalysisFacialAnalysisOutcome rightEye) {
    this.rightEye = rightEye;
  }


  public SelfieAnalysisFacialAnalysis leftBrow(SelfieAnalysisFacialAnalysisOutcome leftBrow) {
    
    this.leftBrow = leftBrow;
    return this;
  }

   /**
   * Get leftBrow
   * @return leftBrow
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getLeftBrow() {
    return leftBrow;
  }


  public void setLeftBrow(SelfieAnalysisFacialAnalysisOutcome leftBrow) {
    this.leftBrow = leftBrow;
  }


  public SelfieAnalysisFacialAnalysis rightBrow(SelfieAnalysisFacialAnalysisOutcome rightBrow) {
    
    this.rightBrow = rightBrow;
    return this;
  }

   /**
   * Get rightBrow
   * @return rightBrow
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getRightBrow() {
    return rightBrow;
  }


  public void setRightBrow(SelfieAnalysisFacialAnalysisOutcome rightBrow) {
    this.rightBrow = rightBrow;
  }


  public SelfieAnalysisFacialAnalysis forehead(SelfieAnalysisFacialAnalysisOutcome forehead) {
    
    this.forehead = forehead;
    return this;
  }

   /**
   * Get forehead
   * @return forehead
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getForehead() {
    return forehead;
  }


  public void setForehead(SelfieAnalysisFacialAnalysisOutcome forehead) {
    this.forehead = forehead;
  }


  public SelfieAnalysisFacialAnalysis middleForehead(SelfieAnalysisFacialAnalysisOutcome middleForehead) {
    
    this.middleForehead = middleForehead;
    return this;
  }

   /**
   * Get middleForehead
   * @return middleForehead
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getMiddleForehead() {
    return middleForehead;
  }


  public void setMiddleForehead(SelfieAnalysisFacialAnalysisOutcome middleForehead) {
    this.middleForehead = middleForehead;
  }


  public SelfieAnalysisFacialAnalysis nose(SelfieAnalysisFacialAnalysisOutcome nose) {
    
    this.nose = nose;
    return this;
  }

   /**
   * Get nose
   * @return nose
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getNose() {
    return nose;
  }


  public void setNose(SelfieAnalysisFacialAnalysisOutcome nose) {
    this.nose = nose;
  }


  public SelfieAnalysisFacialAnalysis philtrum(SelfieAnalysisFacialAnalysisOutcome philtrum) {
    
    this.philtrum = philtrum;
    return this;
  }

   /**
   * Get philtrum
   * @return philtrum
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getPhiltrum() {
    return philtrum;
  }


  public void setPhiltrum(SelfieAnalysisFacialAnalysisOutcome philtrum) {
    this.philtrum = philtrum;
  }


  public SelfieAnalysisFacialAnalysis mouth(SelfieAnalysisFacialAnalysisOutcome mouth) {
    
    this.mouth = mouth;
    return this;
  }

   /**
   * Get mouth
   * @return mouth
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getMouth() {
    return mouth;
  }


  public void setMouth(SelfieAnalysisFacialAnalysisOutcome mouth) {
    this.mouth = mouth;
  }


  public SelfieAnalysisFacialAnalysis jaw(SelfieAnalysisFacialAnalysisOutcome jaw) {
    
    this.jaw = jaw;
    return this;
  }

   /**
   * Get jaw
   * @return jaw
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getJaw() {
    return jaw;
  }


  public void setJaw(SelfieAnalysisFacialAnalysisOutcome jaw) {
    this.jaw = jaw;
  }


  public SelfieAnalysisFacialAnalysis leftCheek(SelfieAnalysisFacialAnalysisOutcome leftCheek) {
    
    this.leftCheek = leftCheek;
    return this;
  }

   /**
   * Get leftCheek
   * @return leftCheek
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getLeftCheek() {
    return leftCheek;
  }


  public void setLeftCheek(SelfieAnalysisFacialAnalysisOutcome leftCheek) {
    this.leftCheek = leftCheek;
  }


  public SelfieAnalysisFacialAnalysis rightCheek(SelfieAnalysisFacialAnalysisOutcome rightCheek) {
    
    this.rightCheek = rightCheek;
    return this;
  }

   /**
   * Get rightCheek
   * @return rightCheek
  **/
  @ApiModelProperty(required = true, value = "")

  public SelfieAnalysisFacialAnalysisOutcome getRightCheek() {
    return rightCheek;
  }


  public void setRightCheek(SelfieAnalysisFacialAnalysisOutcome rightCheek) {
    this.rightCheek = rightCheek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfieAnalysisFacialAnalysis selfieAnalysisFacialAnalysis = (SelfieAnalysisFacialAnalysis) o;
    return Objects.equals(this.leftEye, selfieAnalysisFacialAnalysis.leftEye) &&
        Objects.equals(this.rightEye, selfieAnalysisFacialAnalysis.rightEye) &&
        Objects.equals(this.leftBrow, selfieAnalysisFacialAnalysis.leftBrow) &&
        Objects.equals(this.rightBrow, selfieAnalysisFacialAnalysis.rightBrow) &&
        Objects.equals(this.forehead, selfieAnalysisFacialAnalysis.forehead) &&
        Objects.equals(this.middleForehead, selfieAnalysisFacialAnalysis.middleForehead) &&
        Objects.equals(this.nose, selfieAnalysisFacialAnalysis.nose) &&
        Objects.equals(this.philtrum, selfieAnalysisFacialAnalysis.philtrum) &&
        Objects.equals(this.mouth, selfieAnalysisFacialAnalysis.mouth) &&
        Objects.equals(this.jaw, selfieAnalysisFacialAnalysis.jaw) &&
        Objects.equals(this.leftCheek, selfieAnalysisFacialAnalysis.leftCheek) &&
        Objects.equals(this.rightCheek, selfieAnalysisFacialAnalysis.rightCheek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftEye, rightEye, leftBrow, rightBrow, forehead, middleForehead, nose, philtrum, mouth, jaw, leftCheek, rightCheek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfieAnalysisFacialAnalysis {\n");
    sb.append("    leftEye: ").append(toIndentedString(leftEye)).append("\n");
    sb.append("    rightEye: ").append(toIndentedString(rightEye)).append("\n");
    sb.append("    leftBrow: ").append(toIndentedString(leftBrow)).append("\n");
    sb.append("    rightBrow: ").append(toIndentedString(rightBrow)).append("\n");
    sb.append("    forehead: ").append(toIndentedString(forehead)).append("\n");
    sb.append("    middleForehead: ").append(toIndentedString(middleForehead)).append("\n");
    sb.append("    nose: ").append(toIndentedString(nose)).append("\n");
    sb.append("    philtrum: ").append(toIndentedString(philtrum)).append("\n");
    sb.append("    mouth: ").append(toIndentedString(mouth)).append("\n");
    sb.append("    jaw: ").append(toIndentedString(jaw)).append("\n");
    sb.append("    leftCheek: ").append(toIndentedString(leftCheek)).append("\n");
    sb.append("    rightCheek: ").append(toIndentedString(rightCheek)).append("\n");
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

