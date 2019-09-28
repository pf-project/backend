package com.pfproject.api.dto.logistic.parametrage.configurationdebase;

import com.pfproject.api.dto.logistic.parametrage.configurationdebase.unites.*;
import com.pfproject.api.model.EntityBase;
import java.util.List;

public class UnitesDTO extends EntityBase {

    private List<DeviseDTO> devise;
    private List<PoidsDTO> poids;
    private List<VolumeDTO> volume;
    private List<LongueurDTO> longueur;
    private List<DureeDTO> duree;
    private List<PhysiquoChimiqueDTO> physiquo_chimique;

    public List<DeviseDTO> getDevise() {
        return this.devise;
    }

    public void setDevise(List<DeviseDTO> devise) {
        this.devise = devise;
    }

    public List<PoidsDTO> getPoids() {
        return this.poids;
    }

    public void setPoids(List<PoidsDTO> poids) {
        this.poids = poids;
    }

    public List<VolumeDTO> getVolume() {
        return this.volume;
    }

    public void setVolume(List<VolumeDTO> volume) {
        this.volume = volume;
    }

    public List<LongueurDTO> getLongueur() {
        return this.longueur;
    }

    public void setLongueur(List<LongueurDTO> longueur) {
        this.longueur = longueur;
    }

    public List<DureeDTO> getDuree() {
        return this.duree;
    }

    public void setDuree(List<DureeDTO> duree) {
        this.duree = duree;
    }

    public List<PhysiquoChimiqueDTO> getPhysiquo_chimique() {
        return this.physiquo_chimique;
    }

    public void setPhysiquo_chimique(List<PhysiquoChimiqueDTO> physiquo_chimique) {
        this.physiquo_chimique = physiquo_chimique;
    }

}
