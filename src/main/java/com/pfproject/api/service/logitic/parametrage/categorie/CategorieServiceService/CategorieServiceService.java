package com.pfproject.api.service.logitic.parametrage.categorie.CategorieServiceService;

import com.pfproject.api.model.logistic.parametrage.categorie.CategorieService;

import java.util.List;

public interface CategorieServiceService {

    CategorieService create(CategorieService object);

    // Categorie find(String id);

    CategorieService findByDesignation(String designation);

    List<CategorieService> findAll();

    // Categorie update(String id, Categorie object);

    // String delete(String id);
}
