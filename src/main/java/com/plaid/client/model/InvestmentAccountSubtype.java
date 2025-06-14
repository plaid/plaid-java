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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Valid account subtypes for investment accounts. For a list containing descriptions of each subtype, see [Account schemas](https://plaid.com/docs/api/accounts/#StandaloneAccountType-investment).
 */
@JsonAdapter(InvestmentAccountSubtype.Adapter.class)
public enum InvestmentAccountSubtype {
  
  _529("529"),
  
  _401A("401a"),
  
  _401K("401k"),
  
  _403B("403B"),
  
  _457B("457b"),
  
  BROKERAGE("brokerage"),
  
  CASH_ISA("cash isa"),
  
  CRYPTO_EXCHANGE("crypto exchange"),
  
  EDUCATION_SAVINGS_ACCOUNT("education savings account"),
  
  FIXED_ANNUITY("fixed annuity"),
  
  GIC("gic"),
  
  HEALTH_REIMBURSEMENT_ARRANGEMENT("health reimbursement arrangement"),
  
  HSA("hsa"),
  
  IRA("ira"),
  
  ISA("isa"),
  
  KEOGH("keogh"),
  
  LIF("lif"),
  
  LIFE_INSURANCE("life insurance"),
  
  LIRA("lira"),
  
  LRIF("lrif"),
  
  LRSP("lrsp"),
  
  MUTUAL_FUND("mutual fund"),
  
  NON_CUSTODIAL_WALLET("non-custodial wallet"),
  
  NON_TAXABLE_BROKERAGE_ACCOUNT("non-taxable brokerage account"),
  
  OTHER("other"),
  
  OTHER_ANNUITY("other annuity"),
  
  OTHER_INSURANCE("other insurance"),
  
  PENSION("pension"),
  
  PRIF("prif"),
  
  PROFIT_SHARING_PLAN("profit sharing plan"),
  
  QSHR("qshr"),
  
  RDSP("rdsp"),
  
  RESP("resp"),
  
  RETIREMENT("retirement"),
  
  RLIF("rlif"),
  
  ROTH("roth"),
  
  ROTH_401K("roth 401k"),
  
  RRIF("rrif"),
  
  RRSP("rrsp"),
  
  SARSEP("sarsep"),
  
  SEP_IRA("sep ira"),
  
  SIMPLE_IRA("simple ira"),
  
  SIPP("sipp"),
  
  STOCK_PLAN("stock plan"),
  
  TFSA("tfsa"),
  
  TRUST("trust"),
  
  UGMA("ugma"),
  
  UTMA("utma"),
  
  VARIABLE_ANNUITY("variable annuity"),
  
  ALL("all"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  InvestmentAccountSubtype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvestmentAccountSubtype fromValue(String value) {
    for (InvestmentAccountSubtype b : InvestmentAccountSubtype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return InvestmentAccountSubtype.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<InvestmentAccountSubtype> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvestmentAccountSubtype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvestmentAccountSubtype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvestmentAccountSubtype.fromValue(value);
    }
  }
}

