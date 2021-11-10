/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.46.1
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
 * An object representing the repayment plan for the student loan
 */
@ApiModel(description = "An object representing the repayment plan for the student loan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T01:11:28.812Z[GMT]")
public class StudentRepaymentPlan {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The type of the repayment plan.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EXTENDED_GRADUATED("extended graduated"),
    
    EXTENDED_STANDARD("extended standard"),
    
    GRADUATED("graduated"),
    
    INCOME_CONTINGENT_REPAYMENT("income-contingent repayment"),
    
    INCOME_BASED_REPAYMENT("income-based repayment"),
    
    INTEREST_ONLY("interest-only"),
    
    OTHER("other"),
    
    PAY_AS_YOU_EARN("pay as you earn"),
    
    REVISED_PAY_AS_YOU_EARN("revised pay as you earn"),
    
    STANDARD("standard"),
    
    NULL("null");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public StudentRepaymentPlan description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the repayment plan as provided by the servicer.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The description of the repayment plan as provided by the servicer.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public StudentRepaymentPlan type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the repayment plan.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of the repayment plan.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentRepaymentPlan studentRepaymentPlan = (StudentRepaymentPlan) o;
    return Objects.equals(this.description, studentRepaymentPlan.description) &&
        Objects.equals(this.type, studentRepaymentPlan.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentRepaymentPlan {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

