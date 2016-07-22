package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionResponse {

    private Institution institutions;

    public InstitutionResponse(Institution institutions) {
        this.institutions = institutions;
    }

    public Institution getInstitution() {
        return institutions;
    }
}
