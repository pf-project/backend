package com.pfproject.api.service.ArticleService;

import com.pfproject.api.model.Article;
import com.pfproject.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BasicArticleService implements ArticleService {

    private final ArticleRepository repository;

    @Autowired
    public BasicArticleService(final ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Article create(final Article article) {
        article.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }

    public Article findByDesignation(String designation) {
        return repository.findByDesignation(designation);
    }

    public Article findByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public Article update(final String code, final Article article) {

        final Article saved = repository.findByCode(code);
        article.setId(saved.getId());

        article.setCreatedAt(saved.getCreatedAt());
        article.setUpdatedAt(String.valueOf(LocalDateTime.now()));

        repository.save(article);
        return article;
    }

}
