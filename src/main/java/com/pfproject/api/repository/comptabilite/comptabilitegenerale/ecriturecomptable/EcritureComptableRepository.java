package com.pfproject.api.repository.comptabilite.comptabilitegenerale.ecriturecomptable;

import com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable.EcritureComptable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcritureComptableRepository extends MongoRepository<EcritureComptable,String> {
    
    @Query("{journal : ?0}")
    List<EcritureComptable> findByJournal(String journal);
}
