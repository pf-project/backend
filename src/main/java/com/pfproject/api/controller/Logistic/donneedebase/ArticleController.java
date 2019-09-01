package com.pfproject.api.controller.Logistic.donneedebase;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.donneedebase.ArticleDTO;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.service.donneedebase.ArticleService.ArticleService;
import com.pfproject.api.service.parametrage.categorie.CategorieArticleService.CategorieArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.pfproject.api.model.donneedebase.Article;
import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;

@RestController
@RequestMapping(value = "/api/logistic/article")

public class ArticleController {

    private final ArticleService service;
    private final CategorieArticleService C_service;
    private final ConverterFacade converterFacade;

    @Autowired
    public ArticleController(final ArticleService service, final CategorieArticleService C_service,
            final ConverterFacade converterFacade) {
        this.service = service;
        this.C_service = C_service;
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

        List<Article> response = new ArrayList<Article>();
        for (Article article : liste) {
            if (!article.isArchived()) {
                response.add(article);
            }
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByDesignation/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        Article article = service.findByDesignation(designation);
        CategorieArticle categorie = C_service.findByDesignation(article.getCategorie());
        Map<String, Object> map = new HashMap<String, Object>();
        if (!article.isArchived())
            map.put("article", article);
        map.put("categorie", categorie);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByCode/{code}", method = RequestMethod.GET)
    public ResponseEntity<?> findByCode(@PathVariable final String code) {
        Article article = service.findByCode(code);
        Map<String, Object> map = new HashMap<String, Object>();
        if (!article.isArchived())
            map.put("article", article);
        CategorieArticle categorie = C_service.findByDesignation(article.getCategorie());
        map.put("categorie", categorie);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/getCodesAndDesignations", method = RequestMethod.GET)
    public ResponseEntity<?> getCodesAndDesignations() {
        List<Article> liste = service.findAll();

        List<String> designations = new ArrayList<String>();
        for (Article article : liste) {
            if (!article.isArchived())
                designations.add(article.getDesignation());
        }

        List<String> codes = new ArrayList<String>();
        for (Article article : liste) {
            if (!article.isArchived())
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
        message.setMessage("Article a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String code, @RequestBody final ArticleDTO dto) {

        Article article = service.update(code, converterFacade.convertArticle(dto));

        return new ResponseEntity<>(article, HttpStatus.OK);
    }

}
