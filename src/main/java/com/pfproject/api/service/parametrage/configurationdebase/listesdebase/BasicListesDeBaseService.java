package com.pfproject.api.service.parametrage.configurationdebase.listesdebase;

import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Ville;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;
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
        return repository.findVilles();
    }

}
