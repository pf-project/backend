package com.pfproject.api.converter;

import com.pfproject.api.converter.factory.ConverterFactory;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.dto.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.dto.parametrage.categorie.CategorieServiceDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.dto.donneedebase.ArticleDTO;
import com.pfproject.api.dto.donneedebase.ServiceDTO;
import com.pfproject.api.model.donneedebase.Article;
import com.pfproject.api.model.donneedebase.Service;
import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import com.pfproject.api.model.parametrage.categorie.CategorieService;
import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterFacade {

    @Autowired
    private ConverterFactory converterFactory;

    public User convertUser(final UserDTO dto) {

        return (User) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public CategorieArticle convertCategorieArticle(final CategorieArticleDTO dto) {

        return (CategorieArticle) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public Article convertArticle(final ArticleDTO dto) {

        return (Article) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public CategorieService convertCategorieService(final CategorieServiceDTO dto) {

        return (CategorieService) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public Service convertService(final ServiceDTO dto) {

        return (Service) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public ListesDeBase convertListesDeBase(final ListesDeBaseDTO dto) {

        return (ListesDeBase) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

}
