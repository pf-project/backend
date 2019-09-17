package com.pfproject.api.repository.parametrage.categorie;

import com.pfproject.api.model.logistic.parametrage.categorie.CategorieService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieServiceRepository extends MongoRepository<CategorieService, String> {
    CategorieService findByDesignation(final String designation);
}
