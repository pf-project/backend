package com.pfproject.api.service.comptabilite.donneedebase.caisse;

import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import java.util.List;

public interface CaisseService {

    Caisse create(Caisse object);

    Caisse find(String id);

   Caisse findByDesignation(String designation);

    Caisse findByCode(String code);

    List<Caisse> findAll();

    Caisse update(String code, Caisse object);

     String delete(String id);

}


