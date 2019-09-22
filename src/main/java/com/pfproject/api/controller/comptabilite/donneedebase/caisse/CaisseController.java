package com.pfproject.api.controller.comptabilite.donneedebase.caisse;


import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.dto.comptabilite.donneedebase.caisse.CaisseDTO;
import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.service.comptabilite.donneedebase.caisse.CaisseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
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
    @RequestMapping(value = "/archive/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String id) {
        Caisse caisse = service.find(id);

        caisse.setArchived(true);

        service.update(id, caisse);
        MessageDTO message = new MessageDTO();
        message.setMessage("Article a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final CaisseDTO dto) {

        Caisse caisse = service.update(id, converterFacade.convertCaisse(dto));

        return new ResponseEntity<>(caisse, HttpStatus.OK);
    }



    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByDesignation/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        Caisse fournisseur = service.findByDesignation(designation);


        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByCode/{code}", method = RequestMethod.GET)
    public ResponseEntity<?> findByCode(@PathVariable final String code) {
        Caisse fournisseur = service.findByCode(code);
        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/getCodesAndDesignations", method = RequestMethod.GET)
    public ResponseEntity<?> getCodesAndDesignations() {
        List<Caisse> liste = service.findAll();

        List<String> designations = new ArrayList<String>();
        for (Caisse caisse : liste) {
                designations.add(caisse.getDesignation());
        }

        List<String> codes = new ArrayList<String>();
        for (Caisse caisse : liste) {
                codes.add(caisse.getCode());
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("codes", codes);
        map.put("designations", designations);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
