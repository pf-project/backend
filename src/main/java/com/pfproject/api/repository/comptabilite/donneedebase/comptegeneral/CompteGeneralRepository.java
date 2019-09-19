package com.pfproject.api.repository.comptabilite.donneedebase.comptegeneral;

import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.model.comptabilite.donneedebase.comptegeneral.CompteGeneral;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompteGeneralRepository extends MongoRepository<CompteGeneral, String> {
    @Query("{'niveau':1}")
    List<CompteGeneral> findClasses();

    @Query("{classe : ?0 , 'niveau':2}")
    List<CompteGeneral> findRubriquesByClasse(int classe);

    @Query("{compte:{$lt:?0,$gt:?1} , 'niveau':3}")
    List<CompteGeneral> findPostesByRubriques(int lessthen,int gratherthen);

    @Query("{compte:{$lt:?0,$gt:?1} , 'niveau':4}")
    List<CompteGeneral> findComptesByPoste(int lessthen,int gratherthen);


    @Query("{archived : {$ne : ?0}}")
    List<CompteGeneral> findByArchivedNotEqual(Boolean archived);

    @Query(value = "{'compte' : ?0}" )
    List<CompteGeneral> findByCompte(int compte);


    CompteGeneral findByDesignation(final String designation);




}
