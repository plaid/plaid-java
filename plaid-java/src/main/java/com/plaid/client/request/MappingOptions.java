package com.plaid.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MappingOptions {

    private Boolean pretty;
    private Boolean fullMatch;

    public Boolean isPretty() {
        return pretty;
    }
    public void setPretty(Boolean pretty) {
        this.pretty = pretty;
    }
    @JsonProperty("full_match")
    public Boolean isFullMatch() {
        return fullMatch;
    }
    public void setFullMatch(Boolean fullMatch) {
        this.fullMatch = fullMatch;
    }
}
