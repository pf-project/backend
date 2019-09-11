package com.pfproject.api.service.donneedebase.FournisseurService;

import com.pfproject.api.model.donneedebase.Fournisseur;


import java.util.List;

public interface FournisseurService {

    Fournisseur create(Fournisseur object);

    Fournisseur findByDesignation(String designation);

    Fournisseur findByCode(String code);

    List<Fournisseur> findAll();

    Fournisseur update(String code, Fournisseur object);
}
