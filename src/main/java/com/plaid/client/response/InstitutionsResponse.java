package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionsResponse implements Serializable {

    private Institution[] institutions;

    public InstitutionsResponse(Institution[] institutions) {
        this.institutions = institutions;
    }

    public Institution[] getInstitutions() {
        return institutions;
    }
}
