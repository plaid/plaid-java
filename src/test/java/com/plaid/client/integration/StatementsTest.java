package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.plaid.client.model.*;
import com.plaid.client.request.PlaidApi;
import okhttp3.ResponseBody;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.*;

import org.json.JSONObject;
import org.junit.Test;
import retrofit2.Response;

import java.security.MessageDigest;

public class StatementsTest extends AbstractItemIntegrationTest {
    @Override
    protected List<Products> setupItemProducts() {
        return Arrays.asList(Products.STATEMENTS);
    }

    @Override
    protected String setupItemInstitutionId() {
        return FIRST_PLATYPUS_BANK_INSTITUTION_ID;
    }

    @Override
    protected SandboxPublicTokenCreateRequestOptions setupOptions() {
        SandboxPublicTokenCreateRequestOptionsStatements statementsOptions = new SandboxPublicTokenCreateRequestOptionsStatements()
            .startDate(LocalDate.parse("2023-11-01"))
            .endDate(LocalDate.parse("2023-12-01"));

        SandboxPublicTokenCreateRequestOptions options = new SandboxPublicTokenCreateRequestOptions()
            .statements(statementsOptions);

        return options;
    }

    @Test
    public void testStatementsFullFlow() throws Exception {
        String accessToken = getItemPublicTokenExchangeResponse().getAccessToken();
        // /statements/list
        Response<StatementsListResponse> listStatementsResponse = pollListStatements(client(), accessToken);
        assertNotNull(listStatementsResponse.body());
        List<StatementsAccount> accounts = listStatementsResponse.body().getAccounts();
        assertFalse(accounts.isEmpty());
        assertFalse(accounts.get(0).getStatements().isEmpty());

        // /statements/download
        for (StatementsAccount account : accounts) {
            for (StatementsStatement statement : account.getStatements()) {
                Response<ResponseBody> downloadStatementResponse = downloadStatement(
                        client(),
                        accessToken,
                        statement.getStatementId()
                );

                assertNotNull(downloadStatementResponse.body());
                assertEquals("application/pdf", downloadStatementResponse.headers().get("Content-Type"));

                String actualHash = getSha256Checksum(downloadStatementResponse.body().bytes());
                assertEquals(downloadStatementResponse.headers().get("Plaid-Content-Hash"), actualHash);
            }
        }

        // /statements/refresh
        Response<StatementsRefreshResponse> statementsRefreshResponse = refreshStatements(
                client(),
                accessToken,
                "2024-01-01",
                "2024-02-01"
        );
        assertNotNull(statementsRefreshResponse.body());
        assertFalse(statementsRefreshResponse.body().getRequestId().isEmpty());

        // /statements/list
        listStatementsResponse = pollListStatements(client(), accessToken);
        assertNotNull(listStatementsResponse.body());
        accounts = listStatementsResponse.body().getAccounts();
        assertFalse(accounts.isEmpty());
        assertFalse(accounts.get(0).getStatements().isEmpty());
    }

    public String getSha256Checksum(byte[] bytes) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(bytes);

            // Convert byte array to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    // While this method makes use of polling, Plaid recommends using webhooks in your integration.
    public static Response<StatementsListResponse> pollListStatements(
            PlaidApi client,
            String accessToken
    ) throws Exception {
        int NUM_RETRIES = 20;
        int INTER_REQUEST_SLEEP = 2000; // millis
        int attempt = 0;

        Response<StatementsListResponse> response;
        JSONObject errorResponse = new JSONObject();
        PlaidError error = new PlaidError();

        do {
            StatementsListRequest statementsListRequest = new StatementsListRequest()
                    .accessToken(accessToken);

            response = client.statementsList(statementsListRequest).execute();

            try {
                Gson gson = new Gson();
                error = gson.fromJson(response.errorBody().string(), PlaidError.class);
            } catch (Exception e) {
                // Dont' want to throw here.
            }

            attempt++;
            Thread.sleep(INTER_REQUEST_SLEEP);
        } while (
                !response.isSuccessful() &&
                        response.errorBody() != null &&
                        error.getErrorCode().equals("PRODUCT_NOT_READY") &&
                        attempt < NUM_RETRIES
        );
        assertSuccessResponse(response);
        return response;
    }

    public static Response<ResponseBody> downloadStatement(
            PlaidApi client,
            String accessToken,
            String statementID
    )
            throws Exception {
        Response<ResponseBody> response;
        JSONObject errorResponse = new JSONObject();

        StatementsDownloadRequest statementsDownloadRequest = new StatementsDownloadRequest()
                .accessToken(accessToken)
                .statementId(statementID);

        response = client.statementsDownload(statementsDownloadRequest).execute();
        assertSuccessResponse(response);
        return response;
    }

    public static Response<StatementsRefreshResponse> refreshStatements(
            PlaidApi client,
            String accessToken,
            String startDate,
            String endDate
    )
            throws Exception {
        Response<StatementsRefreshResponse> response;
        JSONObject errorResponse = new JSONObject();

        StatementsRefreshRequest statementsRefreshRequest = new StatementsRefreshRequest()
                .accessToken(accessToken)
                .startDate(LocalDate.parse(startDate))
                .endDate(LocalDate.parse(endDate));

        response = client.statementsRefresh(statementsRefreshRequest).execute();
        assertSuccessResponse(response);
        return response;
    }
}
