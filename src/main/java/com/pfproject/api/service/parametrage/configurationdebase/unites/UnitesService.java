package com.pfproject.api.service.parametrage.configurationdebase.unites;

import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.Unites;
import com.pfproject.api.model.parametrage.configurationdebase.unites.Devise;

public interface UnitesService {

    Unites create(Unites object);

    Unites find(String id);

    List<Unites> findAll();

    Unites update(String id, Unites object);

    // String delete(String id);

}
