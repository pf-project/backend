package com.pfproject.api.repository;

import com.pfproject.api.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findByDesignation(final String designation);

    Article findByCode(final String code);
}
