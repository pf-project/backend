package com.pfproject.api.converter.dto.logistic.parametrage.categorie;

import com.pfproject.api.dto.logistic.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.model.logistic.parametrage.categorie.CategorieArticle;
import org.springframework.core.convert.converter.Converter;

public class CategorieArticleDTOConverter implements Converter<CategorieArticleDTO, CategorieArticle> {

    @Override
    public CategorieArticle convert(final CategorieArticleDTO dto) {
        final CategorieArticle categorie = new CategorieArticle();

        categorie.setCode(dto.getCode());
        categorie.setDesignation(dto.getDesignation());
        categorie.setGroupe(dto.getGroupe());
        categorie.setArticlesMetaData(dto.getArticlesMetaData());
        categorie.setCreatedBy(dto.getCreatedBy());
        categorie.setUpdatedBy(dto.getUpdatedBy());
        return categorie;
    }
}
