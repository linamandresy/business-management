package com.lina.business.business_management.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    
}
