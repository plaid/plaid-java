package com.plaid.client.response;

import java.util.List;

public class AccountsResponse extends PlaidUserResponse {

    protected List<Account> accounts;
    
    public List<Account> getAccounts() {
        return accounts;
    }
    
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
