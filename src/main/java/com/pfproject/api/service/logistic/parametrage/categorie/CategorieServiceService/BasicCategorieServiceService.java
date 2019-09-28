package com.pfproject.api.service.logistic.parametrage.categorie.CategorieServiceService;

import com.pfproject.api.model.logistic.parametrage.categorie.CategorieService;
import com.pfproject.api.repository.parametrage.categorie.CategorieServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BasicCategorieServiceService implements CategorieServiceService {

    private final CategorieServiceRepository repository;

    @Autowired
    public BasicCategorieServiceService(final CategorieServiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public CategorieService create(final CategorieService categorie) {
        categorie.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(categorie);
    }

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }

    @Override
    public CategorieService findByDesignation(final String designation) {
        return repository.findByDesignation(designation);
    }

    @Override
    public List<CategorieService> findAll() {
        return repository.findAll();
    }

}
