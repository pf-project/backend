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
        String ecriture_comptable = object.getJournal().substring(0, 1)
                + "-"
                + object.getDateComptable().substring(object.getDateComptable().length() - 4)
                + "-"
                + String.format("%04d", repository.count());
        object.setEcriture_comtable(ecriture_comptable);
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
