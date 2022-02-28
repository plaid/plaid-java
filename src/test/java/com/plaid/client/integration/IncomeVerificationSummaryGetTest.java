package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.integration.AbstractIntegrationTest;
import com.plaid.client.model.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;

public class IncomeVerificationSummaryGetTest extends AbstractIntegrationTest {

    private String accessToken;

    @Before
    public void setUp() throws Exception {
       SandboxPublicTokenCreateRequest request = new SandboxPublicTokenCreateRequest()
               .institutionId(INCOME_INSTITUTION_ID)
               .initialProducts(Arrays.asList(Products.INCOME_VERIFICATION));

       Response<SandboxPublicTokenCreateResponse> createResponse = client()
               .sandboxPublicTokenCreate(request)
               .execute();

       assertSuccessResponse(createResponse);

       ItemPublicTokenExchangeRequest exchangeRequest = new ItemPublicTokenExchangeRequest()
               .publicToken(createResponse.body().getPublicToken());

       Response<ItemPublicTokenExchangeResponse> response = client()
               .itemPublicTokenExchange(exchangeRequest)
               .execute();

       assertSuccessResponse(response);

       this.accessToken = response.body().getAccessToken();
    }

}
