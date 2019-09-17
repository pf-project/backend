package com.pfproject.api.converter.dto.logistic.donneedebase;

import com.pfproject.api.dto.logistic.donneedebase.ArticleDTO;
import com.pfproject.api.model.logistic.donneedebase.Article;
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
        article.setUnite_poid(dto.getUnite_poid());
        article.setDimension_L(dto.getDimension_L());
        article.setDimension_I(dto.getDimension_L());
        article.setDimension_H(dto.getDimension_H());
        article.setUnite_dim(dto.getUnite_dim());
        article.setGestion_par_lot(dto.isGestion_par_lot());
        article.setLot_standard(dto.getLot_standard());
        article.setControle_qualite_exige(dto.isControle_qualite_exige());

        article.setPrix_achat_HT(dto.getPrix_achat_HT());
        article.setDevise_achat(dto.getDevise_achat());
        article.setUnite_achat(dto.getUnite_achat());
        article.setTaux_tva_achat(dto.getTaux_tva_achat());
        article.setPrix_achat_TTC(dto.getPrix_achat_TTC());
        article.setPrix_moyen_pendere(dto.getPrix_moyen_pendere());
        article.setMarge(dto.isMarge());

        article.setTaux_marge(dto.getTaux_marge());
        article.setMontant_marge(dto.getMontant_marge());
        article.setPrix_vente_HT(dto.getPrix_vente_HT());
        article.setDevise_vente(dto.getDevise_vente());
        article.setUnite_vente(dto.getUnite_vente());
        article.setTaux_tva_vente(dto.getTaux_tva_vente());
        article.setPrix_vente_TTC(dto.getPrix_vente_TTC());

        article.setArchived(dto.isArchived());
        article.setCreatedAt(dto.getCreatedAt());
        return article;
    }
}
