package com.pfproject.api.service.comptabilite.donneedebase.comptebancaire;

import com.pfproject.api.model.comptabilite.donneedebase.comptebancaire.CompteBancaire;
import com.pfproject.api.repository.comptabilite.donneedebase.comptebancaire.CompteBancaireRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicCompteBancaireService implements CompteBancaireService {

    private final CompteBancaireRepository repository;

    @Autowired
    public BasicCompteBancaireService(final CompteBancaireRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompteBancaire create(final CompteBancaire caisse) {
        caisse.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(caisse);
    }

    @Override
    public CompteBancaire find(String id) {

        return repository.findOne(id);
    }

    @Override
    public List<CompteBancaire> findAll() {
        return repository.findByArchivedNotEqual(true);
    }

//    public Caisse findByDesignation(String designation) {
//        return repository.findByDesignation(designation);
//    }
    public CompteBancaire findByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public CompteBancaire update(final String code, final CompteBancaire caisse) {

        final CompteBancaire saved = repository.findByCode(code);
        caisse.setId(saved.getId());

        caisse.setUpdatedAt(String.valueOf(LocalDateTime.now()));

        repository.save(caisse);
        return caisse;
    }

    @Override
    public String delete(String id) {
        CompteBancaire caisse = repository.findOne(id);
        caisse.setArchived(true);
        repository.save(caisse);
        return null;
    }
}
