package com.pfproject.api.converter.dto;

import com.pfproject.api.dto.ArticleDTO;
import com.pfproject.api.model.Article;
import org.springframework.core.convert.converter.Converter;

public class ArticleDTOConverter implements Converter<ArticleDTO, Article> {

    @Override
    public Article convert(final ArticleDTO dto) {
        final Article article = new Article();
        article.setCode(dto.getCode());
        article.setDesignation(dto.getDesignation());
        article.setCategorie(dto.getCategorie());
        article.setUtilite(dto.getUtilite());
        article.setFindvalidite(dto.getFindvalidite());
        article.setAncienCode(dto.getAncienCode());
        article.setFabriquant(dto.getFabriquant());
        article.setNote(dto.getNote());
        article.setNum_piece_fabriquuant(dto.getNum_piece_fabriquuant());
        article.setCaracteristiques(dto.getCaracteristiques());
        article.setUnite_de_quantite_de_base(dto.getUnite_de_quantite_de_base());
        article.setEmplacement(dto.getEmplacement());
        article.setPoids(dto.getPoids());
        article.setUnite1(dto.getUnite1());
        article.setDimension_L(dto.getDimension_L());
        article.setDimension_I(dto.getDimension_L());
        article.setDimension_H(dto.getDimension_H());
        article.setUnite2(dto.getUnite2());
        article.setGestion_par_lot(dto.getGestion_par_lot());
        article.setLot_standard(dto.getLot_standard());
        article.setControle_qualite_exige(dto.getControle_qualite_exige());
        article.setPrix_standar_achat(dto.getPrix_standar_achat());
        article.setUnite_de_quantite_achat(dto.getUnite_de_quantite_achat());
        article.setPrix_moyen_pendere(dto.getPrix_moyen_pendere());
        article.setPrix_de_vente_de_base_HT(dto.getPrix_de_vente_de_base_HT());
        article.setTaux_tva(dto.getTaux_tva());
        article.setPrix_de_vente_de_base_TTC(dto.getPrix_de_vente_de_base_TTC());
        article.setUnite_de_vente(dto.getUnite_de_vente());
        article.setCreatedAt(dto.getCreatedAt());
        return article;
    }
}
