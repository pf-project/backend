package com.pfproject.api.service.logistic.parametrage.configurationdebase.coursdechanges;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.CoursDeChanges;
import com.pfproject.api.repository.parametrage.configurationdebase.CoursDeChangesRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicCoursDeChangesService implements CoursDeChangesService {

    private final CoursDeChangesRepository repository;

    @Autowired
    public BasicCoursDeChangesService(final CoursDeChangesRepository repository) {
        this.repository = repository;
    }

    @Override
    public CoursDeChanges create(final CoursDeChanges listesDeBase) {

        listesDeBase.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(listesDeBase);
    }

    // @Override
    // public User find(final String id) {
    // return repository.findOne(id);
    // }
    @Override
    public List<CoursDeChanges> findAll() {
        return repository.findAll();
    }

    @Override
    public CoursDeChanges find(String id) {

        return repository.findOne(id);
    }

    @Override
    public CoursDeChanges update(String id, CoursDeChanges object) {
        ObjectId new_id = new ObjectId(id);
        object.setId(new_id);

        object.setUpdatedAt(String.valueOf(LocalDateTime.now()));
        return repository.save(object);
    }

}
