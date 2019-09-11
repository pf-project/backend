package com.pfproject.api.service.parametrage.configurationdebase.unites;

import com.pfproject.api.model.parametrage.configurationdebase.unites.Devise;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.model.parametrage.configurationdebase.Unites;
import com.pfproject.api.repository.parametrage.configurationdebase.UnitesRepository;

@Service
public class BasicUnitesService implements UnitesService {

    private final UnitesRepository repository;

    @Autowired
    public BasicUnitesService(final UnitesRepository repository) {
        this.repository = repository;
    }

    @Override
    public Unites create(final Unites unites) {
        // categorie.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(unites);
    }

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }

    @Override
    public List<Unites> findAll() {
        return repository.findAll();
    }

    @Override
    public Unites find(String id) {

        return repository.findOne(id);
    }

    @Override
    public Unites update(String id, Unites object) {
        ObjectId new_id = new ObjectId(id);
        object.setId(new_id);
        return repository.save(object);
    }


}
