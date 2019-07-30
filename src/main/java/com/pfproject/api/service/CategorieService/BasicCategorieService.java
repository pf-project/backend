package com.pfproject.api.service.CategorieService;

import com.pfproject.api.model.Categorie;
import com.pfproject.api.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BasicCategorieService implements CategorieService {

    private final CategorieRepository repository;

    @Autowired
    public BasicCategorieService(final CategorieRepository repository) {
        this.repository = repository;
    }

    @Override
    public Categorie create(final Categorie categorie) {
        categorie.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(categorie);
    }

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }

    @Override
    public Categorie findByDesignation(final String designation) {
        return repository.findByDesignation(designation);
    }

    @Override
    public List<Categorie> findAll() {
        return repository.findAll();
    }

    // @Override
    // public User update(final String id, final User user) {
    // user.setId(id);

    // final User saved = repository.findOne(id);

    // if (saved != null) {
    // user.setCreatedAt(saved.getCreatedAt());
    // user.setUpdatedAt(String.valueOf(LocalDateTime.now()));
    // } else {
    // user.setCreatedAt(String.valueOf(LocalDateTime.now()));
    // }
    // repository.save(user);
    // return user;
    // }

    // @Override
    // public String delete(final String id) {
    // repository.delete(id);
    // return id;
    // }
}