package com.pfproject.api.repository.comptabilite.donneedebase.comptebancaire;

import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.model.comptabilite.donneedebase.comptebancaire.CompteBancaire;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompteBancaireRepository extends MongoRepository<CompteBancaire, String> {
    CompteBancaire findByCode(final String code);

    @Query("{archived : {$ne : ?0}}")
    List<CompteBancaire> findByArchivedNotEqual(Boolean archived);
}
