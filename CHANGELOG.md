See full changelog for the OpenAPI schema (OAS) [here](https://github.com/plaid/plaid-openapi/blob/master/CHANGELOG.md).

# 9.6.0
- Updating to OAS 2020-09-14_1.40.3

# 9.5.0
- Updating to OAS 2020-09-14_1.36.1

# 9.4.0
- Updating to OAS 2020-09-14_1.34.1
- Fixed an issue with enums in this library. The library is supposed to be able to gracefully handle new values being returned from the endpoint. Previously, if there were new enum values this library would crash. Now it coerces it into an `ENUM_UNKNOWN` value.

# 9.3.0
Updating to OAS 2020-09-14_1.33.0.

# 9.2.0
Updating to OAS 2020-09-14_1.31.1.

# 9.1.0
Updating to OAS 2020-09-14_1.26.1.

# 9.0.0
The official release of the `plaid-java` generated library. Refer to the beta migration guide for tips on migrating from older version of the libraries.

This particular version is pinned to OpenAPI version `2020-09-14_1.20.6`.

# 9.0.0-beta-2
Type fixes, see full changelog [here](https://github.com/plaid/plaid-openapi/blob/master/CHANGELOG.md).

# 9.0.0-beta-1

This version represents a transition in how we maintain our external client libraries. We are now using an [API spec](https://github.com/plaid/plaid-openapi) written in `OpenAPI 3.0.0` and running our definition file through [OpenAPITool's `java` generator](https://github.com/OpenAPITools/openapi-generator). All tests have been rewritten to support the new format.

## Java Migration Guide

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

- All request models changed from having their options passed as function arguments  `new AuthGetRequest(accessToken)`
- To now having builder syntax  `new AuthGetRequest().accessToken(accessToken)`.
- All `with$VARNAME` chained setters are now setters have been converted to `${}options`.

**Response Model Structure:**

- Model response properties are no longer connected to their parent response.
- Most other getters/setters stayed the same outside of a few capitalization changes.

**Plaid Client changes:**

- Remove all occurrences of `service()` attached to `client()` endpoint queries.
- Endpoints that start with `get` are now ${Model}Get.

## 8.5.0
- Add deposit switch support for `/link/token/create`

## 8.4.0
- Add support for `options` to `/payment_initiation/payment/create`

## 8.3.0
- Add `last_updated_datetime` to `/accounts/balance/get`

## 8.2.0
- Add mortgage object to Liabilities
- Add Standing Orders support to Payment Initiation

## 8.1.0
- Add [Bank Transfers](https://plaid.com/docs/bank-transfers/) endpoints to the library

## 8.0.0

- The library has been pinned to the '2020-09-14' API release. Visit the [docs](https://plaid.com/docs/api/versioning/) to see what changed.
- the `/item/public_token/create` endpoint has been disabled in favor of the /link/token/create
    endpoint
- The `/item/add_token/create endpoint` has been disabled in favor of the /link/token/create
- The `/payment_initiation/payment/token/create` endpoint has been disabled in favor of the /link/token/create
    endpoint
- The `/item/remove` endpoint will no longer return a `removed` boolean.
- The `/institutions/get`, `/institutions/get_by_id`, and `/institutions/search` now require
    `country_codes` to be passed in.

## 7.1.0

- Add support for Link Token get endpoint ([#239](https://github.com/plaid/plaid-java/pull/239))
  - `/link/token/get`

# 7.0.1

- expose Gson builder on Plaid Client.

# 7.0.0

- [BREAKING] Add BACS support to `/recipient/create`
- Remove unnecessary `final`s from classes
- Adds support for `routingNumbers` field on `Institution`

# 6.0.1

- Alter required fields for `link/token/create` endpoint.
- Downgrade okhttp3 version due to dependency management issue.
- Add support for the `merchantName` field on `Transaction`

# 6.0.0

- [BREAKING] Remove `publicKey` from the library, because it is no longer needed by the API
- Add support for the `/link/token/create` endpoint

# 5.7.0

- Add remaining per-product `InstitutionStatus` fields
- Add support for the `paymentChannel` field on `Transaction`
- Add support for the `/sandbox/item/set_verification_status` endpoint

# 5.6.0

- Add optional fields to the /item/add_token/create User object

# 5.5.0

- Add support for /item/add_token/create endpoint

# 5.4.0

- Add item status for the investment product.
- Add transaction_code field to the Transaction object.

# 5.3.0

- Add support for [Transactions Refresh](https://plaid.com/docs/api/#transactions-refresh) endpoint: `/transactions/refresh`

# 5.2.0

- Add authorized_date field to Transactions object
- Add support for webhook_verification
- Add support for deposit switch endpoints

# 5.1.5

- Add support for UK Payment Initiation
- Add VerificationStatus to Account object
- Add consent expiration time to ItemStatus

# 5.1.4

- Add support for [Credit liabilities](https://plaid.com/docs/api/#liabilities).
- Add support for Account subtype filtering in [Institution Search](https://plaid.com/docs/#institution-search).
- Remove support for deprecated endpoint `/item/access_token/update_version`.

# 5.1.2

- Add support for [Student loan liabilities](https://plaid.com/docs/api/#liabilities).

# 5.1.0

- Add support for [Investments](https://plaid.com/docs/api/#investments).

# 5.0.0

- Add support for 2019-05-29 API version

# 4.0.3

- Allow more robust customization of underlying OkHttpClient used by PlaidClient.

# 4.0.2

- Add support for [`/sandbox/item/fire_webhook`][sandbox-item-fire-webhook] endpoint ([#140](https://github.com/plaid/plaid-java/pull/140))

# 4.0.1

- Deprecate direct integration as it is no longer supported
- Replace `/item/delete` with `/item/remove`
- Add support for include_institution_data for /institutions/search, /institutions/get, /institutions/get_by_id ([#134](https://github.com/plaid/plaid-java/pull/134))

# 3.0.7

- Fix transaction get request handling. ([#132](https://github.com/plaid/plaid-java/pull/132))

# 3.0.6

- Add support for Asset Reports with Insights ([#130](https://github.com/plaid/plaid-java/pull/130))

# 3.0.5

- Add support for filtering asset reports ([#125](https://github.com/plaid/plaid-java/pull/125))
- Add support for asset report refresh ([#126](https://github.com/plaid/plaid-java/pull/126))
- Add support for /asset_report/audit_copy/get ([#127](https://github.com/plaid/plaid-java/pull/127))

# 2.2.2

- Allow `TransactionGetRequest.Options` to be subclassed ([#110](https://github.com/plaid/plaid-java/pull/110))

# 2.2.1

- Add Assets as a product ([#109](https://github.com/plaid/plaid-java/pull/109))

# 2.2.0

- Add `/item/remove` endpoint and `itemRemove()`, an alias for `/item/delete` and `itemDelete()` respectively ([#99](https://github.com/plaid/plaid-java/pull/99))

# 2.1.6

- Add `INSTITUTION_ERROR` `ErrorType` ([#96](https://github.com/plaid/plaid-java/pull/96))

# 2.1.5

- Add `getItemId` method to `ItemAccessTokenUpdateVersionResponse` ([#95](https://github.com/plaid/plaid-java/pull/95))
- Fix failing Sandbox unit tests

# 2.1.4

- Fix Apex and Dwolla `processor_token` return values ([#91](https://github.com/plaid/plaid-java/pull/91))

# 2.1.3

- Add support for Apex and Dwolla processor tokens ([#87](https://github.com/plaid/plaid-java/pull/87))

# 2.1.2

- Add `getItemId()` method to `ItemPublicTokenExchangeResponse` ([#82](https://github.com/plaid/plaid-java/pull/82))
- Add `incomeGet` to support [Income](https://plaid.com/docs/api#income) (fixed [#79](https://github.com/plaid/plaid-java/issues/79))
- Make `TransactionsGetResponse` inner classes static (fixed [#81](https://github.com/plaid/plaid-java/issues/72))

# 2.1.1

- Add `phone_numbers` to Identity responses (fixed [#72](https://github.com/plaid/plaid-java/issues/72))
- Add `account_owner` to Transaction (fixed [#76](https://github.com/plaid/plaid-java/issues/76))

# 2.1.0

- Initial release for [Plaid's updated API](https://blog.plaid.com/improving-our-api)

[sandbox-item-fire-webhook]: https://plaid.com/docs/#firing-webhooks
