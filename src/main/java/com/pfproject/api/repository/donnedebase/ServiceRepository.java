package com.pfproject.api.repository.donnedebase;

import com.pfproject.api.model.logistic.donneedebase.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends MongoRepository<Service, String> {
    Service findByDesignation(final String designation);

    Service findByCode(final String code);
}
