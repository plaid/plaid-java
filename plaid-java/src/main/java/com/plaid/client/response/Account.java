package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Account {

    private String id;
    private String item;
    private String userId;
    
    private Balance balance;
    private AccountMeta meta;
    private AccountNumbers numbers;
    
    private String institutionType;
    private String type;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("_item")
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    @JsonProperty("_user")
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Balance getBalance() {
        return balance;
    }
    public void setBalance(Balance balance) {
        this.balance = balance;
    }
    public AccountMeta getMeta() {
        return meta;
    }
    public void setMeta(AccountMeta meta) {
        this.meta = meta;
    }
    public AccountNumbers getNumbers() {
        return numbers;
    }
    public void setNumbers(AccountNumbers numbers) {
        this.numbers = numbers;
    }
    @JsonProperty("institution_type")
    public String getInstitutionType() {
        return institutionType;
    }
    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Balance {
        private Double available;
        private Double current;

        public Double getAvailable() {
            return available;
        }
        public void setAvailable(Double available) {
            this.available = available;
        }
        public Double getCurrent() {
            return current;
        }
        public void setCurrent(Double current) {
            this.current = current;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class AccountMeta {
        private Double limit;
        private String name;
        private String number;

        public Double getLimit() {
            return limit;
        }
        public void setLimit(Double limit) {
            this.limit = limit;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNumber() {
            return number;
        }
        public void setNumber(String number) {
            this.number = number;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class AccountNumbers {
        private String routing;
        private String account;

        public String getRouting() {
            return routing;
        }

        public void setRouting(String routing) {
            this.routing = routing;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }
    }
    
}
