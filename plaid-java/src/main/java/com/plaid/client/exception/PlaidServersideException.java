package com.plaid.client.exception;

import com.plaid.client.response.ErrorResponse;

public class PlaidServersideException extends RuntimeException {
    
    private ErrorResponse errorResponse;
    
    public PlaidServersideException(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
    
}
