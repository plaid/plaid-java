package com.plaid.client.http;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

public interface WireLogger {

	void logRequestResponsePair(HttpRequestBase request, CloseableHttpResponse response);
	
}
