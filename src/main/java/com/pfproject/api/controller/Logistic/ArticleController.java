package com.pfproject.api.controller.Logistic;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.ArticleDTO;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.service.ArticleService.ArticleService;
import com.pfproject.api.service.CategorieService.CategorieService;
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
import com.pfproject.api.model.Categorie;
import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;

@RestController
@RequestMapping(value = "/api/logistic/article")

public class ArticleController {

    private final ArticleService service;
    private final CategorieService C_service ;
    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(CategorieController.class.getName());

    @Autowired
    public ArticleController(final ArticleService service,final CategorieService C_service, final ConverterFacade converterFacade) {
        this.service = service;
        this.C_service =  C_service ;
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

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByDesignation/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        Article article = service.findByDesignation(designation);

        Categorie categorie =  C_service.findByDesignation(article.getCategorie());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("article" ,article);
        List<Map<String, Object>>  ArticlesMetaData = categorie.getArticlesMetaData();
        map.put("articlesMetaData" , ArticlesMetaData) ;
        log.info(map);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByCode/{code}", method = RequestMethod.GET)
    public ResponseEntity<?> findByCode(@PathVariable final String code) {
        Article article = service.findByCode(code);
        Categorie categorie =  C_service.findByDesignation(article.getCategorie());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("article" ,article);
        map.put("articlesMetaData" , categorie.getArticlesMetaData()) ;


        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/getCodesAndDesignations", method = RequestMethod.GET)
    public ResponseEntity<?> getCodesAndDesignations() {
        List<Article> liste = service.findAll();

        List<String> designations = new ArrayList<String>();
        for (Article article : liste) {
            designations.add(article.getDesignation());
        }

        List<String> codes = new ArrayList<String>();
        for (Article article : liste) {
            codes.add(article.getCode());
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("codes", codes);
        map.put("designations", designations);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/archive/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String code) {
        Article article = service.findByCode(code);

        article.setArchived(true);

        service.update(code, article);
        MessageDTO message = new MessageDTO();
        message.setMessage("Article a été modifié");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String code, @RequestBody final ArticleDTO dto) {

        Article article = service.update(code, converterFacade.convertArticle(dto));

        return new ResponseEntity<>(article, HttpStatus.OK);
    }

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
