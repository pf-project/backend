package com.pfproject.api.controller.Logistic.parametrage.categorie;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import com.pfproject.api.service.parametrage.categorie.CategorieArticleService.CategorieArticleService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/logistic/categorie/article")

public class CategorieArticleController {

    private final CategorieArticleService service;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(CategorieArticleController.class.getName());

    @Autowired
    public CategorieArticleController(final CategorieArticleService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CategorieArticleDTO dto) {

        CategorieArticle categorie = service.create(converterFacade.convertCategorieArticle(dto));

        return new ResponseEntity<>(categorie, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<CategorieArticle> liste = service.findAll();
        ArrayList<String> response = new ArrayList<String>();
        for (CategorieArticle categorie : liste) {

            response.add(categorie.getDesignation());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        CategorieArticle categorie = service.findByDesignation(designation);

        return new ResponseEntity<>(categorie, HttpStatus.OK);
    }

}
