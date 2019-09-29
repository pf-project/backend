package com.pfproject.api.converter.dto.comptabilite.donneedebase.comptegeneral;

import com.pfproject.api.dto.comptabilite.donneedebase.comptegeneral.CompteGeneralDTO;
import com.pfproject.api.model.comptabilite.donneedebase.comptegeneral.CompteGeneral;
import org.springframework.core.convert.converter.Converter;

public class CompteGeneralDTOConverter implements Converter<CompteGeneralDTO, CompteGeneral> {

    @Override
    public CompteGeneral convert(final CompteGeneralDTO dto) {
        final CompteGeneral compteGeneral = new CompteGeneral();

        compteGeneral.setClasse(Integer.parseInt(dto.getClasse()));
        compteGeneral.setCompte(Integer.parseInt(dto.getCompte()));
        compteGeneral.setNiveau(Integer.parseInt(dto.getNiveau()));
        compteGeneral.setDesignation(dto.getDesignation());
        compteGeneral.setCompteancien(dto.getCompteancien());
        compteGeneral.setComptepere(Integer.parseInt(dto.getComptepere()));
        compteGeneral.setTypecompte(dto.getTypecompte());

        compteGeneral.setCreatedBy(dto.getCreatedBy());
        compteGeneral.setCreatedAt(dto.getCreatedAt());
        compteGeneral.setUpdatedBy(dto.getUpdatedBy());
        return compteGeneral;
    }
}
