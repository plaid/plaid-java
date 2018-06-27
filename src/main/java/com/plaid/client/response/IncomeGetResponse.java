package com.plaid.client.response;

import java.util.List;

public final class IncomeGetResponse extends BaseResponse {
  private ItemStatus item;
  private Income income;

  public ItemStatus getItem() {
    return item;
  }

  public Income getIncome() {
    return income;
  }

  public static final class Income {
    private Float lastYearIncome;
    private Float lastYearIncomeBeforeTax;
    private Float projectedYearlyIncome;
    private Float projectedYearlyIncomeBeforeTax;
    private Integer maxNumberOfOverlappingIncomeStreams;
    private Integer numberOfIncomeStreams;
    private List<IncomeStream> incomeStreams;

    public Float getLastYearIncome() {
      return lastYearIncome;
    }

    public Float getLastYearIncomeBeforeTax() {
      return lastYearIncomeBeforeTax;
    }

    public Float getProjectedYearlyIncome() {
      return projectedYearlyIncome;
    }

    public Float getProjectedYearlyIncomeBeforeTax() {
      return projectedYearlyIncomeBeforeTax;
    }

    public Integer getMaxNumberOfOverlappingIncomeStreams() {
      return maxNumberOfOverlappingIncomeStreams;
    }

    public Integer getNumberOfIncomeStreams() {
      return numberOfIncomeStreams;
    }

    public List<IncomeStream> getIncomeStreams() {
      return incomeStreams;
    }
  }

  public static final class IncomeStream {
    private Float confidence;
    private Float days;
    private Float monthlyIncome;
    private String name;

    public Float getConfidence() {
      return confidence;
    }

    public Float getDays() {
      return days;
    }

    public Float getMonthlyIncome() {
      return monthlyIncome;
    }

    public String getName() {
      return name;
    }
  }
}
