package com.pfproject.api.converter.factory;

import com.pfproject.api.converter.dto.UserDTOConverter;
import com.pfproject.api.converter.dto.comptabilite.donneedebase.caisse.CaisseDTOConverter;
import com.pfproject.api.converter.dto.logistic.donneedebase.FournisseurDTOConverter;
import com.pfproject.api.converter.dto.logistic.parametrage.categorie.CategorieArticleDTOConverter;
import com.pfproject.api.converter.dto.logistic.parametrage.categorie.CategorieServiceDTOConverter;
import com.pfproject.api.converter.dto.logistic.parametrage.configurationdebase.CoursDeChangesDTOConverter;
import com.pfproject.api.converter.dto.logistic.parametrage.configurationdebase.ListesDeBaseDTOConverter;
import com.pfproject.api.converter.dto.logistic.parametrage.configurationdebase.UnitesDTOConverter;
import com.pfproject.api.converter.dto.logistic.donneedebase.ArticleDTOConverter;
import com.pfproject.api.converter.dto.logistic.donneedebase.ServiceDTOConverter;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.dto.logistic.donneedebase.FournisseurDTO;
import com.pfproject.api.dto.logistic.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.dto.logistic.parametrage.categorie.CategorieServiceDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.CoursDeChangesDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.UnitesDTO;
import com.pfproject.api.dto.logistic.donneedebase.ArticleDTO;
import com.pfproject.api.dto.logistic.donneedebase.ServiceDTO;
import com.pfproject.api.converter.dto.comptabilite.donneedebase.comptegeneral.CompteGeneralDTOConverter;
import com.pfproject.api.dto.comptabilite.donneedebase.caisse.CaisseDTO;
import com.pfproject.api.dto.comptabilite.donneedebase.comptegeneral.CompteGeneralDTO;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ConverterFactory {

    private Map<Object, Converter> converters;

    public ConverterFactory() {

    }

    @PostConstruct
    public void init() {
        converters = new HashMap<>();
        converters.put(UserDTO.class, new UserDTOConverter());
        converters.put(CategorieServiceDTO.class, new CategorieServiceDTOConverter());
        converters.put(ServiceDTO.class, new ServiceDTOConverter());
        converters.put(CategorieArticleDTO.class, new CategorieArticleDTOConverter());
        converters.put(ArticleDTO.class, new ArticleDTOConverter());
        converters.put(FournisseurDTO.class, new FournisseurDTOConverter());
        converters.put(ListesDeBaseDTO.class, new ListesDeBaseDTOConverter());
        converters.put(UnitesDTO.class, new UnitesDTOConverter());
        converters.put(CoursDeChangesDTO.class, new CoursDeChangesDTOConverter());
        converters.put(CaisseDTO.class, new CaisseDTOConverter());
        converters.put(CompteGeneralDTO.class,new CompteGeneralDTOConverter());
    }

    public Converter getConverter(final Object type) {
        return converters.get(type);
    }
}
