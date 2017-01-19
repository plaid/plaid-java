package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PopularInstitutionsResponse
{

    private Institution[] institutions;

    public PopularInstitutionsResponse(Institution[] institutions) {
        this.institutions = institutions;
    }

    public Institution[] getInstitutions() {
        return institutions;
    }
}
