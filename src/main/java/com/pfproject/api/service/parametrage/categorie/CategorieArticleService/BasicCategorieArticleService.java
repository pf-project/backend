package com.pfproject.api.service.parametrage.categorie.CategorieArticleService;

import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import com.pfproject.api.repository.parametrage.categorie.CategorieArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BasicCategorieArticleService implements CategorieArticleService {

    private final CategorieArticleRepository repository;

    @Autowired
    public BasicCategorieArticleService(final CategorieArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public CategorieArticle create(final CategorieArticle categorie) {
        categorie.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(categorie);
    }

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }

    @Override
    public CategorieArticle findByDesignation(final String designation) {
        return repository.findByDesignation(designation);
    }

    @Override
    public List<CategorieArticle> findAll() {
        return repository.findAll();
    }

}
