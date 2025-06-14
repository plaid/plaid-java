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
import com.plaid.client.model.IdentityVerificationStepStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Each step will be one of the following values:   &#x60;active&#x60; - This step is the user&#39;s current step. They are either in the process of completing this step, or they recently closed their Identity Verification attempt while in the middle of this step. Only one step will be marked as &#x60;active&#x60; at any given point.  &#x60;success&#x60; - The Identity Verification attempt has completed this step.  &#x60;failed&#x60; - The user failed this step. This can either call the user to fail the session as a whole, or cause them to fallback to another step depending on how the Identity Verification template is configured. A failed step does not imply a failed session.  &#x60;waiting_for_prerequisite&#x60; - The user needs to complete another step first, before they progress to this step. This step may never run, depending on if the user fails an earlier step or if the step is only run as a fallback.  &#x60;not_applicable&#x60; - This step will not be run for this session.  &#x60;skipped&#x60; - The retry instructions that created this Identity Verification attempt specified that this step should be skipped.  &#x60;expired&#x60; - This step had not yet been completed when the Identity Verification attempt as a whole expired.  &#x60;canceled&#x60; - The Identity Verification attempt was canceled before the user completed this step.  &#x60;pending_review&#x60; - The Identity Verification attempt template was configured to perform a screening that had one or more hits needing review.  &#x60;manually_approved&#x60; - The step was manually overridden to pass by a team member in the dashboard.  &#x60;manually_rejected&#x60; - The step was manually overridden to fail by a team member in the dashboard.
 */
