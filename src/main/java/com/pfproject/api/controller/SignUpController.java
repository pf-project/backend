package com.pfproject.api.controller;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.pfproject.api.model.User;
import com.pfproject.api.model.Response;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api")
public class SignUpController {

    private final UserService service;

    private final ConverterFacade converterFacade;

    @Autowired
    public SignUpController(final UserService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<?> signUp(@RequestBody final UserDTO dto) {
        return new ResponseEntity<>(service.create(converterFacade.convert(dto)), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final UserDTO dto) {
        User user = service.create(converterFacade.convert(dto));
        Response response = new Response();
        response.setAuthority(user.getAuthority());
        response.setUsername(user.getUsername());
        response.setId(user.getId());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<User> liste = service.findAll();
        ArrayList<Response> response = new ArrayList<Response>();
        for (User user : liste) {
            Response r = new Response();
            r.setAuthority(user.getAuthority());
            r.setUsername(user.getUsername());
            r.setId(user.getId());
            response.add(r);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/find/{username}", method = RequestMethod.GET)
    public ResponseEntity<?> findByUsername(@PathVariable final String username) {
        System.out.println(username);
        return new ResponseEntity<>(service.findByUsername(username), HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final UserDTO dto) {
        return new ResponseEntity<>(service.update(id, converterFacade.convert(dto)), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable final String id) {
        service.delete(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
