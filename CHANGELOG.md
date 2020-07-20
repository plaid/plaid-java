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
