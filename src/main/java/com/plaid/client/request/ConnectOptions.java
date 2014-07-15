package com.plaid.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectOptions {

    private Boolean pretty;
    private Boolean login;
    private Boolean list;
    private Boolean pending;
    
    private String webhook;
    private String startDate;
    private String endDate;
    
    public Boolean isPretty() {
        return pretty;
    }
    public void setPretty(Boolean pretty) {
        this.pretty = pretty;
    }
    public Boolean isLogin() {
        return login;
    }
    public void setLogin(Boolean login) {
        this.login = login;
    }
    public Boolean isList() {
        return list;
    }
    public void setList(Boolean list) {
        this.list = list;
    }
    public String getWebhook() {
        return webhook;
    }
    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }
    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public void setPending(Boolean pending) {
		this.pending = pending;
	}
    public Boolean isPending() {
		return pending;
	}

}
