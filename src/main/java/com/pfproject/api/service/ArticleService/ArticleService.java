package com.pfproject.api.service.ArticleService;

import com.pfproject.api.model.Article;

import java.util.List;

public interface ArticleService {

    Article create(Article object);

    // Categorie find(String id);

    Article findByDesignation(String designation);

    Article findByCode(String code);

    List<Article> findAll();

    Article update(String code, Article object);

    // String delete(String id);
}
