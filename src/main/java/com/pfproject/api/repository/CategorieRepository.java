package com.pfproject.api.repository;

import com.pfproject.api.model.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategorieRepository extends MongoRepository<Categorie, String> {

}
