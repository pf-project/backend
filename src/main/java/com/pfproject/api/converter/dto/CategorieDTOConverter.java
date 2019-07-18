package com.pfproject.api.converter.dto;

import com.pfproject.api.dto.CategorieDTO;
import com.pfproject.api.model.Categorie;
import org.springframework.core.convert.converter.Converter;

public class CategorieDTOConverter implements Converter<CategorieDTO, Categorie> {

    @Override
    public Categorie convert(final CategorieDTO dto) {
        final Categorie categorie = new Categorie();

        categorie.setCode(dto.getCode());
        categorie.setDesignation(dto.getDesignation());
        categorie.setGroupe(dto.getGroupe());
        categorie.setArticlesMetaData(dto.getArticlesMetaData());
        return categorie;
    }
}
