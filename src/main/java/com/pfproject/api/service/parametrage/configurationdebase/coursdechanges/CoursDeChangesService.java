package com.pfproject.api.service.parametrage.configurationdebase.coursdechanges;

import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.CoursDeChanges;
import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;

public interface CoursDeChangesService {

    CoursDeChanges create(CoursDeChanges object);

    CoursDeChanges find(String id);

    List<CoursDeChanges> findAll();

    CoursDeChanges update(String id, CoursDeChanges object);

    // String delete(String id);
}
