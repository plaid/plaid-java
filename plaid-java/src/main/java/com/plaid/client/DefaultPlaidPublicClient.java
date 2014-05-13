package com.plaid.client;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.plaid.client.http.HttpDelegate;
import com.plaid.client.http.HttpResponseWrapper;
import com.plaid.client.http.PlaidHttpRequest;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.Category;

public class DefaultPlaidPublicClient implements PlaidPublicClient {

    private ObjectMapper jsonMapper;
    private HttpDelegate httpDelegate;
    
    public DefaultPlaidPublicClient(HttpDelegate httpDelegate) {
        this.httpDelegate = httpDelegate;
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
    public Object getAllInstitutions() {
        throw new UnsupportedOperationException("Not implemented yet");
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

}
