package org.example.designpatterns.factory.response;

import lombok.Data;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Data
public class JsonHttpResponce implements HttpResponseFactory {



    @Override
    public HttpResponse createResponse(HttpRequest httpRequest,HttpClient httpClient) throws IOException, InterruptedException {
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }


}
