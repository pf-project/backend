package com.pfproject.api.service.logitic.parametrage.configurationdebase.unites;

import java.util.List;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.Unites;

public interface UnitesService {

    Unites create(Unites object);

    Unites find(String id);

    List<Unites> findAll();

    Unites update(String id, Unites object);

    // String delete(String id);

}
