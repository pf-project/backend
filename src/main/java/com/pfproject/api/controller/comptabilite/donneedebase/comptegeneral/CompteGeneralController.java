package com.pfproject.api.controller.comptabilite.donneedebase.comptegeneral;


import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.dto.comptabilite.donneedebase.comptegeneral.CompteGeneralDTO;
import com.pfproject.api.model.comptabilite.donneedebase.comptegeneral.CompteGeneral;
import com.pfproject.api.service.comptabilite.donneedebase.comptegeneral.CompteGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/comptabilite/donneedebase/comptegeneral")

public class CompteGeneralController {

    private final CompteGeneralService service;
    private final ConverterFacade converterFacade;



    @Autowired
    public CompteGeneralController(final CompteGeneralService service,final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CompteGeneralDTO dto) {

        CompteGeneral compteGeneral = service.create(converterFacade.convertCompteGeneral(dto));

        return new ResponseEntity<>(compteGeneral, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {

        List<CompteGeneral> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findDesignation/{compte}", method = RequestMethod.GET)
    public ResponseEntity<?> findDesignation(@PathVariable final String compte) {
        List<CompteGeneral> compteGeneral = service.findByCompte(Integer.parseInt(compte));


        MessageDTO message = new MessageDTO();
        message.setMessage(compteGeneral.get(0).getDesignation());
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findClasses", method = RequestMethod.GET)
    public ResponseEntity<?> findClasses() {

        List<CompteGeneral> liste = service.findClasses();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }
    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findRubriquesByClasse/{classe}", method = RequestMethod.GET)
    public ResponseEntity<?> findRubriquesByClasse(@PathVariable final String classe) {

        List<CompteGeneral> liste = service.findRubriquesByClasse(classe);

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }
    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findPostesByRubrique/{rubrique}", method = RequestMethod.GET)
    public ResponseEntity<?> findPostesByRubrique(@PathVariable final String rubrique) {

        List<CompteGeneral> liste = service.findPostesByRubrique(rubrique);

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }
    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findComptesByPoste/{poste}", method = RequestMethod.GET)
    public ResponseEntity<?> findComptesByPoste(@PathVariable final String poste) {

        List<CompteGeneral> liste = service.findComptesByPoste(poste);

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }


    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/archive/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String id) {
        CompteGeneral compteGeneral = service.find(id);

        compteGeneral.setArchived(true);

        service.update(id, compteGeneral);
        MessageDTO message = new MessageDTO();
        message.setMessage("Article a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final CompteGeneralDTO dto) {

        CompteGeneral caisse = service.update(id, converterFacade.convertCompteGeneral(dto));

        return new ResponseEntity<>(caisse, HttpStatus.OK);
    }

}
