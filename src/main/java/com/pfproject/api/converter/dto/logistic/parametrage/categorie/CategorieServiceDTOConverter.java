package com.pfproject.api.converter.dto.logistic.parametrage.categorie;

import com.pfproject.api.dto.logistic.parametrage.categorie.CategorieServiceDTO;
import com.pfproject.api.model.logistic.parametrage.categorie.CategorieService;
import org.springframework.core.convert.converter.Converter;

public class CategorieServiceDTOConverter implements Converter<CategorieServiceDTO, CategorieService> {

    @Override
    public CategorieService convert(final CategorieServiceDTO dto) {
        final CategorieService categorie = new CategorieService();

        categorie.setCode(dto.getCode());
        categorie.setDesignation(dto.getDesignation());
        categorie.setGroupe(dto.getGroupe());
        categorie.setArticlesMetaData(dto.getArticlesMetaData());
        categorie.setCreatedBy(dto.getCreatedBy());
        categorie.setUpdatedBy(dto.getUpdatedBy());
        categorie.setCreatedAt(dto.getCreatedAt());
        return categorie;
    }
}
