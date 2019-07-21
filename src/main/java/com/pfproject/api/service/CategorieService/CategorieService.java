package com.pfproject.api.service.CategorieService;

import com.pfproject.api.model.Categorie;

import java.util.List;

public interface CategorieService {

    Categorie create(Categorie object);

    // Categorie find(String id);

    Categorie findByDesignation(String designation);

    List<Categorie> findAll();

    // Categorie update(String id, Categorie object);

    // String delete(String id);
}
