package com.pfproject.api.converter.dto.parametrage.categorie;

import com.pfproject.api.dto.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import org.springframework.core.convert.converter.Converter;

public class CategorieArticleDTOConverter implements Converter<CategorieArticleDTO, CategorieArticle> {

    @Override
    public CategorieArticle convert(final CategorieArticleDTO dto) {
        final CategorieArticle categorie = new CategorieArticle();

        categorie.setCode(dto.getCode());
        categorie.setDesignation(dto.getDesignation());
        categorie.setGroupe(dto.getGroupe());
        categorie.setArticlesMetaData(dto.getArticlesMetaData());
        return categorie;
    }
}
