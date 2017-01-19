package com.plaid.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import com.plaid.client.exception.PlaidClientsideException;
import com.plaid.client.response.InstitutionsResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.Institution;
import com.plaid.client.response.PopularInstitutionsResponse;

public class PlaidPublicClientTest {

    private CloseableHttpClient httpClient;
    private HttpDelegate httpDelegate;
    private PlaidPublicClient plaidPublicClientWithoutCredentials;
    private PlaidPublicClient plaidPublicClientWithCredentials;

    //@Rule
    //public WireMockRule wireMockRule = new WireMockRule(8089);

    @Before
    public  void setup() {
        httpClient = HttpClients.custom().disableContentCompression().useSystemProperties().build();
        //httpDelegate = new ApacheHttpClientHttpDelegate("http://localhost:8089", httpClient);
        HttpDelegate httpDelegate = new ApacheHttpClientHttpDelegate("https://tartan.plaid.com", httpClient);
        plaidPublicClientWithoutCredentials = new DefaultPlaidPublicClient.Builder()
                .withHttpDelegate(httpDelegate)
                .build();

        plaidPublicClientWithCredentials = new DefaultPlaidPublicClient.Builder()
                .withHttpDelegate(httpDelegate)
                .withClientId("test_id")
                .withSecret("test_secret")
                .build();
    }

    @Test
    public void testGetAllCategories() {
        CategoriesResponse categoriesResponse = plaidPublicClientWithoutCredentials.getAllCategories();
        assertTrue(categoriesResponse.getCategories().size() > 0);
    }

    @Test
    public void testGetInstitution() {
        Institution institution = plaidPublicClientWithoutCredentials.getInstitution("bofa");
        assertEquals("Bank of America", institution.getName());
    }

    @Test
    public void testGetAllInstitutions() {
        PopularInstitutionsResponse instResponse = plaidPublicClientWithoutCredentials.getPopularInstitutions();
        assertNotNull(instResponse);
        Institution[] institutions = instResponse.getInstitutions();
        Map<String, Institution> map = new HashMap<>();
        for (Institution institution : institutions) {
            map.put(institution.getName(), institution);
        }

        assertNotNull(map.get("Bank of America"));
    }

    @Test(expected = PlaidClientsideException.class)
    public void testGetAllLongTailInstitutionsRequireCredentials() throws Exception {
        plaidPublicClientWithoutCredentials.getAllInstitutions(0, 10, null);
    }

    @Test
    public void testGetAllLongTailInstitutions() throws Exception {
        InstitutionsResponse response = plaidPublicClientWithCredentials.getAllInstitutions(0, 10, null);
        assertEquals(10, response.getResults().length);
    }
}
