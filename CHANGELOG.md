See full changelog for the OpenAPI schema (OAS) [here](https://github.com/plaid/plaid-openapi/blob/master/CHANGELOG.md).

# 10.2.0
- Updating to OAS 2020-09-14_1.78.2
- Java library 10.1.0 was erroneously released as a `minor` version; 10.1.0 changes will be re-released as a `major` version shortly.

# 10.1.0
- Updating to OAS 2020-09-14_1.77.1

## OpenAPI Schema Changes
### 2020-09-14_1.77.1
- Fix extraneous field in enum that caused issue in code generation
- Added `asset_report_id` to the example for `/asset_report/relay/refresh`

### 2020-09-14_1.77.0
- Explicitly set `format: double` for non-integer numbers so generated fields prefer float64

### 2020-09-14_1.76.0
- Add three new endpoints for Assets: `/asset_report/relay/create`, `/asset_report/relay/get`, and `/asset_report/relay/rmeove`

### 2020-09-14_1.75.0
- Added `/asset_report/relay/refresh` endpoint

### 2020-09-14_1.74.0
- Add `recurring_transactions` to list of products

### 2020-09-14_1.73.0
- Add new endpoint for `/credit/bank_income/get`

### 2020-09-14_1.72.0
- Updated documentation URLs for all product endpoints. They can now be found
at `/docs/api/products/<product-name>/#endpoint` instead of `/docs/api/products/#endpoint`

### 2020-09-14_1.71.0
- internal changes

### 2020-09-14_1.70.0
- Remove deprecated `income_verification_id` from `/sandbox/income/fire_webhook`

### 2020-09-14_1.69.1
- Reorder processors enum

### 2020-09-14_1.69.0
- Added `/beta/transactions/v1/enhance` endpoint

### 2020-09-14_1.68.1
- Added `status` object to sample responses for `/institutions/get` and `institutions/search` endpoints

### 2020-09-14_1.68.0
- Mark `include_personal_finance_category_beta` property as deprecated.
- Add new argument `include_personal_finance_category` to TransactionsGetRequestOptions.
- Update docs for `/transactions/get` request and response, referencing personal_finance_category taxonomy csv file.

### 2020-09-14_1.67.1
- internal changes

### 2020-09-14_1.67.0
- Removed unused `/income/verification/summary/get` endpoint

### 2020-09-14_1.66.0
- Added Payment Consent endpoints

### 2020-09-14_1.65.0
- Removed unused `/income/verification/paystub/get` endpoint

### 2020-09-14_1.64.15
- De-anonymized enums:
  - `PaymentInitiationPaymentReverseResponse.properties.status` => `PaymentInitiationRefundStatus`
  - `PaymentInitiationPaymentCreateResponse.properties.status` => `PaymentInitiationPaymentCreateStatus`
  - `PaymentInitiationRefund.properties.status` => `PaymentInitiationRefundStatus`
  - `PaymentAmount.properties.currency` => `PaymentAmountCurrency`
  - `InvestmentTransaction.properties.type` => `InvestmentTransactionType`
  - `InvestmentTransaction.properties.subtype` => `InvestmentTransactionSubtype`
  - `TransferAuthorizationDecisionRationale.properties.code` => `TransferAuthorizationDecisionRationaleCode`
  - `TransferAuthorizationGuaranteeDecisionRationale.properties.code` => `TransferAuthorizationGuaranteeDecisionRationaleCode`
  - `TransferAuthorization.properties.decision` => `TransferAuthorizationDecision`
  - `TransferEventListRequest.properties.transfer_type` => `TransferEventListTransferType`
  - `BankTransferEventListRequest.properties.bank_transfer_type` => `BankTransferEventListBankTransferType`
  - `BankTransferEventListRequest.properties.direction` => `BankTransferEventListDirection`
  - `TransferIntentCreate.properties.status` => `TransferIntentStatus`
  - `TransferIntentGet.properties.status` => `TransferIntentStatus`
  - `TransferIntentGet.properties.authorization_decision` => `TransferIntentAuthorizationDecision`
- `IncomeVerificationPrecheckMilitaryInfo.properties.branch` is now a string field (previously enum)

### 2020-09-14_1.64.15
- Made `last_statement_balance` and `minimum_payment_amount` `nullable` for credit card liabilities schema to reflect existing API behavior.

### 2020-09-14_1.64.14
- Made `last_payment_amount` and `last_statement_issue_date` `nullable` for credit card liabilities schema to reflect existing API behavior.
- Fix transfers examples to reflect more consistent usage of `region` field.

# 10.0.0
- Updating to OAS 2020-09-14_1.64.13

## Breaking changes
- Split `AccountSubtype` enums and objects into per-endpoint ones to more accurately represent allowed values.
  - `DepositoryFilter`'s account subtypes uses `DepositoryAccountSubtypes`
  - `CreditFilter`'s account subtypes uses `CreditAccountSubtypes`
  - `LoanFilter`'s account subtypes uses `LoanAccountSubtypes`
  - `InvestmentFilter`'s account subtypes uses `InvestmentAccountSubtypes`

## OpenAPI Schema Changes
### 2020-09-14_1.64.13
- Deprecate `idempotency_key` parameter in transfer/create

### 2020-09-14_1.64.12
- Removed the unused `required_product_access` and `optional_product_access` parameters from `RequestedScopes`

### 2020-09-14_1.64.11
- Fix some examples that were not consistent with their schemas
- Add `adjustments` as an investments transaction type to make OpenAPI file consistent with values returned by the API
- Clarify description field for `marital_status` to reflect possible values

### 2020-09-14_1.64.10
- Updated the external docs URL for Bank Transfers sandbox endpoints

### 2020-09-14_1.64.9
- De-anonymized the object filters under `LinkTokenCreateRequestAccountSubtypes`, as anonymous objects aren't compatible with the generated CLibs.
- De-anonymized some misc. objects
  - `PaymentInitiationMetadata/properties/maximum_payment_amount`
  - `PaystubOverride/properties/employer`
  - `PaystubOverride/properties/employee`
  - `PaystubOverride/properties/employee/properties/address`
  - `LiabilitiesDefaultUpdateWebhook/properties/account_ids_with_updated_liabilities`

### 2020-09-14_1.64.8
- Updated the description of the historical_balances array

### 2020-09-14_1.64.7
- Add new possible enums for income verification earnings breakdown canonical description

### 2020-09-14_1.64.6
- Hid a few product enum values that are deprecated or no longer valid for certain request fields. This affects the documentation only.

### 2020-09-14_1.64.5
- Make guarantee fields required in Transfer endpoints

### 2020-09-14_1.64.4
- Updated description for `failure_reason` field in Transfer endpoints

### 2020-09-14_1.64.3
- Make `repayment_id` required in `/transfer/repayment/return/list` endpoint

### 2020-09-14_1.64.2
- Update description for legal name field in `BankTransferUser` 

### 2020-09-14_1.64.1
- Update descriptions for `/transfer/repayment/list` and `/transfer/repayment/return/list` endpoints

### 2020-09-14_1.64.0
- Remove `scheme_automatic_downgrade` from `/payment_initiation/payment/create`

### 2020-09-14_1.63.1
- Update description for `/sandbox/transfer/sweep/simulate` endpoint

### 2020-09-14_1.63.0
- Refactor account subtype enums for greater specificity. This has no changes to the API but is a major semver change for Python, Node, Go, and Java client library interfaces to the AccountSubtype object within account filtering contexts in `/link/token/create`. The `AccountSubtype` namespace in this context is now prefixed with the AccountType. (Example for Node: Old: `AccountSubtype.checking` New: `DepositoryAccountSubtype.checking`)

### 2020-09-14_1.62.7
- Update description for `datetime` and `authorized_datetime` fields in Transactions endpoints

### 2020-09-14_1.62.6
- Make `sweep_id` / `sweep_amount` fields on Transfer Event nullable

### 2020-09-14_1.62.6
- Set `institution_status` to be nullable in `InstitutionsGetResponse`

### 2020-09-14_1.62.5
- Update external docs URLs for Transfer and Bank Transfer endpoints
- Update description for `ach_return_code` field in Transfer endpoints

### 2020-09-14_1.62.4
- Add `join_date` to `/application/get` and `/item/application/list`
- Remove `created_at` from `/application/get`

### 2020-09-14_1.62.3
- Updated various description fields for Income

### 2020-09-14_1.62.2
- Add `employment` as an available product in Product array.

### 2020-09-14_1.62.1
- Add `minItems` and `minLength` validation to various fields in `/institution/*` request schemas

### 2020-09-14_1.62.0
- Add guarantee_decision and guarantee_decision rationale fields to the transfer API
- Add repayment-related resources to the transfer API

### 2020-09-14_1.61.7
- Remove `receiver_pending` and `receiver_posted` from bank transfer event types.
- Remove `BankTransferReceiverDetails` from bank transfer event types.

### 2020-09-14_1.61.6
- Update description formatting for `sweep` and `amount` fields for sweep endpoints

### 2020-09-14_1.61.5
- Added `NEW_ACCOUNTS_AVAILABLE` webhook code as valid input to `/sandbox/item/fire_webhook`
- Update description for `/sandbox/item/fire_webhook`

### 2020-09-14_1.61.4
- Set the `minimum` for the `count` and `offset` fields in `InstitutionsGetRequest`
- Set `products`, `routing_numbers`, and `oauth` fields to be nullable in `InstitutionsGetRequestOptions`
- Set `products` to be nullable in `InstitutionsSearchRequest`
- Set `oauth`, `include_auth_metadata`, and `include_payment_initiation_metadata` fields to be nullable in `InstitutionsSearchRequestOptions`
- Set `payment_id` field to be nullable in `InstitutionsSearchPaymentInitiationOptions`

### 2020-09-14_1.61.3
- Adds `DOCUMENT_TYPE_NONE` enum value for document metadata

### 2020-09-14_1.61.2
- Relax length restrictions on the `currency` field in the `Pay` schema

### 2020-09-14_1.61.1
- Use new payment statuses in `PaymentStatusUpdateWebhook`

# 9.11.0
- Updating to OAS 2020-09-14_1.61.0

# 9.10.0
- Updating to OAS 2020-09-14_1.58.1

# 9.9.0
- Updating to OAS 2020-09-14_1.54.2

# 9.8.0
- Updating to OAS 2020-09-14_1.46.1

# 9.7.0
- Updating to OAS 2020-09-14_1.44.0

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

# 8.5.0
- Add deposit switch support for `/link/token/create`

# 8.4.0
- Add support for `options` to `/payment_initiation/payment/create`

# 8.3.0
- Add `last_updated_datetime` to `/accounts/balance/get`

# 8.2.0
- Add mortgage object to Liabilities
- Add Standing Orders support to Payment Initiation

# 8.1.0
- Add [Bank Transfers](https://plaid.com/docs/bank-transfers/) endpoints to the library

# 8.0.0

- The library has been pinned to the '2020-09-14' API release. Visit the [docs](https://plaid.com/docs/api/versioning/) to see what changed.
- the `/item/public_token/create` endpoint has been disabled in favor of the /link/token/create
    endpoint
- The `/item/add_token/create endpoint` has been disabled in favor of the /link/token/create
- The `/payment_initiation/payment/token/create` endpoint has been disabled in favor of the /link/token/create
    endpoint
- The `/item/remove` endpoint will no longer return a `removed` boolean.
- The `/institutions/get`, `/institutions/get_by_id`, and `/institutions/search` now require
    `country_codes` to be passed in.

# 7.1.0

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
