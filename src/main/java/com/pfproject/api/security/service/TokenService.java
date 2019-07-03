package com.pfproject.api.security.service;


public interface TokenService {

    String getToken(String username, String password);
}
