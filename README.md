plaid-java
==========

Java Bindings for the Plaid API (https://www.plaid.com/docs)

These bindings are under active development and currently support the main usecases of the Plaid API. There are some parts that are as yet unimplemented so pull requests are welcome!

### Installation

Plaid-java is available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cplaid-java) with the following coordinates (latest release 0.2.11):

```xml

<dependency>
  <groupId>com.plaid</groupId>
  <artifactId>plaid-java</artifactId>
  <version>0.2.11</version>
</dependency>

```

### Basic Usage

```java

// Add Amex user, get 30 days of transactions

PlaidUserClient plaidUserClient = PlaidClients.testUserClient("test_id", "test_secret");
Credentials testCredentials = new Credentials("plaid_test", "plaid_good");
TransactionsResponse response = plaidUserClient.addUser(testCredentials, "amex", "test@test.com", null);

List<Transaction> transactions = response.getTransactions();


// Get all Categories

PlaidPublicClient plaidPublicClient = PlaidClients.testPublicClient();
CategoriesResponse categoriesResponse = plaidPublicClient.getAllCategories();

List<Category> categories = categoriesResponse.getCategories();
```

Check the Junit test classes for examples of more use cases.

### Exchange a Plaid Link public_token for an API access_token

```java
// Initialize a Plaid client with your client_id and secret
PlaidUserClient plaidUserClient = PlaidClients.testUserClient("test_id", "test_secret");

// Exchange the Link public_token ("test,bofa,connected") for an API access_token
PlaidUserResponse response = plaidUserClient.exchangeToken("test,bofa,connected");

// Initialize the user with the access_token returned by the exchangeToken call
plaidUserClient.setAccessToken(response.getAccessToken());

// Pull accounts for the user
// Note: This assumes you are using Link with the "auth" product
AccountsResponse response = plaidUserClient.updateAuth();
```

### Dependencies

There are two main dependencies (of course automatically managed by Maven):

1. [Apache HTTPComponents Client](http://hc.apache.org/httpcomponents-client-ga/index.html). One reason for this, besides it being a nice library, is that the native JDK HttpUrlConnection doesn't have support for the HTTP Patch method, that is required by the Plaid API. The bindings are, however, designed so that you can replace HTTPComponents client with the HTTP library of your choice, by creating a different implementation of the HttpDelegate interface.

2. The [Jackson JSON Parser](http://jackson.codehaus.org/).

The project also has a test scope dependency on [Wiremock](http://wiremock.org), which is really useful in order to avoid hitting the sandbox API all the time.

