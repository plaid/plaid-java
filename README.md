plaid-java [![Circle CI](https://circleci.com/gh/plaid/plaid-java.svg?style=svg&circle-token=4ed876775bc0ac7fba18124bc835a9e82dab0c53)](https://circleci.com/gh/plaid/plaid-java) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.plaid/plaid-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.plaid/plaid-java)
==========

Java Bindings for the Plaid API (https://www.plaid.com/docs).

The whole available Plaid API is defined in the `PlaidApiService` interface.

Check the Junit test classes for examples of more use cases. Every API endpoint has at
least one integration test against the sandbox environment.

Uses [Retrofit](https://github.com/square/retrofit) and [OkHttp](https://github.com/square/okhttp) under
the hood. You may want to take a look at those libraries if you need to do anything out of the ordinary.

### Installation

Plaid-java is available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cplaid-java)

```xml

<dependency>
  <groupId>com.plaid</groupId>
  <artifactId>plaid-java</artifactId>
  <version>2.2.0</version>
</dependency>

```

### Basic Usage

```java
String accessToken;
// Use builder to create a client 
PlaidClient plaidClient = PlaidClient.newBuilder()
  .clientIdAndSecret("your_client_id", "your_secret")
  .publicKey("your_public_key") // optional. only needed to call endpoints that require a public key
  .sandboxBaseUrl() // or equivalent, depending on which environment you're calling into
  .build();


// Synchronously exchange a Link public_token for an API access_token
// Required request parameters are always Request object constructor arguments
Response<ItemPublicTokenExchangeResponse> response = plaidClient.service()
    .itemPublicTokenExchange(new ItemPublicTokenExchangeRequest("the_link_public_token")).execute();

if (response.isSuccessful()) {
  accessToken = response.body().getAccessToken();
}


// Asynchronously do the same thing. Useful for potentially long-lived calls.
plaidClient.service()
    .itemPublicTokenExchange(new ItemPublicTokenExchangeRequest(publicToken))
    .enqueue(new Callback<ItemPublicTokenExchangeResponse>() {
        @Override
        public void onResponse(Call<ItemPublicTokenExchangeResponse> call, Response<ItemPublicTokenExchangeResponse> response) {
          if (response.isSuccessful()) {
            accessToken = response.body.getAccessToken();
          }
        }
        
        @Override
        public void onFailure(Call<ItemPublicTokenExchangeResponse> call, Throwable t) {
          // handle the failure as needed
        }
    });


// Decoding an unsuccessful response
try {
  ErrorResponse errorResponse = plaidClient.parseError(response);
} catch (Exception e) {
  // deal with it. you didn't even receive a well-formed JSON error response.
}
```

### Legacy API
If you're looking for a Java client that works with the legacy Plaid API, use
versions of `plaid-java` before `2.1.0`. The API and client are not backwards-compatible.
