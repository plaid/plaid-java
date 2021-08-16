package com.plaid.client.integration.util;

import com.plaid.client.request.common.BaseAccessTokenRequest;
import com.plaid.client.request.common.BaseClientRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.Account;
import com.plaid.client.response.BaseResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;
import java.util.Map;

/**
 * Special endpoints only used for testing, but not actually part
 * of the Plaid server-side API.
 */
public interface PlaidSandboxApiService {
  class ItemResetLoginRequest extends BaseAccessTokenRequest {
    public ItemResetLoginRequest(String accessToken) {
      super(accessToken);
    }
  }

  class ItemResetLoginResponse extends BaseResponse {
    private Boolean resetLogin;

    public Boolean getResetLogin() {
      return resetLogin;
    }
  }

  @POST("/sandbox/item/reset_login")
  Call<ItemResetLoginResponse> itemResetLogin(@Body ItemResetLoginRequest request);
}
