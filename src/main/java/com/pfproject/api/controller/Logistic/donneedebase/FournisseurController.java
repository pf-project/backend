package com.pfproject.api.controller.Logistic.donneedebase;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.dto.logistic.donneedebase.FournisseurDTO;
import com.pfproject.api.model.logistic.donneedebase.Fournisseur;
import com.pfproject.api.service.logitic.donneedebase.FournisseurService.FournisseurService;
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
@RequestMapping(value = "/api/logistic/fournisseur")

public class FournisseurController {
    private final FournisseurService service;
    private final ConverterFacade converterFacade;

    @Autowired
    public FournisseurController(final FournisseurService service,
                             final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final FournisseurDTO dto) {

        Fournisseur fournisseur = service.create(converterFacade.convertFournisseur(dto));

        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<Fournisseur> liste = service.findAll();

        List<Fournisseur> response = new ArrayList<Fournisseur>();
        for (Fournisseur fournisseur : liste) {
            if (!fournisseur.isArchived()) {
                response.add(fournisseur);
            }
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByDesignation/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        Fournisseur fournisseur = service.findByDesignation(designation);


        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByCode/{code}", method = RequestMethod.GET)
    public ResponseEntity<?> findByCode(@PathVariable final String code) {
        Fournisseur fournisseur = service.findByCode(code);
        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/getCodesAndDesignations", method = RequestMethod.GET)
    public ResponseEntity<?> getCodesAndDesignations() {
        List<Fournisseur> liste = service.findAll();

        List<String> designations = new ArrayList<String>();
        for (Fournisseur fournisseur : liste) {
            if (!fournisseur.isArchived())
                designations.add(fournisseur.getDesignation());
        }

        List<String> codes = new ArrayList<String>();
        for (Fournisseur fournisseur : liste) {
            if (!fournisseur.isArchived())
                codes.add(fournisseur.getCode());
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("codes", codes);
        map.put("designations", designations);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/archive/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String code) {
        Fournisseur fournisseur = service.findByCode(code);

        fournisseur.setArchived(true);

        service.update(code, fournisseur);
        MessageDTO message = new MessageDTO();
        message.setMessage("Fournsseur a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String code, @RequestBody final FournisseurDTO dto) {

        Fournisseur fournisseur = service.update(code, converterFacade.convertFournisseur(dto));

        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }
}
