package com.pfproject.api.controller.Logistic.parametrage.configurationdebase;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.listesdebase.*;
import com.pfproject.api.service.logistic.parametrage.configurationdebase.listesdebase.ListesDeBaseService;
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
    public ResponseEntity<?> create(@RequestBody final ListesDeBaseDTO dto, final Authentication auth) {

        User user = (User) auth.getDetails();
        dto.setCreatedBy(user.getId());
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
    @RequestMapping(value = "/findVilles", method = RequestMethod.GET)
    public ResponseEntity<?> findVilles() {
        List<Ville> liste = service.findVilles();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findPays", method = RequestMethod.GET)
    public ResponseEntity<?> findPays() {
        List<Pays> liste = service.findPays();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findTVA", method = RequestMethod.GET)
    public ResponseEntity<?> findTVA() {
        List<TVA> liste = service.findTVA();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findLangues", method = RequestMethod.GET)
    public ResponseEntity<?> findLangues() {
        List<Langue> liste = service.findLangue();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findBanques", method = RequestMethod.GET)
    public ResponseEntity<?> findBanques() {
        List<Banque> liste = service.findBanque();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findModeDePayement", method = RequestMethod.GET)
    public ResponseEntity<?> findModeDePayement() {
        List<ModeDePayement> liste = service.findModeDePayement();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findHonorire", method = RequestMethod.GET)
    public ResponseEntity<?> findHonorire() {
        List<Honoraire> liste = service.findHonoraire();
        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final ListesDeBaseDTO dto, final Authentication auth) {

        User user = (User) auth.getDetails();
        dto.setUpdatedBy(user.getId());

        ListesDeBase listesDeBase = service.update(id, converterFacade.convertListesDeBase(dto));

        return new ResponseEntity<>(listesDeBase, HttpStatus.OK);
    }

}
