package com.pfproject.api.converter.dto.comptabilite.donneedebase.caisse;

import com.pfproject.api.dto.comptabiite.donnedebase.caisse.CaisseDTO;
import com.pfproject.api.model.comptabilite.donneedebase.caisse.Caisse;
import org.springframework.core.convert.converter.Converter;

public class CaisseDTOConverter  implements Converter<CaisseDTO, Caisse> {
    @Override
    public Caisse convert(final CaisseDTO dto) {
        final Caisse caisse = new Caisse();
        caisse.setCode(dto.getCode());
        caisse.setCodeJournal(dto.getCodeJournal());
        caisse.setComptegeneral(dto.getComptegeneral());
        caisse.setDesignation(dto.getDesignation());
        caisse.setDevise(dto.getDevise());
        caisse.setPays(dto.getPays());
        caisse.setStatu(dto.getStatu());

        return caisse;
    }

}
