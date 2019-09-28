package com.pfproject.api.service.logistic.parametrage.configurationdebase.unites;

import java.util.List;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.Unites;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.unites.*;

public interface UnitesService {

    Unites create(Unites object);

    Unites find(String id);

    List<Unites> findAll();

    Unites update(String id, Unites object);

    // String delete(String id);

    List<Poids> findPoids();
    List<Devise> findDevise();
    List<Volume> findVolume();
    List<Longueur> findLongueur();
    List<Duree> findDuree();
    List<PhysiquoChimique> findPhysiquoChimique();


}
