package com.pfproject.api.repository.parametrage.categorie;

import com.pfproject.api.model.parametrage.categorie.CategorieService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategorieServiceRepository extends MongoRepository<CategorieService, String> {
    CategorieService findByDesignation(final String designation);
}
