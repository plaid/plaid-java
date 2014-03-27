package com.plaid.client.http;


public interface HttpDelegate {    

    <T> HttpResponseWrapper<T> doPost(PlaidHttpRequest request, Class<T> clazz);
    
    <T> HttpResponseWrapper<T> doGet(PlaidHttpRequest request, Class<T> clazz);

    <T> HttpResponseWrapper<T> doPatch(PlaidHttpRequest request, Class<T> clazz);

    <T> HttpResponseWrapper<T> doDelete(PlaidHttpRequest request, Class<T> clazz);
    
}
