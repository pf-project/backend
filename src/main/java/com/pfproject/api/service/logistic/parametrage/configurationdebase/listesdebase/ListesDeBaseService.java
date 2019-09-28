package com.pfproject.api.service.logistic.parametrage.configurationdebase.listesdebase;

import java.util.List;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.ListesDeBase;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.listesdebase.*;

public interface ListesDeBaseService {

    ListesDeBase create(ListesDeBase object);

    ListesDeBase find(String id);

    List<ListesDeBase> findAll();

    ListesDeBase update(String id, ListesDeBase object);

    List<Ville>  findVilles();
    List<Pays>  findPays();
    List<TVA>  findTVA();
    List<Langue>  findLangue();
    List<ModeDePayement>  findModeDePayement();
    List<Honoraire>  findHonoraire();
    List<Banque>  findBanque();;
    // String delete(String id);
}
