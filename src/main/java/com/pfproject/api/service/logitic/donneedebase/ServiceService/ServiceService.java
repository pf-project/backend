package com.pfproject.api.service.logitic.donneedebase.ServiceService;

import com.pfproject.api.model.logistic.donneedebase.Service;

import java.util.List;

public interface ServiceService {

    Service create(Service object);

    // Categorie find(String id);

    Service findByDesignation(String designation);

    Service findByCode(String code);

    List<Service> findAll();

    Service update(String code, Service object);

    // String delete(String id);
}
