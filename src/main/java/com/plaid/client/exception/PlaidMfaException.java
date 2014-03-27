package com.plaid.client.exception;

import com.plaid.client.response.MfaResponse;

public class PlaidMfaException extends RuntimeException {

    private MfaResponse mfaResponse;

    public PlaidMfaException(MfaResponse mfaResponse) {
        this.mfaResponse = mfaResponse;
    }

    public MfaResponse getMfaResponse() {
        return mfaResponse;
    }
}
