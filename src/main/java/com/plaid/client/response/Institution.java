//
//
//
//
//


package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Institution {

    private CredentialNames credentialNames;
    private Boolean hasMfa;
    private String id;
    private List<String> mfaTypes;
    private String name;
    private List<String> products;
    private String type;

    public CredentialNames getCredentialNames() {
        return credentialNames;
    }

    public void setCredentialNames(CredentialNames credentialNames) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static final class CredentialNames {
        private String username;
        private String password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

}
