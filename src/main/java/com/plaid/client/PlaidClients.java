package com.plaid.client;

import org.apache.http.impl.client.HttpClientBuilder;

import com.plaid.client.http.ApacheHttpClientHttpDelegate;
import com.plaid.client.http.WireLogger;

public class PlaidClients {

    public static final String BASE_URI_PRODUCTION = "https://api.plaid.com";
    public static final String BASE_URI_TEST = "https://tartan.plaid.com";

    public static PlaidUserClient productionUserClient(String clientId, String secret, WireLogger wireLogger, Integer timeout) {
        return new DefaultPlaidUserClient.Builder()
                .withHttpDelegate(createHttpDelegate(BASE_URI_PRODUCTION, wireLogger))
                .withClientId(clientId)
                .withSecret(secret)
                .withTimeout(timeout)
                .build();
    }

    public static PlaidUserClient testUserClient(String clientId, String secret, WireLogger wireLogger, Integer timeout) {
        return new DefaultPlaidUserClient.Builder()
                .withHttpDelegate(createHttpDelegate(BASE_URI_TEST, wireLogger, true))
                .withClientId(clientId)
                .withSecret(secret)
                .withTimeout(timeout)
                .build();
    }

    public static PlaidPublicClient productionPublicClient(WireLogger wireLogger) {
        return new DefaultPlaidPublicClient.Builder()
                .withHttpDelegate(createHttpDelegate(BASE_URI_PRODUCTION, wireLogger))
                .build();
    }

    public static PlaidPublicClient testPublicClient(WireLogger wireLogger) {
        return new DefaultPlaidPublicClient.Builder()
                .withHttpDelegate(createHttpDelegate(BASE_URI_TEST, wireLogger, true))
                .build();
    }

    public static PlaidUserClient productionUserClient(String clientId, String secret) {

        return productionUserClient(clientId, secret, null);
    }

    public static PlaidUserClient productionUserClient(String clientId, String secret, Integer timeout) {

        return productionUserClient(clientId, secret, null, timeout);
    }

    public static PlaidUserClient testUserClient(String clientId, String secret) {

        return testUserClient(clientId, secret, null);
    }

    public static PlaidUserClient testUserClient(String clientId, String secret, Integer timeout) {

        return testUserClient(clientId, secret, null, timeout);
    }

    public static PlaidPublicClient productionPublicClient() {

        return productionPublicClient(null);
    }

    public static PlaidPublicClient testPublicClient() {

        return testPublicClient(null);
    }

    private static ApacheHttpClientHttpDelegate createHttpDelegate(String uri, WireLogger wireLogger) {

        return createHttpDelegate(uri, wireLogger, false);
    }

    private static ApacheHttpClientHttpDelegate createHttpDelegate(String uri, WireLogger wireLogger, boolean test) {

        ApacheHttpClientHttpDelegate httpDelegate;
        if (test) {
            httpDelegate = new ApacheHttpClientHttpDelegate(uri, HttpClientBuilder.create().disableContentCompression().build());
        }
        else {
            httpDelegate = ApacheHttpClientHttpDelegate.createDefault(uri);
        }
        if (wireLogger != null) {
            httpDelegate.setWireLogger(wireLogger);
        }
        return httpDelegate;
    }
}
