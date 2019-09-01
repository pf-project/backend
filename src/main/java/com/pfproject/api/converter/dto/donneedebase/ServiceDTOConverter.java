package com.pfproject.api.converter.dto.donneedebase;

import com.pfproject.api.dto.donneedebase.ServiceDTO;
import com.pfproject.api.model.donneedebase.Service;
import org.springframework.core.convert.converter.Converter;

public class ServiceDTOConverter implements Converter<ServiceDTO, Service> {

    @Override
    public Service convert(final ServiceDTO dto) {
        final Service article = new Service();
        article.setCode(dto.getCode());
        article.setDesignation(dto.getDesignation());
        article.setCategorie(dto.getCategorie());
        article.setUtilite(dto.getUtilite());
        article.setAncienCode(dto.getAncienCode());
        article.setNote(dto.getNote());
        article.setCaracteristiques(dto.getCaracteristiques());

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
