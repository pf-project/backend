package com.pfproject.api.service.ArticleService;

import com.pfproject.api.model.Article;

import java.util.List;

public interface ArticleService {

    Article create(Article object);

    // Categorie find(String id);

    // Article findByDesignation(String designation);

    List<Article> findAll();

    // Categorie update(String id, Categorie object);

    // String delete(String id);
}
