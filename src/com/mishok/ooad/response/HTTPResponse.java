package com.mishok.ooad.response;

/**
 * This is dummy implementation of response.
 * You can use framework-based response or write your own.
 */
public class HTTPResponse {
    public HTTPResponse(String response) {
        this.response = response;
    }

    String response;

    public String getResponse() {
        return response;
    }
}
