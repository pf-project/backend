package com.pfproject.api.service.logistic.parametrage.categorie.CategorieArticleService;

import com.pfproject.api.model.logistic.parametrage.categorie.CategorieArticle;

import java.util.List;

public interface CategorieArticleService {

    CategorieArticle create(CategorieArticle object);

    // Categorie find(String id);

    CategorieArticle findByDesignation(String designation);

    List<CategorieArticle> findAll();

    // Categorie update(String id, Categorie object);

    // String delete(String id);
}
