package com.plaid.client;

import static org.junit.Assert.assertTrue;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.response.CategoriesResponse;

public class PlaidPublicClientTest {
    
    private CloseableHttpClient httpClient;
    private HttpDelegate httpDelegate;
    private PlaidPublicClient plaidPublicClient;
    
    //@Rule
    //public WireMockRule wireMockRule = new WireMockRule(8089);

    @Before
    public  void setup() {
        httpClient = HttpClients.createDefault();
        //httpDelegate = new ApacheHttpClientHttpDelegate("http://localhost:8089", httpClient);
        HttpDelegate httpDelegate = new ApacheHttpClientHttpDelegate("https://tartan.plaid.com", httpClient);
        plaidPublicClient = new DefaultPlaidPublicClient.Builder()
                .withHttpDelegate(httpDelegate)
                .build();
    }
    
    @Test
    public void testGetAllCategories() {
        CategoriesResponse categoriesResponse = plaidPublicClient.getAllCategories();
        assertTrue(categoriesResponse.getCategories().size() > 0);
    }

}
