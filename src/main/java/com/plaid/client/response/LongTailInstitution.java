//
//
//
//
//


package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LongTailInstitution {

    private Map<String, String> credentialNames;
    private Boolean hasMfa;
    private List<String> mfaTypes;
    private String name;
    private List<String> products;
    private String type;
    private String currencyCode;
    private String url;

    @JsonProperty("credentials")
    public Map<String, String> getCredentialNames() {
        return credentialNames;
    }

    public void setCredentialNames(Map<String, String> credentialNames) {
        this.credentialNames = credentialNames;
    }

    @JsonProperty("has_mfa")
    public void setHasMfa(boolean hasMfa) {
        this.hasMfa = hasMfa;
    }

    public boolean isHasMfa() {
        return hasMfa;
    }

    @JsonProperty("mfa")
    public List<String> getMfaTypes() {
        return mfaTypes;
    }

    public void setMfaTypes(List<String> mfaTypes) {
        this.mfaTypes = mfaTypes;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
