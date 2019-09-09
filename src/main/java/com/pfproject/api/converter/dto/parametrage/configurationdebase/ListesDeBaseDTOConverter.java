package com.pfproject.api.converter.dto.parametrage.configurationdebase;

import java.util.ArrayList;
import java.util.List;

import com.pfproject.api.dto.parametrage.configurationdebase.ListesDeBaseDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.BanqueDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.HonoraireDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.LangueDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.ModeDePayementDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.PaysDTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.TVADTO;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.VilleDTO;
import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Banque;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Honoraire;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Langue;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.ModeDePayement;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Pays;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.TVA;
import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Ville;

import org.springframework.core.convert.converter.Converter;

public class ListesDeBaseDTOConverter implements Converter<ListesDeBaseDTO, ListesDeBase> {

    @Override
    public ListesDeBase convert(final ListesDeBaseDTO dto) {
        final ListesDeBase listesDeBase = new ListesDeBase();
        System.out.println("converter ");
        List<Pays> new_list_pays = new ArrayList<Pays>();
        List<PaysDTO> list_pays = dto.getPays();
        for (PaysDTO pays : list_pays) {
            Pays new_pays = new Pays();
            new_pays.setCode(pays.getCode());
            new_pays.setDesignation(pays.getDesignation());
            new_pays.setId(pays.getId());
            new_list_pays.add(new_pays);
        }

        List<Ville> new_list_villes = new ArrayList<Ville>();
        List<VilleDTO> list_villes = dto.getVilles();
        for (VilleDTO ville : list_villes) {
            Ville new_ville = new Ville();
            new_ville.setCode(ville.getCode());
            new_ville.setDesignation(ville.getDesignation());
            new_ville.setId(ville.getId());
            new_ville.setPays(ville.getPays());
            new_list_villes.add(new_ville);
        }

        List<TVA> new_list_tva = new ArrayList<TVA>();
        List<TVADTO> list_tva = dto.getTva();
        for (TVADTO tva : list_tva) {
            TVA new_tva = new TVA();
            new_tva.setCode(tva.getCode());
            new_tva.setDesignation(tva.getDesignation());
            new_tva.setId(tva.getId());
            new_list_tva.add(new_tva);
        }

        List<Langue> new_list_langues = new ArrayList<Langue>();
        List<LangueDTO> list_langues = dto.getLangues();
        for (LangueDTO langue : list_langues) {
            Langue new_langue = new Langue();
            new_langue.setCode(langue.getCode());
            new_langue.setDesignation(langue.getDesignation());
            new_langue.setId(langue.getId());
            new_list_langues.add(new_langue);
        }

        List<ModeDePayement> new_list_mode_payement = new ArrayList<ModeDePayement>();
        List<ModeDePayementDTO> list_mode_payement = dto.getMode_payment();
        for (ModeDePayementDTO mode_payement : list_mode_payement) {
            ModeDePayement new_mode_payement = new ModeDePayement();
            new_mode_payement.setCode(mode_payement.getCode());
            new_mode_payement.setDesignation(mode_payement.getDesignation());
            new_mode_payement.setId(mode_payement.getId());
            new_list_mode_payement.add(new_mode_payement);
        }

        List<Banque> new_list_banque = new ArrayList<Banque>();
        List<BanqueDTO> list_banque = dto.getBanques();
        for (BanqueDTO banque : list_banque) {
            Banque new_banque = new Banque();
            new_banque.setCode(banque.getCode());
            new_banque.setDesignation(banque.getDesignation());
            new_banque.setId(banque.getId());
            new_list_banque.add(new_banque);
        }

        List<Honoraire> new_list_honoraire = new ArrayList<Honoraire>();
        List<HonoraireDTO> list_honoraire = dto.getHonoraires();
        for (HonoraireDTO honoraire : list_honoraire) {
            Honoraire new_honoraire = new Honoraire();
            new_honoraire.setCode(honoraire.getCode());
            new_honoraire.setDesignation(honoraire.getDesignation());
            new_honoraire.setId(honoraire.getId());
            new_honoraire.setTva(honoraire.getTva());
            new_list_honoraire.add(new_honoraire);
        }

        listesDeBase.setPays(new_list_pays);
        listesDeBase.setVilles(new_list_villes);
        listesDeBase.setTva(new_list_tva);
        listesDeBase.setLangues(new_list_langues);
        listesDeBase.setHonoraires(new_list_honoraire);
        listesDeBase.setMode_payment(new_list_mode_payement);
        listesDeBase.setBanques(new_list_banque);

        return listesDeBase;
    }
}
