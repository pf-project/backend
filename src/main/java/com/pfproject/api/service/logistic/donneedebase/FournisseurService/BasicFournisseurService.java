package com.pfproject.api.service.logistic.donneedebase.FournisseurService;

import com.pfproject.api.model.logistic.donneedebase.Fournisseur;
import com.pfproject.api.repository.donnedebase.FournisseurRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicFournisseurService implements FournisseurService {

    private final FournisseurRepository repository;

    @Autowired
    public BasicFournisseurService(final FournisseurRepository repository) {
        this.repository = repository;
    }

    @Override
    public Fournisseur create(
            final Fournisseur fournisseur) {
        fournisseur.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(fournisseur);
    }

    @Override
    public List<Fournisseur> findAll() {
        return repository.findByArchivedNotEqual(true);
    }

    @Override
    public Fournisseur findByDesignation(String designation) {
        return repository.findByDesignation(designation);
    }

    @Override
    public Fournisseur findByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public Fournisseur update(final String code,
            final Fournisseur fournisseur) {

        final Fournisseur saved = repository.findByCode(code);
        fournisseur.setId(saved.getId());

        fournisseur.setUpdatedAt(String.valueOf(LocalDateTime.now()));

        repository.save(fournisseur);
        return fournisseur;
    }
}
