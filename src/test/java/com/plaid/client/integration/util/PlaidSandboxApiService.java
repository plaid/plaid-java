package com.plaid.client.integration.util;

import com.plaid.client.request.common.BaseAccessTokenRequest;
import com.plaid.client.request.common.BasePublicRequest;
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


  class LinkItemCreateRequest extends BasePublicRequest {
    private final Map<String, String> credentials;
    private final List<Product> initialProducts;
    private final String institutionId;

    public LinkItemCreateRequest(Map<String, String> credentials, List<Product> initialProducts, String institutionId) {
      this.credentials = credentials;
      this.initialProducts = initialProducts;
      this.institutionId = institutionId;
    }
  }

  // link endpoints
  // not intended to be part of the server-side API
  // implemented here for ease of testing flows involving link
  class LinkItemCreateResponse extends BaseResponse {
    private List<Account> accounts;
    private String publicToken;

    public List<Account> getAccounts() {
      return accounts;
    }

    public String getPublicToken() {
      return publicToken;
    }
  }

  @POST("/link/item/create")
  Call<LinkItemCreateResponse> linkItemCreate(@Body LinkItemCreateRequest request);
}
