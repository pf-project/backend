package com.pfproject.api.controller.Logistic.donneedebase;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.donneedebase.ServiceDTO;
import com.pfproject.api.dto.MessageDTO;
import com.pfproject.api.service.donneedebase.ServiceService.ServiceService;
import com.pfproject.api.service.parametrage.categorie.CategorieServiceService.CategorieServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.pfproject.api.model.donneedebase.Service;
import com.pfproject.api.model.parametrage.categorie.CategorieService;
import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;

@RestController
@RequestMapping(value = "/api/logistic/service")

public class ServiceController {

    private final ServiceService service;
    private final CategorieServiceService C_service;
    private final ConverterFacade converterFacade;

    @Autowired
    public ServiceController(final ServiceService service, final CategorieServiceService C_service,
            final ConverterFacade converterFacade) {
        this.service = service;
        this.C_service = C_service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final ServiceDTO dto) {

        Service servicee = service.create(converterFacade.convertService(dto));

        return new ResponseEntity<>(servicee, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {
        List<Service> liste = service.findAll();

        List<Service> response = new ArrayList<Service>();
        for (Service servicee : liste) {
            if (!servicee.isArchived()) {
                response.add(servicee);
            }
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByDesignation/{designation}", method = RequestMethod.GET)
    public ResponseEntity<?> findByDesignation(@PathVariable final String designation) {
        Service servicee = service.findByDesignation(designation);
        CategorieService categorie = C_service.findByDesignation(servicee.getCategorie());
        Map<String, Object> map = new HashMap<String, Object>();
        if (!servicee.isArchived())
            map.put("service", servicee);
        map.put("categorie", categorie);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByCode/{code}", method = RequestMethod.GET)
    public ResponseEntity<?> findByCode(@PathVariable final String code) {
        Service servicee = service.findByCode(code);
        Map<String, Object> map = new HashMap<String, Object>();
        if (!servicee.isArchived())
            map.put("service", servicee);
        CategorieService categorie = C_service.findByDesignation(servicee.getCategorie());
        map.put("categorie", categorie);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/getCodesAndDesignations", method = RequestMethod.GET)
    public ResponseEntity<?> getCodesAndDesignations() {
        List<Service> liste = service.findAll();

        List<String> designations = new ArrayList<String>();
        for (Service servicee : liste) {
            if (!servicee.isArchived())
                designations.add(servicee.getDesignation());
        }

        List<String> codes = new ArrayList<String>();
        for (Service servicee : liste) {
            if (!servicee.isArchived())
                codes.add(servicee.getCode());
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("codes", codes);
        map.put("designations", designations);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/archive/{code}", method = RequestMethod.DELETE)
    public ResponseEntity<?> archive(@PathVariable final String code) {
        Service servicee = service.findByCode(code);

        servicee.setArchived(true);

        service.update(code, servicee);
        MessageDTO message = new MessageDTO();
        message.setMessage("Service a été supprimé");
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    public ResponseEntity<?> update(@PathVariable final String code, @RequestBody final ServiceDTO dto) {

        Service servicee = service.update(code, converterFacade.convertService(dto));

        return new ResponseEntity<>(servicee, HttpStatus.OK);
    }

}