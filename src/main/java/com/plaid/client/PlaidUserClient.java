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
import com.plaid.client.response.PlaidUserResponse;

import java.util.Map;

public interface PlaidUserClient {

    void setAccessToken(String accesstoken);

    String getAccessToken();

    PlaidUserResponse exchangeToken(String publicToken);

    TransactionsResponse addUser(Credentials credentials, String type, String email, ConnectOptions connectOptions) throws PlaidMfaException;

    TransactionsResponse mfaConnectStep(String mfa, String type) throws PlaidMfaException;

    TransactionsResponse mfaConnectStep(String[] mfa, String type) throws PlaidMfaException;

    AccountsResponse achAuth(Credentials credentials, String type, ConnectOptions connectOptions) throws PlaidMfaException;

    AccountsResponse mfaAuthStep(String mfa, String type) throws PlaidMfaException;

    AccountsResponse mfaAuthStep(String[] mfa, String type) throws PlaidMfaException;

    AccountsResponse mfaAuthByDeviceMask(String deviceMask) throws PlaidMfaException;

    AccountsResponse mfaConnectByDeviceMask(String deviceMask) throws PlaidMfaException;

    AccountsResponse mfaAuthDeviceSelectionByDeviceType(String deviceType, String type) throws PlaidMfaException;

    AccountsResponse mfaAuthDeviceSelectionByDeviceMask(String deviceMask, String type) throws PlaidMfaException;

    TransactionsResponse updateTransactions();

    TransactionsResponse updateTransactions(GetOptions options);

    TransactionsResponse updateCredentials(Credentials credentials, String type);

    TransactionsResponse updateWebhook(String webhook);

    AccountsResponse updateAuth();

    AccountsResponse updateAuth(Map<String, Object>  requestParams);

    MessageResponse deleteUser();

    AccountsResponse checkBalance();

    InfoResponse info(Credentials credentials, String type, InfoOptions options);

    TransactionsResponse addProduct(String product, ConnectOptions options);

    HttpDelegate getHttpDelegate();
}
