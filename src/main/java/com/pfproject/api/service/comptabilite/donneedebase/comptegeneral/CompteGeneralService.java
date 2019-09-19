package com.pfproject.api.service.comptabilite.donneedebase.comptegeneral;


import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.model.comptabilite.donneedebase.comptegeneral.CompteGeneral;

import java.util.List;

public interface CompteGeneralService {

    CompteGeneral create(CompteGeneral object);

    CompteGeneral find(String id);

    List<CompteGeneral> findClasses();
    List<CompteGeneral> findRubriquesByClasse(String classe);
    List<CompteGeneral> findPostesByRubrique(String rubrique);
    List<CompteGeneral> findComptesByPoste(String poste);
    List<CompteGeneral> findByCompte(int compte);
    List<CompteGeneral> findAll();
    CompteGeneral update(String code, CompteGeneral object);
     String delete(String id);

}


