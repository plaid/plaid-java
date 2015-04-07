package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionsResponse {

    private Institution[] institutions;

    public InstitutionsResponse(Institution[] institutions) {
        this.institutions = institutions;
    }

    public Institution[] getInstitutions() {
        return institutions;
    }
}
