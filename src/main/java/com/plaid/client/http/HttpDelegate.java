package com.plaid.client.http;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface HttpDelegate {

    <T> HttpResponseWrapper<T> doPost(PlaidHttpRequest request, Class<T> clazz);
    
    <T> HttpResponseWrapper<T> doGet(PlaidHttpRequest request, Class<T> clazz);

    <T> HttpResponseWrapper<T> doPatch(PlaidHttpRequest request, Class<T> clazz);

    <T> HttpResponseWrapper<T> doDelete(PlaidHttpRequest request, Class<T> clazz);

    void setObjectMapper(ObjectMapper mapper);
}
