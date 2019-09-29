package com.pfproject.api.converter.dto.logistic.parametrage.configurationdebase;

import com.pfproject.api.dto.logistic.parametrage.configurationdebase.UnitesDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.DeviseDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.DureeDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.LongueurDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.PhysiquoChimiqueDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.PoidsDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.VolumeDTO;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.Unites;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Devise;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Duree;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Longueur;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.PhysiquoChimique;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Poids;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Volume;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;

public class UnitesDTOConverter implements Converter<UnitesDTO, Unites> {

    @Override
    public Unites convert(final UnitesDTO dto) {
        final Unites unites = new Unites();
        List<Devise> new_list_devise = new ArrayList<Devise>();
        List<DeviseDTO> list_devise = dto.getDevise();
        for (DeviseDTO dto_var : list_devise) {
            Devise var = new Devise();
            var.setCode(dto_var.getCode());
            var.setDesignation(dto_var.getDesignation());
            var.setFacteur_conversion(dto_var.getFacteur_conversion());
            var.setUnite_conversion(dto_var.getUnite_conversion());
            var.setId(dto_var.getId());
            new_list_devise.add(var);
        }
        List<Poids> new_list_poids = new ArrayList<Poids>();
        List<PoidsDTO> list_poids = dto.getPoids();
        for (PoidsDTO dto_var : list_poids) {
            Poids var = new Poids();
            var.setCode(dto_var.getCode());
            var.setDesignation(dto_var.getDesignation());
            var.setFacteur_conversion(dto_var.getFacteur_conversion());
            var.setUnite_conversion(dto_var.getUnite_conversion());
            var.setId(dto_var.getId());
            new_list_poids.add(var);
        }
        List<Volume> new_list_volume = new ArrayList<Volume>();
        List<VolumeDTO> list_volume = dto.getVolume();
        for (VolumeDTO dto_var : list_volume) {
            Volume var = new Volume();
            var.setCode(dto_var.getCode());
            var.setDesignation(dto_var.getDesignation());
            var.setFacteur_conversion(dto_var.getFacteur_conversion());
            var.setUnite_conversion(dto_var.getUnite_conversion());
            var.setId(dto_var.getId());
            new_list_volume.add(var);
        }
        List<Longueur> new_list_longueur = new ArrayList<Longueur>();
        List<LongueurDTO> list_longueur = dto.getLongueur();
        for (LongueurDTO dto_var : list_longueur) {
            Longueur var = new Longueur();
            var.setCode(dto_var.getCode());
            var.setDesignation(dto_var.getDesignation());
            var.setFacteur_conversion(dto_var.getFacteur_conversion());
            var.setUnite_conversion(dto_var.getUnite_conversion());
            var.setId(dto_var.getId());
            new_list_longueur.add(var);
        }
        List<Duree> new_list_duree = new ArrayList<Duree>();
        List<DureeDTO> list_duree = dto.getDuree();
        for (DureeDTO dto_var : list_duree) {
            Duree var = new Duree();
            var.setCode(dto_var.getCode());
            var.setDesignation(dto_var.getDesignation());
            var.setFacteur_conversion(dto_var.getFacteur_conversion());
            var.setUnite_conversion(dto_var.getUnite_conversion());
            var.setId(dto_var.getId());
            new_list_duree.add(var);
        }
        List<PhysiquoChimique> new_list_physiquo_chimique = new ArrayList<PhysiquoChimique>();
        List<PhysiquoChimiqueDTO> list_physiquo_chimique = dto.getPhysiquo_chimique();
        for (PhysiquoChimiqueDTO dto_var : list_physiquo_chimique) {
            PhysiquoChimique var = new PhysiquoChimique();
            var.setCode(dto_var.getCode());
            var.setDesignation(dto_var.getDesignation());
            var.setFacteur_conversion(dto_var.getFacteur_conversion());
            var.setUnite_conversion(dto_var.getUnite_conversion());
            var.setId(dto_var.getId());
            new_list_physiquo_chimique.add(var);
        }

        unites.setDevise(new_list_devise);
        unites.setDuree(new_list_duree);
        unites.setLongueur(new_list_longueur);
        unites.setPhysiquo_chimique(new_list_physiquo_chimique);
        unites.setPoids(new_list_poids);
        unites.setVolume(new_list_volume);

        unites.setCreatedBy(dto.getCreatedBy());
        unites.setUpdatedBy(dto.getUpdatedBy());

        unites.setCreatedAt(dto.getCreatedAt());

        return unites;
    }
}
