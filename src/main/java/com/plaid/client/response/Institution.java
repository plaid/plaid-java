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

    public Institution() {
    }

    ;

    private Institution(final CredentialNames credentialNames,
                        final Boolean hasMfa,
                        final String id,
                        final List<String> mfaTypes,
                        final String name,
                        final List<String> products,
                        final String type) {
        this.credentialNames = credentialNames;
        this.hasMfa = hasMfa;
        this.id = id;
        this.mfaTypes = mfaTypes;
        this.name = name;
        this.products = products;
        this.type = type;
    }

    @JsonProperty("credentials")
    public CredentialNames getCredentialNames() {
        return credentialNames;
    }

    public void setCredentialNames(CredentialNames credentialNames) {
        this.credentialNames = credentialNames;
    }

    public boolean isHasMfa() {
        return hasMfa;
    }

    @JsonProperty("has_mfa")
    public void setHasMfa(boolean hasMfa) {
        this.hasMfa = hasMfa;
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
        private String pin;

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

        public String getPin() {
            return pin;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }
    }

    public static class InstitutionBuilder {
        private Institution.CredentialNames credentialNames;
        private Boolean hasMfa;
        private String id;
        private List<String> mfaTypes;
        private String name;
        private List<String> products;
        private String type;

        public InstitutionBuilder setCredentialNames(final Institution.CredentialNames credentialNames) {
            this.credentialNames = credentialNames;
            return this;
        }

        public InstitutionBuilder setHasMfa(final Boolean hasMfa) {
            this.hasMfa = hasMfa;
            return this;
        }

        public InstitutionBuilder setId(final String id) {
            this.id = id;
            return this;
        }

        public InstitutionBuilder setMfaTypes(final List<String> mfaTypes) {
            this.mfaTypes = mfaTypes;
            return this;
        }

        public InstitutionBuilder setName(final String name) {
            this.name = name;
            return this;
        }

        public InstitutionBuilder setProducts(final List<String> products) {
            this.products = products;
            return this;
        }

        public InstitutionBuilder setType(final String type) {
            this.type = type;
            return this;
        }

        public Institution createInstitution() {
            return new Institution(credentialNames, hasMfa, id, mfaTypes, name, products, type);
        }
    }

}
