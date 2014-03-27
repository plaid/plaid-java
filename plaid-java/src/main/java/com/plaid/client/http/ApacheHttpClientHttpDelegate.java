package com.plaid.client.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plaid.client.exception.PlaidClientsideException;
import com.plaid.client.exception.PlaidCommunicationsException;
import com.plaid.client.exception.PlaidMfaException;
import com.plaid.client.exception.PlaidServersideException;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.MfaResponse;

public class ApacheHttpClientHttpDelegate implements HttpDelegate {

    private String baseUri;
    private CloseableHttpClient httpClient;
    private ObjectMapper jsonMapper;

    public ApacheHttpClientHttpDelegate(String baseUri, CloseableHttpClient httpClient) {
        this.baseUri = baseUri;
        this.httpClient = httpClient;
        this.jsonMapper = new ObjectMapper();
    }
    
    public static HttpDelegate createDefault(String baseUri) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        return new ApacheHttpClientHttpDelegate(baseUri, httpClient);
    }
    
    public <T> HttpResponseWrapper<T> doPost(PlaidHttpRequest request, Class<T> clazz) {

        List<NameValuePair> parameters = mapToNvps(request.getParameters());

        try {
            HttpEntity entity = new UrlEncodedFormEntity(parameters, "UTF-8");
            HttpPost post = new HttpPost(baseUri + request.getPath());
            post.setEntity(entity);
            
            addUserAgent(post);

            CloseableHttpResponse response = httpClient.execute(post);

            return handleResponse(response, clazz);

        } catch (UnsupportedEncodingException e) {
            throw new PlaidClientsideException(e);
        } catch (IOException e) {
            throw new PlaidCommunicationsException(e);
        }
    }

    @Override
    public <T> HttpResponseWrapper<T> doGet(PlaidHttpRequest request, Class<T> clazz) {
        try {
            
            List<NameValuePair> parameters = mapToNvps(request.getParameters());
            
            URI uri = new URIBuilder(baseUri)
                .setPath(request.getPath())
                .addParameters(parameters)
                .build();
            
            HttpGet get = new HttpGet(uri);
            
            addUserAgent(get);

            CloseableHttpResponse response = httpClient.execute(get);

            return handleResponse(response, clazz);

        } catch (UnsupportedEncodingException e) {
            throw new PlaidClientsideException(e);
        } catch (IOException e) {
            throw new PlaidCommunicationsException(e);
        } catch (URISyntaxException e) {
            throw new PlaidClientsideException(e);
        }
    }
    
    public <T> HttpResponseWrapper<T> doDelete(PlaidHttpRequest request, Class<T> clazz) {
        try {
            
            List<NameValuePair> parameters = mapToNvps(request.getParameters());
            
            URI uri = new URIBuilder(baseUri)
                .setPath(request.getPath())
                .addParameters(parameters)
                .build();
            
            HttpDelete get = new HttpDelete(uri);
            
            addUserAgent(get);

            CloseableHttpResponse response = httpClient.execute(get);

            return handleResponse(response, clazz);

        } catch (UnsupportedEncodingException e) {
            throw new PlaidClientsideException(e);
        } catch (IOException e) {
            throw new PlaidCommunicationsException(e);
        } catch (URISyntaxException e) {
            throw new PlaidClientsideException(e);
        }
    }
    
    @Override
    public <T> HttpResponseWrapper<T> doPatch(PlaidHttpRequest request, Class<T> clazz) {

        List<NameValuePair> parameters = mapToNvps(request.getParameters());

        try {
            HttpEntity entity = new UrlEncodedFormEntity(parameters, "UTF-8");
            HttpPatch patch = new HttpPatch(baseUri + request.getPath());
            patch.setEntity(entity);
            
            addUserAgent(patch);

            CloseableHttpResponse response = httpClient.execute(patch);

            return handleResponse(response, clazz);

        } catch (UnsupportedEncodingException e) {
            throw new PlaidClientsideException(e);
        } catch (IOException e) {
            throw new PlaidCommunicationsException(e);
        }
    }

    private <T> HttpResponseWrapper<T> handleResponse(CloseableHttpResponse response,
            Class<T> clazz) {

        try {
            int statusCode = response.getStatusLine().getStatusCode();

            if (HttpStatus.SC_OK == statusCode) {

                HttpEntity responseEntity = response.getEntity();                
                T responseBody;
                responseBody = jsonMapper.readValue(responseEntity.getContent(), clazz);
                EntityUtils.consume(responseEntity);                
                return HttpResponseWrapper.create(statusCode, responseBody);
           
            } else if (HttpStatus.SC_CREATED == statusCode) {

                HttpEntity responseEntity = response.getEntity();
                MfaResponse mfaResponse = jsonMapper.readValue(responseEntity.getContent(), MfaResponse.class);
                EntityUtils.consume(responseEntity);
                throw new PlaidMfaException(mfaResponse);
            
            } else if (statusCode >= HttpStatus.SC_BAD_REQUEST) {

                HttpEntity responseEntity = response.getEntity();
                ErrorResponse errorResponse = jsonMapper.readValue(responseEntity.getContent(), ErrorResponse.class);
                EntityUtils.consume(responseEntity);
                throw new PlaidServersideException(errorResponse);
            
            } else {
                throw new PlaidCommunicationsException("Unable to interpret Plaid response");
            }

        } catch (IllegalStateException | IOException e) {

            throw new PlaidCommunicationsException("Unable to interpret Plaid response");
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                
            }
        }

    }

    private static List<NameValuePair> mapToNvps(Map<String, String> params) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        for (Entry<String, String> entry : params.entrySet()) {
            nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return nvps;
    }

    private static void addUserAgent(HttpMessage httpMessage) {
        httpMessage.addHeader("User-Agent", "plaid-java 0.0.1-SNAPSHOT");
    }

}
