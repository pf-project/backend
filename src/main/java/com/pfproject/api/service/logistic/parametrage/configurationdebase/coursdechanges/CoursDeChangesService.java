package com.pfproject.api.service.logistic.parametrage.configurationdebase.coursdechanges;

import java.util.List;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.CoursDeChanges;

public interface CoursDeChangesService {

    CoursDeChanges create(CoursDeChanges object);

    CoursDeChanges find(String id);

    List<CoursDeChanges> findAll();

    CoursDeChanges update(String id, CoursDeChanges object);



    // String delete(String id);
}
