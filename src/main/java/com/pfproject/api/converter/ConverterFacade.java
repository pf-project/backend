package com.pfproject.api.converter;

import com.pfproject.api.converter.factory.ConverterFactory;
import com.pfproject.api.dto.UserDTO;
import com.pfproject.api.dto.comptabilite.donneedebase.caisse.CaisseDTO;
import com.pfproject.api.dto.comptabilite.donneedebase.comptegeneral.CompteGeneralDTO;
import com.pfproject.api.dto.donneedebase.FournisseurDTO;
import com.pfproject.api.dto.parametrage.categorie.CategorieArticleDTO;
import com.pfproject.api.dto.parametrage.categorie.CategorieServiceDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.CoursDeChangesDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.UnitesDTO;
import com.pfproject.api.model.User;
import com.pfproject.api.dto.donneedebase.ArticleDTO;
import com.pfproject.api.dto.donneedebase.ServiceDTO;
import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import com.pfproject.api.model.comptabilite.donneedebase.comptegeneral.CompteGeneral;
import com.pfproject.api.model.donneedebase.Article;
import com.pfproject.api.model.donneedebase.Fournisseur;
import com.pfproject.api.model.donneedebase.Service;
import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import com.pfproject.api.model.parametrage.categorie.CategorieService;
import com.pfproject.api.model.parametrage.configurationdebase.CoursDeChanges;
import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.model.parametrage.configurationdebase.Unites;

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
    public Fournisseur convertFournisseur(final FournisseurDTO dto) {

        return (Fournisseur) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public ListesDeBase convertListesDeBase(final ListesDeBaseDTO dto) {

        return (ListesDeBase) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public Unites convertUnites(final UnitesDTO dto) {

        return (Unites) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public CoursDeChanges convertCoursDeChanges(final CoursDeChangesDTO dto) {

        return (CoursDeChanges) converterFactory.getConverter(dto.getClass()).convert(dto);
    }

    public Caisse convertCaisse(final CaisseDTO dto) {

        return (Caisse) converterFactory.getConverter(dto.getClass()).convert(dto);
    }
    public CompteGeneral convertCompteGeneral(final CompteGeneralDTO dto) {

        return (CompteGeneral) converterFactory.getConverter(dto.getClass()).convert(dto);
    }
}
