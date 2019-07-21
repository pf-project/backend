package com.pfproject.api.converter.factory;

import com.pfproject.api.converter.dto.UserDTOConverter;
import com.pfproject.api.converter.dto.CategorieDTOConverter;
import com.pfproject.api.converter.dto.ArticleDTOConverter;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.dto.CategorieDTO;
import com.pfproject.api.dto.ArticleDTO;
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
        converters.put(CategorieDTO.class, new CategorieDTOConverter());
        converters.put(ArticleDTO.class, new ArticleDTOConverter());
    }

    public Converter getConverter(final Object type) {
        return converters.get(type);
    }
}
