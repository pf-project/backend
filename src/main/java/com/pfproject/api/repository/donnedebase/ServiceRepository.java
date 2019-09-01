package com.pfproject.api.repository.donnedebase;

import com.pfproject.api.model.donneedebase.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServiceRepository extends MongoRepository<Service, String> {
    Service findByDesignation(final String designation);

    Service findByCode(final String code);
}
