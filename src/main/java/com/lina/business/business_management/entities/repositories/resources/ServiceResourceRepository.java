package com.lina.business.business_management.entities.repositories.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.resources.ServiceResource;

public interface ServiceResourceRepository extends JpaRepository<ServiceResource, Long> {
    // Custom query methods (if needed) can be defined here
}
