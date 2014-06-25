package com.plaid.client;

import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.WireLogger;

public class PlaidClients {

    public static final String BASE_URI_PRODUCTION = "https://api.plaid.com";
    public static final String BASE_URI_TEST = "https://tartan.plaid.com";
    
    public static PlaidUserClient productionUserClient(String clientId, String secret, WireLogger wireLogger) {            	    
    	return new DefaultPlaidUserClient(createHttpDelegate(BASE_URI_PRODUCTION, wireLogger), clientId, secret);
    }
    
    public static PlaidUserClient developmentUserClient(String clientId, String secret, WireLogger wireLogger) {    	
        return new DefaultPlaidUserClient(createHttpDelegate(BASE_URI_TEST, wireLogger), clientId, secret);    
    }
    
    public static PlaidPublicClient productionPublicClient(WireLogger wireLogger) {
        return new DefaultPlaidPublicClient(createHttpDelegate(BASE_URI_PRODUCTION, wireLogger));
    }
    
    public static PlaidPublicClient testPublicClient(WireLogger wireLogger) {
        return new DefaultPlaidPublicClient(createHttpDelegate(BASE_URI_TEST, wireLogger));
    }
    
    public static PlaidUserClient productionUserClient(String clientId, String secret) {        
    	return productionUserClient(clientId, secret, null);
    }
    
    public static PlaidUserClient developmentUserClient(String clientId, String secret) {        
         return developmentUserClient(clientId, secret, null);
    }
    
    public static PlaidPublicClient productionPublicClient() {
    	 return productionPublicClient(null);
    }
    
    public static PlaidPublicClient testPublicClient() {
    	 return testPublicClient(null);
    }
    
    private static ApacheHttpClientHttpDelegate createHttpDelegate(String uri, WireLogger wireLogger) {
    	ApacheHttpClientHttpDelegate httpDelegate = ApacheHttpClientHttpDelegate.createDefault(BASE_URI_PRODUCTION);
    	if (wireLogger != null) {
    		httpDelegate.setWireLogger(wireLogger);
    	}
    	return httpDelegate;
    }
}
