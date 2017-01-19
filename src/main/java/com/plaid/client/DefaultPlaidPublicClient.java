package com.plaid.client;

import com.plaid.client.exception.PlaidClientsideException;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.http.HttpResponseWrapper;
import com.plaid.client.http.PlaidHttpRequest;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.Category;
import com.plaid.client.response.Institution;
import com.plaid.client.response.PopularInstitutionsResponse;
import com.plaid.client.response.InstitutionsResponse;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DefaultPlaidPublicClient implements PlaidPublicClient {

    private HttpDelegate httpDelegate;

    private String clientId;
    private String secret;

    @Override
    public Object getEntity(String entityId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Institution getInstitution(String institutionId) {
        PlaidHttpRequest request = new PlaidHttpRequest("/institutions/" + institutionId);
        HttpResponseWrapper<Institution> response = httpDelegate.doGet(request, Institution.class);
        return response.getResponseBody();
    }

    @Override
    public PopularInstitutionsResponse getPopularInstitutions() {
        PlaidHttpRequest request = new PlaidHttpRequest("/institutions");
        HttpResponseWrapper<Institution[]> response = httpDelegate.doGet(request, Institution[].class);
        return new PopularInstitutionsResponse(response.getResponseBody());
    }

    @Override
    public InstitutionsResponse getAllInstitutions(Integer offset, Integer count, String[] products) {
        PlaidHttpRequest request = new PlaidHttpRequest("/institutions/all");

        if(StringUtils.isEmpty(clientId) || StringUtils.isEmpty(secret)) {
            throw new PlaidClientsideException("ClientId and Secret is required");
        }

        request.addParameter("client_id", clientId);
        request.addParameter("secret", secret);

        if(count != null) {
            request.addParameter("count", count.toString());
        }

        if(offset != null) {
            request.addParameter("offset", offset.toString());
        }

        if(products != null && products.length > 0) {
            List<String> productList = new ArrayList<>(products.length);
            for(String product : productList) {
                productList.add("\""+product+"\"");
            }
            request.addParameter("products", "["+StringUtils.join(productList, ",")+"]");
        }

        HttpResponseWrapper<InstitutionsResponse> response = httpDelegate.doPost(request, InstitutionsResponse.class);
        return response.getResponseBody();
    }

    @Override
    public CategoriesResponse getAllCategories() {
        PlaidHttpRequest request = new PlaidHttpRequest("/categories");
        HttpResponseWrapper<Category[]> response = httpDelegate.doGet(request, Category[].class);
        return new CategoriesResponse(response.getResponseBody());
    }

    @Override
    public Object getCategory(String categoryId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Object getCategoriesByMapping(String mapping, MappingOptions options) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public HttpDelegate getHttpDelegate() {
    	return httpDelegate;
    }

    public static class Builder {

        private String clientId;
        private String secret;
        private HttpDelegate httpDelegate;

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder withSecret(String secret) {
            this.secret = secret;
            return this;
        }

        public Builder withHttpDelegate(HttpDelegate httpDelegate) {
            this.httpDelegate = httpDelegate;
            return this;
        }

        public DefaultPlaidPublicClient build() {

            DefaultPlaidPublicClient client = new DefaultPlaidPublicClient();
            client.clientId = this.clientId;
            client.secret = this.secret;
            client.httpDelegate = this.httpDelegate;

            return client;
        }

    }

}
