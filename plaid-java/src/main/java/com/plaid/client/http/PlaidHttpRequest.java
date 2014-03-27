package com.plaid.client.http;

import java.util.HashMap;
import java.util.Map;

public class PlaidHttpRequest {

    private String path;
    private Map<String, String> parameters;
    
    public PlaidHttpRequest(String path) {
        this.path = path;
        this.parameters = new HashMap<String, String>();
    }
    
    public PlaidHttpRequest(String path, Map<String, String> parameters) {
        this.path = path;
        this.parameters = parameters;
    }
    
    public PlaidHttpRequest addParameter(String key, String value) {
        this.parameters.put(key, value);
        return this;
    }
    
    public String getPath() {
        return path;
    }
    
    public Map<String, String> getParameters() {
        return parameters;
    }
    
}
