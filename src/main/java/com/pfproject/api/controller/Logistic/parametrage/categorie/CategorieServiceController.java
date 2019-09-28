package com.pfproject.api.controller.Logistic.parametrage.categorie;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.logistic.parametrage.categorie.CategorieServiceDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.model.logistic.parametrage.categorie.CategorieService;
import com.pfproject.api.service.logistic.parametrage.categorie.CategorieServiceService.CategorieServiceService;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/logistic/categorie/service")

public class CategorieServiceController {

    private final CategorieServiceService service;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(CategorieArticleController.class.getName());

    @Autowired
    public CategorieServiceController(final CategorieServiceService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CategorieServiceDTO dto, final Authentication auth) {

        User user = (User) auth.getDetails();
        dto.setCreatedBy(user.getId());

        CategorieService categorie = service.create(converterFacade.convertCategorieService(dto));

        return new ResponseEntity<>(categorie, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<CategorieService> liste = service.findAll();
        ArrayList<String> response = new ArrayList<String>();
        for (CategorieService categorie : liste) {

            response.add(categorie.getDesignation());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        CategorieService categorie = service.findByDesignation(designation);

        return new ResponseEntity<>(categorie, HttpStatus.OK);
    }

}
