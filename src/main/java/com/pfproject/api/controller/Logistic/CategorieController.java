package com.pfproject.api.controller.Logistic;

import com.pfproject.api.converter.ConverterFacade;
import com.pfproject.api.dto.CategorieDTO;
import com.pfproject.api.service.CategorieService.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pfproject.api.model.Categorie;

import org.apache.log4j.Logger;

@RestController
@RequestMapping(value = "/api/logistic/categorie")

public class CategorieController {

    private final CategorieService service;

    private final ConverterFacade converterFacade;

    static Logger log = Logger.getLogger(CategorieController.class.getName());

    @Autowired
    public CategorieController(final CategorieService service, final ConverterFacade converterFacade) {
        this.service = service;
        this.converterFacade = converterFacade;
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final CategorieDTO dto) {

        Categorie categorie = service.create(converterFacade.convertCategorie(dto));

        return new ResponseEntity<>(categorie, HttpStatus.OK);
    }

    // @Secured("ROLE_ADMIN")
    // @RequestMapping(value = "/find", method = RequestMethod.GET)
    // public ResponseEntity<?> find() {
    // List<User> liste = service.findAll();
    // ArrayList<Response> response = new ArrayList<Response>();
    // for (User user : liste) {
    // Response r = new Response();
    // r.setAuthority(user.getAuthority());
    // r.setUsername(user.getUsername());
    // r.setId(user.getId());
    // r.setEnabled(user.isEnabled());
    // response.add(r);
    // }
    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

    // // search route fonctional
    // // @RequestMapping(value = "/find/{username}", method = RequestMethod.GET)
    // // public ResponseEntity<?> findByUsername(@PathVariable final String
    // username)
    // // {
    // // return new ResponseEntity<>(service.findByUsername(username),
    // HttpStatus.OK);
    // // }
    // @Secured("ROLE_ADMIN")
    // @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    // public ResponseEntity<?> update(@PathVariable final String id, @RequestBody
    // final UserDTO dto) {
    // User user = service.find(id);
    // user.setUsername(dto.getUsername());
    // user.setFirstLogin(true);
    // user.setPassword(dto.getPassword());
    // user.setAuthority(dto.getAuthority());
    // service.update(id, user);

    // final MessageDTO response = new MessageDTO();
    // response.setMessage("Mot de passe est changé avec succes");

    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

    // @RequestMapping(value = "/passwordReset/{id}", method = RequestMethod.POST)
    // public ResponseEntity<?> passwordReset(@PathVariable final String id,
    // @RequestBody final UserDTO dto) {
    // User user = service.find(id);

    // user.setFirstLogin(false);
    // user.setPassword(dto.getPassword());
    // service.update(id, user);

    // final MessageDTO response = new MessageDTO();
    // response.setMessage("Mot de passe est changé avec succes");
    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

    // @Secured("ROLE_ADMIN")
    // @RequestMapping(value = "/disable/{id}", method = RequestMethod.DELETE)
    // public ResponseEntity<?> delete(@PathVariable final String id) {
    // // service.delete(id);
    // final MessageDTO response = new MessageDTO();

    // User user = service.find(id);
    // boolean isEnabled = user.isEnabled();
    // if (isEnabled) {
    // response.setMessage("l'utilisateur a été bloqué");
    // user.setEnabled(false);
    // } else {
    // response.setMessage("l'utilisateur a été débloqué");
    // user.setEnabled(true);
    // }
    // service.update(id, user);

    // return new ResponseEntity<>(response, HttpStatus.OK);
    // }

}
