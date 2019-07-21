package com.pfproject.api.controller.Logistic;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.ArticleDTO;
import com.pfproject.api.service.ArticleService.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.pfproject.api.model.Article;

import org.apache.log4j.Logger;

@RestController
@RequestMapping(value = "/api/logistic/article")

public class ArticleController {

    private final ArticleService service;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(CategorieController.class.getName());

    @Autowired
    public ArticleController(final ArticleService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final ArticleDTO dto) {

        Article article = service.create(converterFacade.convertArticle(dto));

        return new ResponseEntity<>(article, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<Article> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    // @Secured("ROLE_ADMIN")
    // @RequestMapping(value = "/find/{designation}", method = RequestMethod.GET)
    // public ResponseEntity<?> findByDesignation(@PathVariable final String
    // designation) {
    // Article article = service.findByDesignation(designation);

    // return new ResponseEntity<>(article, HttpStatus.OK);
    // }

    // // search route fonctional
    // // @RequestMapping(value = "/find/{username}", method = RequestMethod.GET)
    // // public ResponseEntity<?> findByUsername(@PathVariable final String
    // username)
    // // {
    // // return new ResponseEntity<>(service.findByUsername(username),
    // HttpStatus.OK);
    // // }
    // @Secured("ROLE_ADMIN")
    // @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    // public ResponseEntity<?> update(@PathVariable final String id, @RequestBody
    // final UserDTO dto) {
    // User user = service.find(id);
    // user.setUsername(dto.getUsername());
    // user.setFirstLogin(true);
    // user.setPassword(dto.getPassword());
    // user.setAuthority(dto.getAuthority());
    // service.update(id, user);

    // final MessageDTO response = new MessageDTO();
    // response.setMessage("Mot de passe est changé avec succes");

    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

    // @RequestMapping(value = "/passwordReset/{id}", method = RequestMethod.POST)
    // public ResponseEntity<?> passwordReset(@PathVariable final String id,
    // @RequestBody final UserDTO dto) {
    // User user = service.find(id);

    // user.setFirstLogin(false);
    // user.setPassword(dto.getPassword());
    // service.update(id, user);

    // final MessageDTO response = new MessageDTO();
    // response.setMessage("Mot de passe est changé avec succes");
    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

    // @Secured("ROLE_ADMIN")
    // @RequestMapping(value = "/disable/{id}", method = RequestMethod.DELETE)
    // public ResponseEntity<?> delete(@PathVariable final String id) {
    // // service.delete(id);
    // final MessageDTO response = new MessageDTO();

    // User user = service.find(id);
    // boolean isEnabled = user.isEnabled();
    // if (isEnabled) {
    // response.setMessage("l'utilisateur a été bloqué");
    // user.setEnabled(false);
    // } else {
    // response.setMessage("l'utilisateur a été débloqué");
    // user.setEnabled(true);
    // }
    // service.update(id, user);

    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

}
