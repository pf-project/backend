package com.pfproject.api.repository.parametrage.configurationdebase;

import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.CoursDeChanges;
import com.pfproject.api.model.parametrage.configurationdebase.Unites;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;

@Repository
public interface CoursDeChangesRepository extends MongoRepository<CoursDeChanges, String> {

}
