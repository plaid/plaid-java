package com.plaid.client.exception;

public class PlaidCommunicationsException extends RuntimeException {

    public PlaidCommunicationsException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlaidCommunicationsException(String message) {
        super(message);
    }

    public PlaidCommunicationsException(Throwable cause) {
        super(cause);
    }
    
}
