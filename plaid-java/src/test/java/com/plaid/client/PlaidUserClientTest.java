package com.plaid.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.MfaResponse;
import com.plaid.client.response.MfaResponse.DeviceChoiceMfaResponse;
import com.plaid.client.response.MfaResponse.DeviceListMfaResponse;
import com.plaid.client.response.TransactionsResponse;

public class PlaidUserClientTest {

    private CloseableHttpClient httpClient;
    private HttpDelegate httpDelegate;
    private PlaidUserClient plaidUserClient;
    
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089);

    @Before
    public  void setup() {
        httpClient = HttpClients.createDefault();
        httpDelegate = new ApacheHttpClientHttpDelegate("http://localhost:8089", httpClient);
        //HttpDelegate httpDelegate = new ApacheHttpClientHttpDelegate("https://tartan.plaid.com", httpClient);
        plaidUserClient = new DefaultPlaidUserClient(httpDelegate, "test_id", "test_secret");
    }

    @Test
    public void testAddAmexUser() {
        Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        TransactionsResponse response = plaidUserClient.addUser(testCredentials, "amex", "test@test.com", null);
        
        assertEquals("test",response.getAccessToken());
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
            assertEquals("test", mfaResponse.getAccessToken());
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
            assertEquals("test", mfaResponse.getAccessToken());
            assertTrue(mfaResponse instanceof DeviceChoiceMfaResponse);
            
            TransactionsResponse response = plaidUserClient.mfaStep("1234");
            assertEquals("test",response.getAccessToken());
            assertTrue(response.getAccounts().size() > 0);
            assertTrue(response.getTransactions().size() > 0);            
        }
    }
    
    @Test
    public void testUpdateTransactions() {

        plaidUserClient.setAccessToken("test");
        TransactionsResponse response = plaidUserClient.updateTransactions();
        
        assertEquals("test",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
        assertTrue(response.getTransactions().size() > 0);
    }
    
    // @Test
    // Not testable with WireMock since HTTP PATCH is unsupported
    public void testUpdateCredentials() {
        Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        plaidUserClient.setAccessToken("test");
        TransactionsResponse response = plaidUserClient.updateCredentials(testCredentials);
        
        assertEquals("test",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
        assertTrue(response.getTransactions().size() > 0);
    }
    
    @Test
    public void testDeleteUser() {
        plaidUserClient.setAccessToken("test");
        MessageResponse response = plaidUserClient.deleteUser();
        
        assertEquals("Successfully removed from system", response.getMessage());
    }
}
