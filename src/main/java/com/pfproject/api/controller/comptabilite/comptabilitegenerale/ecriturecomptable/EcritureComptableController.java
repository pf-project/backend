package com.pfproject.api.controller.comptabilite.comptabilitegenerale.ecriturecomptable;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.comptabilite.comptabilitegenerale.ecriturecomptable.EcritureComptableDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable.EcritureComptable;
import com.pfproject.api.service.comptabilite.comptabilitegenerale.ecriturecomptable.EcritureComptableService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/comptabilite/comptabilitegenerale/ecriturecomptable")

public class EcritureComptableController {

    private final EcritureComptableService service;
    private final ConverterFacade converterFacade;

    @Autowired
    public EcritureComptableController(final EcritureComptableService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final EcritureComptableDTO dto, final Authentication auth) {

        User user = (User) auth.getDetails();
        dto.setCreatedBy(user.getId());
        EcritureComptable ecritureComptable = service.create(converterFacade.convertEcritureComptablee(dto));

        return new ResponseEntity<>(ecritureComptable, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<?> find() {

        List<EcritureComptable> liste = service.findAll();

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/findByJournal/{journal}", method = RequestMethod.GET)
    public ResponseEntity<?> findByJournal(@PathVariable final String journal) {

        List<EcritureComptable> liste = service.findByJournal(journal);

        return new ResponseEntity<>(liste, HttpStatus.OK);
    }

}
