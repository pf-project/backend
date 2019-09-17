package com.pfproject.api.repository.parametrage.configurationdebase;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.Unites;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitesRepository extends MongoRepository<Unites, String> {

}