@ApiModel(description = "Each step will be one of the following values:   `active` - This step is the user's current step. They are either in the process of completing this step, or they recently closed their Identity Verification attempt while in the middle of this step. Only one step will be marked as `active` at any given point.  `success` - The Identity Verification attempt has completed this step.  `failed` - The user failed this step. This can either call the user to fail the session as a whole, or cause them to fallback to another step depending on how the Identity Verification template is configured. A failed step does not imply a failed session.  `waiting_for_prerequisite` - The user needs to complete another step first, before they progress to this step. This step may never run, depending on if the user fails an earlier step or if the step is only run as a fallback.  `not_applicable` - This step will not be run for this session.  `skipped` - The retry instructions that created this Identity Verification attempt specified that this step should be skipped.  `expired` - This step had not yet been completed when the Identity Verification attempt as a whole expired.  `canceled` - The Identity Verification attempt was canceled before the user completed this step.  `pending_review` - The Identity Verification attempt template was configured to perform a screening that had one or more hits needing review.  `manually_approved` - The step was manually overridden to pass by a team member in the dashboard.  `manually_rejected` - The step was manually overridden to fail by a team member in the dashboard.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class IdentityVerificationStepSummary {
  public static final String SERIALIZED_NAME_ACCEPT_TOS = "accept_tos";
  @SerializedName(SERIALIZED_NAME_ACCEPT_TOS)
  private IdentityVerificationStepStatus acceptTos;

  public static final String SERIALIZED_NAME_VERIFY_SMS = "verify_sms";
  @SerializedName(SERIALIZED_NAME_VERIFY_SMS)
  private IdentityVerificationStepStatus verifySms;

  public static final String SERIALIZED_NAME_KYC_CHECK = "kyc_check";
  @SerializedName(SERIALIZED_NAME_KYC_CHECK)
  private IdentityVerificationStepStatus kycCheck;

  public static final String SERIALIZED_NAME_DOCUMENTARY_VERIFICATION = "documentary_verification";
  @SerializedName(SERIALIZED_NAME_DOCUMENTARY_VERIFICATION)
  private IdentityVerificationStepStatus documentaryVerification;

  public static final String SERIALIZED_NAME_SELFIE_CHECK = "selfie_check";
  @SerializedName(SERIALIZED_NAME_SELFIE_CHECK)
  private IdentityVerificationStepStatus selfieCheck;

  public static final String SERIALIZED_NAME_WATCHLIST_SCREENING = "watchlist_screening";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_SCREENING)
  private IdentityVerificationStepStatus watchlistScreening;

  public static final String SERIALIZED_NAME_RISK_CHECK = "risk_check";
  @SerializedName(SERIALIZED_NAME_RISK_CHECK)
  private IdentityVerificationStepStatus riskCheck;


  public IdentityVerificationStepSummary acceptTos(IdentityVerificationStepStatus acceptTos) {
    
    this.acceptTos = acceptTos;
    return this;
  }

   /**
   * Get acceptTos
   * @return acceptTos
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getAcceptTos() {
    return acceptTos;
  }


  public void setAcceptTos(IdentityVerificationStepStatus acceptTos) {
    this.acceptTos = acceptTos;
  }


  public IdentityVerificationStepSummary verifySms(IdentityVerificationStepStatus verifySms) {
    
    this.verifySms = verifySms;
    return this;
  }

   /**
   * Get verifySms
   * @return verifySms
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getVerifySms() {
    return verifySms;
  }


  public void setVerifySms(IdentityVerificationStepStatus verifySms) {
    this.verifySms = verifySms;
  }


  public IdentityVerificationStepSummary kycCheck(IdentityVerificationStepStatus kycCheck) {
    
    this.kycCheck = kycCheck;
    return this;
  }

   /**
   * Get kycCheck
   * @return kycCheck
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getKycCheck() {
    return kycCheck;
  }


  public void setKycCheck(IdentityVerificationStepStatus kycCheck) {
    this.kycCheck = kycCheck;
  }


  public IdentityVerificationStepSummary documentaryVerification(IdentityVerificationStepStatus documentaryVerification) {
    
    this.documentaryVerification = documentaryVerification;
    return this;
  }

   /**
   * Get documentaryVerification
   * @return documentaryVerification
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getDocumentaryVerification() {
    return documentaryVerification;
  }


  public void setDocumentaryVerification(IdentityVerificationStepStatus documentaryVerification) {
    this.documentaryVerification = documentaryVerification;
  }


  public IdentityVerificationStepSummary selfieCheck(IdentityVerificationStepStatus selfieCheck) {
    
    this.selfieCheck = selfieCheck;
    return this;
  }

   /**
   * Get selfieCheck
   * @return selfieCheck
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getSelfieCheck() {
    return selfieCheck;
  }


  public void setSelfieCheck(IdentityVerificationStepStatus selfieCheck) {
    this.selfieCheck = selfieCheck;
  }


  public IdentityVerificationStepSummary watchlistScreening(IdentityVerificationStepStatus watchlistScreening) {
    
    this.watchlistScreening = watchlistScreening;
    return this;
  }

   /**
   * Get watchlistScreening
   * @return watchlistScreening
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getWatchlistScreening() {
    return watchlistScreening;
  }


  public void setWatchlistScreening(IdentityVerificationStepStatus watchlistScreening) {
    this.watchlistScreening = watchlistScreening;
  }


  public IdentityVerificationStepSummary riskCheck(IdentityVerificationStepStatus riskCheck) {
    
    this.riskCheck = riskCheck;
    return this;
  }

   /**
   * Get riskCheck
   * @return riskCheck
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepStatus getRiskCheck() {
    return riskCheck;
  }


  public void setRiskCheck(IdentityVerificationStepStatus riskCheck) {
    this.riskCheck = riskCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationStepSummary identityVerificationStepSummary = (IdentityVerificationStepSummary) o;
    return Objects.equals(this.acceptTos, identityVerificationStepSummary.acceptTos) &&
        Objects.equals(this.verifySms, identityVerificationStepSummary.verifySms) &&
        Objects.equals(this.kycCheck, identityVerificationStepSummary.kycCheck) &&
        Objects.equals(this.documentaryVerification, identityVerificationStepSummary.documentaryVerification) &&
        Objects.equals(this.selfieCheck, identityVerificationStepSummary.selfieCheck) &&
        Objects.equals(this.watchlistScreening, identityVerificationStepSummary.watchlistScreening) &&
        Objects.equals(this.riskCheck, identityVerificationStepSummary.riskCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptTos, verifySms, kycCheck, documentaryVerification, selfieCheck, watchlistScreening, riskCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationStepSummary {\n");
    sb.append("    acceptTos: ").append(toIndentedString(acceptTos)).append("\n");
    sb.append("    verifySms: ").append(toIndentedString(verifySms)).append("\n");
    sb.append("    kycCheck: ").append(toIndentedString(kycCheck)).append("\n");
    sb.append("    documentaryVerification: ").append(toIndentedString(documentaryVerification)).append("\n");
    sb.append("    selfieCheck: ").append(toIndentedString(selfieCheck)).append("\n");
    sb.append("    watchlistScreening: ").append(toIndentedString(watchlistScreening)).append("\n");
    sb.append("    riskCheck: ").append(toIndentedString(riskCheck)).append("\n");
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

