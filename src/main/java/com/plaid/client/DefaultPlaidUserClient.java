package com.plaid.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.plaid.client.exception.PlaidClientsideException;
import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.http.HttpResponseWrapper;
import com.plaid.client.http.PlaidHttpRequest;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.response.AccountsResponse;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.TransactionsResponse;

public class DefaultPlaidUserClient implements PlaidUserClient {
    
    private String accessToken;
    
    private String clientId;
    private String secret;    
    
    private ObjectMapper jsonMapper;
    private HttpDelegate httpDelegate;
        
    public DefaultPlaidUserClient(HttpDelegate httpDelegate, String clientId, String secret) {
        this.httpDelegate = httpDelegate;
        this.clientId = clientId;
        this.secret = secret;
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.setSerializationInclusion(Include.NON_NULL);
        this.jsonMapper = jsonMapper;
    }
    
    @Override
    public void setAccessToken(String accesstoken) {
        this.accessToken = accesstoken;
    }
    
    @Override
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override
    public TransactionsResponse addUser(Credentials credentials, String type, String email, ConnectOptions connectOptions) throws PlaidMfaException {
        
        PlaidHttpRequest request = new PlaidHttpRequest("/connect", authenticationParams());        

        try {
            String credentialsString = jsonMapper.writeValueAsString(credentials);
            
            request.addParameter("type", type);
            request.addParameter("email", email);         
            request.addParameter("credentials", credentialsString);
            
            if (connectOptions != null) {
                String optionsString = jsonMapper.writeValueAsString(connectOptions);
                request.addParameter("options", optionsString);
            }
            
            try {
                HttpResponseWrapper<TransactionsResponse> response =
                        httpDelegate.doPost(request, TransactionsResponse.class);
                
                TransactionsResponse body = response.getResponseBody();                
                setAccessToken(body.getAccessToken());
                return body;
            }
            catch (PlaidMfaException e) {
                setAccessToken(e.getMfaResponse().getAccessToken());
                throw e;
            }            
            
        } catch (JsonProcessingException e) {
            throw new PlaidClientsideException(e);
        }
        
    }

    @Override
    public TransactionsResponse mfaStep(String mfa) throws PlaidMfaException {
        
        if (StringUtils.isEmpty(accessToken)) {
            throw new PlaidClientsideException("No accessToken set");
        }
        
        PlaidHttpRequest request = new PlaidHttpRequest("/connect/step", authenticationParams());        

        request.addParameter("mfa", mfa);

        try {
            HttpResponseWrapper<TransactionsResponse> response =
                    httpDelegate.doPost(request, TransactionsResponse.class);
            
            TransactionsResponse body = response.getResponseBody();                
            setAccessToken(body.getAccessToken());
            return body;
        }
        catch (PlaidMfaException e) {
            setAccessToken(e.getMfaResponse().getAccessToken());
            throw e;
        }
        
    }

    @Override
    public TransactionsResponse updateTransactions() {
        
        if (StringUtils.isEmpty(accessToken)) {
            throw new PlaidClientsideException("No accessToken set");
        }
        
        PlaidHttpRequest request = new PlaidHttpRequest("/connect", authenticationParams());
        
        HttpResponseWrapper<TransactionsResponse> response =
                httpDelegate.doGet(request, TransactionsResponse.class);
        
        TransactionsResponse body = response.getResponseBody();                
        setAccessToken(body.getAccessToken());
        return body;
        
    }
    
    @Override
    public TransactionsResponse updateTransactions(LocalDate from, LocalDate to, String accountId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    @Override
    public TransactionsResponse updateCredentials(Credentials credentials) {
        if (StringUtils.isEmpty(accessToken)) {
            throw new PlaidClientsideException("No accessToken set");
        }
        
        PlaidHttpRequest request = new PlaidHttpRequest("/connect", authenticationParams());        

        try {
            String credentialsString = jsonMapper.writeValueAsString(credentials);
            request.addParameter("credentials", credentialsString);            
            
            HttpResponseWrapper<TransactionsResponse> response =
                    httpDelegate.doPatch(request, TransactionsResponse.class);
            
            TransactionsResponse body = response.getResponseBody(); 
            
            setAccessToken(body.getAccessToken());
            
            return body;
        }
        catch (JsonProcessingException e) {
            throw new PlaidClientsideException(e);
        }
        
    }
    
    @Override
    public MessageResponse deleteUser() {
        if (StringUtils.isEmpty(accessToken)) {
            throw new PlaidClientsideException("No accessToken set");
        }
        
        PlaidHttpRequest request = new PlaidHttpRequest("/connect", authenticationParams());
        
        HttpResponseWrapper<MessageResponse> response =
                httpDelegate.doDelete(request, MessageResponse.class);
        
        return response.getResponseBody();
    }
    
    @Override
    public AccountsResponse checkBalance() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
    private Map<String, String> authenticationParams() {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("client_id", clientId);
        parameters.put("secret", secret);
        if (!StringUtils.isEmpty(accessToken)) {
            parameters.put("access_token", accessToken);
        }
        return parameters;
    }

}
