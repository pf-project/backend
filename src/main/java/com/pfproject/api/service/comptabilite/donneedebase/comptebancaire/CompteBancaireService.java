package com.pfproject.api.service.comptabilite.donneedebase.comptebancaire;

import com.pfproject.api.model.comptabilite.donneedebase.comptebancaire.CompteBancaire;
import java.util.List;

public interface CompteBancaireService {

    CompteBancaire create(CompteBancaire object);

    CompteBancaire find(String id);

    CompteBancaire findByCode(String code);

    List<CompteBancaire> findAll();

    CompteBancaire update(String code, CompteBancaire object);

    String delete(String id);
}
