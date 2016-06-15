package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LongTailInstitutionsResponse {

    private Integer totalCount;
    private LongTailInstitution[] results;

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    public LongTailInstitution[] getResults() {
        return results;
    }
}
