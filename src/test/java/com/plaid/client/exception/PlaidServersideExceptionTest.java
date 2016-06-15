package com.plaid.client.exception;

import com.plaid.client.response.ErrorResponse;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaidServersideExceptionTest {

    @Test
    public void setsExceptionMessage() throws Exception {

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("Bad Request");

        PlaidServersideException exception = new PlaidServersideException(errorResponse, HttpStatus.SC_BAD_REQUEST);

        assertEquals("400: Bad Request", exception.getMessage());

    }

    @Test
    public void setsExceptionMessageForNullErrorResponse() throws Exception {

        PlaidServersideException exception = new PlaidServersideException(null, HttpStatus.SC_BAD_REQUEST);

        assertEquals("400: null", exception.getMessage());

    }
}