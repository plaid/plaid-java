package com.plaid.client.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InfoResponse extends PlaidUserResponse {

	private List<Account> accounts;
	private Info info;
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	public static final class Info  implements Serializable{
		private List<String> names;
		private List<Email> emails;
		private List<PhoneNumber> phoneNumbers;
		private List<Address> addresses;

		public List<String> getNames() {
			return names;
		}
		public void setNames(List<String> names) {
			this.names = names;
		}
		public List<Email> getEmails() {
			return emails;
		}
		public void setEmails(List<Email> emails) {
			this.emails = emails;
		}
		@JsonProperty("phone_numbers")
		public List<PhoneNumber> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
		public List<Address> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}
	} 
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static final class Email implements Serializable {
		private String data;
		private String type;
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}		
	}
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static final class PhoneNumber implements Serializable {
		private String data;
		private String type;
		private Boolean primary;
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Boolean isPrimary() {
			return primary;
		}
		public void setPrimary(Boolean primary) {
			this.primary = primary;
		}		
	}
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static final class Address implements Serializable {
		private Boolean primary;
		private AddressDetails addressDetails;
		
		public Boolean getPrimary() {
			return primary;
		}
		public void setPrimary(Boolean primary) {
			this.primary = primary;
		}
		@JsonProperty("address")
		public AddressDetails getAddressDetails() {
			return addressDetails;
		}
		public void setAddressDetails(AddressDetails addressDetails) {
			this.addressDetails = addressDetails;
		}	
	}
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static final class AddressDetails implements Serializable {
		private String street;
		private String city;
		private String state;
		private String zip;
		
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}		
	}
	
}
