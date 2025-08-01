package com.lina.business.business_management.entities.repositories.stock;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.business.business_management.entities.stock.InventoryConsumable;

public interface InventoryConsumableRepository extends JpaRepository<InventoryConsumable, Long> {
    // Custom query methods (if needed) can be defined here
}
