package com.pfproject.api.repository.parametrage.categorie;

import com.pfproject.api.model.logistic.parametrage.categorie.CategorieArticle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieArticleRepository extends MongoRepository<CategorieArticle, String> {

    CategorieArticle findByDesignation(final String designation);

}
