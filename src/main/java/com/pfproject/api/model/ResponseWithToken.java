package com.pfproject.api.model;

public class ResponseWithToken extends Response {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
