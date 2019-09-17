package com.pfproject.api.controller.comptabilite.donneedebase.comptebancaire;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.dto.comptabilite.donneedebase.comptebancaire.CompteBancaireDTO;
import com.pfproject.api.model.comptabilite.donneedebase.comptebancaire.CompteBancaire;
import com.pfproject.api.service.comptabilite.donneedebase.comptebancaire.CompteBancaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/comptabilite/donneedebase/comptebancaire")
public class CompteBancaireController {


    private final CompteBancaireService service;
    private final ConverterFacade converterFacade;

    @Autowired
    public CompteBancaireController(final CompteBancaireService service,final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CompteBancaireDTO dto) {

        CompteBancaire caisse = service.create(converterFacade.convertCompteBancaire(dto));

        return new ResponseEntity<>(caisse, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {

        List<CompteBancaire> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }





    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/archive/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String code) {
        CompteBancaire caisse = service.findByCode(code);

        caisse.setArchived(true);

        service.update(code, caisse);
        MessageDTO message = new MessageDTO();
        message.setMessage("Article a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String code, @RequestBody final CompteBancaireDTO dto) {

        CompteBancaire caisse = service.update(code, converterFacade.convertCompteBancaire(dto));

        return new ResponseEntity<>(caisse, HttpStatus.OK);
    }

}
