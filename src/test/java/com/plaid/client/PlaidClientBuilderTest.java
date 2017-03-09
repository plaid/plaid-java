package com.plaid.client;

import com.plaid.client.request.InstitutionsSearchRequest;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

public class PlaidClientBuilderTest {
  private static final InstitutionsSearchRequest INSTITUTIONS_SEARCH_REQUEST = new InstitutionsSearchRequest("q");
  private static final String PUBLIC_KEY = "thepublickey";
  private static final String CLIENT_ID = "theclientid";
  private static final String SECRET = "thesecret";


  private PlaidClient.Builder getPlaidClientBuilder() {
    return PlaidClient.newBuilder()
      .publicKey(PUBLIC_KEY)
      .clientIdAndSecret(CLIENT_ID, SECRET)
      .logLevel(HttpLoggingInterceptor.Level.BODY);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testUnspecifiedBaseUrlFails() throws Exception {
    getPlaidClientBuilder().build();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testUnspecifiedCredentialsFails() throws Exception {
    PlaidClient.newBuilder()
      .sandboxBaseUrl()
      .build();
  }

  @Test
  public void testPublicCredentialsOnlySucceeds() throws Exception {
    PlaidClient.newBuilder()
      .sandboxBaseUrl()
      .publicKey(PUBLIC_KEY)
      .build();
  }

  @Test
  public void testPrivateCredentialsOnlySucceeds() throws Exception {
    PlaidClient.newBuilder()
      .sandboxBaseUrl()
      .clientIdAndSecret(CLIENT_ID, SECRET)
      .build();
  }

  @Test
  public void testBaseUrlUsesProduction() throws Exception {
    PlaidClient plaidClient = getPlaidClientBuilder().productionBaseUrl().build();

    assertThat(plaidClient.service().institutionsSearch(INSTITUTIONS_SEARCH_REQUEST).request().url().toString(),
      startsWith(PlaidClient.Builder.DEFAULT_PRODUCTION_BASE_URL));
  }

  @Test
  public void testBaseUrlUsesSandbox() throws Exception {
    PlaidClient plaidClient = getPlaidClientBuilder().sandboxBaseUrl().build();

    assertThat(plaidClient.service().institutionsSearch(INSTITUTIONS_SEARCH_REQUEST).request().url().toString(),
      startsWith(PlaidClient.Builder.DEFAULT_SANDBOX_BASE_URL));
  }

  @Test
  public void testBaseUrlUsesDev() throws Exception {
    PlaidClient plaidClient = getPlaidClientBuilder().developmentBaseUrl().build();

    assertThat(plaidClient.service().institutionsSearch(INSTITUTIONS_SEARCH_REQUEST).request().url().toString(),
      startsWith(PlaidClient.Builder.DEFAULT_DEVELOPMENT_BASE_URL));
  }

  @Test
  public void testBaseUrlCustom() throws Exception {
    String baseUrl = "http://example.com/";

    PlaidClient plaidApiService = getPlaidClientBuilder()
      .productionBaseUrl()
      .baseUrl(baseUrl)
      .build();

    assertThat(plaidApiService.service().institutionsSearch(INSTITUTIONS_SEARCH_REQUEST).request().url().toString(),
      startsWith(baseUrl));
  }
}
