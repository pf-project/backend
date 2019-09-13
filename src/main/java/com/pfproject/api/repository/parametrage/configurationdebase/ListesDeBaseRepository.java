package com.pfproject.api.repository.parametrage.configurationdebase;

import com.pfproject.api.model.parametrage.categorie.CategorieArticle;
import com.pfproject.api.model.parametrage.configurationdebase.ListesDeBase;

import com.pfproject.api.model.parametrage.configurationdebase.listesdebase.Ville;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ListesDeBaseRepository extends MongoRepository<ListesDeBase, String> {
    @Query(fields = "{'villes' : 1 , 'id_' : 0}")
     List<Ville> findVilles();

}
