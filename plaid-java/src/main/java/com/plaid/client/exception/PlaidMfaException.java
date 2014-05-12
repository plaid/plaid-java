package com.plaid.client.exception;

import com.plaid.client.response.MfaResponse;

public class PlaidMfaException extends RuntimeException {

    private MfaResponse mfaResponse;
    private int httpStatusCode;

    public PlaidMfaException(MfaResponse mfaResponse, int httpStatusCode) {
        this.mfaResponse = mfaResponse;
        this.httpStatusCode = httpStatusCode;
    }

    public MfaResponse getMfaResponse() {
        return mfaResponse;
    }
    
    public int getHttpStatusCode() {
		return httpStatusCode;
	}
}
