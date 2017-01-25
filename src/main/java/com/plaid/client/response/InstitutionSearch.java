package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionSearch {
    private String id;
    private String name;
    private String forgottenPassword;
    private String accountLocked;
    private String accountSetup;
    private String logo;
    private String type;

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

    public String getForgottenPassword() {
        return forgottenPassword;
    }

    public void setForgottenPassword(String forgottenPassword) {
        this.forgottenPassword = forgottenPassword;
    }

    public String getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(String accountLocked) {
        this.accountLocked = accountLocked;
    }

    public String getAccountSetup() {
        return accountSetup;
    }

    public void setAccountSetup(String accountSetup) {
        this.accountSetup = accountSetup;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
