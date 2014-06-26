package com.plaid.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.ConnectOptions;
import com.plaid.client.request.Credentials;
import com.plaid.client.response.Account;
import com.plaid.client.response.MessageResponse;
import com.plaid.client.response.MfaResponse;
import com.plaid.client.response.MfaResponse.DeviceChoiceMfaResponse;
import com.plaid.client.response.MfaResponse.DeviceListMfaResponse;
import com.plaid.client.response.TransactionsResponse;

public class PlaidUserClientTest {

    private CloseableHttpClient httpClient;
    private HttpDelegate httpDelegate;
    private PlaidUserClient plaidUserClient;
    
   // @Rule
   // public WireMockRule wireMockRule = new WireMockRule(8089);

    @Before
    public  void setup() {
        httpClient = HttpClients.createDefault();
        //httpDelegate = new ApacheHttpClientHttpDelegate("http://localhost:8089", httpClient);
        httpDelegate = new ApacheHttpClientHttpDelegate("https://tartan.plaid.com", httpClient);
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
            assertEquals("list", mfaResponse.getType());
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
            assertEquals("device", mfaResponse.getType());
            assertTrue(mfaResponse instanceof DeviceChoiceMfaResponse);
            
            TransactionsResponse response = plaidUserClient.mfaConnectStep("1234", "chase");
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
    
    @Test
    // Not testable with WireMock since HTTP PATCH is unsupported
    public void testUpdateCredentials() {
        Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
        plaidUserClient.setAccessToken("test");
        TransactionsResponse response = plaidUserClient.updateCredentials(testCredentials, "amex");
        
        assertEquals("test",response.getAccessToken());
        assertTrue(response.getAccounts().size() > 0);
//        assertTrue(response.getTransactions().size() > 0);
    }
    
    @Test
    public void testDeleteUser() {
        plaidUserClient.setAccessToken("test");
        MessageResponse response = plaidUserClient.deleteUser();
        
        assertEquals("Successfully removed from system", response.getMessage());
    }
    
    @Test
    public void testSubmitThenUpdate() {
    	ConnectOptions options = new ConnectOptions();
        options.setLogin(false);
    	PlaidUserClient productionClient = PlaidClients.productionUserClient("52723c6e9a3a9cbd12000002", "f9BtDIWZWPUP_Ibx91eYOK");
    	TransactionsResponse response = productionClient.addUser(new Credentials("jojjefriedman@gmail.com", "Pengu2005"), "citi", "erik+testing@qapital.com", options);
    	
    	List<String> accountIds = new ArrayList<>();
    	
    	for (Account account : response.getAccounts()) {
    		accountIds.add(account.getId());
    	}
    	
    	TransactionsResponse newResponse = productionClient.updateTransactions();
    	
    	for (Account account : newResponse.getAccounts()) {
    		assertTrue(accountIds.contains(account.getId()));
    	}
    	
    }
}
