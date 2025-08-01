package com.lina.business.business_management.entities.repositories.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.resources.ConsumableResource;

public interface ConsumableResourceRepository extends JpaRepository<ConsumableResource, Long> {
    
}
