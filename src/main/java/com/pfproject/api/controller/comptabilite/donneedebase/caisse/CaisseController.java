package com.pfproject.api.controller.comptabilite.donneedebase.caisse;


import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.dto.comptabiite.donnedebase.caisse.CaisseDTO;
import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.service.comptaibilite.donneedebase.caisse.CaisseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/comptabilite/donneedebase/caisse")

public class CaisseController {

    private final CaisseService service;
    private final ConverterFacade converterFacade;



    @Autowired
    public CaisseController(final CaisseService service,final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CaisseDTO dto) {

        Caisse caisse = service.create(converterFacade.convertCaisse(dto));

        return new ResponseEntity<>(caisse, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {



        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }





    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/archive/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String code) {
        Caisse caisse = service.findByCode(code);

        caisse.setArchived(true);

        service.update(code, caisse);
        MessageDTO message = new MessageDTO();
        message.setMessage("Article a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String code, @RequestBody final CaisseDTO dto) {

        Caisse caisse = service.update(code, converterFacade.convertCaisse(dto));

        return new ResponseEntity<>(caisse, HttpStatus.OK);
    }

}
