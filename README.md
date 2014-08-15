plaid-java
==========

Java Bindings for the Plaid API (https://www.plaid.com/docs)

### Installation

Plaid-java is available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cplaid-java) with the following coordinates (latest release 0.2.3):

```xml

<dependency>
  <groupId>com.plaid</groupId>
  <artifactId>plaid-java</artifactId>
  <version>0.2.3</version>
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

### Dependencies

There are two main dependencies (of course automatically managed by Maven):

1. [Apache HTTPComponents Client](http://hc.apache.org/httpcomponents-client-ga/index.html). One reason for this, besides it being a nice library, is that the native JDK HttpUrlConnection doesn't have support for the HTTP Patch method, that is required by the Plaid API. The bindings are, however, designed so that you can replace HTTPComponents client with the HTTP library of your choice, by creating a different implementation of the HttpDelegate interface.

2. The [Jackson JSON Parser](http://jackson.codehaus.org/).

The project also has a test scope dependency on [Wiremock](http://wiremock.org), which is really useful in order to avoid hitting the sandbox API all the time.

