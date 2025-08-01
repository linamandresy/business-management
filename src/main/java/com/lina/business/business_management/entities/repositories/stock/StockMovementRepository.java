package com.lina.business.business_management.entities.repositories.stock;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.stock.StockMovement;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {
    
}
