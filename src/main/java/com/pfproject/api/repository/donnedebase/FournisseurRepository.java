package com.pfproject.api.repository.donnedebase;


import com.pfproject.api.model.logistic.donneedebase.Fournisseur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends MongoRepository<Fournisseur, String> {
    Fournisseur findByDesignation(final String designation);

    Fournisseur findByCode(final String code);
}
