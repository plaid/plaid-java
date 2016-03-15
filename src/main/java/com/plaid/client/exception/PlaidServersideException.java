package com.plaid.client.exception;

import com.plaid.client.response.ErrorResponse;

public class PlaidServersideException extends RuntimeException {
    
    private ErrorResponse errorResponse;
    private int httpStatusCode;
    
    public PlaidServersideException(ErrorResponse errorResponse, int httpStatusCode) {
        super(String.format("%s: %s", httpStatusCode, errorResponse != null ? errorResponse.getMessage() : null));
        this.errorResponse = errorResponse;
        this.httpStatusCode = httpStatusCode;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
    
    public int getHttpStatusCode() {
		return httpStatusCode;
	}
    
}