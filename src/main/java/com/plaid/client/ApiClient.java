package com.plaid.client;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import com.plaid.client.auth.HttpBasicAuth;
import com.plaid.client.auth.HttpBearerAuth;
import com.plaid.client.auth.ApiKeyAuth;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApiClient {

  private Map<String, Interceptor> apiAuthorizations;
  private OkHttpClient.Builder okBuilder;
  private Retrofit.Builder adapterBuilder;
  private JSON json;
  private OkHttpClient okHttpClient;
  public static final String Production = "https://production.plaid.com";
  public static final String Development = "https://development.plaid.com";
  public static final String Sandbox = "https://sandbox.plaid.com";

  public ApiClient() {
    apiAuthorizations = new LinkedHashMap<String, Interceptor>();
    createDefaultAdapter();
    okBuilder = new OkHttpClient.Builder()
        .readTimeout(60, TimeUnit.SECONDS).connectTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                Request requestWithUserAgent = originalRequest.newBuilder()
                        .header("User-Agent", "Plaid Java v15.1.0")
                        .header("Plaid-Version", "2020-09-14")
                        .build();
                return chain.proceed(requestWithUserAgent);
            }
        });
  }

  public ApiClient(OkHttpClient client){
    apiAuthorizations = new LinkedHashMap<String, Interceptor>();
    createDefaultAdapter();
    okHttpClient = client;
  }

  public ApiClient(String[] authNames) {
    this();
    for(String authName : authNames) {
      Interceptor auth;
      if ("clientId".equals(authName)) {
        
        auth = new ApiKeyAuth("header", "PLAID-CLIENT-ID");
      } else if ("plaidVersion".equals(authName)) {
        
        auth = new ApiKeyAuth("header", "Plaid-Version");
      } else if ("secret".equals(authName)) {
        
        auth = new ApiKeyAuth("header", "PLAID-SECRET");
      } else {
        throw new RuntimeException("auth name \"" + authName + "\" not found in available auth names");
      }

      addAuthorization(authName, auth);
    }
  }

  /**
   * Helper constructor for multiple api keys. Preferred constructor
   */
  public ApiClient(Map<String, String> apiKeys) {
    this();
    for(String authName : apiKeys.keySet()) {
      Interceptor auth;
      if ("clientId".equals(authName)) {
        
        ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "PLAID-CLIENT-ID");
		apiKeyAuth.setApiKey(apiKeys.get(authName));
		auth = (Interceptor) apiKeyAuth;
      } else if ("plaidVersion".equals(authName)) {
        
        ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "Plaid-Version");
		apiKeyAuth.setApiKey(apiKeys.get(authName));
		auth = (Interceptor) apiKeyAuth;
      } else if ("secret".equals(authName)) {
        
        ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "PLAID-SECRET");
		apiKeyAuth.setApiKey(apiKeys.get(authName));
		auth = (Interceptor) apiKeyAuth;
      } else {
        throw new RuntimeException("auth name \"" + authName + "\" not found in available auth names");
      }

      addAuthorization(authName, auth);
    }
  }

  /**
   * Basic constructor for single auth name
   * @param authName Authentication name
   */
  public ApiClient(String authName) {
    this(new String[]{authName});
  }

  /**
   * Helper constructor for single api key
   * @param authName Authentication name
   * @param apiKey API key
   */
  public ApiClient(String authName, String apiKey) {
    this(authName);
    this.setApiKey(apiKey);
  }

  /**
   * Helper constructor for single basic auth or password oauth2
   * @param authName Authentication name
   * @param username Username
   * @param password Password
   */
  public ApiClient(String authName, String username, String password) {
    this(authName);
    this.setCredentials(username,  password);
  }

  public void createDefaultAdapter() {
    json = new JSON();

    String baseUrl = "https://production.plaid.com";
    if (!baseUrl.endsWith("/"))
      baseUrl = baseUrl + "/";

    adapterBuilder = new Retrofit
      .Builder()
      .baseUrl(baseUrl)
      .addConverterFactory(ScalarsConverterFactory.create())
      .addConverterFactory(GsonCustomConverterFactory.create(json.getGson()));
  }
  public void setPlaidAdapter(String baseUrl) {
    json = new JSON();

    List<String> PLAID_ENVS = Arrays.asList("https://sandbox.plaid.com", "https://production.plaid.com", "https://development.plaid.com");

    if(!PLAID_ENVS.contains(baseUrl)) {
      System.out.println("baseUrl not found in PLAID_ENVS, must be one of the following: https://sandbox.plaid.com, https://production.plaid.com, https://development.plaid.com");
    }

    if (!baseUrl.endsWith("/"))
      baseUrl = baseUrl + "/";

    adapterBuilder = new Retrofit
      .Builder()
      .baseUrl(baseUrl)
      .addConverterFactory(ScalarsConverterFactory.create())
      .addConverterFactory(GsonCustomConverterFactory.create(json.getGson()));
  }

  /**
   * Helper to set a specific timeout for read and connect
   * @param overrideTimeout timeout in seconds
   */
  public void setTimeout(int overrideTimeout) {
    okBuilder.readTimeout(overrideTimeout, TimeUnit.SECONDS).connectTimeout(overrideTimeout, TimeUnit.SECONDS);
  }

  public <S> S createService(Class<S> serviceClass) {
    if (okHttpClient != null) {
        return adapterBuilder.client(okHttpClient).build().create(serviceClass);
    } else {
        return adapterBuilder.client(okBuilder.build()).build().create(serviceClass);
    }
  }

  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.json.setDateFormat(dateFormat);
    return this;
  }

  public ApiClient setSqlDateFormat(DateFormat dateFormat) {
    this.json.setSqlDateFormat(dateFormat);
    return this;
  }

  public ApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
    this.json.setOffsetDateTimeFormat(dateFormat);
    return this;
  }

  public ApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
    this.json.setLocalDateFormat(dateFormat);
    return this;
  }


  /**
   * Helper method to configure the first api key found
   * @param apiKey API key
   * @return ApiClient
   */
  public ApiClient setApiKey(String apiKey) {
    for(Interceptor apiAuthorization : apiAuthorizations.values()) {
      if (apiAuthorization instanceof ApiKeyAuth) {
        ApiKeyAuth keyAuth = (ApiKeyAuth) apiAuthorization;
        keyAuth.setApiKey(apiKey);
        return this;
      }
    }
    return this;
  }

  /**
   * Helper method to set token for the first Http Bearer authentication found.
   * @param bearerToken Bearer token
   * @return ApiClient
   */
  public ApiClient setBearerToken(String bearerToken) {
    for (Interceptor apiAuthorization : apiAuthorizations.values()) {
      if (apiAuthorization instanceof HttpBearerAuth) {
        ((HttpBearerAuth) apiAuthorization).setBearerToken(bearerToken);
        return this;
      }
    }
    return this;
  }

  /**
   * Helper method to configure the username/password for basic auth or password oauth
   * @param username Username
   * @param password Password
   * @return ApiClient
   */
  public ApiClient setCredentials(String username, String password) {
    for(Interceptor apiAuthorization : apiAuthorizations.values()) {
      if (apiAuthorization instanceof HttpBasicAuth) {
        HttpBasicAuth basicAuth = (HttpBasicAuth) apiAuthorization;
        basicAuth.setCredentials(username, password);
        return this;
      }
    }
    return this;
  }


  /**
   * Adds an authorization to be used by the client
   * @param authName Authentication name
   * @param authorization Authorization interceptor
   * @return ApiClient
   */
  public ApiClient addAuthorization(String authName, Interceptor authorization) {
    if (apiAuthorizations.containsKey(authName)) {
      throw new RuntimeException("auth name \"" + authName + "\" already in api authorizations");
    }
    apiAuthorizations.put(authName, authorization);
    if(okBuilder == null){
        throw new RuntimeException("The ApiClient was created with a built OkHttpClient so it's not possible to add an authorization interceptor to it");
    }
    okBuilder.addInterceptor(authorization);

    return this;
  }

  public Map<String, Interceptor> getApiAuthorizations() {
    return apiAuthorizations;
  }

  public ApiClient setApiAuthorizations(Map<String, Interceptor> apiAuthorizations) {
    this.apiAuthorizations = apiAuthorizations;
    return this;
  }

  public Retrofit.Builder getAdapterBuilder() {
    return adapterBuilder;
  }

  public ApiClient setAdapterBuilder(Retrofit.Builder adapterBuilder) {
    this.adapterBuilder = adapterBuilder;
    return this;
  }

  public OkHttpClient.Builder getOkBuilder() {
    return okBuilder;
  }

  public void addAuthsToOkBuilder(OkHttpClient.Builder okBuilder) {
    for(Interceptor apiAuthorization : apiAuthorizations.values()) {
      okBuilder.addInterceptor(apiAuthorization);
    }
  }

  /**
   * Clones the okBuilder given in parameter, adds the auth interceptors and uses it to configure the Retrofit
   * @param okClient An instance of OK HTTP client
   */
  public void configureFromOkclient(OkHttpClient okClient) {
    this.okBuilder = okClient.newBuilder();
    addAuthsToOkBuilder(this.okBuilder);
  }
}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
  private final Gson gson;
  private final Type type;

  GsonResponseBodyConverterToString(Gson gson, Type type) {
    this.gson = gson;
    this.type = type;
  }

  @Override public T convert(ResponseBody value) throws IOException {
    String returned = value.string();
    try {
      return gson.fromJson(returned, type);
    }
    catch (JsonParseException e) {
      return (T) returned;
    }
  }
}

class GsonCustomConverterFactory extends Converter.Factory
{
  private final Gson gson;
  private final GsonConverterFactory gsonConverterFactory;

  public static GsonCustomConverterFactory create(Gson gson) {
    return new GsonCustomConverterFactory(gson);
  }

  private GsonCustomConverterFactory(Gson gson) {
    if (gson == null)
      throw new NullPointerException("gson == null");
    this.gson = gson;
    this.gsonConverterFactory = GsonConverterFactory.create(gson);
  }

  @Override
  public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
    if (type.equals(String.class))
      return new GsonResponseBodyConverterToString<Object>(gson, type);
    else
      return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
  }

  @Override
  public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
    return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
  }
}
