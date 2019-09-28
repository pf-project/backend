package com.pfproject.api.repository.donnedebase;

import com.pfproject.api.model.logistic.donneedebase.Article;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {

    @Query("{designation :  ?0,,archived : false}")
    Article findByDesignation(final String designation);

    @Query("{code :  ?0,archived : false}")
    Article findByCode(final String code);

    @Query("{archived : {$ne : ?0}}")
    List<Article> findByArchivedNotEqual(Boolean archived);
}
