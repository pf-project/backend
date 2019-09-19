package com.pfproject.api.service.comptabilite.donneedebase.caisse;

import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.repository.comptabilite.donneedebase.caisse.CaisseRepository;
import com.pfproject.api.repository.comptabilite.donneedebase.comptegeneral.CompteGeneralRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class BasicCaisseService implements CaisseService {

    private final CaisseRepository repository;
    private final CompteGeneralRepository compteGeneralRepository;

    @Autowired
    public BasicCaisseService(final CaisseRepository repository,final CompteGeneralRepository compteGeneralRepository) {
        this.repository = repository;
        this.compteGeneralRepository=compteGeneralRepository;
    }

    @Override
    public Caisse create(final Caisse caisse) {
        caisse.setCreatedAt(String.valueOf(LocalDateTime.now()));
        caisse.setClasse(5);
        return repository.save(caisse);
    }

    @Override
    public Caisse find(String id) {

        return repository.findOne(id);
    }

    @Override
    public List<Caisse> findAll() {
            return repository.findCaisses();
    }

   public Caisse findByDesignation(String designation) {
        return repository.findByDesignation(designation);
    }
    public Caisse findByCode(String code) {
        return repository.findByCode(code);
    }




    @Override
    public Caisse update(final String id, final Caisse caisse) {

        final Caisse saved = repository.findOne(id);
        caisse.setId( new ObjectId(saved.getId()) );
        caisse.setClasse(5);
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
