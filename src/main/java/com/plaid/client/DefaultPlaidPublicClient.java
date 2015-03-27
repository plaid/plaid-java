package com.plaid.client;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.http.HttpResponseWrapper;
import com.plaid.client.http.PlaidHttpRequest;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.Category;
import com.plaid.client.response.Institution;
import com.plaid.client.response.InstitutionsResponse;

public class DefaultPlaidPublicClient implements PlaidPublicClient {

    private ObjectMapper jsonMapper;
    private HttpDelegate httpDelegate;
    
    private DefaultPlaidPublicClient() {
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.setSerializationInclusion(Include.NON_NULL);
        this.jsonMapper = jsonMapper;
    }
    
    @Override
    public Object getEntity(String entityId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Object getInstitution(String institutionId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public InstitutionsResponse getAllInstitutions() {
        PlaidHttpRequest request = new PlaidHttpRequest("/institutions");
        HttpResponseWrapper<Institution[]> response = httpDelegate.doGet(request, Institution[].class);
        return new InstitutionsResponse(response.getResponseBody());
    }

    @Override
    public CategoriesResponse getAllCategories() {
        PlaidHttpRequest request = new PlaidHttpRequest("/category");
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
        private HttpDelegate httpDelegate;

        public Builder withHttpDelegate(HttpDelegate httpDelegate) {
            this.httpDelegate = httpDelegate;
            return this;
        }

        public DefaultPlaidPublicClient build() {
            DefaultPlaidPublicClient client = new DefaultPlaidPublicClient();
            client.httpDelegate = this.httpDelegate;

            return client;
        }
    }

}
