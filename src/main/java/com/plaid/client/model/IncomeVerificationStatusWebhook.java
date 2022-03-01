/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.79.0
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
 * Fired when the status of an income verification instance has changed. It will typically take several minutes for this webhook to fire after the end user has uploaded their documents in the Document Income flow.
 */
@ApiModel(description = "Fired when the status of an income verification instance has changed. It will typically take several minutes for this webhook to fire after the end user has uploaded their documents in the Document Income flow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T23:05:06.764Z[GMT]")
public class IncomeVerificationStatusWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_INCOME_VERIFICATION_ID = "income_verification_id";
  @SerializedName(SERIALIZED_NAME_INCOME_VERIFICATION_ID)
  private String incomeVerificationId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;


  public IncomeVerificationStatusWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;\&quot;INCOME\&quot;&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`\"INCOME\"`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IncomeVerificationStatusWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;income_verification&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`income_verification`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IncomeVerificationStatusWebhook incomeVerificationId(String incomeVerificationId) {
    
    this.incomeVerificationId = incomeVerificationId;
    return this;
  }

   /**
   * The &#x60;income_verification_id&#x60; of the verification instance whose status is being reported.
   * @return incomeVerificationId
  **/
  @ApiModelProperty(required = true, value = "The `income_verification_id` of the verification instance whose status is being reported.")

  public String getIncomeVerificationId() {
    return incomeVerificationId;
  }


  public void setIncomeVerificationId(String incomeVerificationId) {
    this.incomeVerificationId = incomeVerificationId;
  }


  public IncomeVerificationStatusWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Item ID associated with the verification.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The Item ID associated with the verification.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public IncomeVerificationStatusWebhook verificationStatus(String verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;: The income verification status processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the &#x60;/income/verification/paystubs/get&#x60; endpoint and check the document metadata to see which documents were successfully parsed.  &#x60;VERIFICATION_STATUS_PROCESSING_FAILED&#x60;: A failure occurred when attempting to process the verification documentation.  &#x60;VERIFICATION_STATUS_PENDING_APPROVAL&#x60;: The income verification has been sent to the user for review.
   * @return verificationStatus
  **/
  @ApiModelProperty(required = true, value = "`VERIFICATION_STATUS_PROCESSING_COMPLETE`: The income verification status processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the `/income/verification/paystubs/get` endpoint and check the document metadata to see which documents were successfully parsed.  `VERIFICATION_STATUS_PROCESSING_FAILED`: A failure occurred when attempting to process the verification documentation.  `VERIFICATION_STATUS_PENDING_APPROVAL`: The income verification has been sent to the user for review.")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationStatusWebhook incomeVerificationStatusWebhook = (IncomeVerificationStatusWebhook) o;
    return Objects.equals(this.webhookType, incomeVerificationStatusWebhook.webhookType) &&
        Objects.equals(this.webhookCode, incomeVerificationStatusWebhook.webhookCode) &&
        Objects.equals(this.incomeVerificationId, incomeVerificationStatusWebhook.incomeVerificationId) &&
        Objects.equals(this.itemId, incomeVerificationStatusWebhook.itemId) &&
        Objects.equals(this.verificationStatus, incomeVerificationStatusWebhook.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, incomeVerificationId, itemId, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationStatusWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    incomeVerificationId: ").append(toIndentedString(incomeVerificationId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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

