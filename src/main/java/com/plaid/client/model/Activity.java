/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
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
import com.plaid.client.model.ActionState;
import com.plaid.client.model.ActivityType;
import com.plaid.client.model.ScopesNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Describes a consent activity.
 */
@ApiModel(description = "Describes a consent activity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class Activity {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private ActivityType activity;

  public static final String SERIALIZED_NAME_INITIATED_DATE = "initiated_date";
  @SerializedName(SERIALIZED_NAME_INITIATED_DATE)
  private LocalDate initiatedDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INITIATOR = "initiator";
  @SerializedName(SERIALIZED_NAME_INITIATOR)
  private String initiator;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ActionState state;

  public static final String SERIALIZED_NAME_TARGET_APPLICATION_ID = "target_application_id";
  @SerializedName(SERIALIZED_NAME_TARGET_APPLICATION_ID)
  private String targetApplicationId;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private ScopesNullable scopes;


  public Activity activity(ActivityType activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @ApiModelProperty(required = true, value = "")

  public ActivityType getActivity() {
    return activity;
  }


  public void setActivity(ActivityType activity) {
    this.activity = activity;
  }


  public Activity initiatedDate(LocalDate initiatedDate) {
    
    this.initiatedDate = initiatedDate;
    return this;
  }

   /**
   * The date this activity was initiated [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
   * @return initiatedDate
  **/
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 UTC 2020", required = true, value = "The date this activity was initiated [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.")

  public LocalDate getInitiatedDate() {
    return initiatedDate;
  }


  public void setInitiatedDate(LocalDate initiatedDate) {
    this.initiatedDate = initiatedDate;
  }


  public Activity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the activity
   * @return id
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the activity")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Activity initiator(String initiator) {
    
    this.initiator = initiator;
    return this;
  }

   /**
   * Application ID of the client who initiated the activity.
   * @return initiator
  **/
  @ApiModelProperty(required = true, value = "Application ID of the client who initiated the activity.")

  public String getInitiator() {
    return initiator;
  }


  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }


  public Activity state(ActionState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")

  public ActionState getState() {
    return state;
  }


  public void setState(ActionState state) {
    this.state = state;
  }


  public Activity targetApplicationId(String targetApplicationId) {
    
    this.targetApplicationId = targetApplicationId;
    return this;
  }

   /**
   * This field will map to the application ID that is returned from /item/application/list, or provided to the institution in an oauth redirect.
   * @return targetApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field will map to the application ID that is returned from /item/application/list, or provided to the institution in an oauth redirect.")

  public String getTargetApplicationId() {
    return targetApplicationId;
  }


  public void setTargetApplicationId(String targetApplicationId) {
    this.targetApplicationId = targetApplicationId;
  }


  public Activity scopes(ScopesNullable scopes) {
    
    this.scopes = scopes;
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScopesNullable getScopes() {
    return scopes;
  }


  public void setScopes(ScopesNullable scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.activity, activity.activity) &&
        Objects.equals(this.initiatedDate, activity.initiatedDate) &&
        Objects.equals(this.id, activity.id) &&
        Objects.equals(this.initiator, activity.initiator) &&
        Objects.equals(this.state, activity.state) &&
        Objects.equals(this.targetApplicationId, activity.targetApplicationId) &&
        Objects.equals(this.scopes, activity.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, initiatedDate, id, initiator, state, targetApplicationId, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    initiatedDate: ").append(toIndentedString(initiatedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    targetApplicationId: ").append(toIndentedString(targetApplicationId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

