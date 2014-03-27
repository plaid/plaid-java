package com.plaid.client.response;

public class ErrorResponse {

    private Integer code;
    private String message;
    private String resolve;
    
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getResolve() {
        return resolve;
    }
    public void setResolve(String resolve) {
        this.resolve = resolve;
    }
}
