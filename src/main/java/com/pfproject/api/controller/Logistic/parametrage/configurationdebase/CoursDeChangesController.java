package com.pfproject.api.controller.Logistic.parametrage.configurationdebase;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.parametrage.configurationdebase.CoursDeChangesDTO;
import com.pfproject.api.model.parametrage.configurationdebase.CoursDeChanges;
import com.pfproject.api.model.parametrage.configurationdebase.Unites;
import com.pfproject.api.service.parametrage.configurationdebase.coursdechanges.CoursDeChangesService;
import com.pfproject.api.service.parametrage.configurationdebase.unites.UnitesService;

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
@RequestMapping(value = "/api/logistic/configurationdebase/coursdechange")

public class CoursDeChangesController {

    private final CoursDeChangesService service;
    private final UnitesService serviceUnites;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(ListesDeBaseController.class.getName());

    @Autowired
    public CoursDeChangesController(final CoursDeChangesService service, final ConverterFacade converterFacade,
            final UnitesService serviceUnites) {
        this.service = service;
        this.serviceUnites = serviceUnites;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CoursDeChangesDTO dto) {

        CoursDeChanges unites = service.create(converterFacade.convertCoursDeChanges(dto));

        return new ResponseEntity<>(unites, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<CoursDeChanges> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String id, @RequestBody final CoursDeChangesDTO dto) {

        CoursDeChanges unites = service.update(id, converterFacade.convertCoursDeChanges(dto));

        return new ResponseEntity<>(unites, HttpStatus.OK);
    }

}
