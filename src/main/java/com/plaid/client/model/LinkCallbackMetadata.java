/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.556.0
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
import com.plaid.client.model.LinkDeliveryAccount;
import com.plaid.client.model.LinkDeliveryInstitution;
import com.plaid.client.model.LinkDeliveryWebhookCallbackType;
import com.plaid.client.model.LinkEventName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information related to the callback from the Hosted Link session.
 */
@ApiModel(description = "Information related to the callback from the Hosted Link session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T20:03:42.500463Z[Etc/UTC]")
public class LinkCallbackMetadata {
  public static final String SERIALIZED_NAME_CALLBACK_TYPE = "callback_type";
  @SerializedName(SERIALIZED_NAME_CALLBACK_TYPE)
  private LinkDeliveryWebhookCallbackType callbackType;

  public static final String SERIALIZED_NAME_EVENT_NAME = "event_name";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private LinkEventName eventName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private LinkDeliveryInstitution institution;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<LinkDeliveryAccount> accounts = null;


  public LinkCallbackMetadata callbackType(LinkDeliveryWebhookCallbackType callbackType) {
    
    this.callbackType = callbackType;
    return this;
  }

   /**
   * Get callbackType
   * @return callbackType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkDeliveryWebhookCallbackType getCallbackType() {
    return callbackType;
  }


  public void setCallbackType(LinkDeliveryWebhookCallbackType callbackType) {
    this.callbackType = callbackType;
  }


  public LinkCallbackMetadata eventName(LinkEventName eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkEventName getEventName() {
    return eventName;
  }


  public void setEventName(LinkEventName eventName) {
    this.eventName = eventName;
  }


  public LinkCallbackMetadata status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Indicates where in the flow the Link user exited
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates where in the flow the Link user exited")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public LinkCallbackMetadata linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * A unique identifier associated with a user&#39;s actions and events through the Link flow. Include this identifier when opening a support ticket for faster turnaround.
   * @return linkSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier associated with a user's actions and events through the Link flow. Include this identifier when opening a support ticket for faster turnaround.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkCallbackMetadata requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID for the last request made by Link. This can be shared with Plaid Support to expedite investigation.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The request ID for the last request made by Link. This can be shared with Plaid Support to expedite investigation.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public LinkCallbackMetadata institution(LinkDeliveryInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkDeliveryInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(LinkDeliveryInstitution institution) {
    this.institution = institution;
  }


  public LinkCallbackMetadata accounts(List<LinkDeliveryAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public LinkCallbackMetadata addAccountsItem(LinkDeliveryAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * A list of accounts attached to the connected Item. If Account Select is enabled via the developer dashboard, accounts will only include selected accounts.
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of accounts attached to the connected Item. If Account Select is enabled via the developer dashboard, accounts will only include selected accounts.")

  public List<LinkDeliveryAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<LinkDeliveryAccount> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkCallbackMetadata linkCallbackMetadata = (LinkCallbackMetadata) o;
    return Objects.equals(this.callbackType, linkCallbackMetadata.callbackType) &&
        Objects.equals(this.eventName, linkCallbackMetadata.eventName) &&
        Objects.equals(this.status, linkCallbackMetadata.status) &&
        Objects.equals(this.linkSessionId, linkCallbackMetadata.linkSessionId) &&
        Objects.equals(this.requestId, linkCallbackMetadata.requestId) &&
        Objects.equals(this.institution, linkCallbackMetadata.institution) &&
        Objects.equals(this.accounts, linkCallbackMetadata.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackType, eventName, status, linkSessionId, requestId, institution, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCallbackMetadata {\n");
    sb.append("    callbackType: ").append(toIndentedString(callbackType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

