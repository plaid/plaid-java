package com.plaid.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.http.HttpStatus;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.exception.PlaidServersideException;
import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.response.AccountsResponse;
import com.plaid.client.response.InfoResponse;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.MfaResponse;
import com.plaid.client.response.MfaResponse.DeviceChoiceMfaResponse;
import com.plaid.client.response.MfaResponse.DeviceListMfaResponse;
import com.plaid.client.response.TransactionsResponse;
import com.plaid.client.response.PlaidUserResponse;

public class PlaidUserClientTest {

    private CloseableHttpClient httpClient;
    private HttpDelegate httpDelegate;
    private PlaidUserClient plaidUserClient;

   // @Rule
   // public WireMockRule wireMockRule = new WireMockRule(8089);

    @Before
    public  void setup() {
        //httpClient = HttpClients.createDefault();
        httpClient = HttpClients.custom().disableContentCompression().build();
        //httpDelegate = new ApacheHttpClientHttpDelegate("http://localhost:8089", httpClient);
        httpDelegate = new ApacheHttpClientHttpDelegate("https://tartan.plaid.com", httpClient);
        plaidUserClient = new DefaultPlaidUserClient.Builder()
                .withHttpDelegate(httpDelegate)
                .withClientId("test_id")
                .withSecret("test_secret")
                .build();
    }

    @Test
    public void testAddAmexUser() {
        Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        TransactionsResponse response = plaidUserClient.addUser(testCredentials, "amex", "test@test.com", null);

        assertEquals("test_amex",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
        assertTrue(response.getTransactions().size() > 0);
    }

    @Test
    public void testAddChaseUserListMfa() {

        try {
            Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
            ConnectOptions options = new ConnectOptions();
            options.setList(true);
            TransactionsResponse response = plaidUserClient.addUser(testCredentials, "chase", "test@test.com", options);
        }
        catch (PlaidMfaException e) {

            MfaResponse mfaResponse = e.getMfaResponse();
            assertNotNull(mfaResponse);
            assertEquals("list", mfaResponse.getType());
            assertEquals("test_chase", mfaResponse.getAccessToken());
            assertTrue(mfaResponse instanceof DeviceListMfaResponse);
        }
    }

    @Test
    public void testAddChaseUserWithMfaStep() {

        try {
            Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
            ConnectOptions options = new ConnectOptions();
            options.setLogin(true);
            plaidUserClient.addUser(testCredentials, "chase", "test@test.com", options);
        }
        catch (PlaidMfaException e) {

            MfaResponse mfaResponse = e.getMfaResponse();
            assertNotNull(mfaResponse);
            assertEquals("test_chase", mfaResponse.getAccessToken());
            assertEquals("device", mfaResponse.getType());
            assertTrue(mfaResponse instanceof DeviceChoiceMfaResponse);

            TransactionsResponse response = plaidUserClient.mfaConnectStep("1234", "chase");
            assertEquals("test_chase",response.getAccessToken());
            assertTrue(response.getAccounts().size() > 0);
            assertTrue(response.getTransactions().size() > 0);
        }
    }


    @Test
    public void testInfoWellsFargo() {
    	Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        InfoResponse response = plaidUserClient.info(testCredentials, "wells", null);

        assertEquals("test_wells",response.getAccessToken());
        assertNotNull(response.getInfo());
    }

    @Test
    public void testUpdateTransactions() {

        plaidUserClient.setAccessToken("test_wells");
        TransactionsResponse response = plaidUserClient.updateTransactions();

        assertEquals("test_wells",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
        assertTrue(response.getTransactions().size() > 0);
    }

    @Test
    public void testUpdateAuth() {

        plaidUserClient.setAccessToken("test_wells");
        AccountsResponse response = plaidUserClient.updateAuth();

        assertEquals("test_wells",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
        assertNotNull(response.getAccounts().get(0).getNumbers());
    }

    @Test
    public void testCheckBalance() {

    	plaidUserClient.setAccessToken("test_wells");
    	AccountsResponse response = plaidUserClient.checkBalance();
    	assertEquals("test_wells",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
    }

    @Test
    public void testAddProduct() {

    	plaidUserClient.setAccessToken("test_wells");
    	AccountsResponse response = plaidUserClient.addProduct("auth", null);
    	assertEquals("test_wells",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
    }

    @Test
    // Not testable with WireMock since HTTP PATCH is unsupported
    public void testUpdateCredentials() {
        Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        plaidUserClient.setAccessToken("test_amex");
        TransactionsResponse response = plaidUserClient.updateCredentials(testCredentials, "amex");

        assertEquals("test_amex",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
//        assertTrue(response.getTransactions().size() > 0);
    }

    @Test
    public void testDeleteUser() {
        plaidUserClient.setAccessToken("test_citi");
        MessageResponse response = plaidUserClient.deleteUser();

        assertEquals("Successfully removed from your account", response.getMessage());
    }

    @Test
    public void testExchangeTokenSuccess() {
        PlaidUserResponse response = plaidUserClient.exchangeToken("test,chase,connected");

        assertEquals("test_chase", response.getAccessToken());
    }

    //Result is "1109 unauthorized product" in Sandbox
    @Ignore
    @Test
    public void testExchangeTokenFailure() {
        try {
            plaidUserClient.exchangeToken("invalid_public_token");
        } catch (PlaidServersideException e) {
            assertEquals(HttpStatus.SC_UNAUTHORIZED, e.getHttpStatusCode());
            assertEquals(1106, e.getErrorResponse().getCode().intValue());
            assertEquals("bad public_token", e.getErrorResponse().getMessage());
        }
    }


}
