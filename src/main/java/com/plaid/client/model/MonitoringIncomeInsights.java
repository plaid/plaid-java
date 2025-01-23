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
import com.plaid.client.model.ForecastedMonthlyIncome;
import com.plaid.client.model.HistoricalAnnualIncome;
import com.plaid.client.model.IncomeSourcesCounts;
import com.plaid.client.model.MonitoringIncomeSource;
import com.plaid.client.model.TotalMonthlyIncomeInsights;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing the income subcategory of the report
 */
@ApiModel(description = "An object representing the income subcategory of the report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T18:11:57.813484Z[Etc/UTC]")
public class MonitoringIncomeInsights {
  public static final String SERIALIZED_NAME_TOTAL_MONTHLY_INCOME = "total_monthly_income";
  @SerializedName(SERIALIZED_NAME_TOTAL_MONTHLY_INCOME)
  private TotalMonthlyIncomeInsights totalMonthlyIncome;

  public static final String SERIALIZED_NAME_INCOME_SOURCES_COUNTS = "income_sources_counts";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCES_COUNTS)
  private IncomeSourcesCounts incomeSourcesCounts;

  public static final String SERIALIZED_NAME_FORECASTED_MONTHLY_INCOME = "forecasted_monthly_income";
  @SerializedName(SERIALIZED_NAME_FORECASTED_MONTHLY_INCOME)
  private ForecastedMonthlyIncome forecastedMonthlyIncome;

  public static final String SERIALIZED_NAME_HISTORICAL_ANNUAL_INCOME = "historical_annual_income";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_ANNUAL_INCOME)
  private HistoricalAnnualIncome historicalAnnualIncome;

  public static final String SERIALIZED_NAME_INCOME_SOURCES = "income_sources";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCES)
  private List<MonitoringIncomeSource> incomeSources = new ArrayList<>();


  public MonitoringIncomeInsights totalMonthlyIncome(TotalMonthlyIncomeInsights totalMonthlyIncome) {
    
    this.totalMonthlyIncome = totalMonthlyIncome;
    return this;
  }

   /**
   * Get totalMonthlyIncome
   * @return totalMonthlyIncome
  **/
  @ApiModelProperty(required = true, value = "")

  public TotalMonthlyIncomeInsights getTotalMonthlyIncome() {
    return totalMonthlyIncome;
  }


  public void setTotalMonthlyIncome(TotalMonthlyIncomeInsights totalMonthlyIncome) {
    this.totalMonthlyIncome = totalMonthlyIncome;
  }


  public MonitoringIncomeInsights incomeSourcesCounts(IncomeSourcesCounts incomeSourcesCounts) {
    
    this.incomeSourcesCounts = incomeSourcesCounts;
    return this;
  }

   /**
   * Get incomeSourcesCounts
   * @return incomeSourcesCounts
  **/
  @ApiModelProperty(required = true, value = "")

  public IncomeSourcesCounts getIncomeSourcesCounts() {
    return incomeSourcesCounts;
  }


  public void setIncomeSourcesCounts(IncomeSourcesCounts incomeSourcesCounts) {
    this.incomeSourcesCounts = incomeSourcesCounts;
  }


  public MonitoringIncomeInsights forecastedMonthlyIncome(ForecastedMonthlyIncome forecastedMonthlyIncome) {
    
    this.forecastedMonthlyIncome = forecastedMonthlyIncome;
    return this;
  }

   /**
   * Get forecastedMonthlyIncome
   * @return forecastedMonthlyIncome
  **/
  @ApiModelProperty(required = true, value = "")

  public ForecastedMonthlyIncome getForecastedMonthlyIncome() {
    return forecastedMonthlyIncome;
  }


  public void setForecastedMonthlyIncome(ForecastedMonthlyIncome forecastedMonthlyIncome) {
    this.forecastedMonthlyIncome = forecastedMonthlyIncome;
  }


  public MonitoringIncomeInsights historicalAnnualIncome(HistoricalAnnualIncome historicalAnnualIncome) {
    
    this.historicalAnnualIncome = historicalAnnualIncome;
    return this;
  }

   /**
   * Get historicalAnnualIncome
   * @return historicalAnnualIncome
  **/
  @ApiModelProperty(required = true, value = "")

  public HistoricalAnnualIncome getHistoricalAnnualIncome() {
    return historicalAnnualIncome;
  }


  public void setHistoricalAnnualIncome(HistoricalAnnualIncome historicalAnnualIncome) {
    this.historicalAnnualIncome = historicalAnnualIncome;
  }


  public MonitoringIncomeInsights incomeSources(List<MonitoringIncomeSource> incomeSources) {
    
    this.incomeSources = incomeSources;
    return this;
  }

  public MonitoringIncomeInsights addIncomeSourcesItem(MonitoringIncomeSource incomeSourcesItem) {
    this.incomeSources.add(incomeSourcesItem);
    return this;
  }

   /**
   * The income sources for this Item. Each entry in the array is a single income source
   * @return incomeSources
  **/
  @ApiModelProperty(required = true, value = "The income sources for this Item. Each entry in the array is a single income source")

  public List<MonitoringIncomeSource> getIncomeSources() {
    return incomeSources;
  }


  public void setIncomeSources(List<MonitoringIncomeSource> incomeSources) {
    this.incomeSources = incomeSources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringIncomeInsights monitoringIncomeInsights = (MonitoringIncomeInsights) o;
    return Objects.equals(this.totalMonthlyIncome, monitoringIncomeInsights.totalMonthlyIncome) &&
        Objects.equals(this.incomeSourcesCounts, monitoringIncomeInsights.incomeSourcesCounts) &&
        Objects.equals(this.forecastedMonthlyIncome, monitoringIncomeInsights.forecastedMonthlyIncome) &&
        Objects.equals(this.historicalAnnualIncome, monitoringIncomeInsights.historicalAnnualIncome) &&
        Objects.equals(this.incomeSources, monitoringIncomeInsights.incomeSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalMonthlyIncome, incomeSourcesCounts, forecastedMonthlyIncome, historicalAnnualIncome, incomeSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringIncomeInsights {\n");
    sb.append("    totalMonthlyIncome: ").append(toIndentedString(totalMonthlyIncome)).append("\n");
    sb.append("    incomeSourcesCounts: ").append(toIndentedString(incomeSourcesCounts)).append("\n");
    sb.append("    forecastedMonthlyIncome: ").append(toIndentedString(forecastedMonthlyIncome)).append("\n");
    sb.append("    historicalAnnualIncome: ").append(toIndentedString(historicalAnnualIncome)).append("\n");
    sb.append("    incomeSources: ").append(toIndentedString(incomeSources)).append("\n");
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

