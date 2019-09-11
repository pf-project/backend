package com.pfproject.api.converter.factory;

import com.pfproject.api.converter.dto.UserDTOConverter;
import com.pfproject.api.converter.dto.donneedebase.FournisseurDTOConverter;
import com.pfproject.api.converter.dto.parametrage.categorie.CategorieArticleDTOConverter;
import com.pfproject.api.converter.dto.parametrage.categorie.CategorieServiceDTOConverter;
import com.pfproject.api.converter.dto.parametrage.configurationdebase.CoursDeChangesDTOConverter;
import com.pfproject.api.converter.dto.parametrage.configurationdebase.ListesDeBaseDTOConverter;
import com.pfproject.api.converter.dto.parametrage.configurationdebase.UnitesDTOConverter;
import com.pfproject.api.converter.dto.donneedebase.ArticleDTOConverter;
import com.pfproject.api.converter.dto.donneedebase.ServiceDTOConverter;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.dto.donneedebase.FournisseurDTO;
import com.pfproject.api.dto.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.dto.parametrage.categorie.CategorieServiceDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.CoursDeChangesDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.UnitesDTO;
import com.pfproject.api.dto.donneedebase.ArticleDTO;
import com.pfproject.api.dto.donneedebase.ServiceDTO;

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
    }

    public Converter getConverter(final Object type) {
        return converters.get(type);
    }
}
