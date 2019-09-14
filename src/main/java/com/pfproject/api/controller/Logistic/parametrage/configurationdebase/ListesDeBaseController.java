package com.pfproject.api.controller.Logistic.parametrage.configurationdebase;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Ville;
import com.pfproject.api.service.parametrage.configurationdebase.listesdebase.ListesDeBaseService;

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
@RequestMapping(value = "/api/logistic/configurationdebase/listesdebase")

public class ListesDeBaseController {

    private final ListesDeBaseService service;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(ListesDeBaseController.class.getName());

    @Autowired
    public ListesDeBaseController(final ListesDeBaseService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final ListesDeBaseDTO dto) {
        ListesDeBase listesDeBaseConverted = converterFacade.convertListesDeBase(dto);
        ListesDeBase listesDeBase = service.create(listesDeBaseConverted);
        return new ResponseEntity<>(listesDeBase, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<ListesDeBase> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }
    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find/villes", method = RequestMethod.GET)
    public ResponseEntity<?> findVilles() {
        List<Ville>  liste = service.findVilles();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }


    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final ListesDeBaseDTO dto) {

        ListesDeBase listesDeBase = service.update(id, converterFacade.convertListesDeBase(dto));

        return new ResponseEntity<>(listesDeBase, HttpStatus.OK);
    }

}
