package com.plaid.client;

import com.plaid.client.http.ApacheHttpClientHttpDelegate;

public class PlaidClients {

    public static final String BASE_URI_PRODUCTION = "https://api.plaid.com";
    public static final String BASE_URI_TEST = "https://tartan.plaid.com";
    
    public static PlaidUserClient productionUserClient(String clientId, String secret) {        
        return new DefaultPlaidUserClient(ApacheHttpClientHttpDelegate.createDefault(BASE_URI_PRODUCTION), clientId, secret);
    }
    
    public static PlaidUserClient developmentUserClient(String clientId, String secret) {        
        return new DefaultPlaidUserClient(ApacheHttpClientHttpDelegate.createDefault(BASE_URI_TEST), clientId, secret);    
    }
    
    public static PlaidPublicClient productionPublicClient() {
        return new DefaultPlaidPublicClient(ApacheHttpClientHttpDelegate.createDefault(BASE_URI_PRODUCTION));
    }
    
    public static PlaidPublicClient testPublicClient() {
        return new DefaultPlaidPublicClient(ApacheHttpClientHttpDelegate.createDefault(BASE_URI_TEST));
    }
}
