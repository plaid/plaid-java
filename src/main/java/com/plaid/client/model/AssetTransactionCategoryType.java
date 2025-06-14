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
 * Asset Transaction Category Type Enumerated derived by Vendor.
 */
@JsonAdapter(AssetTransactionCategoryType.Adapter.class)
public enum AssetTransactionCategoryType {
  
  ATMFEE("ATMFee"),
  
  ADVERTISING("Advertising"),
  
  AIRTRAVEL("AirTravel"),
  
  ALCOHOLBARS("AlcoholBars"),
  
  ALLOWANCE("Allowance"),
  
  AMUSEMENT("Amusement"),
  
  ARTS("Arts"),
  
  AUTOTRANSPORT("AutoTransport"),
  
  AUTOINSURANCE("AutoInsurance"),
  
  AUTOPAYMENT("AutoPayment"),
  
  BABYSUPPLIES("BabySupplies"),
  
  BABYSITTERDAYCARE("BabysitterDaycare"),
  
  BANKFEE("BankFee"),
  
  BILLSUTILITIES("BillsUtilities"),
  
  BONUS("Bonus"),
  
  BOOKSSUPPLIES("BooksSupplies"),
  
  BUSINESS_SERVICES("Business Services"),
  
  BUY("Buy"),
  
  CASHATM("CashATM"),
  
  CHARITY("Charity"),
  
  CHECK("Check"),
  
  CHILDSUPPORT("ChildSupport"),
  
  CLOTHING("Clothing"),
  
  COFFEESHOPS("CoffeeShops"),
  
  CREDITCARDPAYMENT("CreditCardPayment"),
  
  DENTIST("Dentist"),
  
  DOCTOR("Doctor"),
  
  EDUCATION("Education"),
  
  ELECTRONICSSOFTWARE("ElectronicsSoftware"),
  
  ENTERTAINMENT("Entertainment"),
  
  EYECARE("Eyecare"),
  
  FASTFOOD("FastFood"),
  
  FEDERALTAX("FederalTax"),
  
  FEESCHARGES("FeesCharges"),
  
  FINANCECHARGE("FinanceCharge"),
  
  FINANCIAL("Financial"),
  
  FINANCIALADVISOR("FinancialAdvisor"),
  
  FOODDINING("FoodDining"),
  
  FURNISHINGS("Furnishings"),
  
  GASFUEL("GasFuel"),
  
  GIFTSDONATIONS("GiftsDonations"),
  
  GROCERIES("Groceries"),
  
  GYM("Gym"),
  
  HAIR("Hair"),
  
  HEALTHFITNESS("HealthFitness"),
  
  HEALTHINSURANCE("HealthInsurance"),
  
  HOBBIES("Hobbies"),
  
  HOME("Home"),
  
  HOMEIMPROVEMENT("HomeImprovement"),
  
  HOMEINSURANCE("HomeInsurance"),
  
  HOMEPHONE("HomePhone"),
  
  HOMESERVICES("HomeServices"),
  
  HOMESUPPLIES("HomeSupplies"),
  
  HOTEL("Hotel"),
  
  INCOME("Income"),
  
  INTERESTINCOME("InterestIncome"),
  
  INTERNET("Internet"),
  
  INVESTMENTS("Investments"),
  
  KIDS("Kids"),
  
  KIDSACTIVITIES("KidsActivities"),
  
  LATEFEE("LateFee"),
  
  LAUNDRY("Laundry"),
  
  LAWNGARDEN("LawnGarden"),
  
  LEGAL("Legal"),
  
  LIFEINSURANCE("LifeInsurance"),
  
  LOANINSURANCE("LoanInsurance"),
  
  LOANPAYMENT("LoanPayment"),
  
  LOANS("Loans"),
  
  MOBILEPHONE("MobilePhone"),
  
  MORTGAGERENT("MortgageRent"),
  
  MOVIESDVDS("MoviesDVDs"),
  
  MUSIC("Music"),
  
  NEWSPAPERSMAGAZINES("NewspapersMagazines"),
  
  OFFICESUPPLIES("OfficeSupplies"),
  
  PARKING("Parking"),
  
  PAYCHECK("Paycheck"),
  
  PERSONALCARE("PersonalCare"),
  
  PETFOODSUPPLIES("PetFoodSupplies"),
  
  PETGROOMING("PetGrooming"),
  
  PETS("Pets"),
  
  PHARMACY("Pharmacy"),
  
  PRINTING("Printing"),
  
  PROPERTY_TAX("Property Tax"),
  
  PUBLIC_TRANSPORTATION("Public Transportation"),
  
  REIMBURSEMENT("Reimbursement"),
  
  RENTALCARTAXI("RentalCarTaxi"),
  
  RESTAURANTS("Restaurants"),
  
  SALESTAX("SalesTax"),
  
  SERVICEPARTS("ServiceParts"),
  
  SERVICEFEE("ServiceFee"),
  
  SHIPPING("Shipping"),
  
  SHOPPING("Shopping"),
  
  SPAMASSAGE("SpaMassage"),
  
  SPORTINGGOODS("SportingGoods"),
  
  SPORTS("Sports"),
  
  STATETAX("StateTax"),
  
  STUDENT_LOAN("Student Loan"),
  
  TAXES("Taxes"),
  
  TELEVISION("Television"),
  
  TOYS("Toys"),
  
  TRANSFER("Transfer"),
  
  TRAVEL("Travel"),
  
  TUITION("Tuition"),
  
  UNCATEGORIZED("Uncategorized"),
  
  UTILITIES("Utilities"),
  
  VACATION("Vacation"),
  
  VETERINARY("Veterinary"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AssetTransactionCategoryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetTransactionCategoryType fromValue(String value) {
    for (AssetTransactionCategoryType b : AssetTransactionCategoryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<AssetTransactionCategoryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetTransactionCategoryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetTransactionCategoryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetTransactionCategoryType.fromValue(value);
    }
  }
}

