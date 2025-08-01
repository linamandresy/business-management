package com.lina.business.business_management.entities.repositories.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.resources.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    
}
