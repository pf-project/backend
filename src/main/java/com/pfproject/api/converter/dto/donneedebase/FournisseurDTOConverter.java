package com.pfproject.api.converter.dto.donneedebase;

import com.pfproject.api.dto.donneedebase.FournisseurDTO;
import com.pfproject.api.model.donneedebase.Fournisseur;
import org.springframework.core.convert.converter.Converter;

public class FournisseurDTOConverter implements Converter<FournisseurDTO, Fournisseur> {
    public Fournisseur convert(final FournisseurDTO dto) {
        final Fournisseur fournisseur = new Fournisseur();

        fournisseur.setRetenu_a_la_source(dto.getRetenu_a_la_source());
        fournisseur.setAdresse(dto.getAdresse()); ;
        fournisseur.setCivilite(dto.getCivilite());
        fournisseur.setCnss(dto.getCnss());
        fournisseur.setCode(dto.getCode());
        fournisseur.setCode_postal(dto.getCode_postal());
        fournisseur.setCondition_paiement(dto.getCondition_paiement());
        fournisseur.setContacts(dto.getContacts());
        fournisseur.setCoord_bancaire(dto.getCoord_bancaire());
        fournisseur.setDesignation(dto.getDesignation());
        fournisseur.setDevise(dto.getDevise());
        fournisseur.setGroup(dto.getGroup());
        fournisseur.setHonoraire(dto.getHonoraire());
        fournisseur.setIce(dto.getIce());
        fournisseur.setIdentifiant_fiscale(dto.getIdentifiant_fiscale());
        fournisseur.setLangue(dto.getLangue());
        fournisseur.setLibelle_additionnel(dto.getLibelle_additionnel());
        fournisseur.setMode_paiement(dto.getMode_paiement());
        fournisseur.setNombre_jours(dto.getNombre_jours());
        fournisseur.setPatente(dto.getPatente());
        fournisseur.setPays(dto.getPays());
        fournisseur.setRegestre_commerce(dto.getRegestre_commerce());
        fournisseur.setStatus_honoraire(dto.getStatus_honoraire());
        fournisseur.setTaux_tva(dto.getTaux_tva());
        fournisseur.setVille(dto.getVille());

        fournisseur.setArchived(dto.isArchived());

        fournisseur.setCreatedAt(dto.getCreatedAt());

        return fournisseur ;}



}
