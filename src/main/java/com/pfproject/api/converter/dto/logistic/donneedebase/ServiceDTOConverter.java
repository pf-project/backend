package com.pfproject.api.converter.dto.logistic.donneedebase;

import com.pfproject.api.dto.logistic.donneedebase.ServiceDTO;
import com.pfproject.api.model.logistic.donneedebase.Service;
import org.springframework.core.convert.converter.Converter;

public class ServiceDTOConverter implements Converter<ServiceDTO, Service> {

    @Override
    public Service convert(final ServiceDTO dto) {
        final Service service = new Service();
        service.setCode(dto.getCode());
        service.setDesignation(dto.getDesignation());
        service.setCategorie(dto.getCategorie());
        service.setUtilite(dto.getUtilite());
        service.setAncienCode(dto.getAncienCode());
        service.setNote(dto.getNote());
        service.setCaracteristiques(dto.getCaracteristiques());

        service.setPrix_achat_HT(dto.getPrix_achat_HT());
        service.setDevise_achat(dto.getDevise_achat());
        service.setUnite_achat(dto.getUnite_achat());
        service.setTaux_tva_achat(dto.getTaux_tva_achat());
        service.setPrix_achat_TTC(dto.getPrix_achat_TTC());
        service.setPrix_moyen_pendere(dto.getPrix_moyen_pendere());
        service.setMarge(dto.getMarge());
        service.setCreatedAt(dto.getCreatedAt());
        service.setTaux_marge(dto.getTaux_marge());
        service.setMontant_marge(dto.getMontant_marge());
        service.setPrix_vente_HT(dto.getPrix_vente_HT());
        service.setDevise_vente(dto.getDevise_vente());
        service.setUnite_vente(dto.getUnite_vente());
        service.setTaux_tva_vente(dto.getTaux_tva_vente());
        service.setPrix_vente_TTC(dto.getPrix_vente_TTC());

        service.setCreatedBy(dto.getCreatedBy());
        service.setUpdatedBy(dto.getUpdatedBy());
        return service;
    }
}
