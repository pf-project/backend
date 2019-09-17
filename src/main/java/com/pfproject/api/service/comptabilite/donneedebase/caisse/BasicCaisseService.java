package com.pfproject.api.service.comptabilite.donneedebase.caisse;

import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.repository.comptabilite.donneedebase.caisse.CaisseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class BasicCaisseService implements CaisseService {

    private final CaisseRepository repository;

    @Autowired
    public BasicCaisseService(final CaisseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Caisse create(final Caisse caisse) {
        caisse.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(caisse);
    }

    @Override
    public Caisse find(String id) {

        return repository.findOne(id);
    }

    @Override
    public List<Caisse> findAll() {
        return repository.findByArchivedNotEqual(true);
    }

//    public Caisse findByDesignation(String designation) {
//        return repository.findByDesignation(designation);
//    }

    public Caisse findByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public Caisse update(final String code, final Caisse caisse) {

        final Caisse saved = repository.findByCode(code);
        caisse.setId(saved.getId());

        caisse.setCreatedAt(saved.getCreatedAt());
        caisse.setUpdatedAt(String.valueOf(LocalDateTime.now()));

        repository.save(caisse);
        return caisse;
    }

    @Override
    public String delete(String id) {
        Caisse caisse = repository.findOne(id);
        caisse.setArchived(true);
        repository.save(caisse);
        return null;
    }

}
