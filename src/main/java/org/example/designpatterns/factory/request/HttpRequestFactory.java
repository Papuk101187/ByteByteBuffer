package org.example.designpatterns.factory.request;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.net.http.HttpRequest;

public interface HttpRequestFactory {

    public HttpRequest createGetRequest(String url);
    public HttpRequest createPostRequest(String url, String object,String token) throws JsonProcessingException;

}
