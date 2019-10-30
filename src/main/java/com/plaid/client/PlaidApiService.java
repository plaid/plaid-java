package com.plaid.client;

import com.plaid.client.request.AccountsBalanceGetRequest;
import com.plaid.client.request.AccountsGetRequest;
import com.plaid.client.request.AssetReportAuditCopyCreateRequest;
import com.plaid.client.request.AssetReportAuditCopyGetRequest;
import com.plaid.client.request.AssetReportAuditCopyRemoveRequest;
import com.plaid.client.request.AssetReportCreateRequest;
import com.plaid.client.request.AssetReportFilterRequest;
import com.plaid.client.request.AssetReportGetRequest;
import com.plaid.client.request.AssetReportPdfGetRequest;
import com.plaid.client.request.AssetReportRefreshRequest;
import com.plaid.client.request.AssetReportRemoveRequest;
import com.plaid.client.request.AuthGetRequest;
import com.plaid.client.request.CategoriesGetRequest;
import com.plaid.client.request.CreditDetailsGetRequest;
import com.plaid.client.request.IdentityGetRequest;
import com.plaid.client.request.IncomeGetRequest;
import com.plaid.client.request.InvestmentsTransactionsGetRequest;
import com.plaid.client.request.InvestmentsHoldingsGetRequest;
import com.plaid.client.request.InstitutionsGetByIdRequest;
import com.plaid.client.request.InstitutionsGetRequest;
import com.plaid.client.request.InstitutionsSearchRequest;
import com.plaid.client.request.ItemAccessTokenInvalidateRequest;
import com.plaid.client.request.ItemApexProcessorTokenCreateRequest;
import com.plaid.client.request.ItemDwollaProcessorTokenCreateRequest;
import com.plaid.client.request.ItemGetRequest;
import com.plaid.client.request.ItemPublicTokenCreateRequest;
import com.plaid.client.request.ItemPublicTokenExchangeRequest;
import com.plaid.client.request.ItemRemoveRequest;
import com.plaid.client.request.ItemStripeTokenCreateRequest;
import com.plaid.client.request.ItemWebhookUpdateRequest;
import com.plaid.client.request.LiabilitiesGetRequest;
import com.plaid.client.request.SandboxItemFireWebhookRequest;
import com.plaid.client.request.SandboxItemResetLoginRequest;
import com.plaid.client.request.SandboxPublicTokenCreateRequest;
import com.plaid.client.request.TransactionsGetRequest;
import com.plaid.client.response.AccountsBalanceGetResponse;
import com.plaid.client.response.AccountsGetResponse;
import com.plaid.client.response.AssetReportAuditCopyCreateResponse;
import com.plaid.client.response.AssetReportAuditCopyRemoveResponse;
import com.plaid.client.response.AssetReportCreateResponse;
import com.plaid.client.response.AssetReportGetResponse;
import com.plaid.client.response.AssetReportRemoveResponse;
import com.plaid.client.response.AuthGetResponse;
import com.plaid.client.response.CategoriesGetResponse;
import com.plaid.client.response.CreditDetailsGetResponse;
import com.plaid.client.response.IdentityGetResponse;
import com.plaid.client.response.IncomeGetResponse;
import com.plaid.client.response.InvestmentsTransactionsGetResponse;
import com.plaid.client.response.InvestmentsHoldingsGetResponse;
import com.plaid.client.response.InstitutionsGetByIdResponse;
import com.plaid.client.response.InstitutionsGetResponse;
import com.plaid.client.response.InstitutionsSearchResponse;
import com.plaid.client.response.ItemAccessTokenInvalidateResponse;
import com.plaid.client.response.ItemApexProcessorTokenCreateResponse;
import com.plaid.client.response.ItemDwollaProcessorTokenCreateResponse;
import com.plaid.client.response.ItemGetResponse;
import com.plaid.client.response.ItemPublicTokenCreateResponse;
import com.plaid.client.response.ItemPublicTokenExchangeResponse;
import com.plaid.client.response.ItemRemoveResponse;
import com.plaid.client.response.ItemStripeTokenCreateResponse;
import com.plaid.client.response.ItemWebhookUpdateResponse;
import com.plaid.client.response.LiabilitiesGetResponse;
import com.plaid.client.response.SandboxItemFireWebhookResponse;
import com.plaid.client.response.SandboxItemResetLoginResponse;
import com.plaid.client.response.SandboxPublicTokenCreateResponse;
import com.plaid.client.response.TransactionsGetResponse;
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
}
