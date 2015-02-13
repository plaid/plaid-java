package com.plaid.client;

import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.request.GetOptions;
import com.plaid.client.request.InfoOptions;
import com.plaid.client.response.AccountsResponse;
import com.plaid.client.response.InfoResponse;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.MfaResponse;
import com.plaid.client.response.TransactionsResponse;

public interface PlaidUserClient {

    void setAccessToken(String accesstoken);

    String getAccessToken();

    TransactionsResponse addUser(Credentials credentials, String type, String email, ConnectOptions connectOptions) throws PlaidMfaException;

    AccountsResponse getData();

    TransactionsResponse mfaConnectStep(String mfa, String type) throws PlaidMfaException;

    AccountsResponse achAuth(Credentials credentials, String type, ConnectOptions connectOptions) throws PlaidMfaException;

    AccountsResponse mfaAuthStep(String mfa, String type) throws PlaidMfaException;

    AccountsResponse mfaAuthDeviceSelection(MfaResponse.DeviceType device, String type) throws PlaidMfaException;

    TransactionsResponse updateTransactions();

    TransactionsResponse updateTransactions(GetOptions options);
    
    TransactionsResponse updateCredentials(Credentials credentials, String type);
    
    AccountsResponse updateAuth();

    MessageResponse deleteUser();

    AccountsResponse checkBalance();
    
    InfoResponse info(Credentials credentials, String type, InfoOptions options);
    
    TransactionsResponse addProduct(String product, ConnectOptions options);

    HttpDelegate getHttpDelegate();
}
