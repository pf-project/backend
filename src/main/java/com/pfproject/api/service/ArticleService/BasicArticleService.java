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

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }

    // @Override
    // public Article findByDesignation(final String designation) {
    // return repository.findByDesignation(designation);
    // }

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }

    // @Override
    // public User update(final String id, final User user) {
    // user.setId(id);

    // final User saved = repository.findOne(id);

    // if (saved != null) {
    // user.setCreatedAt(saved.getCreatedAt());
    // user.setUpdatedAt(String.valueOf(LocalDateTime.now()));
    // } else {
    // user.setCreatedAt(String.valueOf(LocalDateTime.now()));
    // }
    // repository.save(user);
    // return user;
    // }

    // @Override
    // public String delete(final String id) {
    // repository.delete(id);
    // return id;
    // }
}
