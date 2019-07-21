package com.pfproject.api.converter;

import com.pfproject.api.converter.factory.ConverterFactory;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.dto.CategorieDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.dto.ArticleDTO;
import com.pfproject.api.model.Article;
import com.pfproject.api.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterFacade {

    @Autowired
    private ConverterFactory converterFactory;

    public User convertUser(final UserDTO dto) {

        return (User) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public Categorie convertCategorie(final CategorieDTO dto) {

        return (Categorie) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public Article convertArticle(final ArticleDTO dto) {

        return (Article) converterFactory.getConverter(dto.getClass()).convert(dto);
    }
}
