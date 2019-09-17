package com.pfproject.api.service.logitic.donneedebase.FournisseurService;

import com.pfproject.api.model.logistic.donneedebase.Fournisseur;


import java.util.List;

public interface FournisseurService {

    Fournisseur create(Fournisseur object);

    Fournisseur findByDesignation(String designation);

    Fournisseur findByCode(String code);

    List<Fournisseur> findAll();

    Fournisseur update(String code, Fournisseur object);
}
