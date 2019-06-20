package com.plaid.client;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.plaid.client.internal.Util;
import com.plaid.client.internal.gson.CredentialInjectingTypeAdapterFactory;
import com.plaid.client.internal.gson.ImmutableListStripUnknownEnumsTypeAdapterFactory;
import com.plaid.client.internal.gson.InvestmentsTransactionsBaseOptionsSerializer;
import com.plaid.client.internal.gson.TransactionsBaseOptionsSerializer;
import com.plaid.client.internal.gson.OptionalTypeAdapterFactory;
import com.plaid.client.internal.gson.RequiredFieldTypeAdapterFactory;
import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.response.ErrorResponse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class PlaidClient {
  // a more restrictive connection spec based on the MODERN_TLS spec already present in OkHttp
  private static final ConnectionSpec CONNECTION_SPEC =
    new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
      .tlsVersions(TlsVersion.TLS_1_2)
      .build();
  private static String headerVersion;

  private final PlaidApiService plaidApiService;
  private final Retrofit retrofit;

  private PlaidClient(PlaidApiService plaidApiService, Retrofit retrofit) {
    this.plaidApiService = plaidApiService;
    this.retrofit = retrofit;
  }

  /**
   * Get the Retrofit {@link PlaidApiService} which backs this client.
   *
   * All Plaid API calls are called on this service object.
   *
   * @return the {@link PlaidApiService}
   */
  public PlaidApiService service() {
    return plaidApiService;
  }

  /**
   * A helper to assist with decoding unsuccessful responses.
   *
   * This is not done automatically, because an unsuccessful result may have many causes
   * such as network issues, intervening HTTP proxies, load balancers, partial responses, etc,
   * which means that a response can easily be incomplete, or not even the expected well-formed
   * JSON error.
   *
   * Therefore, even when using this helper, be prepared for it to throw an exception instead of
   * successfully decoding every error response!
   *
   * @param response the unsuccessful response object to deserialize.
   * @return the resulting {@link ErrorResponse}, assuming deserialization succeeded.
   * @throws RuntimeException if the response cannot be deserialized
   */
  public ErrorResponse parseError(Response response) {
    if (response.isSuccessful()) {
      throw new IllegalArgumentException("Response must be unsuccessful.");
    }

    Converter<ResponseBody, ErrorResponse> responseBodyObjectConverter =
      retrofit.responseBodyConverter(ErrorResponse.class, new Annotation[0]);

    try {
      return responseBodyObjectConverter.convert(response.errorBody());
    } catch (IOException ex) {
      throw new RuntimeException("Could not parse error response", ex);
    }
  }

  /**
   * Visible for testing.
   *
   * @return the underlying Retrofit client.
   */
  public Retrofit getRetrofit() {
    return retrofit;
  }

  /**
   * Start here! Creates a new {@link Builder} so you can make a {@link PlaidClient}.
   *
   * @return A brand new {@link Builder}
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  public static class PlaidApiHeadersInterceptor implements Interceptor {
    @Override public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
      Request originalRequest = chain.request();
      Request transformedRequest = originalRequest.newBuilder()
        .addHeader(PlaidHeaders.PLAID_API_VERSION_OVERRIDE_HEADER,
          PlaidHeaders.PLAID_API_VERSION)
        .addHeader(PlaidHeaders.PLAID_API_USER_AGENT_HEADER, getUserAgentHeader())
        .build();
      return chain.proceed(transformedRequest);
    }
  }

  private static String getUserAgentHeader() {
    return String.format("Plaid Java v%s", PlaidVersion.PLAID_VERSION);
  }

  public static class Builder {
    public static String DEFAULT_PRODUCTION_BASE_URL = "https://production.plaid.com";
    public static String DEFAULT_DEVELOPMENT_BASE_URL = "https://development.plaid.com";
    public static String DEFAULT_SANDBOX_BASE_URL = "https://sandbox.plaid.com";
    public static long DEFAULT_READ_TIMEOUT_SECONDS = 300;
    public static long DEFAULT_CONNECT_TIMEOUT_SECONDS = 5;

    private final OkHttpClient.Builder okHttpClientBuilder;
    private String baseUrl;
    private HttpLoggingInterceptor.Level httpLogLevel;
    private String publicKey;

    private String clientId;
    private String secret;

    private Builder() {
      this.okHttpClientBuilder = new OkHttpClient.Builder()
        .readTimeout(DEFAULT_READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
        .connectTimeout(DEFAULT_CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
        .followSslRedirects(false)
        .addInterceptor(new PlaidApiHeadersInterceptor())
        .connectionSpecs(Collections.singletonList(CONNECTION_SPEC));
    }

    /**
     * Validate builder parameters, create, and return a new {@link PlaidClient}.
     *
     * @return A brand new {@link PlaidClient}
     */
    public PlaidClient build() {
      if (baseUrl == null) {
        throw new IllegalArgumentException(
          "must set baseUrl. You probably want to call productionBaseUrl(), developmentBaseUrl(), or sandboxBaseUrl().");
      }

      if (publicKey == null && (clientId == null || secret == null)) {
        throw new IllegalArgumentException("must set a publicKey, clientIdAndSecret, or both!");
      }

      Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(baseUrl)
        .validateEagerly(true)
        .addConverterFactory(GsonConverterFactory.create(buildGson()))
        .client(buildOkHttpClient())
        .build();

      return new PlaidClient(retrofit.create(PlaidApiService.class), retrofit);
    }

    private Gson buildGson() {
      return new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapterFactory(
          new CredentialInjectingTypeAdapterFactory(publicKey, clientId, secret))
        .registerTypeAdapterFactory(new RequiredFieldTypeAdapterFactory())
        .registerTypeAdapterFactory(new OptionalTypeAdapterFactory())
        .registerTypeAdapterFactory(new ImmutableListStripUnknownEnumsTypeAdapterFactory())
        .registerTypeAdapter(TransactionsGetRequest.BaseOptions.class, new TransactionsBaseOptionsSerializer())
        .registerTypeAdapter(InvestmentsTransactionsGetRequest.BaseOptions.class, new InvestmentsTransactionsBaseOptionsSerializer())
        .create();
    }

    private OkHttpClient buildOkHttpClient() {
      if (httpLogLevel != null) {
        okHttpClientBuilder.addInterceptor(new HttpLoggingInterceptor().setLevel(httpLogLevel));
      }

      checkRuntimeSupportsTls12(okHttpClientBuilder);

      return okHttpClientBuilder.build();
    }

    /**
     * Plaid's API requires TLSv1.2, which is well-supported
     * on JDK 8, but spotty on JDK 7 and below.
     *
     * This attempts to detect whether TLSv1.2 is already enabled by default,
     * and if not, enable it, or failing that throw an error early.
     *
     * @param okHttpClientBuilder the OkHttpClient builder
     */
    private void checkRuntimeSupportsTls12(OkHttpClient.Builder okHttpClientBuilder) {
      SSLSocket testSslSocket = null;

      try {
        // create a temporary client and test socket to check for desired cipher and protocol support
        OkHttpClient testOkHttpClient = okHttpClientBuilder.build();
        testSslSocket = (SSLSocket) testOkHttpClient.sslSocketFactory().createSocket();

        // does the test socket work with our connection spec's cipher suite and tls version as-is?
        if (CONNECTION_SPEC.isCompatible(testSslSocket)) {
          return; // no further questions!
        }

        // perhaps TLSv1.2 is supported, just not enabled by default (some versions of Java 7)
        if (!Arrays.asList(testSslSocket.getSupportedProtocols())
          .contains(TlsVersion.TLS_1_2.javaName())) {
          throw new RuntimeException(
            "This JRE's SSL implementation does not support TLSv1.2. Bailing out.");
        }

        // supported but not enabled by default. In this case, we'll have our OkHTTP
        // client use an SSLSocketFactory which does enable it.

        // The following SSLSocketFactory setup code is from
        // OkHttpClient.Builder#sslSocketFactory()'s javadocs
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
          TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
          throw new IllegalStateException("Unexpected default trust managers:"
            + Arrays.toString(trustManagers));
        }
        X509TrustManager trustManager = (X509TrustManager) trustManagers[0];

        SSLContext sslContext = SSLContext.getInstance(TlsVersion.TLS_1_2.javaName());
        sslContext.init(null, new TrustManager[] {trustManager}, null);
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        okHttpClientBuilder.sslSocketFactory(sslSocketFactory, trustManager);
      } catch (Exception ex) {
        throw new RuntimeException(ex);
      } finally {
        if (testSslSocket != null) {
          try {
            testSslSocket.close();
          } catch (IOException ex) {
            // oh well
          }
        }
      }
    }

    /**
     * Generally, you should not need this!
     * <p>
     * Direct access to the underlying OkHTTP client builder for advanced settings
     * like SSL, proxy, logging, and timeout options if needed.
     *
     * @return the underlying builder.
     */
    public OkHttpClient.Builder okHttpClientBuilder() {
      return okHttpClientBuilder;
    }

    /**
     * Convenience method to set the HTTP client's logging level.
     *
     * @param level Desired logging level.
     * @return this. To satisfy the builder pattern.
     */
    public Builder logLevel(HttpLoggingInterceptor.Level level) {
      this.httpLogLevel = level;
      return this;
    }

    /**
     * Set a custom base API url, if {@link #productionBaseUrl()} or {@link #sandboxBaseUrl()} aren't sufficient.
     *
     * @param baseUrl The base URL you wish to use.
     * @return this. To satisfy the builder pattern.
     */
    public Builder baseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    /**
     * Configure the client to use the default {@link #DEFAULT_PRODUCTION_BASE_URL production URL}.
     *
     * @return this. To satisfy the builder pattern.
     */
    public Builder productionBaseUrl() {
      return baseUrl(DEFAULT_PRODUCTION_BASE_URL);
    }

    /**
     * Configure the client to use the default {@link #DEFAULT_SANDBOX_BASE_URL sandbox URL}.
     *
     * @return this. To satisfy the builder pattern.
     */
    public Builder sandboxBaseUrl() {
      return baseUrl(DEFAULT_SANDBOX_BASE_URL);
    }

    /**
     * Configure the client to use the default {@link #DEFAULT_DEVELOPMENT_BASE_URL sandbox URL}.
     *
     * @return this. To satisfy the builder pattern.
     */
    public Builder developmentBaseUrl() {
      return baseUrl(DEFAULT_DEVELOPMENT_BASE_URL);
    }

    /**
     * Set the public key credential.
     *
     * Only required if this client will be used to call API endpoints
     * that need a public key.
     *
     * Can be found in your Account Dashboard. See documentation for details.
     *
     * @param publicKey Your Plaid API Public key.
     * @return This {@link Builder} to satisfy the builder pattern.
     */
    public Builder publicKey(String publicKey) {
      Util.notNull(publicKey, "publicKey");

      this.publicKey = publicKey;
      return this;
    }

    /**
     * Set the client ID and secret credentials.
     *
     * Most API calls require these, you'll almost always want to set them.
     *
     * Can be found in your Account Dashboard.
     *
     * @param clientId Your Plaid API Client ID
     * @param secret Your Plaid API Secret
     * @return This {@link Builder} to satisfy the builder pattern.
     */
    public Builder clientIdAndSecret(String clientId, String secret) {
      Util.notNull(clientId, "clientId");
      Util.notNull(secret, "secret");

      this.clientId = clientId;
      this.secret = secret;

      return this;
    }
  }
}
