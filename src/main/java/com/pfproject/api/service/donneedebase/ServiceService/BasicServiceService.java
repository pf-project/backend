package com.pfproject.api.service.donneedebase.ServiceService;

import com.pfproject.api.repository.donnedebase.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BasicServiceService implements ServiceService {

    private final ServiceRepository repository;

    @Autowired
    public BasicServiceService(final ServiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public com.pfproject.api.model.donneedebase.Service create(
            final com.pfproject.api.model.donneedebase.Service service) {
        service.setCreatedAt(String.valueOf(LocalDateTime.now()));

        return repository.save(service);
    }

    @Override
    public List<com.pfproject.api.model.donneedebase.Service> findAll() {
        return repository.findAll();
    }

    @Override
    public com.pfproject.api.model.donneedebase.Service findByDesignation(String designation) {
        return repository.findByDesignation(designation);
    }
    @Override
    public com.pfproject.api.model.donneedebase.Service findByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public com.pfproject.api.model.donneedebase.Service update(final String code,
            final com.pfproject.api.model.donneedebase.Service service) {

        final com.pfproject.api.model.donneedebase.Service saved = repository.findByCode(code);
        service.setId(saved.getId());

        service.setCreatedAt(saved.getCreatedAt());
        service.setUpdatedAt(String.valueOf(LocalDateTime.now()));

        repository.save(service);
        return service;
    }

}
