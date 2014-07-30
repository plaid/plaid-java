package com.plaid.client.request;

public class GetOptions {

	private Boolean pending;
	private String account;
	private String last;
	private String gte;
	private String lte;
	
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
	
}
