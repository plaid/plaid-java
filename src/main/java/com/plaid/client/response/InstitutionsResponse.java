package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionsResponse {

    private Integer totalCount;
    private Institution[] results;

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    public Institution[] getResults() {
        return results;
    }
}
