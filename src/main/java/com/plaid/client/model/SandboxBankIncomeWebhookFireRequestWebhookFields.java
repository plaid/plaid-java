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
import com.plaid.client.model.BankIncomeRefreshCompleteResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Optional fields which will be populated in the simulated webhook
 */
@ApiModel(description = "Optional fields which will be populated in the simulated webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T16:44:11.345889Z[Etc/UTC]")
public class SandboxBankIncomeWebhookFireRequestWebhookFields {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_BANK_INCOME_REFRESH_COMPLETE_RESULT = "bank_income_refresh_complete_result";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_REFRESH_COMPLETE_RESULT)
  private BankIncomeRefreshCompleteResult bankIncomeRefreshCompleteResult;


  public SandboxBankIncomeWebhookFireRequestWebhookFields userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The user id to be returned in INCOME webhooks
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The user id to be returned in INCOME webhooks")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public SandboxBankIncomeWebhookFireRequestWebhookFields bankIncomeRefreshCompleteResult(BankIncomeRefreshCompleteResult bankIncomeRefreshCompleteResult) {
    
    this.bankIncomeRefreshCompleteResult = bankIncomeRefreshCompleteResult;
    return this;
  }

   /**
   * Get bankIncomeRefreshCompleteResult
   * @return bankIncomeRefreshCompleteResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankIncomeRefreshCompleteResult getBankIncomeRefreshCompleteResult() {
    return bankIncomeRefreshCompleteResult;
  }


  public void setBankIncomeRefreshCompleteResult(BankIncomeRefreshCompleteResult bankIncomeRefreshCompleteResult) {
    this.bankIncomeRefreshCompleteResult = bankIncomeRefreshCompleteResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxBankIncomeWebhookFireRequestWebhookFields sandboxBankIncomeWebhookFireRequestWebhookFields = (SandboxBankIncomeWebhookFireRequestWebhookFields) o;
    return Objects.equals(this.userId, sandboxBankIncomeWebhookFireRequestWebhookFields.userId) &&
        Objects.equals(this.bankIncomeRefreshCompleteResult, sandboxBankIncomeWebhookFireRequestWebhookFields.bankIncomeRefreshCompleteResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, bankIncomeRefreshCompleteResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxBankIncomeWebhookFireRequestWebhookFields {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    bankIncomeRefreshCompleteResult: ").append(toIndentedString(bankIncomeRefreshCompleteResult)).append("\n");
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

