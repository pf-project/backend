package com.pfproject.api.model.logistic.parametrage.configurationdebase;

import java.util.List;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Devise;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Poids;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Volume;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Longueur;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.Duree;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.PhysiquoChimique;

import org.bson.types.ObjectId;

public class Unites {
    private ObjectId id;

    private List<Devise> devise;
    private List<Poids> poids;
    private List<Volume> volume;
    private List<Longueur> longueur;
    private List<Duree> duree;
    private List<PhysiquoChimique> physiquo_chimique;

    public String getId() {
        return this.id.toString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<Devise> getDevise() {
        return this.devise;
    }

    public void setDevise(List<Devise> devise) {
        this.devise = devise;
    }

    public List<Poids> getPoids() {
        return this.poids;
    }

    public void setPoids(List<Poids> poids) {
        this.poids = poids;
    }

    public List<Volume> getVolume() {
        return this.volume;
    }

    public void setVolume(List<Volume> volume) {
        this.volume = volume;
    }

    public List<Longueur> getLongueur() {
        return this.longueur;
    }

    public void setLongueur(List<Longueur> longueur) {
        this.longueur = longueur;
    }

    public List<Duree> getDuree() {
        return this.duree;
    }

    public void setDuree(List<Duree> duree) {
        this.duree = duree;
    }

    public List<PhysiquoChimique> getPhysiquo_chimique() {
        return this.physiquo_chimique;
    }

    public void setPhysiquo_chimique(List<PhysiquoChimique> physiquo_chimique) {
        this.physiquo_chimique = physiquo_chimique;
    }

}
