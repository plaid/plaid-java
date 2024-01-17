# plaid-java [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.plaid/plaid-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.plaid/plaid-java)

Java Bindings for the Plaid API (https://www.plaid.com/docs). This library is generated from the [Plaid OpenAPI spec](https://github.com/plaid/plaid-openapi).

Plaid API is defined in the `PlaidApi` interface.

Uses [Retrofit](https://github.com/square/retrofit) and [OkHttp](https://github.com/square/okhttp) under
the hood. You may want to take a look at those libraries if you need to do anything out of the ordinary.

## Table of Contents

* [Installation](#installation)
* [Versioning](#versioning)
* [Basic Usage Examples](#basic-usage-examples)
  + [Initialization, API call, and error handling](#initialization-api-call-and-error-handling)
  + [Dates](#dates)
* [Migration Guide](#migration-guide)
* [Contributing](#contributing)
* [License](#license)
  

### Installation

Plaid-java is available at [Maven Central](https://central.sonatype.com/artifact/com.plaid/plaid-java).

```xml
<dependency>
  <groupId>com.plaid</groupId>
  <artifactId>plaid-java</artifactId>
  <!--Replace this version number with the latest verison, which can be found at https://github.com/plaid/plaid-java/tags-->
  <version>9.0.0</version>
</dependency>
```

### Versioning

As of `9.0.0`, the library is generated from the OpenAPI spec. 

Each major version of `plaid-java` targets a specific version of the Plaid API:

| API version                                         | plaid-java release    |
| --------------------------------------------------- | --------------------- |
| [`2020-09-14`][api-version-2020-09-14] (**latest**) | `8.x.x` and higher    |
| [`2019-05-29`][api-version-2019-05-29]              | `7.x.x`               |
| [`2018-05-22`][api-version-2018-05-22]              | `4.x.x` (and `3.x.x`) |
| `2017-03-08`                                        | `2.x.x`               |

For information about what has changed between versions and how to update your integration, head to the [version changelog][version-changelog].

The plaid-java client library is typically updated on a monthly basis. The canonical source for the latest version number is the [client library changelog](https://github.com/plaid/plaid-java/blob/master/CHANGELOG.md). New versions are published as [GitHub tags](https://github.com/plaid/plaid-java/tags), not as Releases. New versions can also be found on [Maven Central](https://central.sonatype.com/artifact/com.plaid/plaid-java).

All users are strongly recommended to use a recent version of the library, as older versions do not contain support for new endpoints and fields. For more details, see the [Migration Guide](#migration-guide).

### Basic Usage Examples

For more examples of basic usage, see the [test suites](https://github.plaid.com/plaid/go/tree/master/lib/apischemas/openapi/clib-wrappers/plaid-java/src/test/java/com/plaid/client/integration), [Quickstart](https://github.com/plaid/quickstart/tree/master/java/src/main/java/com/plaid/quickstart), or [API Reference documentation](https://plaid.com/docs/api/).

#### Initialization, API call, and error handling

```java

private PlaidApi plaidClient;

HashMap<String, String> apiKeys = new HashMap<String, String>();
apiKeys.put("clientId", plaidClientId);
apiKeys.put("secret", plaidSecret);
apiClient = new ApiClient(apiKeys);
apiClient.setPlaidAdapter(ApiClient.Sandbox); // or equivalent, depending on which environment you're calling into
plaidClient = apiClient.createService(PlaidApi.class);

// Synchronously exchange a Link public_token for an API access_token
// Required request parameters are always Request object constructor arguments
ItemPublicTokenExchangeRequest request = new ItemPublicTokenExchangeRequest().publicToken("the_link_public_token");
Response<ItemPublicTokenExchangeResponse> response = plaidClient
    .itemPublicTokenExchange(request).execute();

if (response.isSuccessful()) {
  accessToken = response.body().getAccessToken();
}


// Asynchronously do the same thing. Useful for potentially long-lived calls.
ItemPublicTokenExchangeRequest asyncRequest = new ItemPublicTokenExchangeRequest().publicToken("the_link_public_token");
plaidClient
    .itemPublicTokenExchange(asyncRequest)
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
  Gson gson = new Gson();
  PlaidError error = gson.fromJson(response.errorBody().string(), PlaidError.class);
} catch (Exception e) {
  throw new Exception(
    String.format(
      "Failed converting from API Response Error Body to Error %f",
      response.errorBody().string()
    )
  );
}
```

#### Dates
Dates and datetimes in requests, which are represented as strings in the API, are represented in this version of the Java client library as `LocalDate` or `OffsetDateTime` objects. 

Time zone information is required for request fields that accept datetimes. Failing to include time zone information (or specifying a string, instead of an `OffsetDateTime` object) will result in an error.

If the API reference documentation for a request field specifies `format: date`, the following is acceptable:

```java
import java.time.LocalDate;

LocalDate myDate = LocalDate.parse("2019-12-06");
```

If the API reference documentation for a request field specifies `format: date-time`, the following is acceptable:


```java
import java.time.OffsetDateTime;

OffsetDateTime myDateTime = OffsetDateTime.parse("2019-12-06T22:35:49+00:00");
```

## Migration guide

### 9.0.0 or later to latest

Migrating from a version released on or after August 2021 to a recent version should involve very minor integration changes. Many customers will not need to make changes to their integrations at all. To see a list of all potentially-breaking changes since your current version, see the [client library changelog](https://github.com/plaid/plaid-java/blob/master/CHANGELOG.md) and search for "Breaking changes in this version". Breaking changes are annotated at the top of each major version header.

### Pre-9.0.0 to latest

Version 9.0.0 of the client library was released in August 2021 and contains multiple interface changes, as described below.

#### Major changes

**Change CountryCodes to enum:**

- from: `Arrays.list("US")`
- to: `Arrays.list(CountryCode.US`)

**Rename model imports:**

- from: `com.plaid.request.ModelName` and `com.plaid.response.ModelName`
- to: `com.plaid.model.ModelName`

**Rename products:**

- from: `com.plaid.client.request.common.Product`
- to: `com.plaid.model.Products`

**Rename Error model:**

- from:  `com.plaid.client.model.ErrorResponse`
- to:  `com.plaid.client.model.Error`
- from: `ErrorResponse.ErrorType`
- to: `Error.ErrorTypeEnum`

**Rename Account model:**

- from: `import com.plaid.client.model.Account`
- to: `import com.plaid.client.model.AccountBase`

**Rename Payment Initiation Models**:

- from: `import com.plaid.client.model.paymentinitiation.`
- to: `import com.plaid.client.model.PaymentInitiation${Model}`

**Request Model Structure:**

- All request models changed from having their options passed as function arguments  `new AuthGetRequest(accessToken)` to now having builder syntax  `new AuthGetRequest().accessToken(accessToken)`.
- All `with$VARNAME` chained setters have been converted to `${}options`. E.g. `.withEndDate(endDate)` -> `.endDate(endDate)` See [Optional Parameters](#optional-parameters) for an example.

**Response Model Structure:**

- Model response properties are no longer connected to their parent response.
- Most other getters/setters have stayed the same outside of a few capitalization changes.

**Plaid Client changes:**

- Remove all occurrences of `service()` attached to `client()` endpoint queries.
- Endpoints that start with `get` are now ${Model}Get.

#### Date format changes

The date and date-time format has changed in this client library. See [Dates](#dates) for information on the new date format.

#### Enum changes
While the API represents enums using strings, and previous library versions used singletons, this current library uses enum types.

Old:
```
LinkTokenCreateRequest request = new LinkTokenCreateRequest(
   Collections.singletonList("auth"))
  .withCountryCodes(Collections.singletonList("US"))
...
```

Current:
```
LinkTokenCreateRequest request = new LinkTokenCreateRequest()
  .products(Arrays.asList(Products.AUTH))
  .countryCodes(Arrays.asList(CountryCode.US))
  ...
```

#### Initialization and error handling

See [basic usage](#basic-usage) for examples of new-style initialization and error handling.

#### Method calling examples

Old:
```
// Pull real-time balance information for each account associated
// with the Item
Response<AccountsBalanceGetResponse> response = client().service().accountsBalanceGet(
  new AccountsBalanceGetRequest(accessToken))
  .execute();
List<Account> accounts = response.body().getAccounts();
```

New:
```
// Pull real-time balance information for each account associated
// with the Item
AccountsBalanceGetRequest request = new AccountsBalanceGetRequest()
  .accessToken(accessToken);
Response<AccountsGetResponse> response = client()
  .accountsBalanceGet(request)
  .execute();
List<Account> accounts = response.body().getAccounts();
```

#### Optional parameters

Old:

```
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
startDate = simpleDateFormat.parse("2018-01-01");
endDate = simpleDateFormat.parse("2018-02-01");
// Pull transactions for a date range
Response<TransactionsGetResponse> response = client().service().transactionsGet(
  new TransactionsGetRequest(
    accessToken,
    startDate,
    endDate))
  .execute();

// Manipulate the count and offset parameters to paginate
// transactions and retrieve all available data
Response<TransactionsGetResponse> response = client().service().transactionsGet(
  new TransactionsGetRequest(
    accessToken,
    startDate,
    endDate)
    .withAccountIds(Arrays.asList(someAccountId))
    .withCount(numTxns)
    .withOffset(1)).execute();

for (TransactionsGetResponse.Transaction txn : response.body().getTransactions()) { ... }
```

New:

```
LocalDate startDate = LocalDate.now().minusDays(30);
LocalDate endDate = LocalDate.now();
TransactionsGetRequestOptions options = new TransactionsGetRequestOptions()
  .includePersonalFinanceCategory(true)
// Pull transactions for a date range

TransactionsGetRequest request = new TransactionsGetRequest()
  .accessToken(accessToken)
  .startDate(startDate)
  .endDate(endDate)
  .options(options)
Response<TransactionsGetResponse>
  response = plaidClient.transactionsGet(request).execute();

List<Transaction> transactions = new ArrayList <Transaction>();
transactions.addAll(response.body().getTransactions());

// Manipulate the offset parameter to paginate
// transactions and retrieve all available data
while (transactions.size() < response.body().getTotalTransactions()) {
  options = new TransactionsGetRequestOptions()
    .offset(transactions.size())
    .includePersonalFinanceCategory(true)
  TransactionsGetRequest request = new TransactionsGetRequest()
    .accessToken(accessToken)
    .startDate(startDate)
    .endDate(endDate)
    .options(options);

  Response<TransactionsGetResponse>
    response = plaidClient.transactionsGet(request).execute();
  transactions.addAll(response.body().getTransactions());
}
```

## Contributing

Please see [Contributing](CONTRIBUTING.md) for guidelines and instructions for local development.

## License
[MIT](LICENSE).
