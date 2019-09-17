package com.pfproject.api.repository.donnedebase;

import com.pfproject.api.model.logistic.donneedebase.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findByDesignation(final String designation);

    Article findByCode(final String code);
}
