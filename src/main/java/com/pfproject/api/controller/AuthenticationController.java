package com.pfproject.api.controller;

import com.pfproject.api.model.ResponseWithToken;
import com.pfproject.api.dto.LoginDTO;
import com.pfproject.api.model.User;

import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final TokenService tokenService;

    @Autowired
    public AuthenticationController(final TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> authenticate(@RequestBody final LoginDTO dto) {
        final ResponseWithToken res = tokenService.getToken(dto.getUsername(), dto.getPassword());
        if (res.getToken() != null) {
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else {
            final MessageDTO response = new MessageDTO();
            response.setMessage("Authentication failed");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
