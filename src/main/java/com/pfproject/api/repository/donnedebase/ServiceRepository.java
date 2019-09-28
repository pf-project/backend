package com.pfproject.api.repository.donnedebase;

import com.pfproject.api.model.logistic.donneedebase.Service;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends MongoRepository<Service, String> {

    @Query("{designation :  ?0,,archived : false}")
    Service findByDesignation(final String designation);

    @Query("{code :  ?0,,archived : false}")
    Service findByCode(final String code);

    @Query("{archived : {$ne : ?0}}")
    List<Service> findByArchivedNotEqual(Boolean archived);
}
