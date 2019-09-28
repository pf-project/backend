package com.pfproject.api.repository.donnedebase;

import com.pfproject.api.model.logistic.donneedebase.Fournisseur;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends MongoRepository<Fournisseur, String> {

    @Query("{designation :  ?0,,archived : false}")
    Fournisseur findByDesignation(final String designation);

    @Query("{code :  ?0,,archived : false}")
    Fournisseur findByCode(final String code);

    @Query("{archived : {$ne : ?0}}")
    List<Fournisseur> findByArchivedNotEqual(Boolean archived);
}
