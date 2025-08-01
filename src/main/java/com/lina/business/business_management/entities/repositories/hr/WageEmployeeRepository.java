package com.lina.business.business_management.entities.repositories.hr;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.hr.WageEmployee;

public interface WageEmployeeRepository extends JpaRepository<WageEmployee, Long> {
    // Additional query methods can be defined here if needed
}
