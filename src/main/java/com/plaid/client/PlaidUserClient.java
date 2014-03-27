package com.plaid.client;

import org.joda.time.LocalDate;

import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.response.AccountsResponse;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.TransactionsResponse;

public interface PlaidUserClient {
    
    void setAccessToken(String accesstoken);
    
    String getAccessToken();
    
    TransactionsResponse addUser(Credentials credentials, String type, String email, ConnectOptions connectOptions) throws PlaidMfaException;
    
    TransactionsResponse mfaStep(String mfa) throws PlaidMfaException;
    
    TransactionsResponse updateTransactions();
    
    TransactionsResponse updateTransactions(LocalDate from, LocalDate to, String accountId);
    
    TransactionsResponse updateCredentials(Credentials credentials);
    
    MessageResponse deleteUser();
    
    AccountsResponse checkBalance();

}
