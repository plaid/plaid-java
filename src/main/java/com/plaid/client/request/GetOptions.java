package com.plaid.client.request;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class GetOptions {

	private Boolean pending;
	private String account;
	private String last;
	private String gte;
	private String lte;
	private Boolean includeOriginalDescription;
	
	public Boolean isPending() {
		return pending;
	}

	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getGte() {
		return gte;
	}

	public void setGte(String gte) {
		this.gte = gte;
	}

	public String getLte() {
		return lte;
	}

	public void setLte(String lte) {
		this.lte = lte;
	}

	@JsonProperty("include_original_description")
	public Boolean getIncludeOriginalDescription() {
		return includeOriginalDescription;
	}

	public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
		this.includeOriginalDescription = includeOriginalDescription;
	}
}
