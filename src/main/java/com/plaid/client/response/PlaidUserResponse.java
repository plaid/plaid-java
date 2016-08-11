package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PlaidUserResponse implements Serializable {

    protected String accessToken;
    protected String newAccessToken;
    
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }
    
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
     * Returns the user's new access token in the new format. Plaid announced this migration on 10/31/2014 through their developer newsletter.
     * If this field is not blank, then you should update the records for this user with the new access token.
     */
    @JsonProperty("new_access_token")
    public String getNewAccessToken() {
        return newAccessToken;
    }

    public void setNewAccessToken(String newAccessToken) {
        this.newAccessToken = newAccessToken;
    }
}
