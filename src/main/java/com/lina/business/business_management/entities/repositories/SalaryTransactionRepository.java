package com.lina.business.business_management.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.SalaryTransaction;

public interface SalaryTransactionRepository extends JpaRepository<SalaryTransaction, Long> {
    // Custom query methods (if needed) can be defined here
}
