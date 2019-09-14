package com.pfproject.api.repository.comptabilite.donneedebase.caisse;

import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CaisseRepository extends MongoRepository<Caisse, String> {
    Caisse findByCode(final String code);

    @Query("{archived : {$ne : ?0}}")
    List<Caisse> findByArchivedNotEqual(Boolean archived);

}
