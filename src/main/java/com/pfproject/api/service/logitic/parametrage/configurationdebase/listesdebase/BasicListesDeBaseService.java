package com.pfproject.api.service.logitic.parametrage.configurationdebase.listesdebase;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.listesdebase.*;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.repository.parametrage.configurationdebase.ListesDeBaseRepository;

@Service
public class BasicListesDeBaseService implements ListesDeBaseService {

    private final ListesDeBaseRepository repository;

    @Autowired
    public BasicListesDeBaseService(final ListesDeBaseRepository repository) {
        this.repository = repository;
    }

    @Override
    public ListesDeBase create(final ListesDeBase listesDeBase) {
        // categorie.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(listesDeBase);
    }

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }

    @Override
    public List<ListesDeBase> findAll() {
        return repository.findAll();
    }

    @Override
    public ListesDeBase find(String id) {

        return repository.findOne(id);
    }

    @Override
    public ListesDeBase update(String id, ListesDeBase object) {
        ObjectId new_id = new ObjectId(id);
        object.setId(new_id);
        return repository.save(object);
    }

    @Override
    public List<Ville> findVilles() {
        return repository.findAll().get(0).getVilles();
    }

    @Override
    public List<Pays> findPays() {
        return repository.findAll().get(0).getPays();
    }

    @Override
    public List<TVA> findTVA() {
        return repository.findAll().get(0).getTva();
    }

    @Override
    public List<Langue> findLangue() {
        return repository.findAll().get(0).getLangues();
    }

    @Override
    public List<ModeDePayement> findModeDePayement() {
        return repository.findAll().get(0).getMode_payment();
    }

    @Override
    public List<Honoraire> findHonoraire() {
        return repository.findAll().get(0).getHonoraires();
    }

    @Override
    public List<Banque> findBanque() {
        return repository.findAll().get(0).getBanques();
    }

}
