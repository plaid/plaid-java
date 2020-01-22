package com.plaid.client;

import com.plaid.client.request.*;
import com.plaid.client.response.*;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PlaidApiService {

  // item, link, and credentials calls
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/item/get")
  Call<ItemGetResponse> itemGet(@Body ItemGetRequest request);

  @POST("/item/public_token/exchange")
  Call<ItemPublicTokenExchangeResponse> itemPublicTokenExchange(@Body ItemPublicTokenExchangeRequest request);

  @POST("/item/public_token/create")
  Call<ItemPublicTokenCreateResponse> itemPublicTokenCreate(@Body ItemPublicTokenCreateRequest request);

  @POST("/processor/stripe/bank_account_token/create")
  Call<ItemStripeTokenCreateResponse> itemStripeTokenCreate(@Body ItemStripeTokenCreateRequest request);

  @POST("/processor/apex/processor_token/create")
  Call<ItemApexProcessorTokenCreateResponse> itemApexProcessorTokenCreate(@Body ItemApexProcessorTokenCreateRequest request);

  @POST("/processor/dwolla/processor_token/create")
  Call<ItemDwollaProcessorTokenCreateResponse> itemDwollaProcessorTokenCreate(@Body ItemDwollaProcessorTokenCreateRequest request);

  @POST("/item/access_token/invalidate")
  Call<ItemAccessTokenInvalidateResponse> itemAccessTokenInvalidate(@Body ItemAccessTokenInvalidateRequest request);

  @POST("/item/remove")
  Call<ItemRemoveResponse> itemRemove(@Body ItemRemoveRequest request);

  @POST("/item/webhook/update")
  Call<ItemWebhookUpdateResponse> itemWebhookUpdate(@Body ItemWebhookUpdateRequest request);

  // sandbox-only endpoints
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/sandbox/item/fire_webhook")
  Call<SandboxItemFireWebhookResponse> sandboxItemFireWebhook(@Body SandboxItemFireWebhookRequest request);

  @POST("/sandbox/item/reset_login")
  Call<SandboxItemResetLoginResponse> sandboxItemResetLogin(@Body SandboxItemResetLoginRequest request);

  @POST("/sandbox/public_token/create")
  Call<SandboxPublicTokenCreateResponse> sandboxPublicTokenCreate(@Body SandboxPublicTokenCreateRequest request);

  // products
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/accounts/get")
  Call<AccountsGetResponse> accountsGet(@Body AccountsGetRequest request);

  @POST("/accounts/balance/get")
  Call<AccountsBalanceGetResponse> accountsBalanceGet(@Body AccountsBalanceGetRequest request);

  @POST("/asset_report/create")
  Call<AssetReportCreateResponse> assetReportCreate(@Body AssetReportCreateRequest request);

  @POST("/asset_report/get")
  Call<AssetReportGetResponse> assetReportGet(@Body AssetReportGetRequest request);

  // This returns raw bytes so we don't have a wrapper class
  @POST("/asset_report/pdf/get")
  Call<ResponseBody> assetReportPdfGet(@Body AssetReportPdfGetRequest request);

  @POST("/asset_report/remove")
  Call<AssetReportRemoveResponse> assetReportRemove(@Body AssetReportRemoveRequest request);

  @POST("/asset_report/audit_copy/create")
  Call<AssetReportAuditCopyCreateResponse> assetReportAuditCopyCreate(@Body AssetReportAuditCopyCreateRequest request);

  @POST("/asset_report/audit_copy/remove")
  Call<AssetReportAuditCopyRemoveResponse> assetReportAuditCopyRemove(@Body AssetReportAuditCopyRemoveRequest request);

  @POST("/asset_report/audit_copy/get")
  Call<AssetReportGetResponse> assetReportAuditCopyGet(@Body AssetReportAuditCopyGetRequest request);

  @POST("/asset_report/refresh")
  Call<AssetReportCreateResponse> assetReportRefresh(@Body AssetReportRefreshRequest assetReportRefreshRequest);

  @POST("/asset_report/filter")
  Call<AssetReportCreateResponse> assetReportFilter(@Body AssetReportFilterRequest assetReportFilterRequest);

  @POST("/auth/get")
  Call<AuthGetResponse> authGet(@Body AuthGetRequest request);

  @POST("/identity/get")
  Call<IdentityGetResponse> identityGet(@Body IdentityGetRequest request);

  @POST("/income/get")
  Call<IncomeGetResponse> incomeGet(@Body IncomeGetRequest request);

  @POST("/investments/holdings/get")
  Call<InvestmentsHoldingsGetResponse> investmentsHoldingsGet(@Body InvestmentsHoldingsGetRequest request);

  @POST("/investments/transactions/get")
  Call<InvestmentsTransactionsGetResponse> investmentsTransactionsGet(@Body InvestmentsTransactionsGetRequest request);

  @POST("/transactions/get")
  Call<TransactionsGetResponse> transactionsGet(@Body TransactionsGetRequest request);

  @POST("/liabilities/get")
  Call<LiabilitiesGetResponse> liabilitiesGet(@Body LiabilitiesGetRequest request);

  @POST("/payment_initiation/recipient/create")
  Call<RecipientCreateResponse> recipientCreate(@Body RecipientCreateRequest request);

  @POST("/payment_initiation/recipient/get")
  Call<RecipientGetResponse> recipientGet(@Body RecipientGetRequest request);

  @POST("/payment_initiation/recipient/list")
  Call<RecipientListResponse> recipientList(@Body RecipientListRequest request);

  @POST("/payment_initiation/payment/create")
  Call<PaymentCreateResponse> paymentCreate(@Body PaymentCreateRequest request);

  @POST("/payment_initiation/payment/token/create")
  Call<PaymentTokenCreateResponse> paymentTokenCreate(@Body PaymentTokenCreateRequest request);

  @POST("/payment_initiation/payment/get")
  Call<PaymentGetResponse> paymentGet(@Body PaymentGetRequest request);

  @POST("/payment_initiation/payment/list")
  Call<PaymentListResponse> paymentList(@Body PaymentListRequest request);

  @POST("/credit_details/get")
  Call<CreditDetailsGetResponse> creditDetailsGet(@Body CreditDetailsGetRequest request);

  @POST("/categories/get")
  Call<CategoriesGetResponse> categoriesGet(@Body CategoriesGetRequest request);

  // institutions
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/institutions/get")
  Call<InstitutionsGetResponse> institutionsGet(@Body InstitutionsGetRequest request);

  @POST("/institutions/get_by_id")
  Call<InstitutionsGetByIdResponse> institutionsGetById(@Body InstitutionsGetByIdRequest request);

  @POST("/institutions/search")
  Call<InstitutionsSearchResponse> institutionsSearch(@Body InstitutionsSearchRequest request);

  // webhooks
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  @POST("/webhook_verification_key/get")
  Call<WebhookVerificationKeyGetResponse> getWebhookVerificationKey(@Body WebhookVerificationKeyGetRequest request);
}
