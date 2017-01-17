package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionsResponse {

    private Institution[] institutions;

    public InstitutionsResponse(Institution[] institutions) {
        this.institutions = institutions;
    }

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    public Institution[] getInstitutions() {
        return institutions;
    }
}
