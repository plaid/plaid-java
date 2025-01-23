/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.610.1
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
import java.util.ArrayList;
import java.util.List;

/**
 * Information describing a transaction category
 */
@ApiModel(description = "Information describing a transaction category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class Category {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private List<String> hierarchy = new ArrayList<>();


  public Category categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * An identifying number for the category. &#x60;category_id&#x60; is a Plaid-specific identifier and does not necessarily correspond to merchant category codes.
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "An identifying number for the category. `category_id` is a Plaid-specific identifier and does not necessarily correspond to merchant category codes.")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public Category group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * &#x60;place&#x60; for physical transactions or &#x60;special&#x60; for other transactions such as bank charges.
   * @return group
  **/
  @ApiModelProperty(required = true, value = "`place` for physical transactions or `special` for other transactions such as bank charges.")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public Category hierarchy(List<String> hierarchy) {
    
    this.hierarchy = hierarchy;
    return this;
  }

  public Category addHierarchyItem(String hierarchyItem) {
    this.hierarchy.add(hierarchyItem);
    return this;
  }

   /**
   * A hierarchical array of the categories to which this &#x60;category_id&#x60; belongs.
   * @return hierarchy
  **/
  @ApiModelProperty(required = true, value = "A hierarchical array of the categories to which this `category_id` belongs.")

  public List<String> getHierarchy() {
    return hierarchy;
  }


  public void setHierarchy(List<String> hierarchy) {
    this.hierarchy = hierarchy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryId, category.categoryId) &&
        Objects.equals(this.group, category.group) &&
        Objects.equals(this.hierarchy, category.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, group, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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

