package com.pfproject.api.repository.parametrage.configurationdebase;

import com.pfproject.api.model.parametrage.configurationdebase.Unites;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UnitesRepository extends MongoRepository<Unites, String> {

}
