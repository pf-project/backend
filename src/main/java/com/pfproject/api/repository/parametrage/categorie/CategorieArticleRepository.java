package com.pfproject.api.repository.parametrage.categorie;

import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategorieArticleRepository extends MongoRepository<CategorieArticle, String> {
    CategorieArticle findByDesignation(final String designation);
}
