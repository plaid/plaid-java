package com.plaid.client;

import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.request.GetOptions;
import com.plaid.client.response.AccountsResponse;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.TransactionsResponse;

public interface PlaidUserClient {

    void setAccessToken(String accesstoken);

    String getAccessToken();

    TransactionsResponse addUser(Credentials credentials, String type, String email, ConnectOptions connectOptions) throws PlaidMfaException;

    TransactionsResponse mfaConnectStep(String mfa, String type) throws PlaidMfaException;

    AccountsResponse achAuth(Credentials credentials, String type, ConnectOptions connectOptions) throws PlaidMfaException;

    AccountsResponse mfaAuthStep(String mfa, String type) throws PlaidMfaException;
    
    TransactionsResponse updateTransactions();

    TransactionsResponse updateTransactions(GetOptions options);
    
    TransactionsResponse updateCredentials(Credentials credentials, String type);

    MessageResponse deleteUser();

    AccountsResponse checkBalance();

    HttpDelegate getHttpDelegate();
}
