package com.plaid.client.exception;

public class PlaidClientsideException extends RuntimeException {

    public PlaidClientsideException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlaidClientsideException(String message) {
        super(message);
    }

    public PlaidClientsideException(Throwable cause) {
        super(cause);
    }

}
