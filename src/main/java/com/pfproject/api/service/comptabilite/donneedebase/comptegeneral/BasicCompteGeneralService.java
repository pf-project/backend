package com.pfproject.api.service.comptabilite.donneedebase.comptegeneral;


import com.pfproject.api.model.comptabilite.donneedebase.comptegeneral.CompteGeneral;
import com.pfproject.api.repository.comptabilite.donneedebase.comptegeneral.CompteGeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BasicCompteGeneralService implements CompteGeneralService {

    private final CompteGeneralRepository repository;

    @Autowired
    public BasicCompteGeneralService(final CompteGeneralRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompteGeneral create(final CompteGeneral compteGeneral) {
        compteGeneral.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(compteGeneral);
    }


    @Override
    public CompteGeneral find(String id) {

        return repository.findOne(id);
    }

    @Override
    public List<CompteGeneral> findClasses() {
        return repository.findClasses();
    }

    @Override
    public List<CompteGeneral> findRubriquesByClasse(String classe) {
        return repository.findRubriquesByClasse(Integer.parseInt(classe));
    }

    @Override
    public List<CompteGeneral> findPostesByRubrique(String rubrique) {
        return repository.findPostesByRubriques(((Integer.parseInt(rubrique)+1)*10),(Integer.parseInt(rubrique)*10));
    }

    @Override
    public List<CompteGeneral> findComptesByPoste(String poste) {
        return repository.findComptesByPoste(((Integer.parseInt(poste)+1)*10),(Integer.parseInt(poste)*10));
    }


    @Override
    public List<CompteGeneral> findAll() {
        return repository.findByArchivedNotEqual(true);
    }


//    public Caisse findByDesignation(String designation) {
//        return repository.findByDesignation(designation);
//    }


    @Override
    public CompteGeneral update(final String id, final CompteGeneral caisse) {

        final CompteGeneral saved = repository.findOne(id);
        caisse.setId(saved.getId());

        caisse.setCreatedAt(saved.getCreatedAt());
        caisse.setUpdatedAt(String.valueOf(LocalDateTime.now()));

        repository.save(caisse);
        return caisse;
    }

    @Override
    public String delete(String id) {
        CompteGeneral caisse = repository.findOne(id);
        caisse.setArchived(true);
        repository.save(caisse);
        return null;
    }

}
