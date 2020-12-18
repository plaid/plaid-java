package com.plaid.client.model.paymentinitiation;

public class Schedule {
  private String interval;
  private Integer intervalExecutionDay;
  private String startDate;

  public Schedule(String interval, Integer intervalExecutionDay, String startDate) {
    this.interval = interval;
    this.intervalExecutionDay = intervalExecutionDay;
    this.startDate = startDate;
  }

  public String getInterval() {
    return interval;
  }

  public Integer getIntervalExecutionDay() {
    return intervalExecutionDay;
  }

  public String getStartDate() {
    return startDate;
  }
}
