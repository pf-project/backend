package com.pfproject.api.service.parametrage.categorie.CategorieServiceService;

import com.pfproject.api.model.parametrage.categorie.CategorieService;

import java.util.List;

public interface CategorieServiceService {

    CategorieService create(CategorieService object);

    // Categorie find(String id);

    CategorieService findByDesignation(String designation);

    List<CategorieService> findAll();

    // Categorie update(String id, Categorie object);

    // String delete(String id);
}
