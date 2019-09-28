package com.pfproject.api.converter.dto.comptabilite.donneedebase.comptebancaire;

import com.pfproject.api.dto.comptabilite.donneedebase.comptebancaire.CompteBancaireDTO;
import com.pfproject.api.model.comptabilite.donneedebase.comptebancaire.CompteBancaire;
import org.springframework.core.convert.converter.Converter;

public class CompteBancaireDTOConverter implements Converter<CompteBancaireDTO, CompteBancaire> {

    @Override
    public CompteBancaire convert(CompteBancaireDTO compteBancaireDTO) {
        final CompteBancaire compte = new CompteBancaire();

        compte.setAdresse(compteBancaireDTO.getAdresse());
        compte.setAgence(compteBancaireDTO.getAgence());
        compte.setAvec_compte_special(compteBancaireDTO.isAvec_compte_special());
        compte.setBanque(compteBancaireDTO.getBanque());
        compte.setCle_RIB(compteBancaireDTO.getCle_RIB());
        compte.setCompte_general_standard(compteBancaireDTO.getCompte_general_standard());
        compte.setDesignation(compteBancaireDTO.getDesignation());
        compte.setIBAN(compteBancaireDTO.getIBAN());
        compte.setGenerer_des_comptes_intermidieres(compteBancaireDTO.isGenerer_des_comptes_intermidieres());
        compte.setCompte_general_special(compteBancaireDTO.getCompte_general_special());
        compte.setCode(compteBancaireDTO.getCode());
        compte.setJournal(compteBancaireDTO.getJournal());
        compte.setPays(compteBancaireDTO.getPays());
        compte.setStatus_compte(compteBancaireDTO.getStatus_compte());
        compte.setVille(compteBancaireDTO.getVille());
        compte.setSwift(compteBancaireDTO.getSwift());
        compte.setType_compte(compteBancaireDTO.getType_compte());

        compte.setCreatedBy(compteBancaireDTO.getCreatedBy());
        compte.setUpdatedBy(compteBancaireDTO.getUpdatedBy());

        return compte;
    }
}
