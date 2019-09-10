package com.pfproject.api.service.parametrage.configurationdebase.listesdebase;

import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;

public interface ListesDeBaseService {

    ListesDeBase create(ListesDeBase object);

    ListesDeBase find(String id);

    List<ListesDeBase> findAll();

    ListesDeBase update(String id, ListesDeBase object);

    // String delete(String id);
}
