package com.pfproject.api.controller.Logistic.parametrage.configurationdebase;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.UnitesDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.Unites;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.*;
import com.pfproject.api.service.logistic.parametrage.configurationdebase.unites.UnitesService;
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
@RequestMapping(value = "/api/logistic/configurationdebase/unites")

public class UnitesController {

    private final UnitesService service;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(ListesDeBaseController.class.getName());

    @Autowired
    public UnitesController(final UnitesService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final UnitesDTO dto, final Authentication auth) {

        User user = (User) auth.getDetails();
        dto.setCreatedBy(user.getId());

        Unites unites = service.create(converterFacade.convertUnites(dto));

        return new ResponseEntity<>(unites, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<Unites> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findPoids", method = RequestMethod.GET)
    public ResponseEntity<?> findPoids() {
        List<Poids> liste = service.findPoids();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findDevises", method = RequestMethod.GET)
    public ResponseEntity<?> findDevises() {
        List<Devise> liste = service.findDevise();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/finVolumes", method = RequestMethod.GET)
    public ResponseEntity<?> finVolumes() {
        List<Volume> liste = service.findVolume();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findLongueurs", method = RequestMethod.GET)
    public ResponseEntity<?> findLongueurs() {
        List<Longueur> liste = service.findLongueur();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findDurees", method = RequestMethod.GET)
    public ResponseEntity<?> findDurees() {
        List<Duree> liste = service.findDuree();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findPhysiquoChimique", method = RequestMethod.GET)
    public ResponseEntity<?> findPhysiquoChimique() {
        List<PhysiquoChimique> liste = service.findPhysiquoChimique();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final UnitesDTO dto, final Authentication auth) {

        User user = (User) auth.getDetails();
        dto.setUpdatedBy(user.getId());

        Unites unites = service.update(id, converterFacade.convertUnites(dto));

        return new ResponseEntity<>(unites, HttpStatus.OK);
    }

}
