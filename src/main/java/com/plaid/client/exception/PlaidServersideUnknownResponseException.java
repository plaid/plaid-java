package com.plaid.client.exception;

import com.plaid.client.response.UnknownResponse;

public class PlaidServersideUnknownResponseException extends RuntimeException {
    private UnknownResponse unknownResponse;
    private int httpStatusCode;

    public PlaidServersideUnknownResponseException(UnknownResponse unknownResponse, int httpStatusCode) {
        this.unknownResponse = unknownResponse;
        this.httpStatusCode = httpStatusCode;
    }

    public UnknownResponse getUnknownResponse() {
        return unknownResponse;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }
}
