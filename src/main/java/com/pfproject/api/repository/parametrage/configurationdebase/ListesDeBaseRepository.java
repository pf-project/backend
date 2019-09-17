package com.pfproject.api.repository.parametrage.configurationdebase;

import com.pfproject.api.model.logistic.parametrage.configurationdebase.ListesDeBase;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListesDeBaseRepository extends MongoRepository<ListesDeBase, String> {
//   @Query(value = "{'villes':{$elemMatch: {code:?0}}}" ,fields = "{'villes' : 1 , '_id' : 0}")
//   List<ListesDeBase> findByCodeJustReturnVillesQuery(String ville);

}
