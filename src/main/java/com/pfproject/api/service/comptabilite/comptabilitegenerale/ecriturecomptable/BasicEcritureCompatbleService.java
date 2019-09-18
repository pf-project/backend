package com.pfproject.api.service.comptabilite.comptabilitegenerale.ecriturecomptable;

import com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable.EcritureComptable;
import com.pfproject.api.repository.comptabilite.comptabilitegenerale.ecriturecomptable.EcritureComptableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicEcritureCompatbleService implements EcritureComptableService {


    private final EcritureComptableRepository repository;

    @Autowired
    public BasicEcritureCompatbleService(final EcritureComptableRepository repository) {
        this.repository = repository;
    }

    @Override
    public EcritureComptable create(EcritureComptable object) {
        return repository.save(object);
    }

    @Override
    public EcritureComptable find(String id) {
        return repository.findOne(id);
    }

    @Override
    public List<EcritureComptable> findAll() {
        return repository.findAll();
    }

    @Override
    public List<EcritureComptable> findByJournal(final String journal) {
        return repository.findByJournal(journal);
    }
}
